import React from "react";
import { RestClient } from "./RestClient";
import { Link } from "react-router-dom";

export default function MobileSuits() {
  let [mobileSuits, setMobileSuits] = React.useState<Array<any>>([]);

  React.useEffect(() => {
    RestClient.getMobileSuits().then((mobileSuits) =>
      setMobileSuits(mobileSuits)
    );
  }, []);

  return (
    <div>
      <h1>Mobile suits</h1>
      <ul>
        {mobileSuits.map((ms: any, id: number) => (
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
}
