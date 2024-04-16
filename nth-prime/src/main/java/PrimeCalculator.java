class PrimeCalculator {

    int nth(int nth) {
        if(nth==0) throw new IllegalArgumentException();
        int nthPrime=0;
        int n=0;
        for(int i=2;i<Integer.MAX_VALUE;i++){
            if (isPrime(i)){
                nthPrime=i;
                n+=1;
                if(n==nth) return nthPrime;

            }
        }
        return nthPrime;
    }

    private boolean isPrime(int num) {
        if(num==2 || num==3) return true;
        for(int div=2;div<=Math.sqrt(num);div++){
            if(num%div==0 && num!=div) return false;
        }
        return true;
    }

}
