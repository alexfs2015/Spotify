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

/* renamed from: rlj reason: default package */
public final class rlj {
    public long a;
    public boolean b;
    public boolean c;
    public Lifecycle d = Lifecycle.startup;
    private final jrs e;
    private final jro f;
    private final String g;
    private final String h;
    private final Context i;
    private final SpSharedPreferences<Object> j;

    public rlj(glv glv, jrs jrs, jro jro, String str, String str2, SpSharedPreferences<Object> spSharedPreferences, Context context) {
        this.e = jrs;
        this.f = jro;
        this.h = str;
        this.g = str2;
        this.j = spSharedPreferences;
        this.i = context;
        glv.a((glu) new $$Lambda$rlj$ApTLq0fo9jtk_x2pxCZsuntDo(this));
    }

    private Architecture b() {
        try {
            String lowerCase = this.g.toLowerCase(Locale.US);
            if ("x86".equals(lowerCase)) {
                return Architecture.i386;
            }
            return Architecture.valueOf(lowerCase);
        } catch (IllegalArgumentException unused) {
            return Architecture.unknown;
        }
    }

    public final rlf a() {
        State state;
        a aVar = new a();
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        StringBuilder sb = new StringBuilder("Android");
        String str = "";
        sb.append(jtc.c(this.i) ? "-tablet" : str);
        objArr[0] = sb.toString();
        objArr[1] = VERSION.RELEASE;
        objArr[2] = Integer.valueOf(VERSION.SDK_INT);
        objArr[3] = Build.MANUFACTURER;
        objArr[4] = Build.MODEL;
        String format = String.format(locale, "%s OS %s API %d (%s, %s)", objArr);
        String str2 = "uptime";
        String str3 = "device_id";
        String str4 = "hardware_model";
        String str5 = "hardware_vendor";
        String str6 = "os";
        String str7 = "architecture";
        String str8 = "signature";
        String str9 = "free_memory";
        a b2 = aVar.b("raw_platform", format).b("product", "com.spotify.music").b("version", this.h).b("revision", Integer.toString(852700957)).b(str2, Long.toString(SystemClock.elapsedRealtime() - this.a)).b(str3, this.e.a()).b("uuid", UUID.randomUUID().toString().toUpperCase(Locale.US)).b(str4, Build.MODEL).b(str5, Build.MANUFACTURER).b(str6, VERSION.RELEASE).b(str7, b().name()).b("client_build_type", str).b(str8, this.f.e()).b(str9, Long.toString(Runtime.getRuntime().freeMemory()));
        if (!this.b) {
            state = State.background;
        } else if (this.c) {
            state = State.inactive;
        } else {
            state = State.active;
        }
        a b3 = b2.b("state", state.name()).b("lifecycle", this.d.name());
        String a2 = this.j.a(rlp.a, (String) null);
        if (a2 != null) {
            b3.b("username", a2);
        }
        return new rlf(b3.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ViewLoadSequence viewLoadSequence) {
        this.d = Lifecycle.operational;
    }
}
