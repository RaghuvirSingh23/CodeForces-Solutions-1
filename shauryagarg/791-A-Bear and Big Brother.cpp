#include <bits/stdc++.h>
using namespace std;

int main(){

	int a, b, counter=0;
	cin >> a >> b;
	while(1){
		a = 3*a;
		b = 2*b;
		counter++;
		if(a > b){
			cout << counter;
			break;
		} 
	}
	
	return 0;

}