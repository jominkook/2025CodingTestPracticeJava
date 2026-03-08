package backjoon;

public class SolutionMK1
{

    public int solution1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }


    public int solution2(int n) {
        int k = (n + 1) / 2;
        return k * k;
    }


    public int solution3(int n) {
        if (n <= 0) return 0;
        if (n % 2 == 1) return n + solution3(n - 2);
        else return solution3(n - 1);
    }

    public static void main(String[] args)
    {
        SolutionMK1 sol = new SolutionMK1();

        int n = 10;
        // 인자 값은 지원자가 적절하게 수정하여 제출
        System.out.println(sol.solution1(n));
        System.out.println(sol.solution2(n));
        System.out.println(sol.solution3(n));
    }
}
