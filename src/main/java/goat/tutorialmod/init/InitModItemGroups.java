package goat.tutorialmod.init;

import goat.tutorialmod.itemgroup.BasicItemGroup;
import net.minecraft.block.Blocks;

public class InitModItemGroups
{
    public static final BasicItemGroup GROUP = new BasicItemGroup("group", () -> Blocks.DAMAGED_ANVIL);
}
