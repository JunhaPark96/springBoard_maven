package springdi.assignment1.tv;


public class TVServiceImpl implements TVService{
	public boolean turnon() {
		return true;
	}

	@Override
	public boolean turnoff() {
		return false;
	}


	@Override
	public String printSpeakerBrand() {
		return null;
	}

	@Override
	public TV volumeUp(int volume) {
		TV tv = new TV();
		return null;
	}

	@Override
	public TV volumeDown(int volume) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
