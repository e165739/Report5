package jp.ac.uryukyu.ie.e165739;

/**
 * Created by asayamaibuki on 2016/12/07.
 */
public class Step2 {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e) {
            //NullPointerExceptionの場合
            System.out.println("エラー(NullPointerException)が発生しました。");
            e.printStackTrace();  //直前に実行していた関数やメソッドを表示
        }
    }
}
