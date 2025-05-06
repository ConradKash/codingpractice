let id: number = 5;
//Basic Types

let names: string = "John";
let isBoolean: boolean = true;
let isPublisblised: boolean = true;
let age: number = 25;
let hobbies: any = 2;

age = 30;

let ids: number[] = [3, 4, 6, 7, 8];
let arr: any[];

//Tuple

let person: [number, string, boolean] = [1, "John", true];
let employee: [number, string][];

employee = [
  [1, "conrad"],
  [2, "John"],
  [3, "Doe"],
];

//Union

let pid: string | number = "22";
pid = "conrad";

//Enum
enum Direction {
  Up,
  Down,
  Left,
  Right,
}

enum Direction2 {
  Up = "UP",
  Down = "DOWN",
  Left = "LEFT",
  Right = "RIGHT",
}
// Objects
type User = {
  id: number;
  name: string;
  age: number;
  hobbies: string[];
};
const user: User = {
  id: 1,
  name: "John",
  age: 25,
  hobbies: ["sports", "music"],
};

// Type Assertion

let cid: any = 1;

let customerID = <number>cid;

let customerID2 = <boolean>cid;
let customerID3: string = cid as string;

console.log(typeof customerID);
console.log(typeof customerID2);
console.log(typeof customerID3);
console.log(typeof cid);

// Functions

function addNumber(x: number, y: number): number {
  return x + y;
}

console.log(addNumber(2, 3));

function log(message: string | number): void {
  console.log(message);
}
log("Hello");
log(123);
