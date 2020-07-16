 //1
package collections.shoppingcart;//1
//2
import java.util.List;//2
import java.util.Scanner;//3
    new Object();//4
    Math.sin( 3.1415 );//5
    42 * 64;//6
//3
    @Override
    public int hashCode() {//7
        int hash = 7;//8
        hash = 29 * hash + Objects.hashCode(this.pid);//9
        hash = 29 * hash + Objects.hashCode(this.name);//10
        hash = 29 * hash + Objects.hashCode(this.price);//11
        hash = 29 * hash + Objects.hashCode(this.stock);//12
        return hash;//13
    }
class Example1b {//14
//4
    public static void main(String[] args) {//15
        int \u03b8 = 25;//16
        System.out.println(\u03b8);//17
    }//18
}
public class Tilang {
    public static void main(String[] args) {//19
        boolean SIM = false;//20
        boolean STNK = true;//21
//5
        // cek apakah dia akan ditilang atau tidak//6
        if(SIM == true){//22
            if( STNK == true ) {//23
                System.out.println("Tidak ditilang!");//24
            }
        } else {
            System.out.println("Anda ditilang!");//25
        }
    }
}
//7
public class LampuLalulintas {
    public static void main(String[] args) {//26
//8
        // membuat variabel dan Scanner//9
        String lampu;//27
        Scanner scan = new Scanner(System.in);//28
//10
        // mengambil input //11
        System.out.print("Inputkan nama warna: ");//29
        lampu = scan.nextLine();//30
//12
        switch(lampu){//31
            case "merah":
                System.out.println("Lampu merah, berhenti!");//32
                break;//33
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");//34
                break;//35
            default:
                System.out.println("Warna lampu salah!");//36
        }
    }
}
//13
class forLoopDemo //71
{ 
    public static void main(String args[]) //37
    { 
    for (int x = 2; x <= 4; x++) //38
        System.out.println("Value of x:" + x); //39
    }
} 
//14
class dowhileloopDemo //70
{ 
    public static void main(String args[]) //40
    { 
        int x = 21; //41
        do//42
        { 
            System.out.println("Value of x:" + x); //43
            x++; //44
        } 
        while (x < 20); //45
    } 
} 
//15
class Myclass1  //69
{  
    public static void main(String args[])  //46
    {  
        int n = 1;  //47
        while (n <= 15) //48 
        {  
            System.out.println("\n" + n);  //49
            n++;  //50
            if (n == 7)  //51
            {  
                break;  //52
            }  
        }  
    }  
}  
  //16
class Myclass1  //68
    {  
       public static void main(String[] args)  //53
       {  
          yahoo(true);  //54
          System.out.println("hi");  //55
       }  
       public static void yahoo(boolean a)  //56
       {  
          System.out.println("1");  //57
          if (a)  //58
          {  
             return;  //59
          }  
          System.out.println("2");  //60
          System.out.println("3");  //61
       }  
    }  
//17
//18
class Test//67
{
    public static void main(String[] args) //62
        {
            for(int j=1; j<=100; j++) //63
            {
                if(j%2==0)//64
                {
                    continue;//65
                }
            System.out.println(j);//66
        }
    }
}
