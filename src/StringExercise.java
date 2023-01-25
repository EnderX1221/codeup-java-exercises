public class StringExercise {

    public static void main(String[] args) {
        new StringExercise();
    }

    public StringExercise() {

    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }


    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }


    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }


    public String makeOutWord(String out, String word) {
        return out.substring(0,out.length()/2) + word + out.substring((out.length()/2));
    }



    public String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end + end + end;
    }


    public String firstTwo(String str) {
        return str.length() >= 2 ? str.substring(0,2) : str;
    }


    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }


    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }





    public String deFront(String str) {
        if(str.length() < 2) return str;
        if(str.charAt(0) == 'a' && !(str.charAt(1) == 'b')) {
            return str.substring(0,1) + str.substring(2);
        } else if(!(str.charAt(0) == 'a') && str.charAt(1) == 'b') {
            return str.substring(1);
        } else if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        } else {
            return str.substring(2);
        }

    }


    public String startWord(String str, String word) {
        if (word.length() > str.length()) return "";
        if (str.substring(0, word.length()).equals(word)) return word;
        if (str.substring(1, word.length()).equals(word.substring(1)))
            return str.charAt(0) + word.substring(1);
        return "";

    }


    public String withoutX(String str) {
        if(str.startsWith("x")) str = str.substring(1);
        if(str.endsWith("x")) str = str.substring(0,str.length()-1);
        return str;
    }


    public String withoutX2(String str) {
        if(str.length() < 2) return str.contains("x") ? "" : str;
        if(str.charAt(0) == 'x' && str.charAt(1) != 'x') return str.substring(1);
        if(str.charAt(0) != 'x' && str.charAt(1) == 'x') return str.substring(0,1) + str.substring(2);
        if(str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
        return str;
    }

    public String doubleChar(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            result += str.substring(i, i+1) + str.substring(i, i+1);
        }
        return result;
    }


    public int countHi(String str) {
        if(str.length() < 2) return 0;
        return "hi".equals(str.substring(0,2)) ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
    }


    public boolean catDog(String str) {
        if(str.length() < 3) return true;
        int cat = 0;
        int dog = 0;
        for(int i = 0; i < str.length() - 2; i++) {
            String check = str.substring(i, i+3);
            if("cat".equals(check)) cat++;
            if("dog".equals(check)) dog++;
        }
        return dog == cat;
    }


    public int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-3; i++) {
            if("co".equals(str.substring(i, i + 2))
                    && 'e' == str.charAt(i + 3))
                count++;
        }
        return count;
    }


    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return b.endsWith(a) || a.endsWith(b);
    }


    public boolean xyzThere(String str) {
        for(int i = 0; i < str.length()-2; i++) {
            String check = str.substring(i, i+3);
            if("xyz".equals(check)) {
                if(i == 0) return true;
                if(str.charAt(i - 1) != '.') return true;
            }
        }
        return false;
    }


    public boolean bobThere(String str) {
        return str.matches("[a-zA-z0-9]{0,}[b]{1}[a-zA-z0-9]{1}[b]{1}[a-zA-z0-9]{0,}");
    }


    public boolean xyBalance(String str) {
        boolean balanced = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x') balanced = false;
            if(str.charAt(i) == 'y') balanced = true;
        }
        return balanced || !(str.contains("x"));
    }


    }




