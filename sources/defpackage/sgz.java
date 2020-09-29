package defpackage;

import android.content.Context;
import java.util.Calendar;

/* renamed from: sgz reason: default package */
public final class sgz implements wig<sgy> {
    private final wzi<Context> a;
    private final wzi<Calendar> b;

    private sgz(wzi<Context> wzi, wzi<Calendar> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sgz a(wzi<Context> wzi, wzi<Calendar> wzi2) {
        return new sgz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sgy((Context) this.a.get(), (Calendar) this.b.get(), (Calendar) this.b.get());
    }
}
