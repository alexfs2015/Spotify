package com.comscore.streaming;

public interface AdType {
    public static final int[] ALLOWED_VALUES = {LINEAR_ON_DEMAND_PRE_ROLL, LINEAR_ON_DEMAND_MID_ROLL, LINEAR_ON_DEMAND_POST_ROLL, LINEAR_LIVE, BRANDED_ON_DEMAND_PRE_ROLL, BRANDED_ON_DEMAND_MID_ROLL, BRANDED_ON_DEMAND_POST_ROLL, BRANDED_ON_DEMAND_CONTENT, BRANDED_ON_DEMAND_LIVE, 200};
    public static final int BRANDED_ON_DEMAND_CONTENT = 234;
    public static final int BRANDED_ON_DEMAND_LIVE = 235;
    public static final int BRANDED_ON_DEMAND_MID_ROLL = 232;
    public static final int BRANDED_ON_DEMAND_POST_ROLL = 233;
    public static final int BRANDED_ON_DEMAND_PRE_ROLL = 231;
    public static final int LINEAR_LIVE = 221;
    public static final int LINEAR_ON_DEMAND_MID_ROLL = 212;
    public static final int LINEAR_ON_DEMAND_POST_ROLL = 213;
    public static final int LINEAR_ON_DEMAND_PRE_ROLL = 211;
    public static final int OTHER = 200;
}
