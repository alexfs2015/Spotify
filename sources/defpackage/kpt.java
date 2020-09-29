package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import io.reactivex.Flowable;

/* renamed from: kpt reason: default package */
public final class kpt implements vua<kps> {
    private final wlc<Flowable<ShortcutInfo>> a;
    private final wlc<ShortcutManager> b;
    private final wlc<Integer> c;

    private kpt(wlc<Flowable<ShortcutInfo>> wlc, wlc<ShortcutManager> wlc2, wlc<Integer> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kpt a(wlc<Flowable<ShortcutInfo>> wlc, wlc<ShortcutManager> wlc2, wlc<Integer> wlc3) {
        return new kpt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kps((Flowable) this.a.get(), (ShortcutManager) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
