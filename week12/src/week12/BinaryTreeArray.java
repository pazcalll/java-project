package week12;

public class BinaryTreeArray {
    int[] data = new int[10];
    int idxLast;
    BinaryTreeArray bta;
    int size=0;
    
//    public BinaryTreeArray(){
//        data = new int[10];
//    }
    void populateData(int[] data, int adxLast){
        this.data = data;
        this.idxLast=idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void traversePreOrder(int idxStart){
        if (idxStart <= idxLast) {
            System.out.print(" "+data[idxStart]);
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
    void traversePostOrder(int idxStart){
        if (idxStart <= idxLast) {
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
            System.out.print(" "+data[idxStart]);
        }
    }
    void add(int data){
        if (this.data[0]==0){
            this.data[0]=data;
        }
        else{
            while(this.data[0]!=0){
                if (this.data[0]>data) {
                    if (this.data[size*2+1]==0) {
                        this.data[size*2+1] = data;
                        break;
                    }
                    else{
                        size++;
                    }
                }
                else if(this.data[0]<data){
                    if (this.data[size*2+2]==0) {
                        this.data[size*2+2]=data;
                        break;
                    }
                    else{
                        size++;
                    }
                }
            }
        }
        size=0;
    }
    void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+data[i]);
        }
    }
}