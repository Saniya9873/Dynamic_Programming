public class Book_shop{
    public static void main(String[] args){
        int[] price={4,8,5,3};
        int[] pages={5,12,8,1};
        int c=10;
        int res=0;
        func(0,res,c,price,pages);
    }
    static int func(int i,int res,int c,int[] price,int[] pages){
        if(i==price.length) return res;
        for(int j=0;j<price.length;j++){
            int ex=func(i+1,res,c,price,pages);
            int in=0;
            if(price[i]<=c){
                in=func(i+1,res+pages[i],c-price[i],price,pages);
            }
        }
        return res;
    }
}