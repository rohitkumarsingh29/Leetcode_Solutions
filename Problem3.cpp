#include <bits/stdc++.h>
using namespace std;

int lengthOfLongestSubstring(string s) {
        vector<int> hashTable(256,0);
        int l =0,r =0,maxlen = 0;
        //cout <<"String length" << s.length()<< " r is "<<r<< (r < s.length())<<endl;
        while ((l <= r) && (r < s.length())){   
            //cout << r << " " << s[r] << " " << hashTable[s[r]]<< endl;
            if (hashTable[s[r]] == 0){
                hashTable[s[r]]++;
                r++;
                maxlen = ((r-l)>maxlen) ? r-l : maxlen;
            }else{
               hashTable[s[l]]--;
                l++;
            }
        }
        return maxlen;
    }
int main(int argc, char const *argv[])
{
    /* code */
    int res = lengthOfLongestSubstring("bbbbb");
    cout<<"Max len is "<<res<<endl;
    return 0;
}
