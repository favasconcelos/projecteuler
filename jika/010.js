/*
* Problem 10: Summation of primes
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
* Find the sum of all the primes below two million.
* A: 142913828922
*/

var sum = 0;

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

for(var pos = 0; pos < 2000000; pos++) {
	if(isPrime(pos)){
		sum += pos;
	}
}

console.log("Sum: "+sum);