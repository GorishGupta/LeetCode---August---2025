import java.util.*;

class DS118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            for (int j = 1; j < i; j++) {
                int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                row.set(j, val);
            }
            pascal.add(row);
        }
        return pascal;
    }

    public static void main(String[] args) {
        DS118 solution = new DS118();
        int numRows = 5;
        List<List<Integer>> result = solution.generate(numRows);
        System.out.println(result);
    }
}