/*
* Problem 5: Smallest multiple
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
* A: 232792560
*/

function isDiv(number){
	for(var i=1; i<=20; i++){
		if(number % i != 0){
			return false;
		}
	}
	return true;
}

var number = 1;

while(true){
	if(isDiv(number)){
		break;
	}
	number++;
}

console.log(number);