#include <iostream>
#include <string>
using namespace std;
	int main(){
		struct Student{
			string name;
			int number;
			char sex;
			float score;
		}s1,s2;
		cout<<"put in figures"<<endl;
		cin>>s1.name>>s1.number>>s1.sex>>s1.score;
		cin>>s2.name>>s2.number>>s2.sex>>s2.score;
		cout<<s1.name<<" "<<s1.number<<" "<<s1.sex<<" "<<s1.score<<endl
			<<s2.name<<" "<<s2.number<<" "<<s2.sex<<" "<<s2.score<<endl;

		
		
	
		
		
		
		
	}