package valoeghese.nolimit.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import valoeghese.nolimit.Nolimit;

@Mixin(Slot.class)
public class MixinSlot {
	public int getMaxItemCount() {
		return Nolimit.SIZE;
	}

	public int getMaxItemCount(ItemStack stack) {
		return Nolimit.SIZE;
	}
}
