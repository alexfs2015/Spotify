package com.spotify.music.features.bluetoothacl;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

public class BluetoothAclReceiver extends vtm {
    public ijl a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        boolean equals = "android.bluetooth.device.action.ACL_CONNECTED".equals(action);
        boolean equals2 = "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        Logger.c("onReceive device: %s, connect: %s, disconnect: %s", bluetoothDevice, Boolean.valueOf(equals), Boolean.valueOf(equals2));
        if (!((!equals && !equals2) || bluetoothDevice == null || bluetoothDevice.getName() == null)) {
            this.a.a(context, equals, bluetoothDevice, goAsync());
        }
    }
}
