package me.marlester.localizedbook.mixin;

import me.marlester.localizedbook.core.LocalizedBook;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vazkii.patchouli.common.book.Book;

@Mixin(Book.class)
public class BookMixin {
  @Mutable
  @Shadow
  @Final
  public String name;
  @Shadow
  @Final
  public String landingText;
  @Shadow
  @Final
  public String subtitle;
  @Shadow
  @Final
  public ResourceLocation id;

  @Inject(at = @At("TAIL"), method = "<init>")
  private void init(CallbackInfo info) {
    LocalizedBook.LOGGER.info(id);
  }
}
