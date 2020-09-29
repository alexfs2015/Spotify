package defpackage;

import android.content.Context;

/* renamed from: txk reason: default package */
public final class txk implements vua<a> {
    private final wlc<Context> a;

    private txk(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static txk a(wlc<Context> wlc) {
        return new txk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(new bbt((Context) this.a.get(), "previewplayer"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
