class Arraysearch{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    int searchElement=4;
    boolean found = false;
    for (int i=0;i<arr.length;i++){
      if(arr[i]==searchElement){
        found=true;
        break;
      }
    }
    if(found){
      System.out.println(searchElement + " is found in the array.");
        } else {
            System.out.println(searchElement + " is not found in the array.");
        }
    }
  }
