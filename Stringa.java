import java.util.*;
// class car 
// {

// int id;
// String color;




// }


public class Stringa 
{
    public static void main(String[] args)
    {

  


            Scanner scanner=new Scanner(System.in);

            // String acc="cccc8888";
            // String pass="cccc7777";
            System.out.println("Input 6 charaters : ");
            String type=scanner.nextLine();


            //第一題
           if(type.length()>=6)
           {
    
                    type=type.replace("a","4" );
                    type=type.replace("A","4" );
           
                    type=type.replace("s","5");
                    type=type.replace("S","5");
                
                    type=type.replace("t","7");
                    type=type.replace("T","7");
       
                        type=type.replace("o","0");
                        type=type.replace("O","0");
                 
                    
                  }else
                  {
                        System.out.println("Code isn't over 6 charaters ");

                  }


                System.out.println(type);


 

                //第二題

                  System.out.println("Input 6 charaters again :");
                  String type2=scanner.nextLine();
                  if(type2.length()>6)
                  {

                    type2=type2.substring(type2.indexOf('e'),type2.indexOf('f') );

        
               
                    }else
                    {
                        System.out.println("Charaters doesn't exist !");
                    }
    
                        System.out.println(type2);

  
            }         

        }
