class Solution {
  public List<List<Integer>> combine(int n, int k) {
        List <List<Integer>> arr = new ArrayList<>();
	    List<Integer> list = new ArrayList<>();
	    backtrack(arr,n,k,1,list);
	    return arr;
	}
	
// 	static List<Character> list = new ArrayList<>();
	
	static void backtrack(List <List<Integer>> arr,int n,int k,int index,List<Integer> list)
	{
	    if(list.size()==k)
	    {
	        arr.add(new ArrayList<>(list));
	        return;
	    }
	    
	    for(int i=index;i<=n;i++)
	    {
	        list.add(i);
	        backtrack(arr,n,k,i+1,list);
	        list.remove(list.size()-1);
	    }
	}
}