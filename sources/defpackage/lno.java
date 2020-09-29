package defpackage;

import java.util.Calendar;

/* renamed from: lno reason: default package */
public final class lno implements wig<Calendar> {
    private final wzi<gcb> a;

    private lno(wzi<gcb> wzi) {
        this.a = wzi;
    }

    public static lno a(wzi<gcb> wzi) {
        return new lno(wzi);
    }

    public final /* synthetic */ Object get() {
        gcb gcb = (gcb) this.a.get();
        return (Calendar) wil.a(jtp.a.f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
