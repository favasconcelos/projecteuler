/*
* Problem 1: Multiples of 3 and 5
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
* A: 233168
*/
var total = 0;
for(var pos=0; pos<1000; pos++){
	if(pos%3 == 0 || pos%5 == 0){
		total += pos;
	}	
}
console.log(total);