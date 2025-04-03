package net.actuallylinkhe.justflax;

import com.mojang.logging.LogUtils;
import net.actuallylinkhe.justflax.block.ModBlocks;
import net.actuallylinkhe.justflax.item.ModCreativeModeTabs;
import net.actuallylinkhe.justflax.item.ModItems;
import net.actuallylinkhe.justflax.loot.ModLootModifiers;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JustFlax.MOD_ID)
public class JustFlax
{

    public static final String MOD_ID = "justflax";

    private static final Logger LOGGER = LogUtils.getLogger();

    public JustFlax(FMLJavaModLoadingContext context) {

        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    public JustFlax() {
        this(FMLJavaModLoadingContext.get());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Compostable - 30% chance
        ComposterBlock.COMPOSTABLES.put(ModItems.FLAX.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.FLAX_SEEDS.get(), 0.3F);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

}
