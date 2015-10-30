var sum = 0;
function calculateSum() {
	for (var i = 0; i < 1000; i++) {
		if((i % 3 == 0) || (i % 5 == 0) ) {
			sum = sum + i;
		}
	}	
	console.log('The sum is: '+sum)
}

calculateSum();

