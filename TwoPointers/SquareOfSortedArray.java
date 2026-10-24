class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        List<Integer> neg=new ArrayList<>();
        List<Integer> pos=new ArrayList<>();

        //Seperate pos and neg
        for(int num:nums){
            if(num<0){
                neg.add(num);
            }
            else{
                pos.add(num);
            }
        }
        int n1=neg.size();
        int n2=pos.size();

        //No neg nos
        if(n1==0){
            for(int i=0;i<n2;i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        //No pos nos
        if(n2==0){
            for(int i=0;i<n1;i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        //contains both pos and neg nos
        int i=0,j=0,id=0;
        int[] res=new int[n1+n2];

          //Square neg and reverse
          for(i=0;i<n1;i++){
            neg.set(i,neg.get(i)*neg.get(i));
          }
          Collections.reverse(neg);

          //Square pos nos
          for(i=0;i<n2;i++){
            pos.set(i,pos.get(i)*pos.get(i));
          }

          //Merge two sorted arrays
          i=0; j=0;
          while(i<n1 && j<n2){
            if(neg.get(i)<pos.get(j)){
                res[id++]=neg.get(i++);
            }
            else{
                res[id++]=pos.get(j++);
            }
          }
          while(i<n1){
            res[id++]=neg.get(i++);
          }
          while(j<n2){
            res[id++]=pos.get(j++);
          }
        
        return res;
    }
}