package net.luckystudio.splelunkers_charm.worldgen.util;

import net.luckystudio.splelunkers_charm.SpelunkersCharm;
import net.luckystudio.splelunkers_charm.worldgen.types.ModCaveFeatures;
import net.luckystudio.splelunkers_charm.worldgen.types.ModTreeFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModFeatureUtils {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        ModCaveFeatures.bootstrap(context);
        ModTreeFeatures.bootstrap(context);
    }

    // This is a copy of the createKey method from the FeatureUtils class
    // All we did was change the Resource location to SpelunkersCharm.id(key)
    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String key) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, SpelunkersCharm.id(key));
    }
}
