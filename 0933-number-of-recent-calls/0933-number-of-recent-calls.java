class RecentCounter {
// int[] a;
// int size=0;
Deque<Integer> q;
    public RecentCounter() {
        // a=new int[10000];
        q=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        
        q.offer(t);

        while(q.peek()<t-3000){
            q.pollFirst();
        }
        return q.size();


        // a[size]=t;
        // size++;
        // int count=0;
        // for(int i=0;i<size;i++){
        //     if(t-a[i]<=3000){
        //         count++;
        //     }
        // }
        // return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */