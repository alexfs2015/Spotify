package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;

/* renamed from: nkw reason: default package */
public final class nkw implements wig<GlueHeaderLayout> {
    private final wzi<Context> a;

    private nkw(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nkw a(wzi<Context> wzi) {
        return new nkw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (GlueHeaderLayout) wil.a(new GlueHeaderLayout((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
