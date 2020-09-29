package defpackage;

import android.app.Activity;

/* renamed from: nfp reason: default package */
public final class nfp implements wig<nfo> {
    private final wzi<Activity> a;

    private nfp(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static nfp a(wzi<Activity> wzi) {
        return new nfp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nfo((Activity) this.a.get());
    }
}
