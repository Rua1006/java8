package java07;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오  전원ON");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오의 전원OFF");
	}
	public int getVolume() {
		return volume;
	}
	@Override
	public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME){
				this.volume=RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME){
				this.volume=RemoteControl.MIN_VOLUME;
			}else{
				this.volume=volume;
			}
			System.out.println("VOLUME:"+this.volume);
		}
}