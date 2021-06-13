#include <bits/stdc++.h>
using namespace std;

int main(){

	int n, x=0;
	string op;
	cin >> n;
	while(n-->0){
		cin >> op;
		if(op=="X++" || op =="++X")
			x++;
		else
			x--;
	}
	cout << x;
	
	
	return 0;

}