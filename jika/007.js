/*
* Problem 7: 10001st prime
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
* A: 104743
*/


function isPrime(i){
	if (i < 2) return false;
	var end = Math.floor(Math.sqrt(i));
	for(var pos = 2; pos <= end; pos++){
		if(i % pos == 0){
			return false;
		}
	}
	return true;
}

var count = 0;
var i = 0;
while(true){
	if(isPrime(i)){
		count++;
		if(count == 10001){
			break;
		}
	}
	i++;
}

console.log("10001st prime number: "+i);