package com.spotify.mobile.android.orbit;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;

public class DeviceInfo {
    private static final int DEFAULT_VOLUME_STEPS = 32;

    public int getVolumeSteps() {
        return 32;
    }

    public String getName() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return Build.MODEL;
            }
            if (!defaultAdapter.isEnabled()) {
                return Build.MODEL;
            }
            String name = defaultAdapter.getName();
            if (name == null) {
                name = Build.MODEL;
            }
            return name;
        } catch (NullPointerException unused) {
            return Build.MODEL;
        }
    }
}
