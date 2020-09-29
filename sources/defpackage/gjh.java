package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: gjh reason: default package */
public final class gjh implements wig<git> {
    private final wzi<Context> a;

    private gjh(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static gjh a(wzi<Context> wzi) {
        return new gjh(wzi);
    }

    public final /* synthetic */ Object get() {
        File a2 = giu.a((Context) this.a.get(), "picasso-cache");
        return (git) wil.a(new giu(a2, giu.a(a2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
