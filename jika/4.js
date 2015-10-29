// 906609

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
		// console.log("i["+i+"] * j["+j+"] = v["+valor+"]");
		if(isPali(valor)){
			if(bigger < valor){
				bigger = valor;
			}
		}
		// console.log("-----");
	}
}

console.log(bigger);



