package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.Function;

/* renamed from: qnr reason: default package */
public final class qnr implements Function<Optional<gzz>, Optional<gzz>> {
    private final qnt a;

    public final /* synthetic */ Object apply(Object obj) {
        Optional optional = (Optional) obj;
        gzz gzz = this.a.a;
        if (gzz == null) {
            return optional;
        }
        return Optional.c(qnv.a(optional.b() ? (gzz) optional.c() : null, gzz));
    }

    public qnr(qnt qnt) {
        this.a = (qnt) fay.a(qnt);
    }
}
