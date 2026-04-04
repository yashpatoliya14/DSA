
class Helper implements Comparable<Helper>{
    int idx=0;
    float fraction=0;
    Helper(int idx , float fraction){
        this.idx = idx;
        this.fraction = fraction;
    }
     @Override
    public int compareTo(Helper other) {
        return Float.compare(this.fraction, other.fraction);
    }
}

public class MaxWeight{
    public static void main(String[] args) {
        int N = 3, W = 50;
        int[] values = {100,60,120}; 
        int[] weight = {20,10,30};
        Helper[] temp = new Helper[N];
        for(int i=0; i<N; i++){
            float frac = (float) values[i] / weight[i];
            temp[i] = new Helper(i, frac);
        }
        float value = 0;
        int s=0;
        for(int i = 0; i<N ; i++){
            if(s<=W){
                if(s + weight[temp[i].idx]<W){

                    s+=weight[temp[i].idx];
                    value+=values[temp[i].idx];
                }else{
                    int remain = W-s;
                    value+=(float)(remain * values[temp[i].idx])/weight[temp[i].idx];

                }
            }
        }

        System.out.println(value);
    }
}
