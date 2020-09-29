package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.voice.model.VoiceViewResponse;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.TimeUnit;

/* renamed from: tgj reason: default package */
public final class tgj extends DisposableSubscriber<vri> {
    private final tge a;
    private final int b;
    private final tgg c;
    private final rnf d;
    private final CompositeDisposable e = new CompositeDisposable();
    private tgf f;

    public final /* synthetic */ void b_(Object obj) {
        vri vri = (vri) obj;
        if (vri.b()) {
            Logger.b("VoiceSessionSubscriber - Got NLU response: %s", vri);
            this.f = this.c.a((VoiceViewResponse) this.d.b().convertValue(((e) vri).a, VoiceViewResponse.class), this.b);
            return;
        }
        if (vri instanceof d) {
            CompositeDisposable compositeDisposable = this.e;
            Flowable d2 = ((d) vri).a.a(Functions.a()).d(50, TimeUnit.MILLISECONDS);
            tge tge = this.a;
            tge.getClass();
            compositeDisposable.a(d2.c((Consumer<? super T>) new $$Lambda$faPljSjre0wEIFGZkpLk2VqmBU<Object>(tge)));
        }
    }

    public tgj(tge tge, int i, tgg tgg, rnf rnf) {
        this.a = tge;
        this.b = i;
        this.c = tgg;
        this.d = rnf;
    }

    public final void onError(Throwable th) {
        Logger.b("VoiceSessionSubscriber - Got voice error: %s (%s)", th, th.getMessage());
        this.e.c();
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            io.reactivex.disposables.CompositeDisposable r0 = r3.e
            r0.c()
            tgf r0 = r3.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0024
            tgf r0 = r3.f
            boolean r0 = r0.d
            if (r0 == 0) goto L_0x0024
            tgf r0 = r3.f
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            tgf r1 = r3.f
            r0[r2] = r1
            java.lang.String r1 = "VoiceSessionSubscriber - Voice session success, results: %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            tge r0 = r3.a
            tgf r1 = r3.f
            r0.a(r1)
            return
        L_0x003a:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            tgf r1 = r3.f
            r0[r2] = r1
            java.lang.String r1 = "VoiceSessionSubscriber - Voice session failure, results: %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgj.c():void");
    }

    private void d() {
        this.a.b();
    }
}
