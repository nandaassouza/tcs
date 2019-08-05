#include <stdio.h>

int main (){
	int i=0;
	int j=0;
	int a [4][4];
	for (i=0;i<4;i++){
		for (j=0; j<4;j++){
			a[i][j] = 0;
			printf("%d", a[i][j]);
		}
		printf("\n");
	}
}
