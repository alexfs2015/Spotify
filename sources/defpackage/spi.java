package defpackage;

import io.reactivex.functions.Function;

/* renamed from: spi reason: default package */
public final class spi implements Function<sqn<hcs>, hcs> {
    private final siv a;

    spi(siv siv) {
        this.a = (siv) fbp.a(siv);
    }

    public final /* synthetic */ Object apply(Object obj) {
        sqn sqn = (sqn) obj;
        return sqn.a() ? (hcs) sqn.b : this.a.b(sqn.a);
    }
}
