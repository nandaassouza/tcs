#include <stdio.h>

double fatorial(int n){
    double fat;
    if ( n <= 1 ){
	    return (1);
	} else{
       return n * fatorial(n - 1);
    }
}

int main (void){

	printf(" %.0lf", fatorial(10));
	return 0;
	
}
