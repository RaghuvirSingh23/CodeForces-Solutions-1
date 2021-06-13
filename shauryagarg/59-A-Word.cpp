#include <bits/stdc++.h>
using namespace std;

int main(){

    int lower=0, upper=0;
    string s;
    cin >> s;

    for(int i=0; i<s.length(); i++){
        if(s[0]>=65 && s[i]<=90)
            upper++;
        else
            lower++;
    }

    if(lower<upper){
        for(int i=0; i<s.length(); i++)
            putchar(toupper(s[i]));
    }
    else{
        for(int i=0; i<s.length(); i++)
            putchar(tolower(s[i]));
    }
    return 0;
}