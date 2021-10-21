class Solution {
    public String intToRoman(int num) {
        return recursive(num);
    }
    
    public String recursive(int num) {
        String answer = "";
        if(num >= 1000) {
            for(int i = 0; i < num / 1000; i++)
                answer += "M";
            return answer + recursive(num % 1000);
        }
        else if(num >= 900) {
            return "CM" + recursive(num - 900);
        }
        else if(num >= 500) {
            return "D" + recursive(num - 500);
        }
        else if(num >= 400) {
            return "CD" + recursive(num - 400);
        }
        else if(num >= 100) {
            for(int i = 0; i < num / 100; i++)
                answer += "C";
            return answer + recursive(num % 100);
        }
        else if(num >= 90) {
            return "XC" + recursive(num - 90);
        }
        else if(num >= 50) {
            return "L" + recursive(num - 50);
        }
        else if(num >= 40) {
            return "XL" + recursive(num - 40);
        }
        else if(num >= 10) {
            for(int i = 0; i < num / 10; i++)
                answer += "X";
            return answer + recursive(num % 10);
        }
        else if(num == 9) {
            return "IX";
        }
        else if(num >= 5) {
            return "V" + recursive(num - 5);
        }
        else if(num == 4) {
            return "IV";
        }
        else {
            for(int i = 0; i < num; i++)
                answer += "I";
            return answer;
        }
            
    }
}