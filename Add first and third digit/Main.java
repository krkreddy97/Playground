#include<stdio.h>
int main()
{
  int num,sum=0, firstDigit, lastDigit;
  scanf("%d", &num);
    
    /* Find last digit to sum */
    lastDigit = num % 10;
    

    /* Copy num to first digit */
    firstDigit = num;
  while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;
sum = firstDigit + lastDigit; 
  

    printf(" %d", sum);
  return 0;
}