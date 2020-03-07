package goat.tutorialmod.init;

import goat.tutorialmod.Constants;
import goat.tutorialmod.block.BasicBlock;
import goat.tutorialmod.item.BasicBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Constants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class InitBlocks
{
    public static final BasicBlock BASIC_BLOCK = new BasicBlock();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event)
    {
        final IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BASIC_BLOCK.setRegistryName(Constants.MODID, "basic_block"));
    }

    @SubscribeEvent
    public static void registerBlockItem(RegistryEvent.Register<Item> event)
    {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new BasicBlockItem(BASIC_BLOCK));
    }
}
