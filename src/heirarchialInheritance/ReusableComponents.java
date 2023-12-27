package heirarchialInheritance;

public class ReusableComponents
{
    //************************************ Reusable Components *******************
    public void launchApplication()
    {
    	System.out.println("RC : Launch Application");
    }
    
    void loginToApplication()
    {
    	System.out.println("RC : Login To Application");
    }
    
    void logoutFromApplication()
    {
    	System.out.println("RC : Logout From Application");
    }
    
    protected void closeApplication()
    {
    	System.out.println("RC : Close Application");
    }
    
    public void compose()
    {
    	System.out.println("RC : Compose Mail");
    }
    
    public void send()
    {
    	System.out.println("RC : Send Mail");
    }
    
    protected void open()
    {
    	System.out.println("RC : Open Mail");
    }
    
    public void reply()
    {
    	System.out.println("RC : Reply Mail");
    }
    public void forward()
    {
    	System.out.println("RC : Forward Mail");
    }
    public void delete()
    {
    	System.out.println("RC : Delete Mail");
    }


}
