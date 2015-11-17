#include <stdio.h>
#include <stdlib.h>

static const int FOUR_MILLION = 4000000;
void main() {

  int firstIndex = 0;
  int secondIndex = 1;

  int sum = 0;
  int aux = 0;

  while(1) {
    aux = firstIndex + secondIndex;
    if(aux >= FOUR_MILLION) {
        break;
    }

    if(aux % 2 == 0) {
      sum += aux;
    }

    firstIndex = secondIndex;
    secondIndex = aux;
  }
  printf("Total sum is %i\n", sum);
  return;
}
