import java.util.*;
public class Calificaciones {
	public static void main(String args[])
    {
		
        System.out.println(	"Nombre del estudiante: Juan Samaniego");
      

        int marks[] = new int[5];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
           System.out.print("Calificación "+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/5;
        System.out.println("Promedio: " + avg);
        System.out.print("Calificación: ");
       
        if(avg>=91)
        {
            System.out.print("A");
        }
        else if(avg>=81 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=71 && avg<80)
        {
            System.out.print("C");
        }
        else if(avg>=61 && avg<70)
        {
            System.out.print("D");
        } 
        else if(avg>=51 && avg<60)
        {
            System.out.print("E");
    }
        else
        {
            System.out.println("F");
        }
        
       
       
    }
}
