package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ird reason: default package */
public final class ird implements wig<irc> {
    private final wzi<RxResolver> a;

    private ird(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static ird a(wzi<RxResolver> wzi) {
        return new ird(wzi);
    }

    public final /* synthetic */ Object get() {
        return new irc(this.a);
    }
}
