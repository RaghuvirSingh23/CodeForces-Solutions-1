#include <bits/stdc++.h>
using namespace std;

int main(){

    int n, k, a[50], count=0;
    cin >> n >> k;
    
    for(int i=0; i<n; ++i){
        cin >> a[i];
    }
    
    int x = a[k-1];

    for(int j=0; j<n; ++j){
        if(a[j]>=x && a[j]>0){
            count++;
        }
    }
    cout << count;
    return 0;
}