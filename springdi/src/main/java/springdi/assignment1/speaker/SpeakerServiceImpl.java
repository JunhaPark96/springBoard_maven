package springdi.assignment1.speaker;

public class SpeakerServiceImpl implements SpeakerService {
	private SpeakerRepository speakerRepository;
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}
	
	@Override
	public void volumeUp(SpeakerLoc speakerLoc) {
		Speaker speaker = speakerRepository.findByLoc(speakerLoc);
		int volume = speaker.getVolume();
		volume++;
	}

	@Override
	public void volumeDown(SpeakerLoc speakerLoc) {
		Speaker speaker = speakerRepository.findByLoc(speakerLoc);
		int volume = speaker.getVolume();
		volume--;
	}

	@Override
	public String getBrand(SpeakerBrand speakerBrand) {
		Speaker speaker = speakerRepository.findByBrand(speakerBrand);
		String name = speaker.getSpeakerBrand().name();
		return name;
	}

}
