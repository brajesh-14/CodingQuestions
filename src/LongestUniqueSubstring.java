public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";
        int len = 0;
        String sub = "";

        for(int i = 0; i < str.length(); ++i) {
            boolean[] visited = new boolean[255];

            for(int j = i; j < str.length() && !visited[str.charAt(j)]; ++j) {
                visited[str.charAt(j)] = true;
                if (j - i + 1 > len) {
                    len = j - i + 1;
                    sub = str.substring(i, j + 1);
                }
            }
        }

        System.out.println(sub);
    }
}
