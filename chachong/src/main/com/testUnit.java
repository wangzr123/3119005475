package main.com;

import org.junit.Test;

public class testUnit {

    @Test
    public void orign() {
        String str0 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");
        String str1 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");

        double similarity = Algorithm.getSimilarity(Algorithm.getSimHash(str0), Algorithm.getSimHash(str1));
        TxtDemo.writeTxt( similarity, "D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\result.txt");
    }

    @Test
    public void add() {
        String str0 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");
        String str1 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig_0.8_add.txt");

        double similarity = Algorithm.getSimilarity(Algorithm.getSimHash(str0), Algorithm.getSimHash(str1));
        TxtDemo.writeTxt( similarity, "D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\result.txt");
    }

    @Test
    public void del() {
        String str0 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");
        String str1 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig_0.8_del.txt");

        double similarity = Algorithm.getSimilarity(Algorithm.getSimHash(str0), Algorithm.getSimHash(str1));
        TxtDemo.writeTxt( similarity, "D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\result.txt");
    }

    @Test
    public void dis1() {
        String str0 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");
        String str1 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig_0.8_dis_1.txt");

        double similarity = Algorithm.getSimilarity(Algorithm.getSimHash(str0), Algorithm.getSimHash(str1));
        TxtDemo.writeTxt( similarity, "D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\result.txt");
    }
    @Test
    public void dis10() {
        String str0 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");
        String str1 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig_0.8_dis_10.txt");

        double similarity = Algorithm.getSimilarity(Algorithm.getSimHash(str0), Algorithm.getSimHash(str1));
        TxtDemo.writeTxt( similarity, "D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\result.txt");
    }
    @Test
    public void dis15() {
        String str0 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig.txt");
        String str1 = TxtDemo.readTxt("D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\orig_0.8_dis_15.txt");

        double similarity = Algorithm.getSimilarity(Algorithm.getSimHash(str0), Algorithm.getSimHash(str1));
        TxtDemo.writeTxt( similarity, "D:\\study\\3.1\\first_ruangong\\chachong\\src\\file\\result.txt");
    }

}
