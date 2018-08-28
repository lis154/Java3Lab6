import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by i.lapshinov on 28.08.2018.
 */
public class test {
        lab6 lab;
        lab6 lab1;
        lab6 lab2;
        lab6 lab3;
        lab6 lab7;
        lab6 lab8;
        lab6 lab9;

        public test(){}
        int[] mas = {1, 2, 3, 4, 5, 6,7,8,9};
        int[] mas1 = {1,4,5,4,8,6,4,1};
        int[] mas2 = {4,4,4,4,4};
        int[] mas3 = {4,5,6,8,7,4,5};
        int[] mas7 = {1,1,1};
        int[] mas9 = {4,1,4,1,4};



        @Before
        public void init()
        {
            this.lab = new lab6(mas);
            this.lab1 = new lab6(mas1);
            this.lab2 = new lab6(mas2);
            this.lab3 = new lab6(mas3);
            this.lab7 = new lab6(mas7);
            this.lab8 = new lab6(mas);
            this.lab9 = new lab6(mas9);


        }
        int[] mas01 = {5,6,7,8,9};
        int[] mas11 = {4,5,8};
        int[] mas21 = {};
        int[] mas31 = {5};



        @Test
        public void test1() {
            Assert.assertArrayEquals(mas01, this.lab.newMas());
        }
         @Test
         public void test2() {
            Assert.assertArrayEquals(mas11, this.lab1.newMas());
        }
         @Test
        public void test3() {
              Assert.assertArrayEquals(mas21, this.lab2.newMas());
         }
        @Test
         public void test4() {
             Assert.assertArrayEquals(mas31, this.lab3.newMas());
         }

    @Test
    public void test5() {
        Assert.assertEquals(true, this.lab7.proverka());
    }
    @Test
    public void test6() {
        Assert.assertEquals(true, this.lab8.proverka());
    }
    @Test
    public void test7() {
        Assert.assertEquals(true, this.lab9.proverka());
    }



}
