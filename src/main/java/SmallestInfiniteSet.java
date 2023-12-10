// class SmallestInfiniteSet {
//     HashSet<Integer> hs;
//     int smallest;

//     public SmallestInfiniteSet() {
//     hs=new HashSet<Integer>();
//     smallest=1;
//     }

//     public int popSmallest() {
//         if(!hs.isEmpty()){
//             int res=Collections.min(hs);
//             hs.remove(res);
//             return res;
//         }
//         else{
//             smallest++;
//             return smallest-1;
//         }


//     }

//     public void addBack(int num) {
//         if(smallest>num){
//             hs.add(num);
//         }
//     }
// }

import java.util.PriorityQueue;

class SmallestInfiniteSet{
    private int minNum;
    private PriorityQueue<Integer> heap;


    public SmallestInfiniteSet(){
        minNum=1;
        heap=new PriorityQueue<Integer>();
    }

    public int popSmallest(){
        if(heap.isEmpty()){
            minNum++;
            return minNum-1;
        }else{
            return heap.poll();
        }

    }

    public void addBack(int num){
        if(num<minNum && !heap.contains(num)){
            heap.add(num);
        }
    }


}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */