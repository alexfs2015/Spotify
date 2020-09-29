package defpackage;

import android.os.Bundle;

/* renamed from: myd reason: default package */
public final class myd implements wig<String> {
    private final wzi<mxn> a;

    private myd(wzi<mxn> wzi) {
        this.a = wzi;
    }

    public static myd a(wzi<mxn> wzi) {
        return new myd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Bundle) fbp.a(((mxn) this.a.get()).i)).getString("autoplay_track_uri", ""), "Cannot return null from a non-@Nullable @Provides method");
    }
}
