#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a%2==0 && b%2==0)
  {
    std::cout<<"circle can be inside a square";
  }
  else{
    std::cout<<"circle cannot be inside a square";}
}