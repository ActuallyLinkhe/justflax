package net.actuallylinkhe.justflax.item;

import net.actuallylinkhe.justflax.JustFlax;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public  static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustFlax.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FLAX_TAB = CREATIVE_MODE_TABS.register("flax_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.FLAX.get()))
                    .title(Component.translatable("creativetab.flax_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FLAX.get());
                        output.accept(ModItems.FLAX_SEEDS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
