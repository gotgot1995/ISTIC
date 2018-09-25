function getMyPlayerRatio (player, n) {
    return player.attack - n;
}

function fight(player1, player2) {
    let resP1 = getMyPlayerRatio(player1, player2.defense);
    let resP2 = getMyPlayerRation(player2, player1.defense);

    if(resP1 == resP2){
        resP1 += Math.random();
        resP2 += Math.random();
    }
    if(resP1 > resP2) {
        player1.hp = player2.hp;
        player2.hp = 0;
        console.log(`Player ${player1.name} wins !`);
    } else {
        player2.hp = player1.hp;
        player1.hp = 0;
        console.log(`Player ${player2.name} wins !`);
    }
}

module.exports = getMyPlayerRatio;