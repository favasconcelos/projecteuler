#include <stdio.h>
#include <stdlib.h>

void main() {
  
  int sum = 0;
  int i = 0;

  for(i = 0; i < 1000; i++) {
    if(i % 3 == 0 || i % 5 == 0){
      sum += i;
    }
  }
  printf("The sum is %i", sum);
  return;
}
