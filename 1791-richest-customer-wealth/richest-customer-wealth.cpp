class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxsum;
        for(int i=0; i<accounts.size(); i++){
            int currentsum= 0;
            for(int j=0; j<accounts[i].size(); j++){
                currentsum += accounts[i][j];

            }
            if(currentsum>maxsum){
             maxsum = currentsum;
            }

        }

        return maxsum;
        
    }
};