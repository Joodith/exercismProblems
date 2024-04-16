import java.util.ArrayList;
import java.util.List;

public class PrimeCalculatorUsingSieveAlg {
    List<Integer> primeNumbers=new ArrayList<>(List.of(2,3,5,7,9,11,13));
    int nth(int nth) {
        if(nth<1) throw new IllegalArgumentException();
        if(nth>primeNumbers.size())  getPrime(nth);
        return primeNumbers.get(nth-1);

    }

    private void getPrime(int nth) {
        int maxPrime=primeNumbers.getLast();
        for(int i=maxPrime+1;nth>primeNumbers.size();i++){
            if(isPrime(i)) primeNumbers.add(i);
        }
    }

    private boolean isPrime(int num) {
        return primeNumbers.stream().allMatch((prime)->num%prime>0);
    }

}
