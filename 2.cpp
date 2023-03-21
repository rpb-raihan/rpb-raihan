#include <iostream>
using namespace std;

void encode(string str, int j)
{
    int temp;
    for(int i=j; i<str.size(); i=i+j+1)
    {
        temp = str[i];
        str[i] = (char)(temp + j);
    }
    cout << "\nEncoded String: " << str;
}

void decode(string str, int j)
{
    int temp;
    for(int i=j; i>str.size(); i=i-j-1)
    {
        temp = str[i];
        str[i] = (char)(temp + j);
    }
    cout << "\nDecoded String: " << str;
}

int main()
{
    int j;
    string str;
    cout<< "Sample String(s): ";
    ///cin >> str;
    getline(cin,str);
    cout<< "Sample Integer(j): ";
    cin >> j;

    cout << "\nSample Integer: " << j;
    encode(str, j);
    decode(str, j);
    //cout << "\nDecoded String: " << str;
    return 0;
}
