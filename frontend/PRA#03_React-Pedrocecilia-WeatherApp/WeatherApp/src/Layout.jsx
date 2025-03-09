import { Link, Links, Outlet } from "react-router-dom";
import { AppBar,
   Toolbar, 
   Typography,
  Button, 
  Container
} from "@mui/material";
import { styled } from "@mui/system";

const StyledLink = styled(Link)({
  backgroundColor: "#000000", // Matching the soft light gray text color
  textDecoration: "none",
  marginLeft: "20px",
  "&:hover": {
    color: "#000000"// Slightly lighter on hover
  },
});

export default function Layout() {
  return (
    <>
      <AppBar
        position="static"
        sx={{
          background: "linear-gradient(to right,rgb(104, 75, 183),rgb(9, 177, 243))", // Matching the body gradient
          boxShadow: "0 3px 5px 2px rgba(24, 40, 72, 0.3)", // Subtle shadow using the darker color
       
        }}
      >
        
        <Toolbar>
       <Typography
            variant="h4"
            sx={{ flexGrow: 1, textAlign: "left", color: "#000000" }}
          >
            pronunciationApp
          </Typography>
          
          <Button component={StyledLink} to="/">
            Home
          </Button>
          <Button component={StyledLink} to="/Weather">
           weather
          </Button>
          <Button component={StyledLink} to="/Map">
            Map
          </Button>
          <Button component={StyledLink} to="/About">
            About
          </Button>
        </Toolbar>
  
      </AppBar>

      <Container sx={{ color: "#000000" }}>
        {" "}
        {/* Ensuring consistent text color */}
        <Outlet />
      </Container>
    </>
  );
}