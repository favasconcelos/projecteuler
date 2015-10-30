/*
* Problem 6: Smallest multiple
* The sum of the squares of the first ten natural numbers is,
* 12 + 22 + ... + 102 = 385
* The square of the sum of the first ten natural numbers is,
* (1 + 2 + ... + 10)2 = 552 = 3025
* Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
* Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
* A: 25164150
*/

var sumSquare = 0;
var sum = 0;

for(var number = 1; number <= 100; number++){
	console.log(Math.pow(number,2));
	sumSquare += Math.pow(number,2);
	sum += number;
}

var squareSum = Math.pow(sum,2);

console.log("Square sum: "+squareSum);
console.log("Some square: "+sumSquare);

var diff = squareSum-sumSquare;

console.log("Diff: "+diff);