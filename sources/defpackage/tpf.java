package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState.State;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: tpf reason: default package */
public final class tpf {
    public final Context a;
    public BroadcastReceiver b;
    public BluetoothDevice c;
    public boolean d;
    private BluetoothConnectionState e;
    private Collection<a> f = new CopyOnWriteArrayList();

    /* renamed from: tpf$a */
    public interface a {
        void connectionStateChanged(BluetoothConnectionState bluetoothConnectionState);
    }

    public tpf(Context context) {
        this.a = context;
        this.e = new BluetoothConnectionState(State.DISCONNECTED);
        this.d = false;
    }

    private void a(final BluetoothAdapter bluetoothAdapter) {
        bluetoothAdapter.getProfileProxy(this.a, new ServiceListener() {
            public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                List connectedDevices = bluetoothProfile.getConnectedDevices();
                if (!connectedDevices.isEmpty()) {
                    tpf.this.c = (BluetoothDevice) connectedDevices.get(0);
                }
                bluetoothAdapter.closeProfileProxy(2, bluetoothProfile);
                tpf.this.c();
            }

            public final void onServiceDisconnected(int i) {
                tpf.this.c();
            }
        }, 2);
    }

    private void b() {
        BluetoothAdapter d2 = d();
        if (d2 == null) {
            c();
        } else if (d2.getProfileConnectionState(2) == 2) {
            a(d2);
        } else {
            c();
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        BluetoothDevice bluetoothDevice = this.c;
        if (bluetoothDevice == null) {
            this.e = new BluetoothConnectionState(State.DISCONNECTED);
        } else if (bluetoothDevice.getName() == null || this.c.getName().isEmpty()) {
            this.e = new BluetoothConnectionState(State.CONNECTED_UNKNOWN_DEVICE);
        } else {
            this.e = new BluetoothConnectionState(State.CONNECTED, this.c.getName());
        }
        for (a connectionStateChanged : this.f) {
            connectionStateChanged.connectionStateChanged(this.e);
        }
    }

    private BluetoothAdapter d() {
        if (VERSION.SDK_INT < 18) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        BluetoothManager bluetoothManager = (BluetoothManager) this.a.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }

    private static boolean e() {
        String str = "google_sdk";
        if (!Build.MODEL.contains(str) && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86")) {
            String str2 = "generic";
            if ((!Build.BRAND.startsWith(str2) || !Build.DEVICE.startsWith(str2)) && !str.equals(Build.PRODUCT)) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        if (this.d) {
            c();
            return;
        }
        this.d = true;
        if (e()) {
            this.e = new BluetoothConnectionState(State.CONNECTED_UNKNOWN_DEVICE);
            c();
            return;
        }
        this.b = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    Parcelable parcelable = extras.getParcelable("android.bluetooth.device.extra.DEVICE");
                    if (parcelable != null) {
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
                        int i = extras.getInt("android.bluetooth.profile.extra.STATE", -1);
                        if (i == 2) {
                            tpf tpf = tpf.this;
                            tpf.c = bluetoothDevice;
                            tpf.c();
                        } else {
                            if (i == 3 || i == 0) {
                                tpf tpf2 = tpf.this;
                                tpf2.c = null;
                                tpf2.c();
                            }
                        }
                    }
                } else {
                    if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                        int i2 = extras.getInt("android.bluetooth.adapter.extra.STATE", -1);
                        if (i2 == 13 || i2 == 10) {
                            tpf tpf3 = tpf.this;
                            tpf3.c = null;
                            tpf3.c();
                        }
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.a.registerReceiver(this.b, intentFilter);
        b();
    }

    public final void a(a aVar) {
        this.f.add(aVar);
    }

    public final void b(a aVar) {
        this.f.remove(aVar);
    }
}
