class Solution {
    public String multiply(String num1, String num2) {
        return mult(num1, num2);
    }
    
    public String mult(String num1, String num2) {
        List<String> ansList = new ArrayList<>();
        for(int i = 0; i < num1.length(); i++) {
            String ans = "";
            int adder = 0;
            for(int j = 0; j < num2.length(); j++) {
                int a = Integer.parseInt(num1.charAt(num1.length() - i - 1) + "");
                int b = Integer.parseInt(num2.charAt(num2.length() - j - 1) + "");
                ans = Integer.toString((a * b + adder) % 10) + ans;
                adder = (a * b + adder) / 10;
            }
            if(adder > 0)
                ans = adder + ans;
            for(int q = 0; q < i; q++)
                ans += "0";
            ansList.add(ans);
        }
        
        String ans = "";
        
        for(String s : ansList) {
            System.out.println("ans : " + ans);
            System.out.println("s : " + s);
            ans = add(ans, s);
        }
        if(checkZero(ans))
            ans = "0";
        
        return ans;
    }
    
    public String add(String s1, String s2) {
        String ans = "";
        int adder = 0;
        for(int i = 0; i < max(s1.length(), s2.length()); i++) {
            int a = 0;
            int b = 0;
            if(s1.length() > i)
                a = Integer.parseInt(s1.charAt(s1.length() - i - 1) + "");
            if(s2.length() > i)
                b = Integer.parseInt(s2.charAt(s2.length() - i - 1) + "");
            
            ans = (a + b + adder) % 10 + ans;
            adder = (a + b + adder) / 10;
        }
    if(adder > 0)
        ans = adder + ans;
        return ans;
    }
    
    public int max(int a, int b) {
        if(a > b)
            return a;
        return b;
    }
    
    public boolean checkZero(String s) {
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != '0')
                return false;
        return true;
    }
}