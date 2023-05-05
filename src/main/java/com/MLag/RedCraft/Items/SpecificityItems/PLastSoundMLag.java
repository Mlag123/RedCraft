package com.MLag.RedCraft.Items.SpecificityItems;

import com.MLag.RedCraft.Items.ItemsRegisters;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

public class PLastSoundMLag extends ItemRecord {
    protected PLastSoundMLag(String name, SoundEvent soundIn) {
        super(name, soundIn);
        ItemsRegisters.Items_Arrays.add(this);
    }

}
