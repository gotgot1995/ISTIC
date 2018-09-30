import React, { Component } from 'react';

class Cost extends React.Component {
  render() {
    return <li>{this.props.title} {this.props.paidBy} {this.props.cost} €</li>;
  }
}

export default Cost;
