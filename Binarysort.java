class Binarysort{
  public static void main(String args[]){
    int arr[]={10,30,40,50,60,70,80};
    int keyElement=70;
    int left = 0;  
    int right = arr.length - 1;
    int mid=left+right;
    whie(true){
      if(mid==keyElement){
        System.out.println("Element is found at "+mid+"th position");
        break;
    }
    else if(mid<keyElement){
      left = mid + 1;
    }
      else{
        right = mid - 1; 
      }
    }
  }
}
