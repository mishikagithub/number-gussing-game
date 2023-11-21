import java.util.Random;
import java.util.Scanner;

class game1{
    public int number;
    public int inputnumber;
    public int noofgussess=0;

    public int getnoofgussess(){
        return noofgussess;
    }
    public int setnoofgussess(){
        this.noofgussess=noofgussess;
        return 0;
    }
    void Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserinput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Guess the number");
        inputnumber = sc.nextInt();


    }
    boolean iscorrectnumber(){
        noofgussess++;
        if(inputnumber==number){
            System.out.format("yes you guess it wright %d\n you guess no. in %d time", number, noofgussess);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("your number is lesser than computer");
        }
        else if(inputnumber>number){
            System.out.println("yout number is geater than computer");
        }
        return false;
    }
}
public class game2 {
    public static void main(String[] args){
        /*
        1.constructor to generate the random number
        2.takeuserInput() to take auser input of number
        3.iscorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noofguessess
        use properties such as noofguesses(int), etc to get this task done
         */

        game1 g =new game1();
        boolean b=false;
        while(b){
            g.takeuserinput();
           b= g.iscorrectnumber();
            System.out.println(b);
        }


    }
}
