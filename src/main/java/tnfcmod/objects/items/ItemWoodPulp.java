package tnfcmod.objects.items;

import javax.annotation.Nonnull;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import net.dries007.tfc.api.capability.size.Size;
import net.dries007.tfc.api.capability.size.Weight;
import net.dries007.tfc.objects.items.ItemTFC;
import tnfcmod.tnfcmod;

import static tnfcmod.tnfcmod.MODID;

public class ItemWoodPulp extends ItemTFC
{

    protected String name;

    public ItemWoodPulp(String name)
    {
        this.name = name;
        setTranslationKey(MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    public void registerItemModel() {

        tnfcmod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemWoodPulp setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
    @Nonnull
    @Override
    public Size getSize(@Nonnull ItemStack itemStack)
    {
        return Size.TINY;
    }

    @Nonnull
    @Override
    public Weight getWeight(@Nonnull ItemStack itemStack)
    {
        return Weight.VERY_LIGHT;
    }
}
