package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.SlabInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.StairsInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;

import java.util.function.Function;
public class BlockStates extends BlockStateProvider {

    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, SilverwolfsBuildingBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.BLACK_STAINED_ACACIA_PLANKS.get());
        stairsBlock(StairsInit.BLACK_STAINED_ACACIA_STAIRS.get());
        slabBlock(SlabInit.BLACK_STAINED_ACACIA_SLAB.get());
    }

    private void BLACK_STAINED_ACACIA_PLANKS() {
        ResourceLocation txt = new ResourceLocation(SilverwolfsBuildingBlocks.MOD_ID, "block/black_stained_acacia_planks");
        BlockModelBuilder modelblack_stained_acacia_planks = models().cube("black_stained_acacia_planks", txt, txt, txt, txt, txt, txt);
        orientedBlock(BlockInit.BLACK_STAINED_ACACIA_PLANKS.get(), state -> {
                return modelblack_stained_acacia_planks;
        });
    }

    private void orientedBlock(Block block, Function<BlockState, ModelFile> modelFunc) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction dir = state.get(BlockStateProperties.FACING);
                    return ConfiguredModel.builder()
                            .modelFile(modelFunc.apply(state))
                            .rotationX(dir.getAxis() == Direction.Axis.Y ?  dir.getAxisDirection().getOffset() * -90 : 0)
                            .rotationY(dir.getAxis() != Direction.Axis.Y ? ((dir.getHorizontalIndex() + 2) % 4) * 90 : 0)
                            .build();
                });
    }

}