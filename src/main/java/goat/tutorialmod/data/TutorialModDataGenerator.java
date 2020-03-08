package goat.tutorialmod.data;

import goat.tutorialmod.Constants;
import goat.tutorialmod.data.provider.TutorialModBlockTagsProvider;
import goat.tutorialmod.data.provider.TutorialModItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Constants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TutorialModDataGenerator
{
    @SubscribeEvent
    public static void data(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();
        if(event.includeServer())
        {
            generator.addProvider(new TutorialModBlockTagsProvider(generator));
            generator.addProvider(new TutorialModItemTagsProvider(generator));
        }
    }
}
