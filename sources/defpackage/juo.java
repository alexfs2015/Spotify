package defpackage;

import com.spotify.base.java.logging.LogLevel;
import java.util.EnumSet;

/* renamed from: juo reason: default package */
public final class juo implements vua<juj> {
    private final wlc<jum> a;
    private final wlc<EnumSet<LogLevel>> b;

    private juo(wlc<jum> wlc, wlc<EnumSet<LogLevel>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static juo a(wlc<jum> wlc, wlc<EnumSet<LogLevel>> wlc2) {
        return new juo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new juj((jum) this.a.get(), (EnumSet) this.b.get());
    }
}
