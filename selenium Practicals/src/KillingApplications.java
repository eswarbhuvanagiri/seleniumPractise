import org.openqa.selenium.os.WindowsUtils;

public class KillingApplications {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WindowsUtils.killByName("notepad.exe");
	}

}

