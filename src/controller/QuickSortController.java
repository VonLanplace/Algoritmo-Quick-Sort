package controller;

public class QuickSortController{
    public QuickSortController(){
        super();
    }
    public void printVec(int[] vec){
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for(int i: vec){
            buffer.append(i).append(",");
        }
        buffer.deleteCharAt(buffer.length()-1);
        buffer.append("]");
        System.out.println(buffer.toString());
    }
    public void sort(int[] vec){
        quickSort(vec,0,vec.length-1);
    }
    private void quickSort(int[] vec, int min, int max){
        int bot = min;
        int top = max;
        int pivo = vec[(max+min)/2];

        while(bot <= top){
            while(vec[bot] < pivo)
                bot++;

            while(vec[top] > pivo)
                top--;

            if(bot <= top){
                int aux  = vec[bot];
                vec[bot] = vec[top];
                vec[top] = aux;
                top--;
                bot++;
            }
        }

        if(min<top)
            quickSort(vec,min,top);
        if(bot<max)
            quickSort(vec,bot,max);
    }
}
