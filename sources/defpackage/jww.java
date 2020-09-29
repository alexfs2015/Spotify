package defpackage;

import com.spotify.base.java.logging.LogLevel;
import java.util.EnumSet;

/* renamed from: jww reason: default package */
public final class jww implements wig<jwr> {
    private final wzi<jwu> a;
    private final wzi<EnumSet<LogLevel>> b;

    private jww(wzi<jwu> wzi, wzi<EnumSet<LogLevel>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jww a(wzi<jwu> wzi, wzi<EnumSet<LogLevel>> wzi2) {
        return new jww(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jwr((jwu) this.a.get(), (EnumSet) this.b.get());
    }
}
