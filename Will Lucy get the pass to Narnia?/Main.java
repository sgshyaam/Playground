#include<iostream>
int main()
{
  int a,b,x;
  std::cout<<"Enter first number :";
  std::cin>>a;
  std::cout<<" Enter second number :";
  std::cin>>b;
  std::cout<<" Menu\n";
  std::cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>x;
    int c=a+b;
    int d=a-b;
    int e=a*b;
      int f=a/b;
      int g=a%b;
  switch(x)
  {
    case 1:
      std::cout<<c;
      break;
    case 2:
      std::cout<<d;
      break;
    case 3:
      std::cout<<e;
      break;
    case 4:
      std::cout<<f;
      break;
    case 5:
      std::cout<<g;
      break;
    case 6:
      std::cout<<"Invalid operation";
  }
}