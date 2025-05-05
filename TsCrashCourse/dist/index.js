"use strict";
let id = 5;
//Basic Types
let names = "John";
let isBoolean = true;
let isPublisblised = true;
let age = 25;
let hobbies = 2;
age = 30;
let ids = [3, 4, 6, 7, 8];
let arr;
//Tuple
let person = [1, "John", true];
let employee;
employee = [
    [1, "conrad"],
    [2, "John"],
    [3, "Doe"],
];
//Union
let pid = "22";
pid = "conrad";
//Enum
var Direction;
(function (Direction) {
    Direction[Direction["Up"] = 0] = "Up";
    Direction[Direction["Down"] = 1] = "Down";
    Direction[Direction["Left"] = 2] = "Left";
    Direction[Direction["Right"] = 3] = "Right";
})(Direction || (Direction = {}));
var Direction2;
(function (Direction2) {
    Direction2["Up"] = "UP";
    Direction2["Down"] = "DOWN";
    Direction2["Left"] = "LEFT";
    Direction2["Right"] = "RIGHT";
})(Direction2 || (Direction2 = {}));
const user = {
    id: 1,
    name: "John",
    age: 25,
    hobbies: ["sports", "music"],
};
// Type Assertion
let cid = 1;
let customerID = cid;
let customerID2 = cid;
let customerID3 = cid;
console.log(typeof (customerID));
console.log(typeof (customerID2));
console.log(typeof (customerID3));
console.log(typeof (cid));
// Functions
function addNumber(x, y) {
    return x + y;
}
console.log(addNumber(2, 3));
function log(message) {
    console.log(message);
}
log("Hello");
log(123);
