import { useNavigate } from "react-router-dom";
import Header from "../components/Header.jsx";
import { Button, Box, Typography } from "@mui/material";
import { useState } from "react";

export default function Home() {
  const navigate = useNavigate();
  const [isValidated, setIsValidated] = useState(true);
  const [username, setUsername] = useState("albertprofe");

  const handleRegisterClick = () => {
    navigate("/register");
  };

  const handleLoginClick = () => {
    navigate("/login");
  };

  const handleLogout = () => {
    setIsValidated(false);
  };

  return (
    <>
      <h2>Welcome to PronunciationApp</h2>
      <Header />
      <Box sx={{ textAlign: "center", mt: 4 }}>
        {isValidated ? (
          <Box>
            <Typography variant="h5" sx={{ mb: 2 }}>
              Hello @{username}
            </Typography>
            <Button
              variant="contained"
              color="secondary"
              onClick={handleLogout}
            >
              Logout
            </Button>
          </Box>
        ) : (
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
        )}
      </Box>
    </>
  );
}
