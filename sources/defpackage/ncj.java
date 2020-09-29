package defpackage;

import android.os.Bundle;

/* renamed from: ncj reason: default package */
public final class ncj implements wig<Boolean> {
    private final wzi<nbh> a;

    private ncj(wzi<nbh> wzi) {
        this.a = wzi;
    }

    public static ncj a(wzi<nbh> wzi) {
        return new ncj(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Bundle) fbp.a(((nbh) this.a.get()).i)).getBoolean("is_autoplay_uri"));
    }
}
