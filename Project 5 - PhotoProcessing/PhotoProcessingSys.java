package sysutilities;
import javax.swing.JOptionPane;
import sysutilities.PictureManager;

public class PhotoProcessingSys
{
   private String Name;
   private Address Address;
   private double balance;
   private StringBuffer transaction;
   private int transactNumber;
   
   public PhotoProcessingSys(String name, String street, String city, String state, String zip)
   {
	   transaction = new StringBuffer("Image Transactions\n");
       this.Name = name;
       
       this.balance = 0;
       this.transactNumber = 1;
       try
       {
           this.Address = new Address(street, city, state, zip);
       }
       catch (IllegalArgumentException A)
       {
           this.Address = new Address();
       }
   }

   public PhotoProcessingSys()
   {
	   transaction = new StringBuffer("Image Transactions\n");	   
       this.Name = "NONAME";
       this.Address = new Address();
       this.balance = 0;
       this.transactNumber = 1;
       
   }
  
   public String toString()
   {
       String answer = "";
       
       answer+="Customer Name: " + this.Name + "\n";
       answer += "Customer Address: " + this.Address + "\n";
       answer += "Balance: "+ this.balance;
              
       return answer;
   }

   public String imageTransaction(String imageName, String task,String taskOptions, boolean graphicalMode)
   {

       String answer = "";   
       if (graphicalMode == true)
       {
           PictureManager.graphicalModeOn();
       }

       else if (graphicalMode == false)
       {
           PictureManager.graphicalModeOff();
       }
     
       if(task.equals("display"))
       {
    	   answer = PictureManager.displayPicture(imageName);
           
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           balance += 1.00;          
       }
       else if(task.equals("clear"))
       {      
    	   answer = PictureManager.clearScreen();
           
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           balance += 1.00;           
       }
       else if(task.equals("displaylast"))
       {
    	   answer = PictureManager.displayLastPicture();
           
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           balance += 1.00;
           
       }
       else if(task.equals("blackandwhite"))
       {
       
    	   answer = PictureManager.displayPictureBlackWhitePosterize(imageName, true, false);
           
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           balance += 1.00;
           
       }
       else if(task.equals("posterize"))
       {       
    	   answer = PictureManager.displayPictureBlackWhitePosterize(imageName,false, true);
    
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           balance += 1.00;
       }
       else if(task.equals("blackandwhiteposterize"))
       {
       
    	   answer = PictureManager.displayPictureBlackWhitePosterize(imageName, true, true);
           
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           balance += 1.00;

       }
       else if(task.equals("selectcolors"))
       {
    	   boolean Red = false;
           boolean Green = false;
           boolean Blue = false;
           
         if(task!=null)
         {
           if (taskOptions.toLowerCase().contains("r"))
               Red = true;
           if (taskOptions.toLowerCase().contains("g"))
               Green = true;
           if (taskOptions.toLowerCase().contains("b"))
               Blue = true;

           answer = PictureManager.displayPictureSelectRedGreenBlue(imageName, Red, Green, Blue);
           balance += 2.00;
           transaction.append("Transaction #" + transactNumber+": "+answer);
           transactNumber++;
           
         }
             
       }
       else
       {
           transaction.append("Transaction #" + transactNumber);
           answer="Invalid photoProcessing option";
       }
    
       if (graphicalMode)
       {
           JOptionPane.showMessageDialog(null, "Continue");
       }
       return answer;
   }

  
   public String getTransactions()
   {
       return transaction.toString();
   }


   public double getBalance()
   {
       return balance;
   }
}