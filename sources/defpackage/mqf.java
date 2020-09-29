package defpackage;

import io.reactivex.Observable;

/* renamed from: mqf reason: default package */
public final class mqf implements wig<mqe> {
    private final wzi<rzo> a;
    private final wzi<Observable<mqa>> b;

    public static mqe a(rzo rzo, Observable<mqa> observable) {
        return new mqe(rzo, observable);
    }

    public final /* synthetic */ Object get() {
        return new mqe((rzo) this.a.get(), (Observable) this.b.get());
    }
}
