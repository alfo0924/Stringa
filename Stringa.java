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

    
            System.out.println("Input 6 charaters : ");
            String type=scanner.nextLine();


            //第一題  密碼(字元)轉換 a換4,s換5,t換7,o換0



            //建立條件判斷式 若字串大小大於等於6 
           if(type.length()>=6)
           {
                    //寫條件方法 記得加= 才可以更新數值
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

                    //印出結果
                System.out.println(type);


 

                //第二題 取得字串內容 以e開頭f結尾 再把字串內容印出


                  //輸入6個字串字元
                  System.out.println("Input 6 charaters again :");
                  String type2=scanner.nextLine();
                  if(type2.length()>6)
                  {

                    //找出e的索引位置和f的索引位置再置入subString函式 取索引值.subString(開始,結尾)
                    type2=type2.substring(type2.indexOf('e'),type2.indexOf('f') );

        
               
                    }else
                    {
                        System.out.println("Charaters doesn't exist !");
                    }
    
                        //印出最後結果
                        System.out.println(type2);




                        
  
            }         

        }
