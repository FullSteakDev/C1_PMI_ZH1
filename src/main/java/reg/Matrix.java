package reg;

public class Matrix {
    private int[][] matrix;
    public int sumOfEvenNumbers(){
        int sum = 0;
        for (int[] innerMat : matrix)
            for (int i : innerMat)
                if(i % 2 == 0)
                    sum += i;
        return sum;
    }


}
