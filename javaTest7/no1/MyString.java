package no1;

public class MyString {
    public String s;

    MyString(String s) {
        this.s = s;
    }

    public int showsum(char i) {
        int num = 0;
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.indexOf(i, num) != -1) {
                num = s.indexOf(i, num) + 1;
                sum += 1;
            } else
                return sum;
        }
        return -1;
    }

    public String find(int i, int j) {
        char[] c = s.toCharArray();
        StringBuffer ns = new StringBuffer();
        for (int k = i; k <= j; k++) {
            ns.append(c[k]);
        }
        return new String(ns);
    }
}
