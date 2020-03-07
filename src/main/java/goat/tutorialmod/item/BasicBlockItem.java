package goat.tutorialmod.item;

import goat.tutorialmod.Tutorialmod;
import goat.tutorialmod.init.InitModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BasicBlockItem extends BlockItem
{
    public BasicBlockItem(Block block)
    {
        super(block, new Properties().group(InitModItemGroups.GROUP));
        setRegistryName(block.getRegistryName());
    }
}
