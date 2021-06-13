#include <bits/stdc++.h>
using namespace std;

int main(){

    int n, a, b, min=0, current=0;
    cin >> n;
    while(n-->0){
        cin >> a >> b;
        current += (b-a);
        if(current>min){
            min = current;
        }
    }
    cout << min;
    return 0;
}