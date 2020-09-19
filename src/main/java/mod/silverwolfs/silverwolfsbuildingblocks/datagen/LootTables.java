package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(BlockInit.BLACK_STAINED_ACACIA_PLANKS.get(), createStandardTable("black_stained_acacia_planks", BlockInit.BLACK_STAINED_ACACIA_PLANKS.get()));
    }
}