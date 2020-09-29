package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: sdg reason: default package */
public final class sdg {
    private final sfn a;
    private final sdx b;
    private final Scheduler c;
    private final sdi d;
    private final boolean e;
    private final int f;

    public sdg(sfn sfn, sdx sdx, Scheduler scheduler, boolean z, sdi sdi, int i) {
        this.a = sfn;
        this.b = sdx;
        this.c = scheduler;
        this.e = z;
        this.d = sdi;
        this.f = i;
    }

    public final Single<sgg<gzz>> a(sgh sgh) {
        if (sgh.c()) {
            return Single.b(sgg.c());
        }
        if (!((sgh.a.e.b() instanceof g) || (sgh.a.e.b() instanceof a)) || !this.e) {
            return this.a.a(sgh);
        }
        return this.b.a(sgh).a((long) this.f, TimeUnit.MILLISECONDS, this.c).h(new $$Lambda$sdg$KeegPyJBuCZ6DvbTq98nA6L5qbY(this, sgh));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(sgh sgh, Throwable th) {
        return Single.b(new QueryAutocompleteResult("", Collections.singletonList(sgh.a.a.b()))).f(new $$Lambda$sdg$q7bAVUlYTQhzQdyuD35Neta1DE(sgh)).f(this.d).f(new $$Lambda$sdg$7xPJ3mjjqA0mHSCCGLlqIpIR_k(sgh));
    }
}
