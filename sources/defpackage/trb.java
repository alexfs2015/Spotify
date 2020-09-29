package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.VoiceViewResponse;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.TimeUnit;

/* renamed from: trb reason: default package */
public final class trb extends DisposableSubscriber<weq> {
    private final tqw a;
    private final int b;
    private final tqy c;
    private final rwl d;
    private final CompositeDisposable e = new CompositeDisposable();
    private tqx f;

    public trb(tqw tqw, int i, tqy tqy, rwl rwl) {
        this.a = tqw;
        this.b = i;
        this.c = tqy;
        this.d = rwl;
    }

    private void d() {
        this.a.b();
    }

    public final /* synthetic */ void b_(Object obj) {
        weq weq = (weq) obj;
        if (weq.b()) {
            Logger.b("VoiceSessionSubscriber - Got NLU response: %s", weq);
            this.f = this.c.a((VoiceViewResponse) this.d.b().convertValue(((e) weq).a, VoiceViewResponse.class), this.b);
            return;
        }
        if (weq instanceof d) {
            CompositeDisposable compositeDisposable = this.e;
            Flowable d2 = ((d) weq).a.a(Functions.a()).d(50, TimeUnit.MILLISECONDS);
            tqw tqw = this.a;
            tqw.getClass();
            compositeDisposable.a(d2.c((Consumer<? super T>) new $$Lambda$MJ49J8gd3i3aCjSBsYKO0Och4<Object>(tqw)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            io.reactivex.disposables.CompositeDisposable r0 = r3.e
            r0.c()
            tqx r0 = r3.f
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
            tqx r0 = r3.f
            boolean r0 = r0.d
            if (r0 == 0) goto L_0x0024
            tqx r0 = r3.f
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            tqx r1 = r3.f
            r0[r2] = r1
            java.lang.String r1 = "VoiceSessionSubscriber - Voice session success, results: %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            tqw r0 = r3.a
            tqx r1 = r3.f
            r0.a(r1)
            return
        L_0x003a:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            tqx r1 = r3.f
            r0[r2] = r1
            java.lang.String r1 = "VoiceSessionSubscriber - Voice session failure, results: %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trb.c():void");
    }

    public final void onError(Throwable th) {
        Logger.b("VoiceSessionSubscriber - Got voice error: %s (%s)", th, th.getMessage());
        this.e.c();
        if (th instanceof VoiceSessionException) {
            VoiceSessionException voiceSessionException = (VoiceSessionException) th;
            if (ErrorDomain.OFFLINE == voiceSessionException.mDomain || ErrorDomain.CONNECTION == voiceSessionException.mDomain) {
                this.a.c();
                return;
            }
        }
        d();
    }
}
