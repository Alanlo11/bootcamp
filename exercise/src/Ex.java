public class Ex {
    public static void main(String[] args) {
        

        byte hoursOfDay = 24;
        byte daysOfWeek = 7;
        byte hoursOfWeek = (byte) (hoursOfDay * daysOfWeek);
        System.out.println(hoursOfWeek);

        String str = "Welcome to programming";
        String newStr = str.replace("WELCOME TO", "");
        char c = newStr.trim().charAt(2);
        System.out.println(c);

        String s = "hello";
        String newstr1 = "";
        if (s.length()>5 || s.indexOf("he")==1) {
            newstr1 = s;
        }else{
            newstr1 += "str";
        }
        System.out.println(newStr);

        
        String str1 = "";
        for(byte i = 127 ; i<128 ; i++){
        str += i;
        if (i<0) {
            break;
        }
        }
        System.out.println(str1);


        String str2 = "";
        for(byte i = 127 ; i<128 ; i++){
            if (i<0){
                continue;
            }
            str += i;
        }
        System.out.println(str2);


        int [] integers = {20,10,40};
        byte [] bytes = new byte[] {2,4,1};
        int score = 0;
        for(int i =0 ; i<3 ; i++){
            if (i%2 == 1){
                score += integers[i];
            }else{
                score += bytes[i];
            }
        }
        System.out.println(score);

        char ii = '\u03C0' ;
        System.out.println("ii="+ii);


    }
    
}
