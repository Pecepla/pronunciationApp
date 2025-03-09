
import { BrowserRouter, Route, Routes } from "react-router-dom";
import './App.css';
import Home from './Home';
import Layout from './Layout';
import Weather from './Weather';
import About from './About';
import Map from './Map';



export default function App() {


  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="Weather" element={<Weather />} />
          <Route path="Map" element={<Map />} />
          <Route path="About" element={<About />} />
        
        </Route>
      </Routes>
    </BrowserRouter>
      );
};