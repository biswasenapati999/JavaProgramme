package StringLifeEasy;

public class RemoveDuplicate {
    public static void main(String [] args) {
        String s1 = "banana";
        removeDuplicateChar(s1);
    }
        public static void removeDuplicateChar (String duplicate){
            StringBuilder sb = new StringBuilder();
            String s2 = "";
            for (int i = 0; i < duplicate.length() - 1; i++) {
                char c = duplicate.charAt(i);
                if (s2.indexOf(c) == -1) {
                    s2 += duplicate.charAt(i);
                }

            }
            System.out.println(s2);
        }
    }
