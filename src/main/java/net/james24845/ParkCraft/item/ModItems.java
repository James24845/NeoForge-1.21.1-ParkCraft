package net.james24845.ParkCraft.item;

import net.james24845.ParkCraft.ParkCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ParkCraft.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));  //bismuth

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties())); // raw bismuth


    //creating some new items ** BELOW ARE RAW MATERIALS FOR COASTERS **

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties())); // steel Ingot

    /*/
    Steel Ingots will be a basic material for use in the coaster infrastructure themselves,
    Beams, Supports, Tracks, Coaster Tracks, also misc. material in crafting recipes
     */

   public static final DeferredItem<Item> LARCADIA = ITEMS.register("larcadia",
            () -> new Item(new Item.Properties()));

    /*
    Larcadia, otherwise known as a common crystal in the ground. Will be used for progression within the mod and for
    different coaster tiers.
     */

   // public static final DeferredItem<Item> STEEL_ROD = ITEMS.register("steel_rod",
   //     () -> new Item(new Item.Properties()));

//Steel Rod

  //  public static final DeferredItem<Item> STEEL_BEAM = ITEMS.register(":steel_beam",
  //          () -> new Item(new Item.Properties()));
    //Steel Beam





    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }










}
