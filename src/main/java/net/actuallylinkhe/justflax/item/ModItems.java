package net.actuallylinkhe.justflax.item;

import net.actuallylinkhe.justflax.JustFlax;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustFlax.MOD_ID);

    public static final RegistryObject<Item> FLAX = ITEMS.register("flax",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
