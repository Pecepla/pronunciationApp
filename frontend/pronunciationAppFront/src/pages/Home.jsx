import { useNavigate } from "react-router-dom";
import Header from "../components/Header.jsx";
import { Button, Box } from "@mui/material";

export default function Home() {
  const navigate = useNavigate();

  const handleRegisterClick = () => {
    navigate("/register");
  };

    const handleLoginClick = () => {
      navigate("/login");
    };


  return (
    <>
      <h2>Welcome to PronunciationApp</h2>
      <Header />
      <Box sx={{ textAlign: "center", mt: 4 }}>
        <Box sx={{ mt: 3 }}>
          <Button
            variant="contained"
            onClick={handleLoginClick}
            color="primary"
            sx={{ mr: 2 }}
          >
            Login
          </Button>
          <Button
            variant="contained"
            color="secondary"
            onClick={handleRegisterClick}
          >
            Register
          </Button>
        </Box>
      </Box>
    </>
  );
}
