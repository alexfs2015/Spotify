package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;

/* renamed from: jgn reason: default package */
public final class jgn extends jht {
    /* access modifiers changed from: 0000 */
    public a a;
    private final Context b;
    private BroadcastReceiver c;
    /* access modifiers changed from: private */
    public boolean f;

    /* renamed from: jgn$a */
    public static class a {
        final String a;
        private final String b;
        private final String c;

        private a(String str, String str2, BluetoothClass bluetoothClass) {
            this.a = str;
            this.b = str2;
            if (bluetoothClass != null) {
                this.c = String.valueOf(bluetoothClass.getDeviceClass());
            } else {
                this.c = "1024";
            }
        }

        static a a(Parcelable parcelable) {
            String str;
            String str2;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
            BluetoothClass bluetoothClass = null;
            try {
                str2 = bluetoothDevice.getName();
                try {
                    str = bluetoothDevice.getAddress();
                } catch (NullPointerException e) {
                    e = e;
                    str = null;
                    Assertion.b("Unexpected nullpointer from BT api", (Throwable) e);
                    return new a(str2, str, bluetoothClass);
                }
                try {
                    bluetoothClass = bluetoothDevice.getBluetoothClass();
                } catch (NullPointerException e2) {
                    e = e2;
                    Assertion.b("Unexpected nullpointer from BT api", (Throwable) e);
                    return new a(str2, str, bluetoothClass);
                }
            } catch (NullPointerException e3) {
                e = e3;
                str2 = null;
                str = null;
                Assertion.b("Unexpected nullpointer from BT api", (Throwable) e);
                return new a(str2, str, bluetoothClass);
            }
            return new a(str2, str, bluetoothClass);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.a;
            if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? aVar.b != null : !str2.equals(aVar.b)) {
                return false;
            }
            String str3 = this.c;
            if (str3 != null) {
                return str3.equals(aVar.c);
            }
            return aVar.c == null;
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }
    }

    static /* synthetic */ String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN STATE" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    static /* synthetic */ String b(int i) {
        switch (i) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "UNKNOWN STATE";
        }
    }

    jgn(jhu jhu) {
        super("BluetoothA2dpConnected");
        this.b = jhu.a;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.c = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                String str;
                Bundle extras = intent.getExtras();
                String str2 = "New state: %s, Previous state: %s, Device name: %s";
                if (jgn.a(intent.getAction())) {
                    Parcelable parcelable = extras.getParcelable("android.bluetooth.device.extra.DEVICE");
                    if (parcelable == null) {
                        Logger.e("No device available from connection state intent", new Object[0]);
                        return;
                    }
                    a a2 = a.a(parcelable);
                    String str3 = "android.bluetooth.profile.extra.STATE";
                    Logger.b(str2, jgn.a(extras.getInt(str3, -1)), jgn.a(extras.getInt("android.bluetooth.profile.extra.PREVIOUS_STATE", -1)), a2.a);
                    int i = extras.getInt(str3, -1);
                    if (i == 2) {
                        if (jgn.this.a != null && !jgn.this.a.equals(a2)) {
                            jgn.this.ah_();
                        }
                        jgn.this.a = a2;
                        jgn.this.ag_();
                    } else if (i == 3 || i == 0) {
                        jgn.this.a = null;
                        jgn.this.ah_();
                    }
                } else {
                    if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                        if (jgn.this.a != null) {
                            str = jgn.this.a.a;
                        } else {
                            str = "";
                        }
                        String str4 = "android.bluetooth.adapter.extra.STATE";
                        Logger.b(str2, jgn.b(extras.getInt(str4, -1)), jgn.b(extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), str);
                        int i2 = extras.getInt(str4, -1);
                        if (i2 == 13 || i2 == 10) {
                            jgn.this.a = null;
                            jgn.this.ah_();
                        }
                    } else {
                        Assertion.b("Unexpected intent");
                    }
                }
                if (!jgn.this.f) {
                    jgn.this.f = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.b.registerReceiver(this.c, intentFilter);
        new Handler().post(new Runnable() {
            public final void run() {
                jgn.c(jgn.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.b.unregisterReceiver(this.c);
        this.a = null;
    }

    static /* synthetic */ boolean a(String str) {
        return "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(str);
    }

    static /* synthetic */ void c(jgn jgn) {
        final BluetoothAdapter bluetoothAdapter;
        if (VERSION.SDK_INT < 18) {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        } else {
            BluetoothManager bluetoothManager = (BluetoothManager) jgn.b.getSystemService("bluetooth");
            if (bluetoothManager == null) {
                bluetoothAdapter = null;
            } else {
                bluetoothAdapter = bluetoothManager.getAdapter();
            }
        }
        if (bluetoothAdapter == null) {
            if (jgn.e) {
                jgn.ah_();
            }
        } else if (bluetoothAdapter.getProfileConnectionState(2) == 2) {
            bluetoothAdapter.getProfileProxy(jgn.b, new ServiceListener() {
                public final void onServiceDisconnected(int i) {
                }

                public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                    if (!jgn.this.f) {
                        List connectedDevices = bluetoothProfile.getConnectedDevices();
                        if (!connectedDevices.isEmpty()) {
                            jgn.this.a = a.a((Parcelable) connectedDevices.get(0));
                            jgn.this.ag_();
                        } else {
                            jgn.this.ah_();
                        }
                        bluetoothAdapter.closeProfileProxy(2, bluetoothProfile);
                        jgn.this.f = true;
                    }
                }
            }, 2);
        } else if (jgn.e) {
            jgn.ah_();
        }
    }
}
