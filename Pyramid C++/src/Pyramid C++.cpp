//============================================================================
// Name        : Pyramid.cpp
// Author      : Marie Mb
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <stdio.h>
#include <cstdlib>
using namespace std;

int main() {
	int rows,space,i,j;
		printf("Enter number of rows: ");
		scanf("%4d",&rows);
			for(i=0;i<rows;++i) {
				printf("\n");
				for (space=1;space<=rows-i;++space){
					printf(" ");
				}
				for(j=0;j<=i;++j) {
					printf("%4d",1);
				}
				printf("\n");

			}
	system("pause");
	return 0;
}
