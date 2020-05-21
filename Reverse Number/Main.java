#include <stdio.h>
#include<iostream>
 
int main()
{
    long  num, reverse = 0, temp, remainder;
 
    std::cin >> num;
    temp = num;
    while (num > 0)
    {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num /= 10;
    }
    
   
    std::cout << reverse << std::endl;
    
}