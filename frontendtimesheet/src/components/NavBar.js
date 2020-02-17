import React, { Component } from 'react';
import {
    Navbar,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink
  } from 'reactstrap';
import './css/navbar.css';



class NavBar extends Component {
    
    state = {  }
    
    render() { 
        return (
            
    <div className = "nav_container">
      <Navbar light expand="md">
        <NavbarBrand href="/" className= "nav_items">Skill Storm Timesheet</NavbarBrand>
            <Nav className="mr-auto" navbar>
                <NavItem>
                        <NavLink>
                            <Link to ="/" className="nav_items"> Home </Link>
                        </NavLink>
                </NavItem>
                <NavItem>
                        <NavLink>
                            <Link to ="/submit" className="nav_items">Submit Timesheet </Link>
                        </NavLink>
                </NavItem>
                <NavItem>
                        <NavLink>
                            <Link to ="/dashboard" className="nav_items">View Timesheets
                            </Link>
                        </NavLink>
                </NavItem>
            
                <NavItem>
                        <Link to ="/login" className = "login" >Login</Link>
                </NavItem> 
          
     
      </Navbar>
    </div>
        );
 
    }
}

 
export default NavBar;