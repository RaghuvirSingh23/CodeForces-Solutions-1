#include <bits/stdc++.h>
using namespace std;

int main(){

	int k, n, w, total=0, extra=0;
	cin >> k >> n >> w;
	
	for(int i=1; i<=w; i++){
		total += i*k;
	}
	extra = total-n;
	if(n>=total) cout << 0;
	else cout << extra;
	
	return 0;

}