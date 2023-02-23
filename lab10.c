#include <stdio.h>

/* const */ int A = 9; //initalized A & B values
/* const */ int B = 3; //below is function prototype

float whatPercentage(); //in the 2 invocations, the main difference i saw was in the point of declaration. Specifically the points in which A and B are defined changes the result upon function call

int main(){
	printf("Percentage of B and A is: %.2f\n", whatPercentage());
    	A = 10;
	B = 2; //invoked new values
	printf("Percentage of B and A is NOW: %.2f", whatPercentage()); //function call
}

float whatPercentage(){ // const made it so that it would make variables local and not global, thus producing an error on new value declaration
	return ((float) B/A ) * 100;
}
