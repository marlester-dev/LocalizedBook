package me.marlester.localizedbook.core;

import me.marlester.localizedbook.config.MainConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LocalizedBook {
  public static final String MOD_ID = "localizedbook";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
  public static MainConfig mainConfig = new MainConfig();

  public static void init() {

  }
}
