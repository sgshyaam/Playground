#include<iostream>
using namespace std;
int main()
{
  int t,a,c;
  std::cin>>t>>a>>c;
  int d=(a*75)+(c*30);
  if(d>t)
  {
std::cout<<"Boat will drow";
}
  else
  {
std::cout<<"Boat is stable";
  }
}