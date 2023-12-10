import java.util.Arrays;
import java.util.HashMap;

class Solution{
    HashMap<String,Integer> map=new HashMap<>();
    public int equalPairs(int [][] grid){
        for(int[] row:grid){
            String key=Arrays.toString(row);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int pairs=0;
        for(int c=0;c<grid.length;c++){
            int [] col=new int[grid.length];
            for(int r=0;r<grid[0].length;r++){
                col[r] = grid[r][c];
            }

            pairs = pairs + map.getOrDefault(Arrays.toString(col),0);
        }
        return pairs;
    }

}