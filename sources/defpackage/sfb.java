package defpackage;

import io.reactivex.functions.Function;

/* renamed from: sfb reason: default package */
public final class sfb implements Function<sgg<gzz>, gzz> {
    private final rzh a;

    public final /* synthetic */ Object apply(Object obj) {
        sgg sgg = (sgg) obj;
        if (sgg.a()) {
            return (gzz) sgg.b;
        }
        return this.a.b(sgg.a);
    }

    sfb(rzh rzh) {
        this.a = (rzh) fay.a(rzh);
    }
}
