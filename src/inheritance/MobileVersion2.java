package inheritance;

public class MobileVersion2 extends MobileVersion1 {
public void voicemail() {
	System.out.println("Voicemail is from MobileVersion2");
}
@Override
public void call() {
	System.out.println("This Call is from MobileVersion2");
}
}
