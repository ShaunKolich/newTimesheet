import React, { Component } from "react";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import {
  Col,
  Button,
  Form,
  FormGroup,
  Label,
  Input,
  FormText,
  Row
} from "reactstrap";
import "./css/addTimeSheet.css";


class AddTimeSheet extends Component {
  state = {};

  render() {
    return (
      <Row form>
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Monday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup >
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Tuesday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup >
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Wednesday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup>
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Thursday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup>
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Friday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup>
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Saturday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup>
        <FormGroup className = "formGroup">
          <Col sm={10}>
            <Label for="mondayHours">Sunday Hours</Label>

            <Input type="mondayHours" name="mondayHours"></Input>
          </Col>
        </FormGroup>
        <FormGroup className="formGroup">
          <Button color = "success">Submit</Button>
          <Button color = "danger">Delete</Button>
        </FormGroup>
      </Row>
    );
  }
}

export default AddTimeSheet;
