package me.marlester.localizedbook.config;

import me.marlester.localizedbook.core.LocalizedBook;
import me.marlester.localizedbook.util.Environment;
import me.marlester.localizedbook.util.config.Config;

public class MainConfig extends Config {

  public MainConfig() {
    super(Environment.getConfigPath().resolve(LocalizedBook.MOD_ID + "/mainconfig.toml"));
  }

  @Override
  public void load() {

  }
}
