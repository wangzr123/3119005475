package main.com;



public class testMain {

    public static void testAll(){

        String[] str = new String[6];
        str[0] = TxtDemo.readTxt("D:/study/3.1/first_ruangong/chachong/src/file/orig.txt");
        str[1] = TxtDemo.readTxt("D:/study/3.1/first_ruangong/chachong/src/file/orig_0.8_add.txt");
        str[2] = TxtDemo.readTxt("D:/study/3.1/first_ruangong/chachong/src/file/orig_0.8_del.txt");
        str[3] = TxtDemo.readTxt("D:/study/3.1/first_ruangong/chachong/src/file/orig_0.8_dis_1.txt");
        str[4] = TxtDemo.readTxt("D:/study/3.1/first_ruangong/chachong/src/file/orig_0.8_dis_10.txt");
        str[5] = TxtDemo.readTxt("D:/study/3.1/first_ruangong/chachong/src/file/orig_0.8_dis_15.txt");

        String resultFlie = "D:/study/3.1/first_ruangong/chachong/src/file/result.txt";
        for(int i = 0; i <= 5; i++){
            double result = Algorithm.getSimilarity(Algorithm.getSimHash(str[0]), Algorithm.getSimHash(str[i]));
            TxtDemo.writeTxt(result, resultFlie);
        }
    }


}
