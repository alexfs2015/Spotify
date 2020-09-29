package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: qsr reason: default package */
public final class qsr {
    public final jpb a;
    public final rgz b;
    public final int c;
    public final int d = (this.f + (this.e << 1));
    public final int e = Math.min(this.c / 8, 16);
    public final int f;
    private final uqz g;
    private final twu h;
    private final uqi i;

    public qsr(Context context, jpb jpb, uqz uqz, rgz rgz, twu twu, uqi uqi) {
        this.a = jpb;
        this.g = uqz;
        this.b = rgz;
        this.h = twu;
        this.i = uqi;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f = Math.min(Math.max(Math.round((((float) displayMetrics.heightPixels) * 1.5f) / ((float) Math.round(displayMetrics.density * 64.0f))), 16), 48);
        int i2 = this.f << 1;
        fpt b2 = jpb.b();
        this.c = Math.max(Math.min(Math.max(((Integer) fav.a(feb.a((String) b2.a(uqy.b)), fav.a(feb.a((String) b2.a(uqy.a)), Integer.valueOf(256)))).intValue(), 32), CrashReportManager.TIME_WINDOW), i2);
    }

    public final boolean a() {
        return !jsl.c(this.a.b());
    }

    public final boolean b() {
        return jsl.a(this.a.b());
    }

    public final boolean c() {
        return jsl.b(this.a.b());
    }

    public final boolean d() {
        return jsl.b(this.a.b());
    }

    public static boolean e() {
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_DISABLE_PULLDOWN_FOR_FILTER_AND_SORT;
        return VERSION.SDK_INT >= 23;
    }

    public final boolean f() {
        return this.g.a.a();
    }
}
