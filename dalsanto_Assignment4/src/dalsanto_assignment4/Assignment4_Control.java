package dalsanto_assignment4;

//Matthew Dal Santo
//ITDEV140
//Assignment 4

public class Assignment4_Control {

    Assignment4_View View = new Assignment4_View();
    
    public void RunApp()
    {
        //int EorP = View.Display_Intro();
        User NewUser = new User(View.Display_Intro());
        
        View.DisplayUser(NewUser.GetUserName(), NewUser.GetUserStatus(), 
                NewUser.GetPhoneNumber(), NewUser.GetUserID(), NewUser.GetUserBalance(), NewUser.GetUserPay());        
    }
}
