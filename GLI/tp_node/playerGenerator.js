function playerGenerator(n, a, d) {
    const hp = 100;
    return {
        name: n,
        attack: a,
        defense: d,
        hp: hp,
        displayInfo: function(){
            console.log(`My name is ${n}, I have ${a} attack, ${d} defense and ${hp} health points.`);
        }
    };
};

module.exports = playerGenerator;