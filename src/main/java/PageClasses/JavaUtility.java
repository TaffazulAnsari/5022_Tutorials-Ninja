package PageClasses;
import java.time.LocalDateTime;

public class JavaUtility {

	public String TimeStamp()
	{
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		return timestamp;
	}
}
