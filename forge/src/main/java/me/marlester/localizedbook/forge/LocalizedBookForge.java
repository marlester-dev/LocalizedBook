package me.marlester.localizedbook.forge;

import me.marlester.localizedbook.core.LocalizedBook;
import net.minecraftforge.fml.common.Mod;

@Mod(value = LocalizedBook.MOD_ID)
public class LocalizedBookForge {

  public LocalizedBookForge() {
    LocalizedBook.init();
  }
}
