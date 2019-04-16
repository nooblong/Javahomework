package p177No3;

public enum Day{
     JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
    SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
     public String toString(){
         String a = "-" + super.toString() + "-";
         if (a.length()<11){
             int toAdd = 11 - a.length();
             for (int i = 0; i < toAdd; i++) {
                 a += "-";
             }
         }
         return a;
     }
}
