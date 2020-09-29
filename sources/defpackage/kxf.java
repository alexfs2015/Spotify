package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;

/* renamed from: kxf reason: default package */
final class kxf {
    private final kwn a;
    private final kwy b;
    private final CompositeDisposable c = new CompositeDisposable();
    private final jtz d;
    private final kwp e;
    private final kxj f;
    private boolean g;
    private boolean h;

    kxf(kwn kwn, kwy kwy, jtz jtz, kwp kwp, kxj kxj) {
        this.a = kwn;
        this.b = kwy;
        this.d = jtz;
        this.e = kwp;
        this.f = kxj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.a();
        }
        this.g = false;
        return Single.b(Collections.EMPTY_LIST);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Integer num) {
    }

    /* access modifiers changed from: private */
    public void a(List<kws> list) {
        for (kws kws : list) {
            if (!this.h) {
                if (kws.g() <= this.d.a() - 2592000000L) {
                    a(kws);
                } else {
                    AuthorizationRequest a2 = AuthorizationRequest.a(kws.a(), ResponseType.TOKEN, kws.b(), new ClientIdentity(kws.e(), kws.f()), null, (String[]) kws.h().toArray(new String[0]), false);
                    this.f.a(a2, false, false);
                    this.c.a(this.a.a(a2, false).a((Action) new $$Lambda$kxf$ayu9J0RhcwAK0VPlkZ4K9M3gus(this, kws), (Consumer<? super Throwable>) new $$Lambda$kxf$eUWboz4XMGzi5X1DsN4dssDMw<Object>(this, kws)));
                }
            } else {
                return;
            }
        }
        this.g = false;
    }

    private void a(kws kws) {
        this.c.a(this.b.c(kws).a((Action) $$Lambda$kxf$OdLOjDaBGFrXRyGsfHFY9ia2UY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$kxf$GU9ubHtKx3hRohHBY5L6wjV88Wo.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kws kws, Throwable th) {
        this.f.a(kws.e(), th.getMessage());
        if (!this.h) {
            if (th instanceof BuiltInAuthException) {
                a(kws);
            } else {
                Logger.d(th, "Error while updating built-in cache", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kws kws) {
        this.f.a(kws.e());
        if (!this.h) {
            this.c.a(this.b.b(kws.a(kws.a(), kws.b(), kws.c(), this.d.a(), kws.e(), kws.f(), kws.g())).a((Action) $$Lambda$kxf$SrPQbBbx7e0EKyohjUpc4ljpF8.INSTANCE, (Consumer<? super Throwable>) $$Lambda$kxf$rXON4knogqA9RdUN27draX7tZrY.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        this.g = false;
        Logger.d(th, "Error while updating built-in cache", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final void a() {
        this.g = true;
        this.c.a(this.e.a().a(0, Boolean.FALSE).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$kxf$QoIiSnq8E_fTApvalXEIP42f8gQ<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$kxf$FqfgjCd3jyegs2JjPe06LGFvx0<Object>(this), (Consumer<? super Throwable>) new $$Lambda$kxf$VqnRTBIaKpwzC9We_j9VC9wMpQg<Object>(this)));
    }

    public final void b() {
        this.h = true;
        this.c.c();
    }

    public final void c() {
        this.c.a(this.b.b().a((Consumer<? super T>) $$Lambda$kxf$N7vjUgMkSIvBL48a82LkJDcoElU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$kxf$ytxG9swdB3XAXLzdb_I71sD9k0o.INSTANCE));
    }
}
