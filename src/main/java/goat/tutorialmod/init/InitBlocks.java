package goat.tutorialmod.init;

import goat.tutorialmod.Constants;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Constants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class InitBlocks
{
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event)
    {

    }

    @SubscribeEvent
    public static void registerBlockItem(RegistryEvent.Register<Item> event)
    {

    }
}
