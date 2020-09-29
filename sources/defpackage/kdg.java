package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.waze.sdk.WazeSDKManager;
import com.waze.sdk.WazeSDKManager.Waze_Message;
import java.lang.ref.WeakReference;

/* renamed from: kdg reason: default package */
public final class kdg implements kdf {
    /* access modifiers changed from: private */
    public static final Waze_Message[] a = Waze_Message.values();
    private final Context b;
    private final kde c;
    private boolean d;
    private defpackage.kdf.a e;
    private a f;

    /* renamed from: kdg$a */
    static class a extends Handler {
        private final WeakReference<defpackage.kdf.a> a;

        public a(defpackage.kdf.a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            defpackage.kdf.a aVar = (defpackage.kdf.a) this.a.get();
            if (aVar == null) {
                Assertion.b("Weak reference has been lost, can't handle messages");
                return;
            }
            Waze_Message waze_Message = kdg.a[message.what];
            switch (waze_Message) {
                case Waze_Message_CONNECTION_STATUS:
                    boolean parseBoolean = Boolean.parseBoolean(message.getData().getString("STATUS"));
                    Logger.b("Conn=%b", Boolean.valueOf(parseBoolean));
                    aVar.a(parseBoolean);
                    return;
                case Waze_Message_ETA:
                    String string = message.getData().getString("ETA_MINUTES");
                    Logger.b("ETA=%s", string);
                    aVar.a(string);
                    return;
                case Waze_Message_ETA_DISTANCE:
                    String string2 = message.getData().getString("ETA_DISTANCE");
                    Logger.b("ETADistance=%s", string2);
                    aVar.b(string2);
                    return;
                case Waze_Message_INSTRUCTION:
                    String string3 = message.getData().getString("INSTRUCTION");
                    try {
                        int parseInt = Integer.parseInt(string3);
                        Logger.b("Inst=%d", Integer.valueOf(parseInt));
                        aVar.a(parseInt);
                        return;
                    } catch (NumberFormatException e) {
                        Logger.e(e, "Couldn't parse instruction %s", string3);
                        return;
                    }
                case Waze_Message_INSTRUCTION_EXIT:
                    String string4 = message.getData().getString("INSTRUCTION_EXIT");
                    try {
                        int parseInt2 = Integer.parseInt(string4);
                        Logger.b("Exit=%d", Integer.valueOf(parseInt2));
                        aVar.b(parseInt2);
                        return;
                    } catch (NumberFormatException e2) {
                        Logger.e(e2, "Couldn't parse instruction exit %s", string4);
                        return;
                    }
                case Waze_Message_DISTANCE:
                    String string5 = message.getData().getString("DISTANCE_METERS");
                    String string6 = message.getData().getString("DISTANCE_DISPLAY");
                    Logger.b("Distance: %s, Distance display: %s", string5, string6);
                    aVar.a(string5, string6);
                    return;
                case Waze_Message_ROUTE:
                    break;
                case Waze_Message_DIRECTION_SIDE:
                    boolean parseBoolean2 = Boolean.parseBoolean(message.getData().getString("LEFT_LANE"));
                    Logger.b("UKStyle: %b", Boolean.valueOf(parseBoolean2));
                    aVar.b(parseBoolean2);
                    break;
                case Waze_Message_NAVIGATION_STATUS:
                    Logger.b("IsNavigating: %b", Boolean.valueOf(Boolean.parseBoolean(message.getData().getString("IS_NAVIGATING"))));
                    return;
                default:
                    Logger.e("Unknown %s => %s", waze_Message, message);
                    return;
            }
        }
    }

    public kdg(Context context, kde kde) {
        this.b = context;
        this.c = kde;
    }

    public final void a(defpackage.kdf.a aVar) {
        if (this.d) {
            Assertion.b("WazeSdkWrapper has already been started!");
            return;
        }
        Logger.b("start", new Object[0]);
        this.d = true;
        this.e = aVar;
        this.f = new a(this.e);
        Messenger messenger = new Messenger(this.f);
        if (!defpackage.kzd.a.a) {
            defpackage.vth.a aVar2 = new defpackage.vth.a();
            aVar2.a = this.c.a(this.b);
            vth vth = new vth(aVar2.a, false, false, false, null, null, null, 0);
            WazeSDKManager a2 = WazeSDKManager.a();
            a2.e = this.b.getApplicationContext();
            a2.f = messenger;
            a2.c = vth;
            a2.d = vtg.a();
            a2.b = new Messenger(new com.waze.sdk.WazeSDKManager.a(a2.d));
            a2.l = new Intent();
            String str = "com.waze";
            a2.l.setComponent(new ComponentName(str, "com.waze.AIDLService"));
            a2.e.bindService(a2.l, a2.m, 1);
            a2.k = new Intent();
            a2.k.setComponent(new ComponentName(str, "com.waze.BoundService"));
            a2.e.bindService(a2.k, a2.n, 1);
        }
    }

    public final void a() {
        if (!this.d) {
            Assertion.b("Trying to stop WazeSdkWrapper which hasn't been started yet!");
            return;
        }
        Logger.b("stop", new Object[0]);
        if (!defpackage.kzd.a.a) {
            WazeSDKManager a2 = WazeSDKManager.a();
            if (a2.a) {
                a2.a = false;
                a2.h = -1.0d;
                a2.g = -1.0d;
                a2.i = null;
                a2.j = null;
                a2.d = null;
                a2.e.unbindService(a2.n);
                a2.e.stopService(a2.k);
                a2.e.unbindService(a2.m);
                a2.e.stopService(a2.l);
            }
        }
        this.e = null;
        this.f = null;
        this.d = false;
    }

    public final void b() {
        if (!this.d) {
            Assertion.b("Trying to openWaze before WazeSdkWrapper has been started!");
            return;
        }
        Logger.b("open", new Object[0]);
        if (!defpackage.kzd.a.a) {
            WazeSDKManager.a().a((Uri) null);
        }
    }

    public final boolean c() {
        return this.d;
    }
}
