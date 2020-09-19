package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SilverwolfsBuildingBlocks.MOD_ID);

    public static final RegistryObject<BlockItem> BLACK_STAINED_ACACIA_PLANKS = ITEMS.register("black_stained_acacia_planks", () -> new BlockItem(BlockInit.BLACK_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLUE_STAINED_ACACIA_PLANKS = ITEMS.register("blue_stained_acacia_planks", () -> new BlockItem(BlockInit.BLUE_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BROWN_STAINED_ACACIA_PLANKS = ITEMS.register("brown_stained_acacia_planks", () -> new BlockItem(BlockInit.BROWN_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CYAN_STAINED_ACACIA_PLANKS = ITEMS.register("cyan_stained_acacia_planks", () -> new BlockItem(BlockInit.CYAN_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAY_STAINED_ACACIA_PLANKS = ITEMS.register("gray_stained_acacia_planks", () -> new BlockItem(BlockInit.GRAY_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GREEN_STAINED_ACACIA_PLANKS = ITEMS.register("green_stained_acacia_planks", () -> new BlockItem(BlockInit.GREEN_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_STAINED_ACACIA_PLANKS = ITEMS.register("light_blue_stained_acacia_planks", () -> new BlockItem(BlockInit.LIGHT_BLUE_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_STAINED_ACACIA_PLANKS = ITEMS.register("light_gray_stained_acacia_planks", () -> new BlockItem(BlockInit.LIGHT_GRAY_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GREEN_STAINED_ACACIA_PLANKS = ITEMS.register("light_green_stained_acacia_planks", () -> new BlockItem(BlockInit.LIGHT_GREEN_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> MAGENTA_STAINED_ACACIA_PLANKS = ITEMS.register("magenta_stained_acacia_planks", () -> new BlockItem(BlockInit.MAGENTA_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ORANGE_STAINED_ACACIA_PLANKS = ITEMS.register("orange_stained_acacia_planks", () -> new BlockItem(BlockInit.ORANGE_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PINK_STAINED_ACACIA_PLANKS = ITEMS.register("pink_stained_acacia_planks", () -> new BlockItem(BlockInit.PINK_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PURPLE_STAINED_ACACIA_PLANKS = ITEMS.register("purple_stained_acacia_planks", () -> new BlockItem(BlockInit.PURPLE_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RED_STAINED_ACACIA_PLANKS = ITEMS.register("red_stained_acacia_planks", () -> new BlockItem(BlockInit.RED_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> WHITE_STAINED_ACACIA_PLANKS = ITEMS.register("white_stained_acacia_planks", () -> new BlockItem(BlockInit.WHITE_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> YELLOW_STAINED_ACACIA_PLANKS = ITEMS.register("yellow_stained_acacia_planks", () -> new BlockItem(BlockInit.YELLOW_STAINED_ACACIA_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BLACK_STAINED_ACACIA_STAIRS = ITEMS.register("black_stained_acacia_stairs", () -> new BlockItem(StairsInit.BLACK_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLUE_STAINED_ACACIA_STAIRS = ITEMS.register("blue_stained_acacia_stairs", () -> new BlockItem(StairsInit.BLUE_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BROWN_STAINED_ACACIA_STAIRS = ITEMS.register("brown_stained_acacia_stairs", () -> new BlockItem(StairsInit.BROWN_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CYAN_STAINED_ACACIA_STAIRS = ITEMS.register("cyan_stained_acacia_stairs", () -> new BlockItem(StairsInit.CYAN_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAY_STAINED_ACACIA_STAIRS = ITEMS.register("gray_stained_acacia_stairs", () -> new BlockItem(StairsInit.GRAY_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GREEN_STAINED_ACACIA_STAIRS = ITEMS.register("green_stained_acacia_stairs", () -> new BlockItem(StairsInit.GREEN_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_STAINED_ACACIA_STAIRS = ITEMS.register("light_blue_stained_acacia_stairs", () -> new BlockItem(StairsInit.LIGHT_BLUE_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_STAINED_ACACIA_STAIRS = ITEMS.register("light_gray_stained_acacia_stairs", () -> new BlockItem(StairsInit.LIGHT_GRAY_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GREEN_STAINED_ACACIA_STAIRS = ITEMS.register("light_green_stained_acacia_stairs", () -> new BlockItem(StairsInit.LIGHT_GREEN_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> MAGENTA_STAINED_ACACIA_STAIRS = ITEMS.register("magenta_stained_acacia_stairs", () -> new BlockItem(StairsInit.MAGENTA_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ORANGE_STAINED_ACACIA_STAIRS = ITEMS.register("orange_stained_acacia_stairs", () -> new BlockItem(StairsInit.ORANGE_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PINK_STAINED_ACACIA_STAIRS = ITEMS.register("pink_stained_acacia_stairs", () -> new BlockItem(StairsInit.PINK_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PURPLE_STAINED_ACACIA_STAIRS = ITEMS.register("purple_stained_acacia_stairs", () -> new BlockItem(StairsInit.PURPLE_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RED_STAINED_ACACIA_STAIRS = ITEMS.register("red_stained_acacia_stairs", () -> new BlockItem(StairsInit.RED_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> WHITE_STAINED_ACACIA_STAIRS = ITEMS.register("white_stained_acacia_stairs", () -> new BlockItem(StairsInit.WHITE_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> YELLOW_STAINED_ACACIA_STAIRS = ITEMS.register("yellow_stained_acacia_stairs", () -> new BlockItem(StairsInit.YELLOW_STAINED_ACACIA_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BLACK_STAINED_ACACIA_SLAB = ITEMS.register("black_stained_acacia_slab", () -> new BlockItem(SlabInit.BLACK_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BLUE_STAINED_ACACIA_SLAB = ITEMS.register("blue_stained_acacia_slab", () -> new BlockItem(SlabInit.BLUE_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> BROWN_STAINED_ACACIA_SLAB = ITEMS.register("brown_stained_acacia_slab", () -> new BlockItem(SlabInit.BROWN_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> CYAN_STAINED_ACACIA_SLAB = ITEMS.register("cyan_stained_acacia_slab", () -> new BlockItem(SlabInit.CYAN_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAY_STAINED_ACACIA_SLAB = ITEMS.register("gray_stained_acacia_slab", () -> new BlockItem(SlabInit.GRAY_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GREEN_STAINED_ACACIA_SLAB = ITEMS.register("green_stained_acacia_slab", () -> new BlockItem(SlabInit.GREEN_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_STAINED_ACACIA_SLAB = ITEMS.register("light_blue_stained_acacia_slab", () -> new BlockItem(SlabInit.LIGHT_BLUE_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_STAINED_ACACIA_SLAB = ITEMS.register("light_gray_stained_acacia_slab", () -> new BlockItem(SlabInit.LIGHT_GRAY_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> LIGHT_GREEN_STAINED_ACACIA_SLAB = ITEMS.register("light_green_stained_acacia_slab", () -> new BlockItem(SlabInit.LIGHT_GREEN_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> MAGENTA_STAINED_ACACIA_SLAB = ITEMS.register("magenta_stained_acacia_slab", () -> new BlockItem(SlabInit.MAGENTA_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ORANGE_STAINED_ACACIA_SLAB = ITEMS.register("orange_stained_acacia_slab", () -> new BlockItem(SlabInit.ORANGE_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PINK_STAINED_ACACIA_SLAB = ITEMS.register("pink_stained_acacia_slab", () -> new BlockItem(SlabInit.PINK_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> PURPLE_STAINED_ACACIA_SLAB = ITEMS.register("purple_stained_acacia_slab", () -> new BlockItem(SlabInit.PURPLE_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RED_STAINED_ACACIA_SLAB = ITEMS.register("red_stained_acacia_slab", () -> new BlockItem(SlabInit.RED_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> WHITE_STAINED_ACACIA_SLAB = ITEMS.register("white_stained_acacia_slab", () -> new BlockItem(SlabInit.WHITE_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> YELLOW_STAINED_ACACIA_SLAB = ITEMS.register("yellow_stained_acacia_slab", () -> new BlockItem(SlabInit.YELLOW_STAINED_ACACIA_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}
