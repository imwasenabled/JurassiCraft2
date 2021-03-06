package org.jurassicraft.server.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import org.jurassicraft.JurassiCraft;
import org.jurassicraft.server.api.SubBlocksBlock;
import org.jurassicraft.server.block.entity.BugCrateBlockEntity;
import org.jurassicraft.server.block.entity.CleaningStationBlockEntity;
import org.jurassicraft.server.block.entity.CultivatorBlockEntity;
import org.jurassicraft.server.block.entity.DNACombinatorHybridizerBlockEntity;
import org.jurassicraft.server.block.entity.DNAExtractorBlockEntity;
import org.jurassicraft.server.block.entity.DNASequencerBlockEntity;
import org.jurassicraft.server.block.entity.DNASynthesizerBlockEntity;
import org.jurassicraft.server.block.entity.DisplayBlockEntity;
import org.jurassicraft.server.block.entity.ElectricFenceBaseBlockEntity;
import org.jurassicraft.server.block.entity.ElectricFencePoleBlockEntity;
import org.jurassicraft.server.block.entity.ElectricFenceWireBlockEntity;
import org.jurassicraft.server.block.entity.EmbryoCalcificationMachineBlockEntity;
import org.jurassicraft.server.block.entity.EmbryonicMachineBlockEntity;
import org.jurassicraft.server.block.entity.FeederBlockEntity;
import org.jurassicraft.server.block.entity.FossilGrinderBlockEntity;
import org.jurassicraft.server.block.entity.IncubatorBlockEntity;
import org.jurassicraft.server.block.fence.ElectricFenceBaseBlock;
import org.jurassicraft.server.block.fence.ElectricFencePoleBlock;
import org.jurassicraft.server.block.fence.ElectricFenceWireBlock;
import org.jurassicraft.server.block.machine.CleaningStationBlock;
import org.jurassicraft.server.block.machine.CultivatorBottomBlock;
import org.jurassicraft.server.block.machine.CultivatorTopBlock;
import org.jurassicraft.server.block.machine.DNACombinatorHybridizerBlock;
import org.jurassicraft.server.block.machine.DNAExtractorBlock;
import org.jurassicraft.server.block.machine.DNASequencerBlock;
import org.jurassicraft.server.block.machine.DNASynthesizerBlock;
import org.jurassicraft.server.block.machine.EmbryoCalcificationMachineBlock;
import org.jurassicraft.server.block.machine.EmbryonicMachineBlock;
import org.jurassicraft.server.block.machine.FeederBlock;
import org.jurassicraft.server.block.machine.FossilGrinderBlock;
import org.jurassicraft.server.block.machine.IncubatorBlock;
import org.jurassicraft.server.block.machine.SkeletonAssemblyBlock;
import org.jurassicraft.server.block.plant.AjuginuculaSmithiiBlock;
import org.jurassicraft.server.block.plant.AncientCoralBlock;
import org.jurassicraft.server.block.plant.AncientPlantBlock;
import org.jurassicraft.server.block.plant.BennettitaleanCycadeoideaBlock;
import org.jurassicraft.server.block.plant.CycadZamitesBlock;
import org.jurassicraft.server.block.plant.DicksoniaBlock;
import org.jurassicraft.server.block.plant.DicroidiumZuberiBlock;
import org.jurassicraft.server.block.plant.DictyophyllumBlock;
import org.jurassicraft.server.block.plant.DoublePlantBlock;
import org.jurassicraft.server.block.plant.EncephalartosBlock;
import org.jurassicraft.server.block.plant.GracilariaBlock;
import org.jurassicraft.server.block.plant.LiriodendritesBlock;
import org.jurassicraft.server.block.plant.MossBlock;
import org.jurassicraft.server.block.plant.OrontiumMackiiBlock;
import org.jurassicraft.server.block.plant.RaphaeliaBlock;
import org.jurassicraft.server.block.plant.RhamnusSalifocifusBlock;
import org.jurassicraft.server.block.plant.ScalyTreeFernBlock;
import org.jurassicraft.server.block.plant.SerennaVeriformansBlock;
import org.jurassicraft.server.block.plant.SmallChainFernBlock;
import org.jurassicraft.server.block.plant.SmallCycadBlock;
import org.jurassicraft.server.block.plant.SmallPlantBlock;
import org.jurassicraft.server.block.plant.SmallRoyalFernBlock;
import org.jurassicraft.server.block.plant.UmaltolepisBlock;
import org.jurassicraft.server.block.plant.WestIndianLilacBlock;
import org.jurassicraft.server.block.plant.WildOnionBlock;
import org.jurassicraft.server.block.plant.WildPotatoBlock;
import org.jurassicraft.server.block.tree.AncientDoorBlock;
import org.jurassicraft.server.block.tree.AncientDoubleSlabBlock;
import org.jurassicraft.server.block.tree.AncientFenceBlock;
import org.jurassicraft.server.block.tree.AncientFenceGateBlock;
import org.jurassicraft.server.block.tree.AncientLeavesBlock;
import org.jurassicraft.server.block.tree.AncientLogBlock;
import org.jurassicraft.server.block.tree.AncientPlanksBlock;
import org.jurassicraft.server.block.tree.AncientSaplingBlock;
import org.jurassicraft.server.block.tree.AncientSlabHalfBlock;
import org.jurassicraft.server.block.tree.AncientStairsBlock;
import org.jurassicraft.server.block.tree.TreeType;
import org.jurassicraft.server.dinosaur.Dinosaur;
import org.jurassicraft.server.entity.EntityHandler;
import org.jurassicraft.server.item.ItemHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class BlockHandler {
    public static final Map<TreeType, AncientPlanksBlock> ANCIENT_PLANKS = new HashMap<>();
    public static final Map<TreeType, AncientLogBlock> ANCIENT_LOGS = new HashMap<>();
    public static final Map<TreeType, AncientLeavesBlock> ANCIENT_LEAVES = new HashMap<>();
    public static final Map<TreeType, AncientSaplingBlock> ANCIENT_SAPLINGS = new HashMap<>();

    public static final Map<TreeType, AncientSlabHalfBlock> ANCIENT_SLABS = new HashMap<>();
    public static final Map<TreeType, AncientDoubleSlabBlock> ANCIENT_DOUBLE_SLABS = new HashMap<>();
    public static final Map<TreeType, AncientStairsBlock> ANCIENT_STAIRS = new HashMap<>();
    public static final Map<TreeType, AncientFenceBlock> ANCIENT_FENCES = new HashMap<>();
    public static final Map<TreeType, AncientFenceGateBlock> ANCIENT_FENCE_GATES = new HashMap<>();
    public static final Map<TreeType, AncientDoorBlock> ANCIENT_DOORS = new HashMap<>();

    public static final Map<TreeType, AncientLogBlock> PETRIFIED_LOGS = new HashMap<>();

    public static final List<FossilBlock> FOSSILS = new ArrayList<>();
    public static final List<EncasedFossilBlock> ENCASED_FOSSILS = new ArrayList<>();

    public static final PlantFossilBlock PLANT_FOSSIL = new PlantFossilBlock();

    public static final CleaningStationBlock CLEANING_STATION = new CleaningStationBlock();
    public static final FossilGrinderBlock FOSSIL_GRINDER = new FossilGrinderBlock();
    public static final DNASequencerBlock DNA_SEQUENCER = new DNASequencerBlock();
    public static final DNASynthesizerBlock DNA_SYNTHESIZER = new DNASynthesizerBlock();
    public static final EmbryonicMachineBlock EMBRYONIC_MACHINE = new EmbryonicMachineBlock();
    public static final EmbryoCalcificationMachineBlock EMBRYO_CALCIFICATION_MACHINE = new EmbryoCalcificationMachineBlock();
    public static final IncubatorBlock INCUBATOR = new IncubatorBlock();
    public static final DNAExtractorBlock DNA_EXTRACTOR = new DNAExtractorBlock();
    public static final DNACombinatorHybridizerBlock DNA_COMBINATOR_HYBRIDIZER = new DNACombinatorHybridizerBlock();

    public static final AmberBlock AMBER_ORE = new AmberBlock();
    public static final IceShardBlock ICE_SHARD = new IceShardBlock();

    public static final GypsumStoneBlock GYPSUM_STONE = new GypsumStoneBlock();
    public static final Block GYPSUM_COBBLESTONE = new BasicBlock(Material.ROCK).setHardness(1.5F);
    public static final Block GYPSUM_BRICKS = new BasicBlock(Material.ROCK).setHardness(2.0F);

    public static final Block REINFORCED_STONE = new BasicBlock(Material.ROCK).setHardness(2.0F);
    public static final Block REINFORCED_BRICKS = new BasicBlock(Material.ROCK).setHardness(3.0F);

    public static final CultivatorTopBlock CULTIVATOR_TOP = new CultivatorTopBlock();
    public static final CultivatorBottomBlock CULTIVATOR_BOTTOM = new CultivatorBottomBlock();

    public static final DisplayBlock DISPLAY_BLOCK = new DisplayBlock();

    public static final ClearGlassBlock CLEAR_GLASS = new ClearGlassBlock();

    public static final FossilizedTrackwayBlock FOSSILIZED_TRACKWAY = new FossilizedTrackwayBlock();
    public static final NestFossilBlock NEST_FOSSIL = new NestFossilBlock(false);
    public static final NestFossilBlock ENCASED_NEST_FOSSIL = new NestFossilBlock(true);

    public static final SmallRoyalFernBlock SMALL_ROYAL_FERN = new SmallRoyalFernBlock();
    public static final SmallChainFernBlock SMALL_CHAIN_FERN = new SmallChainFernBlock();
    public static final SmallCycadBlock SMALL_CYCAD = new SmallCycadBlock();
    public static final BennettitaleanCycadeoideaBlock CYCADEOIDEA = new BennettitaleanCycadeoideaBlock();
    public static final AncientPlantBlock CRY_PANSY = new AncientPlantBlock();
    public static final ScalyTreeFernBlock SCALY_TREE_FERN = new ScalyTreeFernBlock();
    public static final CycadZamitesBlock ZAMITES = new CycadZamitesBlock();
    public static final DicksoniaBlock DICKSONIA = new DicksoniaBlock();
    public static final DicroidiumZuberiBlock DICROIDIUM_ZUBERI = new DicroidiumZuberiBlock();
    public static final AjuginuculaSmithiiBlock AJUGINUCULA_SMITHII = new AjuginuculaSmithiiBlock();
    public static final WildOnionBlock WILD_ONION = new WildOnionBlock();
    public static final GracilariaBlock GRACILARIA = new GracilariaBlock();
    public static final DictyophyllumBlock DICTYOPHYLLUM = new DictyophyllumBlock();
    public static final WestIndianLilacBlock WEST_INDIAN_LILAC = new WestIndianLilacBlock();
    public static final SerennaVeriformansBlock SERENNA_VERIFORMANS = new SerennaVeriformansBlock();
    public static final SmallPlantBlock LADINIA_SIMPLEX = new SmallPlantBlock();
    public static final OrontiumMackiiBlock ORONTIUM_MACKII = new OrontiumMackiiBlock();
    public static final UmaltolepisBlock UMALTOLEPIS = new UmaltolepisBlock();
    public static final LiriodendritesBlock LIRIODENDRITES = new LiriodendritesBlock();
    public static final RaphaeliaBlock RAPHAELIA = new RaphaeliaBlock();
    public static final EncephalartosBlock ENCEPHALARTOS = new EncephalartosBlock();
    public static final WildPotatoBlock WILD_POTATO_PLANT = new WildPotatoBlock();
    public static final RhamnusSalifocifusBlock RHAMNUS_SALICIFOLIUS_PLANT = new RhamnusSalifocifusBlock();
    public static final SmallPlantBlock CINNAMON_FERN = new SmallPlantBlock();
    public static final SmallPlantBlock BRISTLE_FERN = new SmallPlantBlock();
    public static final DoublePlantBlock TEMPSKYA = new DoublePlantBlock();
    public static final SmallPlantBlock WOOLLY_STALKED_BEGONIA = new SmallPlantBlock();
    public static final SmallPlantBlock LARGESTIPULE_LEATHER_ROOT = new SmallPlantBlock();
    public static final DoublePlantBlock RHACOPHYTON = new DoublePlantBlock();
    public static final DoublePlantBlock GRAMINIDITES_BAMBUSOIDES = new DoublePlantBlock();
    public static final DoublePlantBlock HELICONIA = new DoublePlantBlock();

    public static final AncientCoralBlock ENALLHELIA = new AncientCoralBlock();
    public static final AncientCoralBlock AULOPORA = new AncientCoralBlock();
    public static final AncientCoralBlock CLADOCHONUS = new AncientCoralBlock();
    public static final AncientCoralBlock LITHOSTROTION = new AncientCoralBlock();
    public static final AncientCoralBlock STYLOPHYLLOPSIS = new AncientCoralBlock();
    public static final AncientCoralBlock HIPPURITES_RADIOSUS = new AncientCoralBlock();

    public static final PeatBlock PEAT = new PeatBlock();
    public static final Block PEAT_MOSS = new PeatMossBlock();
    public static final MossBlock MOSS = new MossBlock();

    public static final FeederBlock FEEDER = new FeederBlock();

    public static final BugCrateBlock BUG_CRATE = new BugCrateBlock();

    public static final SwarmBlock PLANKTON_SWARM = new SwarmBlock(() -> ItemHandler.PLANKTON);
    public static final SwarmBlock KRILL_SWARM = new SwarmBlock(() -> ItemHandler.KRILL);

    public static final ElectricFencePoleBlock LOW_SECURITY_FENCE_POLE = new ElectricFencePoleBlock();
    public static final ElectricFenceBaseBlock LOW_SECURITY_FENCE_BASE = new ElectricFenceBaseBlock();
    public static final ElectricFenceWireBlock LOW_SECURITY_FENCE_WIRE = new ElectricFenceWireBlock();

    public static final JPMainGateBlock JP_MAIN_GATE_BLOCK = new JPMainGateBlock();
    public static final TourRailBlock TOUR_RAIL = new TourRailBlock(false);
    public static final TourRailBlock TOUR_RAIL_POWERED = new TourRailBlock(true);
    
    public static final SkeletonAssemblyBlock SKELETON_ASSEMBLY = new SkeletonAssemblyBlock();

    public static PaleoBaleBlock PALEO_BALE_CYCADEOIDEA;
    public static PaleoBaleBlock PALEO_BALE_CYCAD;
    public static PaleoBaleBlock PALEO_BALE_FERN;
    public static PaleoBaleBlock PALEO_BALE_LEAVES;

    public static PaleoBaleBlock PALEO_BALE_OTHER;

    public static void init() {
        registerBlock(PLANT_FOSSIL, "Plant Fossil Block");
        registerBlock(FOSSILIZED_TRACKWAY, "Fossilized Trackway");
        registerBlock(NEST_FOSSIL, "Nest Fossil");
        registerBlock(ENCASED_NEST_FOSSIL, "Encased Nest Fossil");

        for (int i = 0; i < (int) Math.ceil(EntityHandler.getHighestID() / 16.0F); i++) {
            FossilBlock fossil = new FossilBlock(i * 16);
            EncasedFossilBlock encasedFossil = new EncasedFossilBlock(i * 16);

            FOSSILS.add(fossil);
            ENCASED_FOSSILS.add(encasedFossil);

            registerBlock(fossil, "Fossil Block " + i);
            registerBlock(encasedFossil, "Encased Fossil " + i);

            OreDictionary.registerOre("fossil", fossil);
        }

        for (TreeType type : TreeType.values()) {
            registerTreeType(type);
        }

        registerBlock(AMBER_ORE, "Amber Ore");
        registerBlock(ICE_SHARD, "Ice Shard");
        registerBlock(GYPSUM_STONE, "Gypsum Stone");
        registerBlock(GYPSUM_COBBLESTONE, "Gypsum Cobblestone");
        registerBlock(GYPSUM_BRICKS, "Gypsum Bricks");
        registerBlock(REINFORCED_STONE, "Reinforced Stone");
        registerBlock(REINFORCED_BRICKS, "Reinforced Bricks");

        registerBlock(AJUGINUCULA_SMITHII, "Ajuginucula Smithii");
        registerBlock(SMALL_ROYAL_FERN, "Small Royal Fern");
        registerBlock(SMALL_CHAIN_FERN, "Small Chain Fern");
        registerBlock(SMALL_CYCAD, "Small Cycad");
        registerBlock(CYCADEOIDEA, "Bennettitalean Cycadeoidea");
        registerBlock(CRY_PANSY, "Cry Pansy");
        registerBlock(SCALY_TREE_FERN, "Scaly Tree Fern");
        registerBlock(ZAMITES, "Cycad Zamites");
        registerBlock(DICKSONIA, "Dicksonia");
        registerBlock(WILD_ONION, "Wild Onion Plant");
        registerBlock(GRACILARIA, "Gracilaria Seaweed");
        registerBlock(DICROIDIUM_ZUBERI, "Dicroidium Zuberi");
        registerBlock(DICTYOPHYLLUM, "Dictyophyllum");
        registerBlock(WEST_INDIAN_LILAC, "West Indian Lilac");
        registerBlock(SERENNA_VERIFORMANS, "Serenna Veriformans");
        registerBlock(LADINIA_SIMPLEX, "Ladinia Simplex");
        registerBlock(ORONTIUM_MACKII, "Orontium Mackii");
        registerBlock(UMALTOLEPIS, "Umaltolepis");
        registerBlock(LIRIODENDRITES, "Liriodendrites");
        registerBlock(RAPHAELIA, "Raphaelia");
        registerBlock(ENCEPHALARTOS, "Encephalartos");
        registerBlock(WILD_POTATO_PLANT, "Wild Potato Plant");
        registerBlock(RHAMNUS_SALICIFOLIUS_PLANT, "Rhamnus Salicifolius");
        registerBlock(BRISTLE_FERN, "Bristle Fern");
        registerBlock(CINNAMON_FERN, "Cinnamon Fern");
        registerBlock(TEMPSKYA, "Tempskya");
        registerBlock(WOOLLY_STALKED_BEGONIA, "Woolly Stalked Begonia");
        registerBlock(LARGESTIPULE_LEATHER_ROOT, "Largestipule Leather Root");
        registerBlock(RHACOPHYTON, "Rhacophyton");
        registerBlock(GRAMINIDITES_BAMBUSOIDES, "Graminidites Bambusoides");
        registerBlock(ENALLHELIA, "Enallhelia");
        registerBlock(AULOPORA, "Aulopora");
        registerBlock(CLADOCHONUS, "Cladochonus");
        registerBlock(LITHOSTROTION, "Lithostrotion");
        registerBlock(STYLOPHYLLOPSIS, "Stylophyllopsis");
        registerBlock(HIPPURITES_RADIOSUS, "Hippurites Radiosus");
        registerBlock(HELICONIA, "Heliconia");

        registerBlock(MOSS, "Moss");
        registerBlock(PEAT, "Peat");
        registerBlock(PEAT_MOSS, "Peat Moss");

        registerBlock(CLEAR_GLASS, "Clear Glass");

        registerBlock(PLANKTON_SWARM, "Plankton Swarm");
        registerBlock(KRILL_SWARM, "Krill Swarm");
//        registerBlock(TOUR_RAIL, "Tour Rail");
//        registerBlock(TOUR_RAIL_POWERED, "Powered Tour Rail");

        registerBlock(SKELETON_ASSEMBLY, "Skeleton Assembly");
//        registerBlock(JP_MAIN_GATE_BLOCK, "Jurassic Park Gate");

        registerBlock(CultivatorBlockEntity.class, CULTIVATOR_BOTTOM, "Cultivate Bottom");
        registerBlock(CULTIVATOR_TOP, "Cultivate Top");
        registerBlock(CleaningStationBlockEntity.class, CLEANING_STATION, "Cleaning Station");
        registerBlock(FossilGrinderBlockEntity.class, FOSSIL_GRINDER, "Fossil Grinder");
        registerBlock(DNASequencerBlockEntity.class, DNA_SEQUENCER, "DNA Sequencer");
        registerBlock(DNASynthesizerBlockEntity.class, DNA_SYNTHESIZER, "DNA Synthesizer");
        registerBlock(EmbryonicMachineBlockEntity.class, EMBRYONIC_MACHINE, "Embryonic Machine");
        registerBlock(EmbryoCalcificationMachineBlockEntity.class, EMBRYO_CALCIFICATION_MACHINE, "Embryo Calcification Machine");
        registerBlock(DNAExtractorBlockEntity.class, DNA_EXTRACTOR, "DNA Extractor");
        registerBlock(DNACombinatorHybridizerBlockEntity.class, DNA_COMBINATOR_HYBRIDIZER, "DNA Combinator Hybridizer");
        registerBlock(IncubatorBlockEntity.class, INCUBATOR, "Incubator");
        registerBlock(DisplayBlockEntity.class, DISPLAY_BLOCK, "Display Block");
        registerBlock(FeederBlockEntity.class, FEEDER, "Feeder");
        registerBlock(BugCrateBlockEntity.class, BUG_CRATE, "Bug Crate");
        registerBlock(ElectricFencePoleBlockEntity.class, LOW_SECURITY_FENCE_POLE, "Low Security Fence Pole");
        registerBlock(ElectricFenceBaseBlockEntity.class, LOW_SECURITY_FENCE_BASE, "Low Security Fence Base");
        registerBlock(ElectricFenceWireBlockEntity.class, LOW_SECURITY_FENCE_WIRE, "Low Security Fence Wire");

        PALEO_BALE_CYCADEOIDEA = new PaleoBaleBlock(PaleoBaleBlock.Variant.CYCADEOIDEA);
        PALEO_BALE_CYCAD = new PaleoBaleBlock(PaleoBaleBlock.Variant.CYCAD);
        PALEO_BALE_FERN = new PaleoBaleBlock(PaleoBaleBlock.Variant.FERN);
        PALEO_BALE_LEAVES = new PaleoBaleBlock(PaleoBaleBlock.Variant.LEAVES);
        PALEO_BALE_OTHER = new PaleoBaleBlock(PaleoBaleBlock.Variant.OTHER);

        registerBlock(PALEO_BALE_OTHER, "Paleo Bale Other");
        registerBlock(PALEO_BALE_CYCADEOIDEA, "Paleo Bale Cycadeoidea");
        registerBlock(PALEO_BALE_CYCAD, "Paleo Bale Cycad");
        registerBlock(PALEO_BALE_FERN, "Paleo Bale Fern");
        registerBlock(PALEO_BALE_LEAVES, "Paleo Bale Leaves");
    }

    public static void registerTreeType(TreeType type) {
        AncientPlanksBlock planks = new AncientPlanksBlock(type);
        AncientLogBlock log = new AncientLogBlock(type, false);
        AncientLogBlock petrifiedLog = new AncientLogBlock(type, true);
        AncientLeavesBlock leaves = new AncientLeavesBlock(type);
        AncientSaplingBlock sapling = new AncientSaplingBlock(type);
        AncientStairsBlock stair = new AncientStairsBlock(type, planks.getDefaultState());
        AncientSlabHalfBlock slab = new AncientSlabHalfBlock(type, planks.getDefaultState());
        AncientDoubleSlabBlock doubleSlab = new AncientDoubleSlabBlock(type, slab, planks.getDefaultState());
        AncientFenceBlock fence = new AncientFenceBlock(type);
        AncientFenceGateBlock fenceGate = new AncientFenceGateBlock(type);
        AncientDoorBlock door = new AncientDoorBlock(type);

        ANCIENT_PLANKS.put(type, planks);
        ANCIENT_LOGS.put(type, log);
        ANCIENT_LEAVES.put(type, leaves);
        ANCIENT_SAPLINGS.put(type, sapling);
        ANCIENT_STAIRS.put(type, stair);
        ANCIENT_SLABS.put(type, slab);
        ANCIENT_DOUBLE_SLABS.put(type, doubleSlab);
        ANCIENT_FENCES.put(type, fence);
        ANCIENT_FENCE_GATES.put(type, fenceGate);
        ANCIENT_DOORS.put(type, door);
        PETRIFIED_LOGS.put(type, petrifiedLog);

        String typeName = type.name();

        registerBlock(planks, typeName + " Planks");
        registerBlock(log, typeName + " Log");
        registerBlock(petrifiedLog, typeName + " Log Petrified");
        registerBlock(leaves, typeName + " Leaves");
        registerBlock(sapling, typeName + " Sapling");
        registerBlock(stair, typeName + " Stairs");
        registerBlock(slab, typeName + " Slab");
        registerBlock(doubleSlab, typeName + " Double Slab");
        registerBlock(fence, typeName + " Fence");
        registerBlock(fenceGate, typeName + " Fence Gate");
        registerBlock(door, typeName + " Door");

        OreDictionary.registerOre("logWood", log);
        OreDictionary.registerOre("logWood", petrifiedLog);
        OreDictionary.registerOre("plankWood", planks);
        OreDictionary.registerOre("treeLeaves", leaves);
        OreDictionary.registerOre("treeSapling", sapling);
        OreDictionary.registerOre("slabWood", slab);
        OreDictionary.registerOre("stairWood", stair);
        OreDictionary.registerOre("fenceWood", fence);
        OreDictionary.registerOre("gateWood", fenceGate);
        OreDictionary.registerOre("fenceGateWood", fenceGate);
        OreDictionary.registerOre("doorWood", door);

        Blocks.FIRE.setFireInfo(leaves, 30, 60);
        Blocks.FIRE.setFireInfo(planks, 5, 20);
        Blocks.FIRE.setFireInfo(log, 5, 5);
        Blocks.FIRE.setFireInfo(petrifiedLog, 5, 5);
        Blocks.FIRE.setFireInfo(doubleSlab, 5, 20);
        Blocks.FIRE.setFireInfo(slab, 5, 20);
        Blocks.FIRE.setFireInfo(stair, 5, 20);
        Blocks.FIRE.setFireInfo(fence, 5, 20);
        Blocks.FIRE.setFireInfo(fenceGate, 5, 20);
    }

    public static FossilBlock getFossilBlock(Dinosaur dinosaur) {
        return getFossilBlock(EntityHandler.getDinosaurId(dinosaur));
    }

    private static int getBlockId(int id) {
        return (int) (Math.floor((((float) id + 1.0F) / 16.0F) - 0.0625F));
    }

    public static EncasedFossilBlock getEncasedFossil(Dinosaur dinosaur) {
        return getEncasedFossil(EntityHandler.getDinosaurId(dinosaur));
    }

    public static EncasedFossilBlock getEncasedFossil(int id) {
        return ENCASED_FOSSILS.get(getBlockId(id));
    }

    public static FossilBlock getFossilBlock(int id) {
        return FOSSILS.get(getBlockId(id));
    }

    public static int getDinosaurId(FossilBlock fossil, int metadata) {
        return (FOSSILS.indexOf(fossil) * 16) + metadata;
    }

    public static int getDinosaurId(EncasedFossilBlock fossil, int metadata) {
        return (ENCASED_FOSSILS.indexOf(fossil) * 16) + metadata;
    }

    public static int getMetadata(int id) {
        return id % 16;
    }

    public static int getMetadata(Dinosaur dinosaur) {
        return getMetadata(EntityHandler.getDinosaurId(dinosaur));
    }

    public static void registerBlock(Class<? extends TileEntity> tileEntity, Block block, String name) {
        registerBlock(block, name);

        GameRegistry.registerTileEntity(tileEntity, "jurassicraft:" + name.toLowerCase(Locale.ENGLISH).replaceAll(" ", "_"));
    }

    public static void registerBlock(Block block, String name) {
        name = name.toLowerCase(Locale.ENGLISH).replaceAll(" ", "_");

        block.setUnlocalizedName(name);

        ResourceLocation resource = new ResourceLocation(JurassiCraft.MODID, name);

        if (block instanceof SubBlocksBlock) {
            GameRegistry.register(block, resource);
            GameRegistry.register(((SubBlocksBlock) block).getItemBlock(), resource);
        } else {
            GameRegistry.register(block, resource);
            GameRegistry.register(new ItemBlock(block), resource);
        }
    }
}
