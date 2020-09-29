package defpackage;

import android.content.pm.ShortcutInfo;
import io.reactivex.Flowable;

/* renamed from: kth reason: default package */
public final class kth implements wig<Flowable<ShortcutInfo>> {
    private final wzi<Flowable<ktl>> a;
    private final wzi<ktj> b;

    private kth(wzi<Flowable<ktl>> wzi, wzi<ktj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kth a(wzi<Flowable<ktl>> wzi, wzi<ktj> wzi2) {
        return new kth(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Flowable) this.a.get(), (ktj) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
