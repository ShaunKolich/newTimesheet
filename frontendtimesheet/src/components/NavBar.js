import React, { Component } from 'react';
import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink,
    NavbarText
  } from 'reactstrap';


class NavBar extends Component {
    
    state = {  }
    
    render() { 
        return (
            
            <div>
      <Navbar color="light" light expand="md">
        <NavbarBrand href="/">Skill Storm Timesheet</NavbarBrand>
            <Nav className="mr-auto" navbar>
            <NavItem>
              <NavLink href="/components/">Components</NavLink>
            </NavItem>
            <NavItem>
              <NavLink href="https://github.com/reactstrap/reactstrap">GitHub</NavLink>
            </NavItem>
          </Nav>
          <NavbarText>Simple Text</NavbarText>
     
      </Navbar>
    </div>
        );
 
    }
}

 
export default NavBar;