package defpackage;

import io.reactivex.Completable;

/* renamed from: oqt reason: default package */
public final class oqt implements wig<Completable> {
    private final wzi<oma> a;

    private oqt(wzi<oma> wzi) {
        this.a = wzi;
    }

    public static oqt a(wzi<oma> wzi) {
        return new oqt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Completable) wil.a(((oma) this.a.get()).b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
