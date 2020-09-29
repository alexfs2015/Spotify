package defpackage;

import android.os.Bundle;

/* renamed from: mwx reason: default package */
public final class mwx implements vua<String> {
    private final wlc<mwg> a;

    private mwx(wlc<mwg> wlc) {
        this.a = wlc;
    }

    public static mwx a(wlc<mwg> wlc) {
        return new mwx(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) fay.a(((mwg) this.a.get()).i)).getString("artist_view_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
