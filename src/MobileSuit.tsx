import React from "react";
import { Link, useParams } from "react-router-dom";
import { RestClient } from "./RestClient";
import { Button } from "react-bootstrap";

export default function MobileSuit() {
  let { id }: any = useParams();

  console.log(id);

  let [mobileSuit, setMobileSuit] = React.useState<any>(undefined);

  React.useEffect(() => {
    RestClient.getMobileSuit(id).then((mobileSuit) =>
      setMobileSuit(mobileSuit)
    );
  }, [id]);
  if (mobileSuit) {
    return <MobileSuitDetails {...mobileSuit}></MobileSuitDetails>;
  } else {
    return <p>Please wait...</p>;
  }
}

function MobileSuitDetails(mobileSuit: any) {
  return (
    <div>
      <h1>{mobileSuit.name}</h1>
      <p>
        <i className="fa fa-info-circle cir" aria-hidden="true"></i>
        <label>&nbsp;Info:&nbsp;</label>
        <span>{mobileSuit.info}</span>
      </p>
      <p>
        <i className="fa fa-globe glo" aria-hidden="true"></i>
        <label>&nbsp;Era:&nbsp; </label>
        <span>{renderParam(mobileSuit.universe)}</span>
      </p>
      <p>
        <img
          src={RestClient.baseUrl + "/" + mobileSuit.image}
          className="MsImg rounded-4"
        />
      </p>
      <p>
        <Link to={"/"}>
          <Button className="btn btn-primary btn-lg"> Back </Button>
        </Link>
      </p>
    </div>
  );
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
