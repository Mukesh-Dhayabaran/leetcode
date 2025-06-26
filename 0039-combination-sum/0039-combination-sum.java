class Solution {
  public List<List<Integer>> combinationSum(int[] n, int k) {
        List <List<Integer>> arr = new ArrayList<>();
	    List<Integer> list = new ArrayList<>();
	    backtrack(arr,n,k,0,list);
	    return arr;
	}
	
	static void backtrack(List <List<Integer>> arr,int n[],int k,int index,List<Integer> list)
	{
	    if(k==0)
	    {
	        arr.add(new ArrayList<>(list));
	        return;
	    }
	    
        if(k<0) return;
	    
        for(int i=index;i<n.length;i++)
	    {
	        list.add(n[i]);
	        backtrack(arr,n,k-n[i],i,list);
	        list.remove(list.size()-1);
	    }
	}
}