// resposta: 4613732
var total = 4000000;
var a = 0;
var b = 1;
var soma = 0;
while(true){
	var atual = a + b;
	if(atual >= total){
		break;
	}
	if(atual % 2 == 0){
		soma += atual;
	}
	a = b;
	b = atual;
}
console.log(soma);
