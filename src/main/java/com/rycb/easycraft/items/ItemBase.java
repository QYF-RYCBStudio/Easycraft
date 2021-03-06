package com.rycb.easycraft.items;

import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.rycb.easycraft.util.IHasModel;


/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/21 20:13
 * Location:EasyCraft/com.rycb.easycraft.tabs/
 */
public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Easycraft.proxy.registerItemRenderer(this, 0, "inventory");
    }
}