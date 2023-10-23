import java.util.Scanner;
import java.util.ArrayList;

public class problema4 {
    public static void main(String []args)
    {
        ArrayList<Integer> sir_numere= new ArrayList<>();
        ArrayList<Integer> sir_numere_prime= new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cate numere doriti sa introduceti in sir?\n");
        int dim_sir = keyboard.nextInt();
        for(int i=0;i<dim_sir;i++){//adaugare sir
            System.out.println("Introdu numarul:\n");
            int numar = keyboard.nextInt();
            sir_numere.add(numar);
        }
        for (int i=0;i<dim_sir;i++){//citire din sir
            int numar_curent=sir_numere.get(i);
            if (isPrime(numar_curent)) {
                sir_numere_prime.add(numar_curent);
            }

        }
        System.out.println("Sirul de numere prime este"+sir_numere_prime);



    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
