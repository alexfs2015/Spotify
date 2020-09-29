package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;

/* renamed from: gfq reason: default package */
final class gfq implements gfj {
    private static int c = 5120;
    private final gfh a;
    private final gfu b;
    private final PublishSubject<gfx> d = PublishSubject.a();

    gfq(gfh gfh, gfu gfu) {
        this.a = gfh;
        this.b = gfu;
        this.d.a(Schedulers.d()).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$gfq$eBReZsP2ghbROySIT3IE52ixag<Object,Object>(this), 2).b(Schedulers.d()).a((Action) $$Lambda$gfq$9RMXlX7YekXWaGVE3cKDKoXIzlk.INSTANCE, (Consumer<? super Throwable>) new $$Lambda$gfq$IoUjmQf6BHhOzt2meBJWpTG0Xg<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(gfx gfx) {
        return Completable.a((Action) new $$Lambda$gfq$0fV89W9u7M8IgkpvmH5frUAPk4o(this, gfx)).a(Functions.c());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.a(th, "Error persisting event.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gfx gfx) {
        try {
            if (gfx.b().length <= c) {
                gfh gfh = this.a;
                gfh.d.a(gfx.a(), gfx.b(), gfh.b, gfh.a, gfh.c, gfh.e, gfx.c());
                return;
            }
            throw new IllegalStateException(String.format("Size of event %s exceeds maximum allowed payload size of %d bytes", new Object[]{gfx.a(), Integer.valueOf(c)}));
        } catch (Exception e) {
            this.b.a((Throwable) e, "Error persisting event.");
        }
    }

    public final void a(String str, byte[] bArr) {
        this.d.onNext(gfx.a(str, bArr, true));
    }

    public final void b(String str, byte[] bArr) {
        this.d.onNext(gfx.a(str, bArr, false));
    }
}
