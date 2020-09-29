package com.spotify.mobile.android.ui.activity.upsell;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public final class PremiumActivationNotificationStyleStrategy implements jka {
    private final WeakReference<Context> a;
    private final fl b;
    private final int c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public static class NotificationsIntentReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            fay.a(context);
            fay.a(intent);
            String action = intent.getAction();
            String str = "com.spotify.music.features.upsell.SHOW_MAIN";
            fay.a(str.equals(action));
            if (str.equals(action)) {
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
            }
        }
    }

    public PremiumActivationNotificationStyleStrategy(Context context, fl flVar, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = new WeakReference<>(context);
        this.b = flVar;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context != null) {
            c cVar = new c(context);
            c a2 = cVar.a((CharSequence) this.e).b((CharSequence) this.f).d(this.g).a((int) R.drawable.icn_notification).a(true);
            a2.o = true;
            a2.a(2, true);
            c a3 = a2.a(0);
            a3.r = fr.c(context, R.color.cat_medium_green);
            a3.p = "status";
            a3.h = 1;
            a3.a(0, 0, true);
            if (VERSION.SDK_INT >= 18) {
                cVar.b(2);
            }
            if (VERSION.SDK_INT >= 21) {
                cVar.s = 1;
            }
            a(this.c, cVar);
        }
    }

    public final void b() {
        fl flVar = this.b;
        int i2 = this.c;
        flVar.b.cancel(null, i2);
        if (VERSION.SDK_INT <= 19) {
            flVar.a((e) new a(flVar.a.getPackageName(), i2, null));
        }
    }

    public final void c() {
        Context context = (Context) this.a.get();
        if (context != null) {
            c cVar = new c(context);
            c a2 = cVar.a((CharSequence) this.h).b((CharSequence) this.i).d(this.j).a((int) R.drawable.icn_notification).a(true);
            a2.o = true;
            c a3 = a2.a(0);
            a3.r = fr.c(context, R.color.cat_medium_green);
            a3.p = "status";
            a3.h = 1;
            a3.b(true).f = a(context);
            if (VERSION.SDK_INT >= 18) {
                cVar.b(2);
            }
            if (VERSION.SDK_INT >= 21) {
                cVar.s = 1;
            }
            a(this.d, cVar);
        }
    }

    public final void d() {
        Context context = (Context) this.a.get();
        if (context != null) {
            c cVar = new c(context);
            c a2 = cVar.a((CharSequence) this.k).b((CharSequence) this.l).d(this.m).a((int) R.drawable.icn_notification).a(true);
            a2.o = true;
            c a3 = a2.a(0);
            a3.r = fr.c(context, R.color.cat_medium_green);
            a3.p = "status";
            a3.h = 1;
            a3.b(true).f = a(context);
            if (VERSION.SDK_INT >= 18) {
                cVar.b(2);
            }
            if (VERSION.SDK_INT >= 21) {
                cVar.s = 1;
            }
            a(this.d, cVar);
        }
    }

    private void a(int i2, c cVar) {
        try {
            this.b.a(i2, cVar.b());
        } catch (SecurityException unused) {
            cVar.b(0);
            this.b.a(i2, cVar.b());
        }
    }

    private static Intent a(Context context, String str) {
        return new Intent(str, null, context, NotificationsIntentReceiver.class);
    }

    private static PendingIntent a(Context context) {
        return PendingIntent.getBroadcast(context, 10, a(context, "com.spotify.music.features.upsell.SHOW_MAIN"), 268435456);
    }
}
