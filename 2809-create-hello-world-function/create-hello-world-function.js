function createHelloWorld() {
    return function() {
        return "Hello World";
    };
}

// Example usage:
const f = createHelloWorld();
console.log(f()); // "Hello World"
console.log(f({}, null, 42)); 