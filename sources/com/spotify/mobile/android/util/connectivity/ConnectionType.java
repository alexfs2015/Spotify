package com.spotify.mobile.android.util.connectivity;

import com.comscore.android.id.IdHelperAndroid;

public enum ConnectionType {
    CONNECTION_TYPE_UNKNOWN(-1, false, false, true),
    CONNECTION_TYPE_NONE(0, false, false, true),
    CONNECTION_TYPE_GPRS(1, true, false, false),
    CONNECTION_TYPE_EDGE(2, true, false, false),
    CONNECTION_TYPE_3G(3, true, false, false),
    CONNECTION_TYPE_4G(4, true, false, false),
    CONNECTION_TYPE_WLAN(5, false, true, false),
    CONNECTION_TYPE_ETHERNET(6, false, true, false),
    CONNECTION_TYPE_COMPANION_PROXY(7, true, false, false);
    
    public final boolean mCellular;
    public final boolean mIsOffline;
    public final boolean mIsp;
    public final int mNativeConstant;

    private ConnectionType(int i, boolean z, boolean z2, boolean z3) {
        this.mNativeConstant = i;
        this.mCellular = z;
        this.mIsp = z2;
        this.mIsOffline = z3;
    }

    public final String a() {
        switch (this) {
            case CONNECTION_TYPE_NONE:
                String str = "nnoe";
                return IdHelperAndroid.NO_ID_AVAILABLE;
            case CONNECTION_TYPE_GPRS:
                return "gprs";
            case CONNECTION_TYPE_EDGE:
                return "edge";
            case CONNECTION_TYPE_3G:
                String str2 = "g3";
                return "3g";
            case CONNECTION_TYPE_4G:
                String str3 = "4g";
                return "4g";
            case CONNECTION_TYPE_WLAN:
                return "wlan";
            case CONNECTION_TYPE_ETHERNET:
                String str4 = "nermeeht";
                return "ethernet";
            default:
                String str5 = "wnsoknu";
                return "unknown";
        }
    }
}
