
package hashtable;

/**
 *
 * @author Anthony
 */
class HashTable{
    int[] arr;
    int tableSize;
    int mode;
    int[] occupied;
    
    HashTable(int mode){
        tableSize = 11;
        arr = new int[tableSize];
        this.mode = mode;
        occupied = new int [tableSize];
    }
    
    public void hash(int val){
        if(this.mode == 0){
            simpleHashing(val);
        }else if(this.mode == 1){
            linearProbing();
        }
    }
    
    int simpleHashing(int key){
        return key % tableSize;
    }
    
    public void linearProbing(){}
    
    public boolean hashInsertion(int key){
        if(this.mode == 0){
          int hashIndex = simpleHashing(key);
           arr[hashIndex] = key;
            hashDisplay(key);
            return true;
        }
        else if(this.mode == 1){
            int hashIndex = simpleHashing(key);
            int counter = 0;
            while(occupied[hashIndex] == 1){
                hashIndex = (hashIndex + 1) % arr.length;
                counter++;
                 if(counter == arr.length){
                return false;
            }
                 
            }
            
            arr[hashIndex] = key;
            hashDisplay(key);
            return true;
           
        }
        return true;
        
        
       
        
     
    }
    
    public boolean hashDeletion(int key){
        
         if(this.mode == 0){
          int hashIndex = simpleHashing(key);
          arr[hashIndex] = 0;
          hashDisplay(0);
          return true;
        }
        else if(this.mode == 1){
            int hashIndex = simpleHashing(key);
            int counter = 0;
            while(occupied[hashIndex] == 2){
                hashIndex = (hashIndex + 1) % arr.length;
                counter++;
                if(counter == arr.length){
                return false;
            }
                
                
            }
            
            arr[hashIndex] = 0;
            hashDisplay(0);
            return true;
            
        }
         return false;
    }
    
    public boolean hashSearch(int key){
        
         if(this.mode == 0){
          int hashIndex = simpleHashing(key);
          arr[hashIndex] = key;
          hashDisplay(key);
          return true;
        }
        else if(this.mode == 1){
            int hashIndex = simpleHashing(key);
            int counter = 0;
            while(occupied[hashIndex] == 2){
                hashIndex = (hashIndex + 1) % arr.length;
                counter++;
                if(counter == arr.length){
                return false;
            }
                
                
            }
            
            arr[hashIndex] = key;
            hashDisplay(key);
            return true;
            
        }
         return false;
        
    }
    
    public void hashDisplay(int key){
        int hashIndex = simpleHashing(key);
        for(int i = 0; i < arr.length; i++){
            arr[hashIndex] = key;
        }
        
        System.out.println(key);
        
    }
    
    public  void hashDisplayInsertion(int key){
        System.out.println(hashInsertion(key));
    }
    
    public void hashDisplaySearch(int key){
        System.out.println(hashSearch(key));
    }
    
    public void hashDisplayDeletion(int key){
        System.out.println(hashDeletion(key));
    }
}


