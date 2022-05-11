package net.aber.fumomod.item;

import net.aber.fumomod.FumoMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FUMO = registerItem("fumo",
    new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FumoMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FumoMod.LOGGER.info("Registering Mod Items for " + FumoMod.MOD_ID);
    }
}
