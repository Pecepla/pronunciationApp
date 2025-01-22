import { useState, useEffect } from "react";
import { fetchWords } from "./data-api";

export default function WordList() {
  const [words, setWords] = useState([]);

  useEffect(() => {
    const getWords = async () => {
      try {
        const data = await fetchWords();
        setWords(data);
      } catch (error) {
        console.error("Failed to fetch words:", error);
      }
    };

    getWords();
  }, []);

  return (
    <>
      <h1>Words List</h1>
      {words.map((word) => (
        <p
          key={word.id}
          style={{
            display: "flex",
            justifyContent: "space-between",
            padding: "0 20px",
          }}
        >
          <span style={{ flex: "1", textAlign: "left", color:"grey" }}>{word.id.slice(0,5) + "..."}</span>
          <span style={{ flex: "1", textAlign: "center" }}>
            <b>{word.word}</b>
          </span>
          <span style={{ flex: "1", textAlign: "right" }}>
            {word.pronunciation}
          </span>
        </p>
      ))}
    </>
  );
}