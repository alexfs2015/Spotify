package defpackage;

import android.os.Bundle;

/* renamed from: mta reason: default package */
public final class mta implements vua<String> {
    private final wlc<msm> a;

    private mta(wlc<msm> wlc) {
        this.a = wlc;
    }

    public static mta a(wlc<msm> wlc) {
        return new mta(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) fay.a(((msm) this.a.get()).i)).getString("album_view_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
