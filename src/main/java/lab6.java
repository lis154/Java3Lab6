import java.util.ArrayList;

/**
 * Created by i.lapshinov on 28.08.2018.
 */
public class lab6 {

    int[] mas;

    lab6(int mas[])
    {
        this.mas = mas;
    }
    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6,4,5,6,7};
        int[] mas1 = {4,1,4,1,4};
        lab6 lab = new lab6(mas);
        lab6 lab1 = new lab6(mas1);


        lab.newMas();

        System.out.println(lab1.proverka());
    }


    public int[] newMas ()
    {
        int number = 0;
        for (int i = 0; i < this.mas.length; i++) {
            if (this.mas[i] == 4)
                number = i+1;
        }
        int[] mas2 = new int[this.mas.length - number];
        for (int i = number; i < this.mas.length; i++)
        {
            mas2[i-number] = this.mas[i];
            System.out.println(mas2[i-number]);
        }
        return mas2;
    }

    public boolean proverka()
    {

        boolean prov1 = false;
        boolean prov4 = false;
        for (int i = 0; i < this.mas.length; i++) {
            if (this.mas[i] != 1 && this.mas[i] != 4){
               // System.out.println("end" + this.mas[i]);
                return false;
            }
            if (this.mas[i] == 1) prov1 = true;
            if (this.mas[i] == 4) prov4 = true;
        }
        System.out.println(prov1 + " " + prov4);
        if (prov1 == true && prov4 == true)
        return true;
        else return false;

    }



}
