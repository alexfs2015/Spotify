package defpackage;

import android.content.pm.ShortcutInfo;
import io.reactivex.Flowable;

/* renamed from: kpy reason: default package */
public final class kpy implements vua<Flowable<ShortcutInfo>> {
    private final wlc<Flowable<kqc>> a;
    private final wlc<kqa> b;

    private kpy(wlc<Flowable<kqc>> wlc, wlc<kqa> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kpy a(wlc<Flowable<kqc>> wlc, wlc<kqa> wlc2) {
        return new kpy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Flowable) this.a.get(), (kqa) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
