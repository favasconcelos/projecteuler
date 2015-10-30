/*
* Problem 9: 10001st prime
* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
* a2 + b2 = c2
* For example, 32 + 42 = 9 + 16 = 25 = 52.
* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
* Find the product abc.
* A: 31875000
*/

var sum = 1000;
var a = 1;
var b = 1;
var c = 1;
var found = false;
for (a = 1; a <= sum/3; a++){
	for (b = a + 1; b <= sum/2; b++){
		c = sum - a - b;
		if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
			console.log("a["+a+"] b["+b+"] c["+c+"]");
			found = true;
			break;
		}
	}
	if(found){
		break;
	}
}
var result = a * b * c;
console.log("A:"+a+" B:"+b+" C:"+c+" ");
console.log("Result: "+result);
