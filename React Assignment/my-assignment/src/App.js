import React, { Component } from 'react';

import './App.css';
import UserInput from './UserInput/UserInput';
import UserOutput from './UserOutput/UserOutput';

class App extends Component {
  
  state = {
    username : ''
  }

  nameChangehandler = (event) => {
    this.setState({
      username : event.target.value
    });
  }
  render() {
     
    return (
      <div className="App">
      
        <UserInput click={this.nameChangehandler} presentName={this.state.username}/>
        <UserOutput name={this.state.username}/>
        <UserOutput name={this.state.username}/>
      </div>
    );
  }
}

export default App;
