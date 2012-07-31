//============================================================================
// Name        : ProblemSolving.cpp
// Author      : haruna
// Version     :
// Copyright   : haruna kibirige
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<set>

using namespace std;

int comp;
struct classcomp
{
  bool operator() (const int& lhs, const int& rhs) const
  {
	  return (lhs-rhs>comp);
  }
};

multiset<int,classcomp>values;
multiset<int>::iterator x;



void optimise(int jobs[],int y,int d);

int T,N,K;
int main()
{
	int i,l,j,temp;

	cin>>T;
	for(i=0;i<T;i++)
	{
		cin>>N>>K;
		int jobs[N];
		values.clear();
		comp=K;
		for(j=0;j<N;j++)
		{
			cin>>temp;
			values.insert(temp);
		}
		for(l=0,x=values.begin();x!=values.end();x++,l++)
		{
			//cout<<*x<<endl;
			jobs[l]=*x;
		}
		optimise(jobs,N,K);
	}
	return 0;
}
 void optimise(int jobs[],int y,int d)
 {
	 int day=0;
	 int endJ=y-1;
	 for(int i=0;i<y;i++)
	 {
		 for(int j=endJ;j>0;j--)
		 {

		 }
		cout<<jobs[i]<<" ";
	 }
	 cout<<endl<<day<<endl;
 }
/*
 * 1
8 51
49 57 3 95 98 100 44 40
ans 3
 */
