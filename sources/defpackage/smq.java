package defpackage;

import io.reactivex.functions.Consumer;

/* renamed from: smq reason: default package */
public final class smq implements Consumer<e> {
    private final szp a;

    public smq(szp szp) {
        this.a = szp;
    }

    /* renamed from: a */
    public final void accept(e eVar) {
        this.a.a(eVar.a);
    }
}
