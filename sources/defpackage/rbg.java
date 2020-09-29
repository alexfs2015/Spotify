package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: rbg reason: default package */
public final class rbg {
    public final jrn a;
    public final vce b;
    public final rqb c;
    public final heg d;
    public final int e;
    public final int f = (this.h + (this.g << 1));
    public final int g = Math.min(this.e / 8, 16);
    public final int h;
    private final uix i;

    public rbg(Context context, jrn jrn, vce vce, rqb rqb, uix uix, heg heg) {
        this.a = jrn;
        this.b = vce;
        this.c = rqb;
        this.i = uix;
        this.d = heg;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.h = Math.min(Math.max(Math.round((((float) displayMetrics.heightPixels) * 1.5f) / ((float) Math.round(displayMetrics.density * 64.0f))), 16), 48);
        int i2 = this.h << 1;
        fqn d2 = jrn.d();
        this.e = Math.max(Math.min(Math.max(((Integer) fbm.a(fev.a((String) d2.a(vcd.b)), fbm.a(fev.a((String) d2.a(vcd.a)), Integer.valueOf(256)))).intValue(), 32), CrashReportManager.TIME_WINDOW), i2);
    }

    public static boolean e() {
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_DISABLE_PULLDOWN_FOR_FILTER_AND_SORT;
        return VERSION.SDK_INT >= 23;
    }

    public final boolean a() {
        return !jus.c(this.a.d());
    }

    public final boolean b() {
        return jus.a(this.a.d());
    }

    public final boolean c() {
        return jus.b(this.a.d());
    }

    public final boolean d() {
        return jus.b(this.a.d());
    }

    public final boolean f() {
        return this.b.a.b();
    }
}
