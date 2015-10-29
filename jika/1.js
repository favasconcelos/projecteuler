
var total = 0;
for(var pos=0; pos<1000; pos++){
	if(pos%3 == 0 || pos%5 == 0){
		total += pos;
	}	
}
console.log(total);