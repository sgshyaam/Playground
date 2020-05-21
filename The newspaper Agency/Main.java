#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  std::cin>>w>>x>>y;
  int s=(w*x)-(100+(w*y));
  std::cout<<s;
}