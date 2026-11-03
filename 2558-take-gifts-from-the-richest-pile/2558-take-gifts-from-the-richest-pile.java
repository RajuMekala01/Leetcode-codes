class Solution {
    public long pickGifts(int[] gifts, int k) {
       int n=gifts.length;
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i:gifts) {
			pq.add(i);
		}

		for(int i=0;i<k;i++) {
		
			int sq=(int)Math.sqrt(pq.poll());
			pq.add(sq);
			
		}
		long ans=0;
		for(int j:pq) {
			ans+=j;
		}
		return ans; 
    }
}