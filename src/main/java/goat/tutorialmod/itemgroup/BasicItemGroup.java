package goat.tutorialmod.itemgroup;

import goat.tutorialmod.Constants;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;

import java.util.function.Supplier;

public class BasicItemGroup extends ItemGroup
{

    private final Supplier<IItemProvider> supplier;

    public BasicItemGroup(String label, Supplier<IItemProvider> supplier)
    {
        super(Constants.MODID + "." + label);
        this.supplier = supplier;
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(supplier.get());
    }
}
