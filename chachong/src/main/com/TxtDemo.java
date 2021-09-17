package main.com;

import java.io.*;

public class TxtDemo {

        public static String readTxt(String txtPath) {
            //输入文件绝对路径  把文件的全部内容写到字符串str中
            String str = "";
            String strLine;
            // 将 txt文件按行读入 str中
            File file = new File(txtPath);
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                // 字符串拼接
                while ((strLine = bufferedReader.readLine()) != null) {
                    str += strLine;
                }
                // 关闭资源
                inputStreamReader.close();
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;//返回文件的字符串形式
        }

        public static void writeTxt(double txtElem,String txtPath){
            //把重复率txtElem写入文件txtPath中
            String str = Double.toString(txtElem);
            File file = new File(txtPath);
            FileWriter fileWriter = null;

            try {
                fileWriter = new FileWriter(file, true);
                fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
                fileWriter.write("\r\n");
                // 关闭资源
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

