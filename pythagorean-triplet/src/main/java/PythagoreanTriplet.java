import java.util.*;

class PythagoreanTriplet {
    int tripletOne, tripletTwo, tripletThree;


    PythagoreanTriplet(int a, int b, int c) {
        this.tripletOne = a;
        this.tripletTwo = b;
        this.tripletThree = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();

    }


    static class TypeTriplet {
        int first, second, third;
        String hash;

        TypeTriplet(int a, int b, int c) {
            this.first = a;
            this.second = b;
            this.third = c;
            this.hash = String.format("%d|%d|%d", a, b, c);
        }
    }

    static class TripletListBuilder {
        int sum;
        int maxFactor = 0;


        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;

        }

        private List<TypeTriplet> findAllTriplets(int limit) {
            List<TypeTriplet> triplets = new ArrayList<>();
            List<String> isTripletPresent = new ArrayList<>();
            for (int m = 2; m <= Math.sqrt(limit - 1) + 1; m++) {

                for (int n = 1 + m % 2; n <= Math.min(m, Math.sqrt(limit - Math.pow(m, 2))); n += 2) {
                    if (gcd(m, n) > 1) continue;
                    int tmp = (int) (Math.pow(m, 2) - Math.pow(n, 2));
                    int a = Math.min(tmp, 2 * m * n);
                    int b = Math.max(tmp, 2 * m * n);
                    int c = (int) (Math.pow(m, 2) + Math.pow(n, 2));
                    if (a < 0) continue;
                    TypeTriplet typeTriplet = new TypeTriplet(a, b, c);
                    if (!isTripletPresent.contains(typeTriplet.hash)) {
                        triplets.add(typeTriplet);
                        isTripletPresent.add(typeTriplet.hash);
                    }
                    for (int k = 1; k <= (limit / c) + 1; k++) {
                        TypeTriplet nonPrimeTypeTriplet = new TypeTriplet(k * a, k * b, k * c);
                        if (!isTripletPresent.contains(nonPrimeTypeTriplet.hash)) {
                            triplets.add(nonPrimeTypeTriplet);
                            isTripletPresent.add(nonPrimeTypeTriplet.hash);
                        }
                    }

                }
            }
            return triplets;

        }

        private int gcd(int m, int n) {
            if (m == 0) return n;
            return gcd(n % m, m);
        }


        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            int limit = this.maxFactor == 0 ? this.sum : this.maxFactor;
            List<TypeTriplet> triplets = findAllTriplets(limit);
            triplets.sort(Comparator.comparing(o -> o.first));
            List<PythagoreanTriplet> pythagoreanTriplets = new ArrayList<>();
            for (TypeTriplet typeTriplet : triplets) {

                if (typeTriplet.first + typeTriplet.second + typeTriplet.third == this.sum && typeTriplet.third <= limit) {
                    pythagoreanTriplets.add(new PythagoreanTriplet(typeTriplet.first, typeTriplet.second, typeTriplet.third));

                }


            }

            return pythagoreanTriplets;

        }

    }
}