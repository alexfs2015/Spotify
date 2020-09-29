package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lhh reason: default package */
public final class lhh implements wig<hqc> {
    private final wzi<Context> a;
    private final wzi<jlr> b;

    private lhh(wzi<Context> wzi, wzi<jlr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lhh a(wzi<Context> wzi, wzi<jlr> wzi2) {
        return new lhh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hqc) wil.a(new hqb((Context) this.a.get(), ViewUris.bO, new hqy((jlr) this.b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
