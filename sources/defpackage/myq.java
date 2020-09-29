package defpackage;

import android.os.Bundle;

/* renamed from: myq reason: default package */
public final class myq implements wig<Boolean> {
    private final wzi<mxn> a;

    private myq(wzi<mxn> wzi) {
        this.a = wzi;
    }

    public static myq a(wzi<mxn> wzi) {
        return new myq(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Bundle) fbp.a(((mxn) this.a.get()).i)).getBoolean("is_autoplay_uri"));
    }
}
