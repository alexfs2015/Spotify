package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.app.ApplicationManager.AnonymousClass2;
import com.bmwgroup.connected.car.app.ApplicationType;
import com.bmwgroup.connected.car.app.BrandType;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;

/* renamed from: lyd reason: default package */
public final class lyd implements lyc {
    private final lyh a;

    static {
        ags.a(7);
    }

    public lyd(lyh lyh) {
        this.a = lyh;
    }

    public final void a(Context context) {
        Logger.b("Registering BMW app", new Object[0]);
        Logger.b("register context %s", context);
        ApplicationType applicationType = ApplicationType.MULTIMEDIA;
        BrandType brandType = BrandType.ALL;
        String str = "com.spotify.music.features.bmw.ACTION_CONNECTED";
        String str2 = "com.spotify.music.features.bmw.ACTION_DISCONNECTED";
        Logger.b("register context %s connectAction %s disconnectAction %s", context, str, str2);
        ApplicationManager applicationManager = ApplicationManager.INSTANCE;
        if (context != null) {
            applicationManager.mAppId = context.getPackageName();
            BrandType brandType2 = brandType == null ? BrandType.ALL : brandType;
            if (context != null) {
                applicationManager.mDisconnectReceiverAction = str2;
                Handler handler = new Handler();
                AnonymousClass2 r4 = new Runnable(context, R.string.app_name, R.drawable.bmw_spotify_logo, applicationType, str, str2, brandType2) {
                    private /* synthetic */ Context a;
                    private /* synthetic */ int b;
                    private /* synthetic */ int c;
                    private /* synthetic */ ApplicationType d;
                    private /* synthetic */ String e;
                    private /* synthetic */ String f;
                    private /* synthetic */ BrandType g;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r4;
                        this.d = r5;
                        this.e = r6;
                        this.f = r7;
                        this.g = r8;
                    }

                    public final void run() {
                        String b2 = ApplicationManager.b(this.a, this.b);
                        byte[] a2 = ApplicationManager.a(this.a, this.c);
                        Intent intent = new Intent("com.bmwgroup.connected.app.action.ACTION_CAR_APPLICATION_REGISTERING");
                        intent.putExtra("EXTRA_APPLICATION_CATEGORY", this.d.toString());
                        intent.putExtra("EXTRA_APPLICATION_TITLE", b2);
                        intent.putExtra("EXTRA_APPLICATION_VERSION", "v3");
                        intent.putExtra("EXTRA_APPLICATION_CONNECT_RECEIVER_ACTION", this.e);
                        intent.putExtra("EXTRA_APPLICATION_DISCONNECT_RECEIVER_ACTION", this.f);
                        intent.putExtra("EXTRA_APPLICATION_BRAND", this.g);
                        intent.putExtra("EXTRA_APPLICATION_APP_ICON", a2);
                        intent.putExtra("EXTRA_APPLICATION_ID", ApplicationManager.this.mAppId);
                        this.a.sendBroadcast(intent);
                    }
                };
                handler.post(r4);
                return;
            }
            throw new IllegalArgumentException("ApplicationContext is null!");
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
