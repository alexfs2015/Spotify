package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.Function;

/* renamed from: qwa reason: default package */
public final class qwa implements Function<Optional<hcs>, Optional<hcs>> {
    private final qwc a;

    public qwa(qwc qwc) {
        this.a = (qwc) fbp.a(qwc);
    }

    public final /* synthetic */ Object apply(Object obj) {
        Optional optional = (Optional) obj;
        hcs hcs = this.a.a;
        if (hcs == null) {
            return optional;
        }
        return Optional.c(qwe.a(optional.b() ? (hcs) optional.c() : null, hcs));
    }
}
