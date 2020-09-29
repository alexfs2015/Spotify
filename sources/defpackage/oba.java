package defpackage;

import android.content.Context;
import java.text.DateFormat;

/* renamed from: oba reason: default package */
public final class oba implements vua<DateFormat> {
    private final wlc<Context> a;

    private oba(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static oba a(wlc<Context> wlc) {
        return new oba(wlc);
    }

    public final /* synthetic */ Object get() {
        return (DateFormat) vuf.a(android.text.format.DateFormat.getDateFormat((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
