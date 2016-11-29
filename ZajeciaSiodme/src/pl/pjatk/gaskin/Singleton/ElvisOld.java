package pl.pjatk.gaskin.Singleton;

/**
 * Created by Gaskin on 29.11.2016.
 */
public class ElvisOld {

	private static final ElvisOld INSTANCE = new ElvisOld();

	private ElvisOld() {
	}

	public static ElvisOld getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {
		System.out.println("Elvis left the building!");
	}


}

