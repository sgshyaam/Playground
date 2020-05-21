#include<iostream>
using namespace std;
int main(){
  int a;
  cin>>a;
  int r=a;
  for(int i=1;i<=4;i++)
  {
for(int j=1;j<=i;j++)
{
cout<<r;
}r++;
cout<<"\n";
  }r--;
for(int i=4;i>=1;i--)
  {
for(int j=1;j<=i;j++)
{
cout<<r;
}r--;
cout<<"\n";
  }
}