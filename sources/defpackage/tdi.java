package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tdi reason: default package */
public final class tdi implements wig<tdh> {
    private final wzi<tkk> a;
    private final wzi<a> b;
    private final wzi<Flowable<String>> c;

    private tdi(wzi<tkk> wzi, wzi<a> wzi2, wzi<Flowable<String>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tdi a(wzi<tkk> wzi, wzi<a> wzi2, wzi<Flowable<String>> wzi3) {
        return new tdi(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tdh(this.a, this.b, this.c);
    }
}
