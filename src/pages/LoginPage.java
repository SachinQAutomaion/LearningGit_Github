package pages;

public class LoginPage 
{
	public static void main(String[] args)
	{

		loginPage();
		loginPage("sachu");
	}

	public static void loginPage() {
		System.out.println("this is my loginPage");
	}

	public static void loginPage(String loginName) 
	{
		System.out.println(loginName);
	}
}
