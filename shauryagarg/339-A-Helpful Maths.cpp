#include <bits/stdc++.h>
using namespace std;

int main(){

	string s;
	cin >> s;
	for(int j=0; j<s.length()-1; j=j+2){
		for(int i=0; i<s.length()-j-1; i=i+2){
			if(s[i] > s[i+2]){
				char temp = s[i];
				s[i] = s[i+2];
				s[i+2] = temp;
			}
		}
	}
	cout << s;
	return 0;

}