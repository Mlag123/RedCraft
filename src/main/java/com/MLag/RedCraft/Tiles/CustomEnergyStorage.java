package com.MLag.RedCraft.Tiles;

import net.minecraftforge.energy.EnergyStorage;

public class CustomEnergyStorage extends EnergyStorage {
    public CustomEnergyStorage(int capacity, int maxReceive, int maxExtract) {
        super(capacity, maxReceive, maxExtract);
    }

    public void setEnergy(int energy){
        this.energy =energy;
    }
    public void addEnergy(int energy){
        this.energy+=energy;

        if (this.energy>capacity){
            this.energy = capacity;
        }
    }
}
