package defpackage;

import io.reactivex.functions.Consumer;

/* renamed from: scj reason: default package */
public final class scj implements Consumer<e> {
    private final spi a;

    public scj(spi spi) {
        this.a = spi;
    }

    /* renamed from: a */
    public final void accept(e eVar) {
        this.a.a(eVar.a);
    }
}
