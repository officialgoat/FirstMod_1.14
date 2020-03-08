package goat.tutorialmod.data.provider;

import goat.tutorialmod.data.TutorialModDataGenerator;
import goat.tutorialmod.init.InitItems;
import goat.tutorialmod.init.TutorialModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;

public class TutorialModItemTagsProvider extends ItemTagsProvider
{
    public TutorialModItemTagsProvider(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerTags()
    {
        getBuilder(TutorialModTags.Items.TUTOIRAL).add(InitItems.BASIC_ITEM).add(InitItems.BASIC_ITEM.asItem());
    }
}
