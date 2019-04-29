/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeitem;

/**
 *
 * @author mzj10
 */
public class RemoveItem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int list[]= new int[10];    
    
    
    list[0] = 1;
    list[1] = 2;
    list[2] = 1;
    list[3] = 3;
    list[4] = 1;
    list[5] = 5;
    list[6] = 1;
    list[7] = 4;
    list[8] = 1;
    list[9] = 2;
    
     int count = 0;
    for (int i :list){
        
        for (int counter = 0;counter<list.length;counter++){
           
        
            if (list[counter]== i){
              
              switch (count){
                  case 0:
                      count++;
                      break;
                  case 1:
                      list[counter] = 0;
                  default:
                      break;
                      
              }
              
              
            }

            
        }
        count = 0;
    }
    
    
    for (int z:list){
        if (z == 0){
            continue;
        }else{
            
        System.out.println(z);
        } 
    }
    
    
}
}