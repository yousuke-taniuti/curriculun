/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */int data[] = {3,1,2,7,5};
          
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length  /*ここに記述*/; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length/*ここに記述*/; i++) {
            for (int j = 4/*ここに記述*/; j > i; j--) {
                
            
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[i/*ここに記述*/] > data[j/*ここに記述*/]){
                  int box = data[i/*ここに記述*/];
                  data[i/*ここに記述*/] = data[j/*ここに記述*/];
                  data[j/*ここに記述*/] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}