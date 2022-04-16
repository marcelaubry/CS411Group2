import React from 'react';
import { Link } from 'react-router-dom';
import classes from '../styles/Home.module.css';

const Home = () => (
  <div className={classes.Home}>
    <div className="d-flex justify-content-center flex-column align-items-center h-100">
      <h1 style={{ color: 'Black' }}>Appointment Booking</h1>
      <div className="d-flex mt-3">
        <select className={`${classes.Select} ${classes.Button} mr-4`}>
          <option> Boston </option>
          <option> NewYork </option>
        </select>
        <Link to="/appointments/new" className={classes.Button}>
          Add Appointment
        </Link>
      </div>
    </div>
  </div>
);

export default Home;
