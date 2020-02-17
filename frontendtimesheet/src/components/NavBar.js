import React, { Component } from "react";
import { Navbar, NavbarBrand, Nav, NavItem, NavLink } from "reactstrap";
import "./css/navbar.css";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Home from "./Home";
import AddTimeSheet from "./AddTimeSheet";
import Dashboard from "./Dashboard";
import Login from "./Login";

class NavBar extends Component {
  state = {};

  render() {
    return (
      <Router>
        <div className="nav_container">
          <Navbar light expand="md">
            <NavbarBrand href="/" className="nav_items">
              Skill Storm Timesheet
            </NavbarBrand>
            <Nav className="mr-auto" navbar>
              <NavItem>
                <NavLink>
                  <Link to="/" className="nav_items">
                    Home
                  </Link>
                </NavLink>
              </NavItem>
              <NavItem>
                <NavLink>
                  <Link to="/submit" className="nav_items">
                    Submit Timesheet
                  </Link>
                </NavLink>
              </NavItem>
              <NavItem>
                <NavLink>
                  <Link to="/dashboard" className="nav_items">
                    View Timesheets
                  </Link>
                </NavLink>
              </NavItem>

              <NavItem>
                <NavLink>
                  <Link to="/login" className="login">
                    Login
                  </Link>
                </NavLink>
              </NavItem>
            </Nav>
          </Navbar>
          </div>
          <Switch>
            <Route exact path="/" component={Home} />
            <Route exact path="/submit" component={AddTimeSheet} />
            <Route exact path="/dashboard" component={Dashboard} />
            <Route exact path="/login"component={Login} />
          </Switch>
    
      </Router>
    );
  }
}

export default NavBar;
