package goat.tutorialmod.data.provider;

import goat.tutorialmod.init.InitBlocks;
import goat.tutorialmod.init.InitItems;
import goat.tutorialmod.init.TutorialModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;

public class TutorialModBlockTagsProvider extends BlockTagsProvider
{
    public TutorialModBlockTagsProvider(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerTags()
    {
        getBuilder(TutorialModTags.Blocks.TUTOIRAL).add(InitBlocks.BASIC_BLOCK).add(Tags.Blocks.STORAGE_BLOCKS_DIAMOND);

    }
}
