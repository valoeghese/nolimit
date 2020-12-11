package valoeghese.nolimit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public class Nolimit implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Nolimit");

	@Override
	public void onInitialize() {
		LOGGER.info("Hacking the 64 stack mainframe...");
	}
	
	public static final int SIZE = 1000;
}
