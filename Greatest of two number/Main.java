#include<stdio.h>
int main()
{
 int num1,num2,num3;
  scanf("%d%d%d",&num1,&num2,&num3);
  {
    if(num1>num2)
      printf("num1 is the greatest");
    else
       printf("num2 is the greatest");
  }
  if (num1==num2)
    printf("Both number Equal");
  return 0;
}