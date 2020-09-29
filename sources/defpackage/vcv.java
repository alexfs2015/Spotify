package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: vcv reason: default package */
public final class vcv implements wig<vcu> {
    private final wzi<Flowable<String>> a;
    private final wzi<a> b;

    private vcv(wzi<Flowable<String>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vcv a(wzi<Flowable<String>> wzi, wzi<a> wzi2) {
        return new vcv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vcu((Flowable) this.a.get(), (a) this.b.get());
    }
}
