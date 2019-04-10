package no3;

public class IDcard {
    private String s;

    boolean ifInGuangdong(String s) {
        return s.startsWith("44");
    }

    void setS(String s) {
        this.s = s;
    }

    String replace(String olds, String news) {
        s = s.replace(olds, news);
        return s;
    }

    String split(String toSplit) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String i : s.split(toSplit)) {
            stringBuffer.append(i + " ");
        }
        s = stringBuffer.toString();
        return s;
    }

    void printS() {
        System.out.println(s);
    }
    int compare(String sysin1, String sysin2){
        return sysin1.compareTo(sysin2);
    }
}
