package apply.Day1.practice;

public class Counter {
//  カウント
    private int count = 0;
    private static int totalCount = 0;
    //  コンストラクタ
    public void reset(){
        this.count = 0;
        //totalCount = 0;
    }
    //  カウント
    public void count(){
    	this.count++;
    }
    public int getCount(){
    	totalCount += this.count;
        return this.count;
    }
    //  値の取得
    public static int getTotalCount(){
        return totalCount;
    }

}
