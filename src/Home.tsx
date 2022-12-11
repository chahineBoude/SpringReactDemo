import React from "react";
import splash from "./swanseamarina.jpg"; // Tell Webpack this code file uses this image
import { Link } from "react-router-dom";
import Menu from "./Menu";
import MobileSuits from "./MobileSuits";
import { Stack, Button } from "react-bootstrap";
import uc from "./UC.png";
import ac from "./AC.png";
import ce from "./CE.jpg";

export default function Home() {
  const universes = {
    unis: [
      { name: "UC", img: uc },
      { name: "AC", img: ac },
      { name: "CE", img: ce },
      //  { name: "Anno Domini", img: ad },
      //  { name: "Post Disaster", img: pd },
    ],
  };
  const [universe, setUniverse] = React.useState<any[]>(universes.unis);
  return (
    <div className="row justify-content-md-center">
      <h1>Universes</h1>
      {universe.map((un: any, id: number) => (
        <div className="col-md-auto universe">
          <Link to={`universe/${un.name}`} className="homeLink">
            <img src={un.img} className="univImg" />
            <br />
            {un.name}
            <br />
          </Link>
        </div>
      ))}
    </div>
  );
}
