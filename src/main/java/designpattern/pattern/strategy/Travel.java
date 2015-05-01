package designpattern.pattern.strategy;

public class Travel {
	private Drive drive;

	public Travel(Drive drive) {
		this.drive = drive;
	}
	
	public void drive(){
		drive.drive();
	}
}
