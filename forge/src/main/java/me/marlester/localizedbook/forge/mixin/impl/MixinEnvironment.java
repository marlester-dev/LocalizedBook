package me.marlester.localizedbook.forge.mixin.impl;

import me.marlester.localizedbook.util.Environment;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.loading.FMLPaths;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.nio.file.Path;

@Mixin(value = Environment.class, remap = false)
public abstract class MixinEnvironment
{
//  @Overwrite
//  public static boolean isClient()
//  {
//    return FMLEnvironment.dist.isClient();
//  }

  @Overwrite
  public static Path getConfigPath()
  {
    return FMLPaths.CONFIGDIR.get();
  }
//
//  @Overwrite
//  public static boolean isModLoaded(String id)
//  {
//    return ModList.get().isLoaded(id);
//  }
}
