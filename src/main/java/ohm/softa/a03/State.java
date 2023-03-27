package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
	protected static final Logger logger = LogManager.getLogger();

	int time = 0;
	final int duration;

	public State(int duration)
	{
		this.duration = duration;
	}

	public final State tick(Cat cat)
	{
		if(duration == -1)
			return this;
		else
		{
			time++;

			if (time == duration)
				return successor(cat);
			else
				return this;
		}
	}

	public abstract State successor(Cat cat);

	int getDuration()
	{
		return duration;
	}

	public int getTime() {
		return time;
	}
}
