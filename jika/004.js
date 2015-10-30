/*
* Problem 4: Largest palindrome product
* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 3-digit numbers.
* A: 906609
*/

var a = 100;
var b = 100;

// 99 9 00
function isPali(number){
	var valor = String(number);
	var ite = Math.floor(valor.length / 2);
	for(var i = 0; i < ite; i++){
		var j = (valor.length-1)-i;
		if(valor[i] != valor[j]){
			return false;
		}
	}
	return true;
}

var bigger = 0;

var valor = 0;
for(var i=999; i>=100; i--){
	for(var j=999; j>=100; j--){
		valor = i * j;
		if(isPali(valor)){
			if(bigger < valor){
				bigger = valor;
			}
		}
	}
}

console.log(bigger);



