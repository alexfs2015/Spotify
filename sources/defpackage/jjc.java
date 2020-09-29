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

/* renamed from: jjc reason: default package */
public final class jjc extends jkj {
    /* access modifiers changed from: 0000 */
    public a a;
    private final Context b;
    private BroadcastReceiver c;
    /* access modifiers changed from: private */
    public boolean f;

    /* renamed from: jjc$a */
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
            return str3 != null ? str3.equals(aVar.c) : aVar.c == null;
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

    jjc(jkk jkk) {
        super("BluetoothA2dpConnected");
        this.b = jkk.a;
    }

    static /* synthetic */ String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN STATE" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    static /* synthetic */ boolean a(String str) {
        return "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(str);
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

    static /* synthetic */ void c(jjc jjc) {
        final BluetoothAdapter bluetoothAdapter;
        if (VERSION.SDK_INT < 18) {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        } else {
            BluetoothManager bluetoothManager = (BluetoothManager) jjc.b.getSystemService("bluetooth");
            bluetoothAdapter = bluetoothManager == null ? null : bluetoothManager.getAdapter();
        }
        if (bluetoothAdapter == null) {
            if (jjc.e) {
                jjc.ah_();
            }
        } else if (bluetoothAdapter.getProfileConnectionState(2) == 2) {
            bluetoothAdapter.getProfileProxy(jjc.b, new ServiceListener() {
                public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                    if (!jjc.this.f) {
                        List connectedDevices = bluetoothProfile.getConnectedDevices();
                        if (!connectedDevices.isEmpty()) {
                            jjc.this.a = a.a((Parcelable) connectedDevices.get(0));
                            jjc.this.ag_();
                        } else {
                            jjc.this.ah_();
                        }
                        bluetoothAdapter.closeProfileProxy(2, bluetoothProfile);
                        jjc.this.f = true;
                    }
                }

                public final void onServiceDisconnected(int i) {
                }
            }, 2);
        } else if (jjc.e) {
            jjc.ah_();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.c = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                String str = "New state: %s, Previous state: %s, Device name: %s";
                if (jjc.a(intent.getAction())) {
                    Parcelable parcelable = extras.getParcelable("android.bluetooth.device.extra.DEVICE");
                    if (parcelable == null) {
                        Logger.e("No device available from connection state intent", new Object[0]);
                        return;
                    }
                    a a2 = a.a(parcelable);
                    String str2 = "android.bluetooth.profile.extra.STATE";
                    Logger.b(str, jjc.a(extras.getInt(str2, -1)), jjc.a(extras.getInt("android.bluetooth.profile.extra.PREVIOUS_STATE", -1)), a2.a);
                    int i = extras.getInt(str2, -1);
                    if (i == 2) {
                        if (jjc.this.a != null && !jjc.this.a.equals(a2)) {
                            jjc.this.ah_();
                        }
                        jjc.this.a = a2;
                        jjc.this.ag_();
                    } else if (i == 3 || i == 0) {
                        jjc.this.a = null;
                        jjc.this.ah_();
                    }
                } else {
                    if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                        String str3 = "android.bluetooth.adapter.extra.STATE";
                        Logger.b(str, jjc.b(extras.getInt(str3, -1)), jjc.b(extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), jjc.this.a != null ? jjc.this.a.a : "");
                        int i2 = extras.getInt(str3, -1);
                        if (i2 == 13 || i2 == 10) {
                            jjc.this.a = null;
                            jjc.this.ah_();
                        }
                    } else {
                        Assertion.b("Unexpected intent");
                    }
                }
                if (!jjc.this.f) {
                    jjc.this.f = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.b.registerReceiver(this.c, intentFilter);
        new Handler().post(new Runnable() {
            public final void run() {
                jjc.c(jjc.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.b.unregisterReceiver(this.c);
        this.a = null;
    }
}
