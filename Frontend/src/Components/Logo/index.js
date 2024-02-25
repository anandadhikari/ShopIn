import React from "react";
import { Link } from "react-router-dom";

import "../../css/logo.css";

export default function index({ style }) {
  return (
    <Link to="/" className="app-logo-container">
      <span style={style}>Shop</span>
      <span>.in</span>
    </Link>
  );
}
