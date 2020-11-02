package tnfcmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import tnfcmod.handlers.TNFCEntities;
import tnfcmod.tnfcmod;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(tnfcmod.MODID + ":" + id, "inventory"));


    }

    @Override
    public void registerNormalItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal"));
    }

    public void preInit(FMLPreInitializationEvent event){
        TNFCEntities.registerRenders();
    }
    public void postInit(FMLPostInitializationEvent event){

    }
}
