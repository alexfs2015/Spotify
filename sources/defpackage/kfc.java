package defpackage;

import io.reactivex.Observable;

/* renamed from: kfc reason: default package */
public final class kfc implements vua<Observable<kfg>> {
    private final wlc<kfk> a;

    public static Observable<kfg> a(kfk kfk) {
        return (Observable) vuf.a(CC.a(kfk), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((kfk) this.a.get());
    }
}
