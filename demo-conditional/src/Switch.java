import java.util.Scanner;

public class Switch {
    public static void main(String [] args){
    char grade = 'B';
    switch (grade){
        case'A':
        System.out.println("A=" + grade);
        break;//break the switch statement
        case'B':
        System.out.println("B="+grade);
        break;//break the switch statement
        default:
        System.out.println("no grade"); }


    if (grade == 'A'||grade =='B' ||grade =='C' )
    System.out.println("B=");
    else
    {System.out.println("C=");}

//ask
    int x =0;//switch 用&& 意思
    switch (grade){
        case'A':
        x += 11;
        case'B':
        x += 12;
        case'C':
        x += 13;
        default:
        x += 10;
        System.out.println(x+"no grade"); }

        //scanner
        Scanner input = new Scanner(System.in);
        System.out.print("pls put a num:");
        int month = input.nextInt();//line of the input =int
        System.out.println("month="+ month);


    }
    
}
