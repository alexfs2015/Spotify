package defpackage;

import io.reactivex.functions.Consumer;

/* renamed from: mro reason: default package */
public final class mro implements Consumer<c> {
    private final spi a;

    public final /* synthetic */ void accept(Object obj) {
        this.a.a(((c) obj).a);
    }

    public mro(spi spi) {
        this.a = spi;
    }
}
