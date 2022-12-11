import { useState } from "react";
import React from "react";
import { useParams, Link } from "react-router-dom";
import { RestClient } from "./RestClient";

export default function Universe() {
  let { universe }: any = useParams();

  console.log(universe);

  let [msList, setMsList] = React.useState<Array<any>>([]);

  React.useEffect(() => {
    RestClient.getMsByUniverse(universe).then((msList) => setMsList(msList));
  }, []);

  if (msList) {
    return (
      <div>
        <h1>{renderParam(universe)}</h1>
        <h2>Mobile suits</h2>
        <ul>
          {msList.map((ms: any, id: number) => (
            <li key={id}>
              <Link to={`/suit/${ms.id}`}>
                <img
                  src={RestClient.baseUrl + "/" + ms.image}
                  className="suitImg"
                />
                <br></br>
                {ms.name}
              </Link>
            </li>
          ))}
        </ul>
      </div>
    );
  } else {
    return <p>Please wait...</p>;
  }
}

function renderParam(param: any) {
  switch (param) {
    case "UC":
      return "Universal Century";
    case "AC":
      return "After Colony";
    case "CE":
      return "Cosmic Era";
    default:
      return "Universe";
  }
}
