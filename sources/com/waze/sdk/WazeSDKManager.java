package com.waze.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public final class WazeSDKManager {
    /* access modifiers changed from: private */
    public static WazeSDKManager s;
    public boolean a;
    public Messenger b;
    public vth c;
    public String d;
    public Context e;
    public Messenger f;
    public double g = -1.0d;
    public double h = -1.0d;
    public Favorite i;
    public String j;
    public Intent k;
    public Intent l;
    public ServiceConnection m = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WazeSDKManager.this.q = defpackage.vtf.a.a(iBinder);
            WazeSDKManager.this.p = true;
            try {
                WazeSDKManager.this.q.a(WazeSDKManager.this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            WazeSDKManager.this.q = null;
        }
    };
    public ServiceConnection n = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            WazeSDKManager.this.o = null;
            WazeSDKManager.a(WazeSDKManager.this, Waze_Message.Waze_Message_CONNECTION_STATUS.ordinal(), "STATUS", "false");
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WazeSDKManager.this.o = new Messenger(iBinder);
            WazeSDKManager.this.a = true;
            if (WazeSDKManager.this.p) {
                WazeSDKManager.d(WazeSDKManager.this);
            }
            WazeSDKManager.a(WazeSDKManager.this, Waze_Message.Waze_Message_CONNECTION_STATUS.ordinal(), "STATUS", "true");
        }
    };
    /* access modifiers changed from: private */
    public Messenger o;
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public vtf q;
    /* access modifiers changed from: private */
    public boolean r;

    public enum Favorite {
        HOME,
        WORK
    }

    public enum Waze_Message {
        Waze_Message_ROUTE,
        Waze_Message_DISTANCE,
        Waze_Message_ETA,
        Waze_Message_INSTRUCTION,
        Waze_Message_CONNECTION_STATUS,
        Waze_Message_UNUSED,
        Waze_Message_INSTRUCTION_EXIT,
        Waze_Message_DIRECTION_SIDE,
        Waze_Message_ETA_DISTANCE,
        Waze_Message_NAVIGATION_STATUS
    }

    public static class a extends Handler {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public final void handleMessage(Message message) {
            String str = "IS_NAVIGATING";
            if (WazeSDKManager.s.a) {
                switch (message.what) {
                    case 0:
                        String str2 = "GeoJson";
                        String a2 = vtg.a(message.getData().getByteArray(str2), this.a);
                        if (a2 != null) {
                            WazeSDKManager.a(WazeSDKManager.s, 0, str2, a2);
                            break;
                        }
                        break;
                    case 1:
                        String str3 = "DISTANCE_METERS";
                        String a3 = vtg.a(message.getData().getByteArray(str3), this.a);
                        if (a3 != null) {
                            String str4 = "DISTANCE_DISPLAY";
                            String a4 = vtg.a(message.getData().getByteArray(str4), this.a);
                            if (a4 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString(str3, a3);
                                bundle.putString(str4, a4);
                                WazeSDKManager.a(WazeSDKManager.s, 1, bundle);
                                return;
                            }
                        }
                        break;
                    case 2:
                        String str5 = "ETA_MINUTES";
                        String a5 = vtg.a(message.getData().getByteArray(str5), this.a);
                        if (a5 != null) {
                            WazeSDKManager.a(WazeSDKManager.s, 2, str5, a5);
                            return;
                        }
                        break;
                    case 3:
                        String str6 = "INSTRUCTION";
                        String a6 = vtg.a(message.getData().getByteArray(str6), this.a);
                        if (a6 != null) {
                            WazeSDKManager.a(WazeSDKManager.s, 3, str6, a6);
                            return;
                        }
                        break;
                    case 4:
                        if (vtg.a(message.getData().getByteArray("NEXT_TURN"), this.a) == null) {
                            return;
                        }
                        break;
                    case 6:
                        String str7 = "INSTRUCTION_EXIT";
                        String a7 = vtg.a(message.getData().getByteArray(str7), this.a);
                        if (a7 != null) {
                            WazeSDKManager.a(WazeSDKManager.s, 6, str7, a7);
                            return;
                        }
                        break;
                    case 7:
                        String a8 = vtg.a(message.getData().getByteArray("AGREEMENT"), this.a);
                        if (a8 != null && Boolean.valueOf(a8).booleanValue()) {
                            WazeSDKManager.f(WazeSDKManager.s);
                            return;
                        }
                    case 9:
                        String a9 = vtg.a(message.getData().getByteArray("CONNECTION"), this.a);
                        if (a9 != null && !Boolean.valueOf(a9).booleanValue() && WazeSDKManager.s.a) {
                            WazeSDKManager.a(WazeSDKManager.s, Waze_Message.Waze_Message_CONNECTION_STATUS.ordinal(), "STATUS", "false");
                            return;
                        }
                    case 10:
                        String str8 = "LEFT_LANE";
                        String a10 = vtg.a(message.getData().getByteArray(str8), this.a);
                        if (a10 != null) {
                            WazeSDKManager.a(WazeSDKManager.s, Waze_Message.Waze_Message_DIRECTION_SIDE.ordinal(), str8, a10);
                            break;
                        }
                        break;
                    case 11:
                        String str9 = "ETA_DISTANCE";
                        String a11 = vtg.a(message.getData().getByteArray(str9), this.a);
                        if (a11 != null) {
                            WazeSDKManager.a(WazeSDKManager.s, Waze_Message.Waze_Message_ETA_DISTANCE.ordinal(), str9, a11);
                            return;
                        }
                        break;
                    case 12:
                        try {
                            WazeSDKManager.s.r = Boolean.valueOf(vtg.a(message.getData().getByteArray(str), this.a)).booleanValue();
                        } catch (Exception unused) {
                        }
                        WazeSDKManager.a(WazeSDKManager.s, Waze_Message.Waze_Message_NAVIGATION_STATUS.ordinal(), str, Boolean.toString(WazeSDKManager.s.r));
                        return;
                }
            }
        }
    }

    public static WazeSDKManager a() {
        if (s == null) {
            s = new WazeSDKManager();
        }
        return s;
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.waze", 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public void a(Uri uri) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.waze", "com.waze.FreeMapAppActivity"));
        intent.addFlags(268435456);
        intent.setData(uri);
        this.e.startActivity(intent);
    }

    static /* synthetic */ void a(WazeSDKManager wazeSDKManager, int i2, String str, String str2) {
        Message obtain = Message.obtain(null, i2, 0, 0);
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        obtain.setData(bundle);
        try {
            wazeSDKManager.f.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    static /* synthetic */ void d(WazeSDKManager wazeSDKManager) {
        try {
            wazeSDKManager.p = false;
            Message obtain = Message.obtain(null, 5, 0, 0);
            vth vth = wazeSDKManager.c;
            Bundle bundle = new Bundle();
            if (vth.a != null) {
                bundle.putParcelable("Intent", vth.a);
            }
            if (vth.b) {
                bundle.putBoolean("HideIcon", true);
            }
            if (vth.c) {
                bundle.putBoolean("DisableRoutePreview", true);
            }
            if (vth.d) {
                bundle.putBoolean("UseBottomDockButton", true);
            }
            if (vth.e != null) {
                bundle.putString("CarId", vth.e);
            }
            if (vth.f != null) {
                bundle.putString("VoiceId", vth.f);
            }
            if (vth.g != null) {
                bundle.putString("VehicleType", vth.g);
            }
            obtain.setData(bundle);
            obtain.replyTo = wazeSDKManager.b;
            wazeSDKManager.o.send(obtain);
            if (VERSION.SDK_INT >= 29) {
                wazeSDKManager.o.send(Message.obtain(null, 14, 0, 0));
                return;
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.intent.action.VIEW");
            intent.setPackage("com.waze");
            intent.setData(Uri.parse("waze://?a="));
            wazeSDKManager.e.startActivity(intent);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void f(WazeSDKManager wazeSDKManager) {
        double d2 = wazeSDKManager.h;
        if (d2 != -1.0d) {
            double d3 = wazeSDKManager.g;
            if (d3 != -1.0d) {
                StringBuilder sb = new StringBuilder("waze://?ll=");
                sb.append(d2);
                sb.append(",");
                sb.append(d3);
                sb.append("&n=T");
                wazeSDKManager.a(Uri.parse(sb.toString()));
            }
        }
        wazeSDKManager.h = -1.0d;
        wazeSDKManager.g = -1.0d;
        wazeSDKManager.i = null;
        wazeSDKManager.j = null;
    }

    static /* synthetic */ void a(WazeSDKManager wazeSDKManager, int i2, Bundle bundle) {
        Message obtain = Message.obtain(null, 1, 0, 0);
        obtain.setData(bundle);
        try {
            wazeSDKManager.f.send(obtain);
        } catch (RemoteException unused) {
        }
    }
}
