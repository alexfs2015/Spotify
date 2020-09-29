package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;

/* renamed from: gef reason: default package */
final class gef implements gdy {
    private static int c = 5120;
    private final gdw a;
    private final gej b;
    private final PublishSubject<gem> d = PublishSubject.a();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    gef(gdw gdw, gej gej) {
        this.a = gdw;
        this.b = gej;
        this.d.a(Schedulers.d()).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$gef$NYMibbJYmEv5vQJjCaW5hk3zbk<Object,Object>(this), 2).b(Schedulers.d()).a((Action) $$Lambda$gef$UUvit17XPPVJamRoXn6E1csBwXk.INSTANCE, (Consumer<? super Throwable>) new $$Lambda$gef$EwOHh1lhimSIYOtsemHOYsfagZg<Object>(this));
    }

    public final void a(String str, byte[] bArr) {
        this.d.onNext(gem.a(str, bArr, true));
    }

    public final void b(String str, byte[] bArr) {
        this.d.onNext(gem.a(str, bArr, false));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(gem gem) {
        return Completable.a((Action) new $$Lambda$gef$awSTRdSD1SEwYHcZQgKrl2b_KQU(this, gem)).a(Functions.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.a(th, "Error persisting event.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gem gem) {
        try {
            if (gem.b().length <= c) {
                gdw gdw = this.a;
                gdw.d.a(gem.a(), gem.b(), gdw.b, gdw.a, gdw.c, gdw.e, gem.c());
                return;
            }
            throw new IllegalStateException(String.format("Size of event %s exceeds maximum allowed payload size of %d bytes", new Object[]{gem.a(), Integer.valueOf(c)}));
        } catch (Exception e) {
            this.b.a((Throwable) e, "Error persisting event.");
        }
    }
}
