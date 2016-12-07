package jp.ac.uryukyu.ie.e165739;

/**
 * Created by asayamaibuki on 2016/12/07.
 */
public class Step3 {
    public static void main(String[] args){
        try{
            String str = "3．14";
            double value = Double.parseDouble(str);
        }catch (NullPointerException e) {
            System.out.println("エラー(NullPointerException)が発生しました。");
            e.printStackTrace();
        }catch (NumberFormatException e) {
            System.out.println("エラー(NumberFormatException)が発生しました。");
            e.printStackTrace();
        }
    }
}
