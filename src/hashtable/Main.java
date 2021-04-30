/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author Anthony
 */
public class Main {
    public static void main(String[] args) {
        HashTable hash = new HashTable(0);
        HashTable hash1 = new HashTable(1);
        
         int[] values_to_append = {8, 15, 22, 5};
         
         System.out.println("Key value pairs:");
        
        for(int value: values_to_append){
            hash.hashInsertion(value);
        }
        
        System.out.println("");
        
        
       System.out.println("Simple Hashing: ");
       hash.hashInsertion(96);
       //hash.hashDisplayInsertion(96);
       hash.hashInsertion(81);
       //hash.hashDisplayInsertion(81);
       hash.hashInsertion(22);
       //hash.hashDisplayInsertion(22);
       hash.hashInsertion(35);
       //hash.hashDisplayInsertion(35);
       hash.hashInsertion(4);
       //hash.hashDisplayInsertion(4);
       hash.hashInsertion(15);
      // hash.hashDisplayInsertion(15);
       hash.hashInsertion(57);
       //hash.hashDisplayInsertion(57);
       hash.hashInsertion(46);
       //hash.hashDisplayInsertion(46);
       hash.hashDeletion(81);
       //hash.hashDisplayDeletion(81);
       hash.hashSearch(35);
       //hash.hashDisplaySearch(35);
       hash.hashInsertion(4);
      // hash.hashDisplayInsertion(4);
       //hash.hashDisplay(96);
       
       System.out.println("");
       
       
       System.out.println("Linear Probing: ");
       hash1.hashInsertion(96);
       //hash1.hashDisplayInsertion(96);
       hash1.hashInsertion(81);
       //hash1.hashDisplayInsertion(81);
       hash1.hashInsertion(22);
       //hash1.hashDisplayInsertion(22);
       hash1.hashInsertion(35);
      // hash1.hashDisplayInsertion(35);
       hash1.hashInsertion(4);
       //hash1.hashDisplayInsertion(4);
       hash1.hashInsertion(15);
       //hash1.hashDisplayInsertion(15);
       hash1.hashInsertion(57);
       //hash1.hashDisplayInsertion(57);
       hash1.hashInsertion(46);
       //hash1.hashDisplayInsertion(46);
       hash1.hashDeletion(81);
       //hash1.hashDisplayDeletion(81);
       hash1.hashSearch(35);
       //hash1.hashDisplaySearch(35);
       hash1.hashInsertion(4);
       //hash1.hashDisplayInsertion(4);
    }
    
}
