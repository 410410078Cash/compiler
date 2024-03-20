int main() {
    char a='A';
    string name="Andy";
    int c=0;
    while(1){
    	name[0]='B';
    	if(name[0] =='C' && !c){   // this will never stop~~
    		break;
    	}
    }
    return 0;
}
