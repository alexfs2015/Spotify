package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleTransformer;

/* renamed from: nij reason: default package */
public final class nij {
    private final boolean a;
    private final ndr b;
    private final nid c;
    private final nie d;

    public nij(boolean z, ndr ndr, nid nid, nie nie) {
        this.a = z;
        this.b = ndr;
        this.c = nid;
        this.d = nie;
    }

    public final Single<gzz> a() {
        ndr ndr = this.b;
        return ndr.a.a(ndr.b(), ndr.c()).a((SingleTransformer<? super T, ? extends R>) this.c).a(this.a ? this.d : $$Lambda$zVwfHrwr9OrFPEL9ngZ3BOpjo.INSTANCE);
    }
}
