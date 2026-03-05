package net.james24845.ParkCraft.item;
import net.james24845.ParkCraft.block.ModBlocks;


import net.james24845.ParkCraft.ParkCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ParkCraft.MOD_ID);


    public static final Supplier<CreativeModeTab> PARKCRAFT_TAB = CREATIVE_MODE_TAB.register("parkcraft",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.LARCADIA.get()))
                    .title(Component.translatable("creativetab.parkcraft"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LARCADIA);
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.RAW_BISMUTH);
                        output.accept(ModItems.STEEL_INGOT);
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.BISMUTH_BLOCK);








                    }) .build());





    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }




}
