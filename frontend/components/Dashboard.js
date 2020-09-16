import React, { Component } from "react";
import { Table, Button } from "reactstrap";
import "react-datepicker/dist/react-datepicker.css";
import DatePicker from "react-datepicker";
import axios from "axios";

class Dashboard extends Component {
  state = {
    isloading: true,
    timesheets: [],
    date: new Date(),
    approval: false
  };

  componentDidMount() {
    // fetch('/timesheets/all')
    axios
      .get("/timesheets/all")
      .then(res => {
        const timesheets = res.data;
        // const isloading = false;
        this.setState({ timesheets });
      })
      .catch(err => {
        console.log(err);
      });
  }

  render() {
    const { timesheets } = this.state;
    console.log(timesheets);

    return (
      <div>
        <h2 color="black">Dashboard</h2>
        <Table>
          <thead>
            <tr>
              <th>Mon Hours</th>
              <th>Tues Hours</th>
              <th>Wed Hours</th>
              <th>Thurs Hours</th>
              <th>Fri Hours</th>
              <th>Sat Hours</th>
              <th>Sun Hours</th>
              <th>Total Hours</th>
              <th>User</th>
              <th>WeekEnd Date</th>
              <th>Approved</th>
            </tr>
          </thead>
          <tbody>
            {timesheets.map((time, index) => (
              <tr key={index}>
                {console.log(time.timesheetId)}
              
                <td>{time.mondayHours}</td>
                <td>{time.tuesdayHours}</td>
                <td>{time.wednesdayHours}</td>
                <td>{time.thursdayHours}</td>
                <td>{time.fridayHours}</td>
                <td>{time.saturdayHours}</td>
                <td>{time.sundayHours}</td>
                <td>
                {time.mondayHours +
                  time.tuesdayHours +
                  time.wednesdayHours +
                  time.thursdayHours +
                  time.fridayHours +
                  time.saturdayHours +
                  time.sundayHours}
              </td>
                
               
                <td>{time.username}</td>
                <td>{time.weekEndDate}</td>
                <td>{time.approval}</td>
                <button color="success">Approve</button>
              </tr>
            ))}
          </tbody>
        </Table>
      </div>
    );
  }
}

export default Dashboard;
