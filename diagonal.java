//https://practice.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=-1&difficulty[]=0&difficulty[]=1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]-1difficulty[]0difficulty[]1page1category[]Arrays#
class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
          ArrayList<Integer> result = new ArrayList<>();
        int sum=0;
        int max=b[0];
        for(int i=1;i<n;i++){
            if(max<b[i]){
                max=b[i];
            }

        }  
        
        for(int i=0;i<n;i++){
                    sum=sum+a[i][i];
        }
                    
                    result.add(sum);
         result.add(max);
         
         return result;
                
            
        }
       
         
         
        
    }

