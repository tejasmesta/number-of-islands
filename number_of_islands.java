
class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        
        int c = 0;
        
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,m,n,grid);
                    c++;
                }
            }
        }
        
        return c; 
    }
    
    void dfs(int i,int j,int m,int n,char grid[][])
    {
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!='1')
        {
            return;
        }
        
        grid[i][j] = '2';
        
        dfs(i+1,j,m,n,grid);
        dfs(i,j+1,m,n,grid);
        dfs(i-1,j,m,n,grid);
        dfs(i,j-1,m,n,grid);
        dfs(i+1,j+1,m,n,grid);
        dfs(i+1,j-1,m,n,grid);
        dfs(i-1,j+1,m,n,grid);
        dfs(i-1,j-1,m,n,grid);
        
        return;
    }
    
}
