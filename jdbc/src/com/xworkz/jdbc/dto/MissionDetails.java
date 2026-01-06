package com.xworkz.jdbc.dto;

import java.util.Objects;

public class MissionDetails {
    private int missionId;
    private String missionName;
    private String destination;
    private String launchDate;
    private String rocketType;
    private int crewSize;
    private double fuelCapacity;
    private double missionBudget;
    private boolean isManned;
    private String agencyName;

    public MissionDetails(int missionId, int missionName, String destination, String launchDate, String rocketType, int crewSize, double fuelCapacity, double missionBudget, boolean isManned, String agencyName) {
        this.missionId = missionId;
        this.missionName = String.valueOf(missionName);
        this.destination = destination;
        this.launchDate = launchDate;
        this.rocketType = rocketType;
        this.crewSize = crewSize;
        this.fuelCapacity = fuelCapacity;
        this.missionBudget = missionBudget;
        this.isManned = isManned;
        this.agencyName = agencyName;
    }

    @Override
    public String toString() {
        return "MissionDetails{" +
                "missionId=" + missionId +
                ", missionName='" + missionName + '\'' +
                ", destination='" + destination + '\'' +
                ", launchDate='" + launchDate + '\'' +
                ", rocketType='" + rocketType + '\'' +
                ", crewSize=" + crewSize +
                ", fuelCapacity=" + fuelCapacity +
                ", missionBudget=" + missionBudget +
                ", isManned=" + isManned +
                ", agencyName='" + agencyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MissionDetails)) return false;
        MissionDetails that = (MissionDetails) o;
        return missionId == that.missionId && crewSize == that.crewSize && Double.compare(fuelCapacity, that.fuelCapacity) == 0 && Double.compare(missionBudget, that.missionBudget) == 0 && isManned == that.isManned && Objects.equals(missionName, that.missionName) && Objects.equals(destination, that.destination) && Objects.equals(launchDate, that.launchDate) && Objects.equals(rocketType, that.rocketType) && Objects.equals(agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionId, missionName, destination, launchDate, rocketType, crewSize, fuelCapacity, missionBudget, isManned, agencyName);
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getMissionBudget() {
        return missionBudget;
    }

    public void setMissionBudget(double missionBudget) {
        this.missionBudget = missionBudget;
    }

    public boolean isManned() {
        return isManned;
    }

    public void setManned(boolean manned) {
        isManned = manned;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
}