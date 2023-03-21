#include<iostream>
using namespace std;

struct Student{
    int uId;
    int sem;
    int credit;
    float cgpa;
};

int main()
{

    struct Student s[15];
    int i, n = 0;
    bool isUsed[15] = {0};

    for(i = 0; i<14; i++)
    {
        cout<< "Please enter the id of serial " << (i+1) << " student: "<< endl<<endl;
        cout<< "Enter student id: ";
        cin>>n;

        if(n>= 0 || n<=14)
        {
            if(isUsed[n] == false)
            {
                s[n].uId = n;
                isUsed[n] = true;
                cout<< "Enter completed semester numbers: ";
                cin>> s[n].sem;
                cout<< "Enter completed credits: " ;
                cin>> s[n].credit;
                cout<< "Enter cgpa: ";
                cin>> s[n].cgpa;

            }
            else{
                cout<< "Student id already taken: "<<endl;
                i--;
            }
        }

        else
        {
            cout<< "Invalid! Valid id from 0 to 14"<<endl;
            i--;
        }

    }

    cout<< "Students who have cgpa more than 3.50: "<<endl;

    for(int i=0; i<14; i++)
    {
        if(s[i].cgpa> 3.50)
        {
            cout<< "Student ID: "<< s[i].uId<<endl;
        }
    }

    cout<< "Students who have completed more than 50 credits: "<<endl;

    for(int i=0; i<14; i++)
    {
        if(s[i].credit> 50)
        {
            cout<< "Student ID: "<< s[i].uId<<endl;
        }
    }

    cout<< "Students who have completed minimum 2 semesters and minimum 28 credits: "<<endl;

    for(int i=0; i<14; i++)
    {
        if(s[i].sem>= 2 && s[i].credit>=28)
        {
            cout<< "Student ID: "<< s[i].uId<<endl;
        }
    }



    return 0;
}
