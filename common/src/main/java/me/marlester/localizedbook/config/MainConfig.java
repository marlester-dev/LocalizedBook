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
    // examples:
    //add("examplemod:examplebook", List.of("name, can be 'default'", "landingtext, can be 'default'", "subtitle, can be 'default'"), "Example for book translation for a book with id 'examplemod:examplebook'. The first element in the list is name. The second is landingtext. The third is subtitle.");
    //add("adventurez:adventurez", List.of("Adventurez book", "Welcome", "default"), "Example for book translation for a book with id 'adventurez:adventurez'. The subtitle stays unchanged.");
  }
}
