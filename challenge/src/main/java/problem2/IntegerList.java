package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numElements = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<numElements; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int newSize = list.length == 0 ? 1 : list.length * 2;
        int[] newList = new int[newSize];
        for (int i=0; i<list.length; i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    public void addElement(int newVal){
        if (numElements == list.length){
            increaseSize();
        }
        list[numElements] = newVal;
        numElements ++;
    }

    public void removeFirst(int newVal){
        int index = 0;
        while (index < numElements && list[index] != newVal){
            index ++;
        }

        if (index == numElements) //this is the case where the newVal is not found in the list
            return;

        for (int i=index; i<numElements-1; i++){
            list[i] = list[i+1];
        }

        numElements --;
    }

    public void removeAll(int newVal){
        int i=0;
        while(i < numElements){
            if (list[i] == newVal){
                for (int j=i; j<numElements - 1; j++){
                    list[j] = list[j+1];
                }
                numElements--;
            }
            else{
                i++;
            }
        }
    }

}