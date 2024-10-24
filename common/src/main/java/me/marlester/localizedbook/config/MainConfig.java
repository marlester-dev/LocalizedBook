package me.marlester.localizedbook.config;

import java.util.List;
import me.marlester.localizedbook.core.LocalizedBook;
import me.marlester.localizedbook.util.Environment;
import me.marlester.localizedbook.util.config.Config;

public class MainConfig extends Config {

  public MainConfig() {
    super(Environment.getConfigPath().resolve(LocalizedBook.MOD_ID + "/mainconfig.toml"));
  }

  @Override
  public void load() {
    add("examplemod:examlpebook1", List.of("name", "landingtext", "subtitle"), "Example for book translation for a book with id 'examplemod:examplebook'. The first element in the list is name. The second is landingtext. The third is title.");
  }
}
