/*
* Problem 3: Largest prime factor
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
* A: 6857
*/

var bigger = 0;
var max = 600851475143;
var total = 1;
var count = 1;
var numbers = Array();

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

while(true){
	if(total >= max){
		break;
	}
	if(isPrime(count) && (max % count == 0)){
		console.log("-------------");
		console.log("Tot: "+total);
		console.log("Max: "+max);
		total *= count;
		numbers.push(count);
		if(bigger < count){
			bigger = count;
			console.log("Bigger: "+bigger);
		}
	}
	count++;
}
console.log(numbers);
console.log(total);
