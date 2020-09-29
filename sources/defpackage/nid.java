package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Consumer;
import java.io.IOException;

/* renamed from: nid reason: default package */
public final class nid implements SingleTransformer<wsj<wmg>, gzz> {
    private final ndk a;
    private final nif b;

    public nid(ndk ndk, nif nif) {
        this.a = ndk;
        this.b = nif;
    }

    public final SingleSource<gzz> a(Single<wsj<wmg>> single) {
        return single.b((Consumer<? super T>) new $$Lambda$nid$AFz5RmNR7kGlUZJNeggjJ3A9ZBo<Object>(this)).a((SingleTransformer<? super T, ? extends R>) this.b).a(single.a((SingleTransformer<? super T, ? extends R>) this.b));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wsj wsj) {
        wmg wmg = (wmg) wsj.b();
        if (wmg != null) {
            try {
                wom c = wmg.c();
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
}
