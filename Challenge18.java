public class Challenge18
{
    public static void main(String[] args) {
       String[] names = {"Ashir","Aaron","Yousef",
                         "Shariar","Humdan","Afrida",
                         "Koby","Lily","Sam"," Charles",
                         "Abdullahi"};
       int aNamesTotal = 0;
       for(int i = 0;i < names.length;i++) {
           if(names[i].startsWith("a") || names[i].startsWith("A")) {
               aNamesTotal++;
           }
       }
       System.out.println("Number of names beginning with A: " + aNamesTotal);
       String[] aNamesArray = new String[aNamesTotal];
       for(int i = 0, j = 0;i < names.length;i++) {
           if(names[i].startsWith("a") || names[i].startsWith("A")) {
               aNamesArray[j] = names[i];
               j++;
           }
       }
       for(int i = 0; i < aNamesArray.length;i++) {
           System.out.println(aNamesArray[i]);
       }
    }
}
