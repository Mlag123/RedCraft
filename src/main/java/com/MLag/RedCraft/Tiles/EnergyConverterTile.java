package com.MLag.RedCraft.Tiles;

import com.MLag.RedCraft.Main;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;

public class EnergyConverterTile extends TileEntity implements ITickable{


    private CustomEnergyStorage storage = new CustomEnergyStorage(100000,200,200);


    @Override
    public void update() {
        if (world.isRemote) return;

        EnumFacing out = EnumFacing.DOWN;

        TileEntity te = world.getTileEntity(pos.offset(out));

        if (te !=null && te.hasCapability(CapabilityEnergy.ENERGY,out.getOpposite())){

            IEnergyStorage other = te.getCapability(CapabilityEnergy.ENERGY,out.getOpposite());

            if (other!=null && storage.getEnergyStored()>0){
                int extract = storage.extractEnergy(200,true);
                int received = other.receiveEnergy(extract,false);
                storage.extractEnergy(received,false);
                markDirty();


                //prinimaem

                int canRecieve = storage.receiveEnergy(200,true);
                int extracted = other.extractEnergy(canRecieve,false);
                storage.receiveEnergy(extracted,false);

                Main.log.info("Отдал: " + received + " Получил: " + extracted
                        + " Моя энергия: " + storage.getEnergyStored());
            }
        }

    }



    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityEnergy.ENERGY || super.hasCapability(capability, facing);
    }



    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityEnergy.ENERGY)
            return (T) storage;
        return super.getCapability(capability, facing);
    }


/*

    @Override
    public int receiveEnergy(int maxRecieve, boolean simulate) {
        int energyRec = Math.min(capacity-energy,Math.min(this.maxRecieve,maxRecieve));

        if (!simulate){
            energy+= energyRec;
            markDirty();
        }
        return energyRec;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulated) {
        int energyEx = Math.min(energy,Math.min(this.maxExtract,maxExtract));

        if (!simulated){
            energy -= energyEx;
            markDirty();
        }

        Main.log.info("en = "+energyEx+ " now "+energyEx);
        return energyEx;
    }

    @Override
    public int getEnergyStored() {
        return energy;
    }

    @Override
    public int getMaxEnergyStored() {
        return capacity;
    }

    @Override
    public boolean canExtract() {
        return true;
    }

    @Override
    public boolean canReceive() {
        return true;
    }


    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityEnergy.ENERGY || super.hasCapability(capability, facing);
    }



    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityEnergy.ENERGY)
            return (T) this;
        return super.getCapability(capability, facing);
    }


    public void addEnergy(int energy){
        this.energy +=energy;
        if (this.energy >capacity){
            this.energy = capacity;
        }
    }

    @Override
    public void update() {

    }*/
}
