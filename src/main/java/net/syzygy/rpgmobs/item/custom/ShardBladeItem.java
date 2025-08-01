package net.syzygy.rpgmobs.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShardBladeItem extends SwordItem {
    public ShardBladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.rpgmobs.shard_blade.tooltip_line1").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.rpgmobs.shard_blade.tooltip_line2").formatted(Formatting.GRAY));
    }
}
