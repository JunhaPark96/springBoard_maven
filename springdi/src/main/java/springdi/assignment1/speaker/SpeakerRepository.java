package springdi.assignment1.speaker;

public interface SpeakerRepository {
	Speaker findByLoc(SpeakerLoc speakerLoc);
	Speaker findByBrand(SpeakerBrand speakerBrand);
}
