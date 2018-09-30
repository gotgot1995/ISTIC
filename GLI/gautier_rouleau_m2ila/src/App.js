import React, { Component } from 'react';
import Cost from './components/Cost';
import logo from './logo.svg';
import './App.css';

const USERS = [ { name: 'Gautier' }, { name: 'Audrey' }, { name: 'Rémi' } ];

const EXPENSES = [
  { key: 0, paidBy: 'Gautier', title: 'New laptop', cost: 684.37 },
  { key: 1, paidBy: 'Audrey', title: 'Nintendo Switch', cost: 360.0 },
  { key: 2, paidBy: 'Rémi', title: 'Kingdom\'s hearts game', cost: 59.99 },
];

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      expenses : EXPENSES,
      title: '',
      paidBy: '',
      amount: 0.0
    };
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          {/* <img src={logo} className="App-logo" alt="logo" /> */}
          <h1 className="App-title">Integration weekend</h1>
        </header>
        <ul>
          {
            this.state.expenses.map(expense => {
              return <Cost title={expense.title} paidBy={expense.paidBy} cost={expense.cost} />;
            })
          }
        </ul>
        <input value={this.state.title} onChange={this.changeTitle} />
        <input value={this.state.paidBy} onChange={this.changeName} />
        <input value={this.state.amount} onChange={this.changeAmount} />
        <button onClick={this.addExpense}>Add</button>
      </div>
      );
  }

  addExpense = () => {
    let truc = {
      paidBy: this.state.paidBy, title: this.state.title, amount: this.state.amount
    };
    console.log(truc);
    this.setState({ expenses: this.state.expenses.push(truc)})
  }

  changeTitle = (e) => {
    this.setState({ title: e.target.value });
  }

  changeName = (e) => {
    this.setState({ paidBy: e.target.value });
  }

  changeAmount = (e) => {
    this.setState({ amount: e.target.value });
  }
}

export default App;
