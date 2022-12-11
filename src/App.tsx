import React from "react";
import logo from "./logo.svg";
import "./App.css";
import MobileSuits from "./MobileSuits";
import MobileSuit from "./MobileSuit";
import Home from "./Home";
import Menu from "./Menu";
import { Routes, Route, BrowserRouter } from "react-router-dom";
import Universe from "./Universe";

function App() {
  return (
    <div className="App">
      <body>
        <BrowserRouter>
          <Menu />
          <Routes>
            <Route path="suit/:id" element={<MobileSuit />} />
            <Route path="/" element={<Home />} />
            <Route path="suits" element={<MobileSuits />} />
            <Route path="universe/:universe" element={<Universe />} />
          </Routes>
        </BrowserRouter>
      </body>
    </div>
  );
}

export default App;
