package EjercicioTema7_8_9;

import java.util.ArrayList;

public class Apartado6 {
    public static void main(String[]args){
        ArrayList<Integer>nums=new ArrayList<>();
        for(int i=1;i<=10;i++)nums.add(i);

        nums.removeIf(par -> (par%2==0));

        for (int n:nums) System.out.println(n);



    }
}
