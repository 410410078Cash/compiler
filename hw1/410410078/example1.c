int main(void) {
    int x = 8;
    const float y = 1.23;	// hello
    /*
    	byebye
    */
    double c = (x*y);
    c += x;
    c -= x;
    c *= x;
    c /= x;
    if(c & 0 == 1){
    	return 1;
    }
    else{
    	return 0;
    }
}
