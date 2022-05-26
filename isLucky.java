boolean solution(int n) {
    int numDigits = String.valueOf(n).length();
    int sumFirst=0;
    int sumSecond=0;
    for(int i=0;i<numDigits;i++){
        if(i>=numDigits/2){
            sumSecond+=n%10;                        
        }
        else{
            sumFirst+=n%10;
        }
        n/=10;
    }
    if(sumSecond==sumFirst){
        return true;
    }
    else{
        return false;
    }
}
