package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.crashes.report.CrashReport.Architecture;
import com.spotify.music.internal.crashes.report.CrashReport.Lifecycle;
import com.spotify.music.internal.crashes.report.CrashReport.State;
import java.util.Locale;
import java.util.UUID;

/* renamed from: rup reason: default package */
public final class rup {
    public long a;
    public boolean b;
    public boolean c;
    public Lifecycle d = Lifecycle.startup;
    private final juc e;
    private final jty f;
    private final String g;
    private final String h;
    private final Context i;
    private final SpSharedPreferences<Object> j;

    public rup(gnk gnk, juc juc, jty jty, String str, String str2, SpSharedPreferences<Object> spSharedPreferences, Context context) {
        this.e = juc;
        this.f = jty;
        this.h = str;
        this.g = str2;
        this.j = spSharedPreferences;
        this.i = context;
        gnk.a((gnj) new $$Lambda$rup$e3Spnj2MoFhR2j8VhsJR2Em0F8g(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ViewLoadSequence viewLoadSequence) {
        this.d = Lifecycle.operational;
    }

    private Architecture b() {
        try {
            String lowerCase = this.g.toLowerCase(Locale.US);
            return "x86".equals(lowerCase) ? Architecture.i386 : Architecture.valueOf(lowerCase);
        } catch (IllegalArgumentException unused) {
            return Architecture.unknown;
        }
    }

    public final rul a() {
        a aVar = new a();
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        StringBuilder sb = new StringBuilder("Android");
        String str = "";
        sb.append(jvi.c(this.i) ? "-tablet" : str);
        objArr[0] = sb.toString();
        objArr[1] = VERSION.RELEASE;
        objArr[2] = Integer.valueOf(VERSION.SDK_INT);
        objArr[3] = Build.MANUFACTURER;
        objArr[4] = Build.MODEL;
        String format = String.format(locale, "%s OS %s API %d (%s, %s)", objArr);
        String str2 = "hardware_model";
        String str3 = "hardware_vendor";
        String str4 = "os";
        String str5 = "architecture";
        String str6 = "signature";
        String str7 = "free_memory";
        a b2 = aVar.b("raw_platform", format).b("product", "com.spotify.music").b("version", this.h).b("revision", Integer.toString(852900828)).b("uptime", Long.toString(SystemClock.elapsedRealtime() - this.a)).b("device_id", this.e.a()).b("uuid", UUID.randomUUID().toString().toUpperCase(Locale.US)).b(str2, Build.MODEL).b(str3, Build.MANUFACTURER).b(str4, VERSION.RELEASE).b(str5, b().name()).b("client_build_type", str).b(str6, this.f.e()).b(str7, Long.toString(Runtime.getRuntime().freeMemory()));
        State state = this.b ? this.c ? State.inactive : State.active : State.background;
        a b3 = b2.b("state", state.name()).b("lifecycle", this.d.name());
        String a2 = this.j.a(ruv.a, (String) null);
        if (a2 != null) {
            b3.b("username", a2);
        }
        return new rul(b3.b());
    }
}
