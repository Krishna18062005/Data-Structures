class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int ans=0;
       while(tickets[k]!=0){
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]<=0) continue;
            tickets[i]-=1;
            ans++;
            if(tickets[k]==0) return ans;

        }
       }
        
        

        return ans;
    }
}
class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0) return new int[code.length];
        int[] ans=new int[code.length];
        for(int i=0;i<code.length;i++){
            if(k<0){
                int s=0;
                int c=0;
                int j=i;
                while(c<-k){
                    if(j==0){
                        j=code.length;
                    }
                    j--;
                    c++;
                    s+=code[j];
                }
                ans[i]=s;
            }
            else{
                int s=0;
                for(int j=i+1;j<i+1+k;j++){
                    s+=code[(j%code.length)];
                }
                ans[i]=s;
            }
        }
        return ans;
        
    //     if(k>0){
    //        int[] suffix=new int[code.length];
    //        int s=0;
    //        for(int i=0;i<k;i++){
    //         s+=code[i];
    //        }
    //        int id=0;
    //        for(int i=k;i<code.length+k;i++){
    //         s=s-code[i-k]+code[i%code.length];
    //         suffix[id++]=s;

    //        }
    //        return suffix;
    //    }
    //    int s=0;
    //    int[] prefix=new int[code.length];
    //    for(int j=code.length-1;j>code.length+(k);j--){
    //     s+=code[j];
    //    }
       
    //    for(int j=code.length+k-1;j>=0+k;j--){
    //     prefix[j-]
    //    }
    //    return prefix;
        
    }
}
