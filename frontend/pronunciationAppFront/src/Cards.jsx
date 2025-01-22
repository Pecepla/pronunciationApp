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
        <p key={word.id}>
          {word.id}: <b>{word.word}</b> {word.pronunciation}
        </p>
      ))}
    </>
  );
}