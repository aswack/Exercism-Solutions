class DifferenceOfSquaresCalculator {
    
    int computeSquareOfSumTo(int input) {
        int sumTotal = sum(input);
        return sumTotal*sumTotal;
    }

    int computeSumOfSquaresTo(int input) {
        if (input>0) return input*input + computeSumOfSquaresTo(input-1);
        else return 0;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    static int sum(int n){
        if (n>0) return n + sum(n - 1);
        else return 0;
  }
}