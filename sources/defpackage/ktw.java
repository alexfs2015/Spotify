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

/* renamed from: ktw reason: default package */
final class ktw {
    private final kte a;
    private final ktp b;
    private final CompositeDisposable c = new CompositeDisposable();
    private final jrp d;
    private final ktg e;
    private final kua f;
    private boolean g;
    private boolean h;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Integer num) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    ktw(kte kte, ktp ktp, jrp jrp, ktg ktg, kua kua) {
        this.a = kte;
        this.b = ktp;
        this.d = jrp;
        this.e = ktg;
        this.f = kua;
    }

    public final void a() {
        this.g = true;
        this.c.a(this.e.a().a(0, Boolean.FALSE).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ktw$2rTRWWnpMccJXhtsWSCMqQeq1c<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$ktw$Z_D_D3D2VjyoMRehBEkKqe6RoFQ<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ktw$oWPIpnsagN9IKfSWOkUnCxUrsPg<Object>(this)));
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
    public /* synthetic */ void d(Throwable th) {
        this.g = false;
        Logger.d(th, "Error while updating built-in cache", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void a(List<ktj> list) {
        for (ktj ktj : list) {
            if (!this.h) {
                if (ktj.g() <= this.d.a() - 2592000000L) {
                    a(ktj);
                } else {
                    AuthorizationRequest a2 = AuthorizationRequest.a(ktj.a(), ResponseType.TOKEN, ktj.b(), new ClientIdentity(ktj.e(), ktj.f()), null, (String[]) ktj.h().toArray(new String[0]), false);
                    this.f.a(a2, false, false);
                    this.c.a(this.a.a(a2, false).a((Action) new $$Lambda$ktw$U2KiFPGSuLy6dytJqk07rXx2xJg(this, ktj), (Consumer<? super Throwable>) new $$Lambda$ktw$UC8ZvBjztITx5QLMLr4Kvuvniac<Object>(this, ktj)));
                }
            } else {
                return;
            }
        }
        this.g = false;
    }

    private void a(ktj ktj) {
        this.c.a(this.b.c(ktj).a((Action) $$Lambda$ktw$2vzNRHKukrZazN55xxnF7XiOUdE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ktw$UL97IXwomeZBlLWDPEI9dhxuOrw.INSTANCE));
    }

    public final void b() {
        this.h = true;
        this.c.c();
    }

    public final void c() {
        this.c.a(this.b.b().a((Consumer<? super T>) $$Lambda$ktw$CrO0aIx19tk_c1XSQ3hF5ioeTY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ktw$ZYOR0eRSf_wvUNPTKmgWHYE5Nk.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ktj ktj, Throwable th) {
        this.f.a(ktj.e(), th.getMessage());
        if (!this.h) {
            if (th instanceof BuiltInAuthException) {
                a(ktj);
            } else {
                Logger.d(th, "Error while updating built-in cache", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ktj ktj) {
        this.f.a(ktj.e());
        if (!this.h) {
            this.c.a(this.b.b(ktj.a(ktj.a(), ktj.b(), ktj.c(), this.d.a(), ktj.e(), ktj.f(), ktj.g())).a((Action) $$Lambda$ktw$NT8IrdT1lTjqjiFH4jMUk6pwMzE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ktw$FhzdS18R5L6zJxKiv4TdpyEcwXs.INSTANCE));
        }
    }
}
