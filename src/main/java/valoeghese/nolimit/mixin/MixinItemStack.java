package valoeghese.nolimit.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.item.ItemStack;
import valoeghese.nolimit.Nolimit;

@Mixin(ItemStack.class)
public class MixinItemStack {
	@Overwrite
	public int getMaxCount() {
		return Nolimit.SIZE;
	}
}
