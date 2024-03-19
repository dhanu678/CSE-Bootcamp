class Pattern6{
    public static void main(String[] args){
        // 1            
        // 1 2          
        // 1 2 3        
        // 1 2 3 4      
        // 1 2 3 4 5    
        // 1 2 3 4 5 6  
        int n = 6;

        for(int i = 0 ; i < n ; i++){  //i = 5
            
            for(int j = 0 ; j < i + 1 ; j++){

                System.out.print(j + 1 + " ");

            }

            System.out.println();
        }
    }
}