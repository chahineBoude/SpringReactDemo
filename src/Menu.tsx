import React from "react";
import { Link, NavLink, BrowserRouter } from "react-router-dom";
import "./Menu.css";
import { Nav } from "react-bootstrap";

export default function Menu() {
  // const forceUpdate = useForceUpdate();

  return (
    <Nav className="navbar navbar-expand-lg navbar-dark bg-primary mb-2">
      <div className="collapse navbar-collapse" id="navbarNavDropdown">
        <ul className="navbar-nav">
          <li className="nav-item active">
            <a className="nav-link" href="/">
              Home <span className="sr-only">(current)</span>
            </a>
          </li>
          <li className="nav-item active">
            <a className="nav-link" href="/suits">
              Mobile Suits <span className="sr-only">(current)</span>
            </a>
          </li>
          <li className="nav-item dropdown">
            <a
              className="nav-link dropdown-toggle"
              data-bs-toggle="dropdown"
              href="#"
              role="button"
              aria-haspopup="true"
              aria-expanded="false"
            >
              Dropdown
            </a>
            <div className="dropdown-menu">
              <a className="dropdown-item" href="">
                Action
              </a>
              <a className="dropdown-item" href="">
                Another action
              </a>
              <a className="dropdown-item" href="">
                Something else here
              </a>
              <div className="dropdown-divider"></div>
              <a className="dropdown-item" href="">
                Separated link
              </a>
            </div>
          </li>
        </ul>
      </div>
      {/*<NavLink to={"/"}>home</NavLink>*/}
      {/*<NavLink to={"/suits"}>Mobile</NavLink>*/}
    </Nav>
  );

  // function useForceUpdate() {
  //   const [value, setValue] = React.useState(0); // integer state
  //   return () => setValue((value: any) => value + 1); // update state to force render
  // An function that increment 👆🏻 the previous state like here
  // is better than directly setting `value + 1`
  //}
  function refreshPage() {
    window.location.reload();
  }
}
