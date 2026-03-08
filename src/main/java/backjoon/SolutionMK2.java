package backjoon;

public class SolutionMK2
{

    public String solution(String input)
    {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args)
    {
        SolutionMK2 sol = new SolutionMK2();

        // 예시 입력: "hello"
        System.out.println(sol.solution("hello")); // 출력: "olleh"
    }
}
