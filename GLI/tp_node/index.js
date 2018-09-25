const PlayerGenerator = require('./playerGenerator');
const PlayerUtils = require('./playerUtils');

let player1 = PlayerGenerator("G4uti3r", 15, 5);
let player2 = PlayerGenerator("z3r0", 15, 5);

player1.displayInfo();
player2.displayInfo();