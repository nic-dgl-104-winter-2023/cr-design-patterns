// Singleton implementation in JavaScript
class Singleton {
    
    // The constructor contains a check to see if an instance of Singleton
    // has been created. If not, it instantiates member variables (counter) and
    // creates a new instance. Otherwise, it just returns the already instantiated
    // instance.
    constructor(name) {
        if (!Singleton.instance) {
            this.name = name; // name is a member variable
            this.counter = 0; // counter is a member variable
            Singleton.instance = this; // `this` refers to the current instance
        }
        return Singleton.instance; // returns whatever instance already exists
    }

    // The sayName function just prints the name of the instance
    sayName() {
        return this.name;
    }
    // The add function adds 1 to the value of counter with each call
    add() {
        return this.counter += 1;
    }

}


// Example of use
console.log("Creating s1 = new Singleton(\"Alice\")");
let s1 = new Singleton("Alice"); // constructing a new Singleton instance named "Alice"
console.log("Creating s1 = new Singleton(\"Bob\")");
let s2 = new Singleton("Bob"); // Attempting to construct a second instance named "Bob"

console.log("\n\nNotice that the names of both s1 and s2 are identical");
console.log(`s1 name: ${s1.name}`);
console.log(`s2 name: ${s2.name}`);

console.log("\n\nNotice that no matter whether we call add() on s1 or s2 the same counter is incremented");
console.log(`s1.add() returns: ${s1.add()}`);
console.log(`s1.add() returns: ${s1.add()}`);
console.log(`s2.add() returns: ${s2.add()}`);
console.log(`s1.add() returns: ${s1.add()}`);


