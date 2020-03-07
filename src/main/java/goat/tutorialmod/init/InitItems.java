package goat.tutorialmod.init;

import goat.tutorialmod.Constants;
import goat.tutorialmod.item.BasicItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Constants.MODID, bus = EventBusSubscriber.Bus.MOD)
public class InitItems
{
    public static final BasicItem BASIC_ITEM = new BasicItem();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event)
    {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(BASIC_ITEM.setRegistryName(Constants.MODID, "basic_item"));
    }
}
