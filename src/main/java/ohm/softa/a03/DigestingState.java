package ohm.softa.a03;

public class DigestingState extends State {
	final int awakeTime;

	public DigestingState(int duration, int awakeTime)
	{
		super(duration);
		this.awakeTime = awakeTime;
	}

	@Override
	public State successor(Cat cat) {
		logger.info("Getting in a playful mood!");
		return new PlayfulState(cat.getAwake() - (awakeTime + getTime()));
	}
}
