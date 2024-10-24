package me.marlester.localizedbook.fabric;

import me.marlester.localizedbook.core.LocalizedBook;
import net.fabricmc.api.ModInitializer;

public class LocalizedBookFabric implements ModInitializer {
  @Override
  public void onInitialize() {
    LocalizedBook.init();
  }
}
