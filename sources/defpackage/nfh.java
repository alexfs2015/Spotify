package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;

/* renamed from: nfh reason: default package */
public final class nfh implements vua<GlueHeaderLayout> {
    private final wlc<Context> a;

    private nfh(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nfh a(wlc<Context> wlc) {
        return new nfh(wlc);
    }

    public final /* synthetic */ Object get() {
        return (GlueHeaderLayout) vuf.a(new GlueHeaderLayout((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
