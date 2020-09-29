package defpackage;

import android.content.Context;
import java.text.DateFormat;

/* renamed from: ohz reason: default package */
public final class ohz implements wig<DateFormat> {
    private final wzi<Context> a;

    private ohz(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ohz a(wzi<Context> wzi) {
        return new ohz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (DateFormat) wil.a(android.text.format.DateFormat.getDateFormat((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
