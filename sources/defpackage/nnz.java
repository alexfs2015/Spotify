package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Consumer;
import java.io.IOException;

/* renamed from: nnz reason: default package */
public final class nnz implements SingleTransformer<xgo<xam>, hcs> {
    private final niz a;
    private final nob b;

    public nnz(niz niz, nob nob) {
        this.a = niz;
        this.b = nob;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xgo xgo) {
        xam xam = (xam) xgo.b();
        if (xam != null) {
            try {
                xcs c = xam.c();
                c.b(2147483647L);
                byte[] i = c.b().t().i();
                if (i.length > 0) {
                    this.a.a(i);
                }
            } catch (IOException e) {
                Assertion.a("Failed to get response bytes", (Throwable) e);
            }
        }
    }

    public final SingleSource<hcs> apply(Single<xgo<xam>> single) {
        return single.b((Consumer<? super T>) new $$Lambda$nnz$0QuZyOGeb1n2AGAwOsAGRYChIA0<Object>(this)).a((SingleTransformer<? super T, ? extends R>) this.b).a(single.a((SingleTransformer<? super T, ? extends R>) this.b));
    }
}
