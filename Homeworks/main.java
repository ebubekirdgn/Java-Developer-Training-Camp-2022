/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		//Öne Çıkanlar
		
		
		String [] images= {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg","10.jpg",};
		
		String leftArrowDirection="";
		String rigthArrowDirection = "";
		
		 for(int k=0; k < images.length;k++){
	          if(k >= 0 & k <=5)
	          {
	               leftArrowDirection = "Hide";
	               rigthArrowDirection ="Show";
	          }
	           
	          else if(k >= 5 && k <= images.length)
	          {
	              leftArrowDirection = "Show";
                  rigthArrowDirection = "Show";
	          }
	          else
	          {
	              leftArrowDirection = "Show";
                  rigthArrowDirection = "Hide";  
	          }
	            
            }
		
		 System.out.println(leftArrowDirection);
		 System.out.println(rigthArrowDirection);
		 
		// Array
		String[] categories = {"Elektrikli Ev Aletleri","Akıllı Cep Telefonları","English Home","Ev Giyim & İç Giyim"};
		
	    for(int i=0; i < categories.length;i++){
	           System.out.println(categories[i]);
        }
        	

	}
	
}
