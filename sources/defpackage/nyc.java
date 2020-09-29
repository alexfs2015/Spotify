package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nyc reason: default package */
public final class nyc implements defpackage.nxz.a, wau {
    final nxz a;
    final goy b;
    final gbp c;
    final waq d;
    final CompositeDisposable e = new CompositeDisposable();
    final hxx f;
    Disposable g = Disposables.b();
    final Set<gbl> h = new HashSet();
    Observable<CharSequence> i;
    Observable<CharSequence> j;
    private final Scheduler k;
    private final Scheduler l;
    private final got m;
    private final gpn n;
    private int o;
    private Credential p;
    private final qoo q;

    /* renamed from: nyc$a */
    interface a {
        void complete(boolean z);
    }

    public nyc(nxz nxz, goy goy, gbp gbp, Scheduler scheduler, Scheduler scheduler2, waq waq, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, got got, gpn gpn, hxx hxx, qoo qoo) {
        this.a = nxz;
        this.b = goy;
        this.c = gbp;
        this.k = scheduler;
        this.l = scheduler2;
        this.d = waq;
        this.m = got;
        this.n = gpn;
        this.f = hxx;
        this.q = qoo;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(SessionState sessionState) {
                boolean z = false;
                if (sessionState.loggedIn()) {
                    nyc nyc = nyc.this;
                    String e = nyc.a.e();
                    String ae = nyc.a.ae();
                    nyc.c.a(gbr.b(new e()));
                    if (!fbo.a(e) && !fbo.a(ae)) {
                        z = true;
                    }
                    if (z) {
                        nyc.d.a = new e();
                        nyc.d.a(e, ae, "", (wau) nyc);
                    } else {
                        nyc.b.d();
                    }
                } else if (sessionState.loggingIn()) {
                    nyc.this.a.d((int) R.string.login_spotify_button_logging_in);
                    nyc.this.a.a(false);
                    nyc.this.a.ai();
                }
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(Throwable th) {
            }

            public final void a() {
                super.a();
                nyc.this.g.bd_();
                nyc.this.e.c();
                nyc.this.h.clear();
            }

            public final void c() {
                super.c();
                CompositeDisposable compositeDisposable = nyc.this.e;
                nyc nyc = nyc.this;
                compositeDisposable.a(nyc.i.b(1).a(nyc.k).d((Consumer<? super T>) new $$Lambda$nyc$lkG66z_DxoW9EnUYeSNDRLGxEPk<Object>(nyc, new f())));
                CompositeDisposable compositeDisposable2 = nyc.this.e;
                nyc nyc2 = nyc.this;
                compositeDisposable2.a(nyc2.j.b(1).a(nyc2.k).d((Consumer<? super T>) new $$Lambda$nyc$lkG66z_DxoW9EnUYeSNDRLGxEPk<Object>(nyc2, new e())));
                CompositeDisposable compositeDisposable3 = nyc.this.e;
                nyc nyc3 = nyc.this;
                compositeDisposable3.a(nyc.a(nyc3, (Observable) nyc3.i, (Observable) nyc.this.j));
                nyc.this.e.a(nyc.this.f.a.a((Consumer<? super T>) new $$Lambda$nyc$1$ReymSoNfs4GjXB8D5s3dBKidxrc<Object>(this), (Consumer<? super Throwable>) $$Lambda$nyc$1$SHpv6rw9rdw0elCuKoTgUp5S3X8.INSTANCE));
            }
        });
    }

    static /* synthetic */ Disposable a(nyc nyc, Observable observable, Observable observable2) {
        Observable a2 = Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) observable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$nyc$k5lHBVv3PqVenaqB3Z4UxjO9L60.INSTANCE).a(nyc.l);
        nxz nxz = nyc.a;
        nxz.getClass();
        return a2.a((Consumer<? super T>) new $$Lambda$oAlzmhS6t8v9as01JElhU2tA09U<Object>(nxz), (Consumer<? super Throwable>) new $$Lambda$nyc$TxB9HdlkXU9E9q2PkFqFrSkiRg<Object>(nyc));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return Boolean.valueOf(!charSequence.toString().trim().isEmpty() && charSequence2.length() > 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            this.c.a(gbr.a(new e(), new d(), new d()));
            this.b.b(this.a.e());
            return;
        }
        if (i2 == -2) {
            this.c.a(gbr.a(new e(), new o(), new d()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SpotifyError spotifyError, boolean z) {
        this.a.d((int) R.string.login_spotify_button_login);
        this.a.a(true);
        switch (spotifyError) {
            case LOGIN_BAD_CREDENTIALS:
            case LOGIN_USERPASS:
                this.a.e((int) R.string.login_error_message_incorrect_credentials);
                this.c.a(gbr.a((gbo) new e(), (gbk) new j(), (gbl) new d(), String.valueOf(spotifyError.mCode)));
                if (this.p != null) {
                    this.d.a = new e();
                    this.d.a(this.p);
                    this.p = null;
                }
                return;
            case AP_SOCKET:
            case AP_PROTOCOL:
            case DNS:
                qoo qoo = this.q;
                e eVar = new e();
                qoo.a(R.string.error_dialog_no_network_title, qoo.a.getString(R.string.error_dialog_no_network_body), 17039370, 0, null);
                qoo.b.a(gbr.a((gbo) eVar, (gbj) new c()));
                this.c.a(gbr.a((gbo) new e(), (gbk) new k(), (gbl) new d(), String.valueOf(spotifyError.mCode)));
                return;
            case LOGIN_REGION_MISMATCH:
                this.a.ah();
                this.c.a(gbr.a((gbo) new e(), (gbk) new l(), (gbl) new d(), String.valueOf(spotifyError.mCode)));
                return;
            case AP_NETWORK_DISABLED:
                this.a.e(spotifyError.mResourceId);
                this.a.ag();
                return;
            case LOGIN_UNKNOWN_ERROR:
                this.a.af();
                this.c.a(gbr.a((gbo) new e(), (gbk) new g(), (gbl) new d(), String.valueOf(spotifyError.mCode)));
                return;
            default:
                this.a.e(spotifyError.mResourceId);
                this.c.a(gbr.a((gbo) new e(), (gbk) new g(), (gbl) new d(), String.valueOf(spotifyError.mCode)));
                return;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gbl gbl, CharSequence charSequence) {
        if (charSequence.length() > 0 && !this.h.contains(gbl)) {
            this.h.add(gbl);
            this.c.a(gbr.a((gbo) new e(), gbl));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to observe the input fields.", new Object[0]);
        this.a.a(false);
    }

    static /* synthetic */ void a(nyc nyc) {
        nxz nxz = nyc.a;
        String e2 = nxz.e();
        new $$Lambda$nyc$oCH9htja2Jq548YLyz_Zm5FCNEI(nyc);
        nxz.e(e2);
    }

    private void b(final String str, String str2) {
        this.a.d((int) R.string.login_spotify_button_logging_in);
        this.a.a(false);
        this.a.ai();
        this.m.b(str, str2, false).a(this.l).b((SingleObserver<? super T>) new SingleObserver<gou>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(b bVar) {
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(String str, defpackage.gou.a aVar) {
                nyc.this.a(SpotifyError.a(aVar.a), str);
            }

            public final /* synthetic */ void c_(Object obj) {
                ((gou) obj).a((ged<b>) $$Lambda$nyc$3$UujV7H3TYgDCPDz7BpZ9XQkyYuk.INSTANCE, (ged<defpackage.gou.a>) new $$Lambda$nyc$3$TG1KY71ztDDiIUdZiz59KKsP9Dw<defpackage.gou.a>(this, str));
            }

            public final void onError(Throwable th) {
                nyc.this.a(SpotifyError.a(SpotifyError.UNKNOWN.mCode), str);
            }

            public final void onSubscribe(Disposable disposable) {
                nyc.this.g.bd_();
                nyc.this.g = disposable;
            }
        });
    }

    public final void a(Credential credential) {
        this.p = credential;
        String str = this.p.a;
        String b2 = fbo.b(this.p.b);
        this.a.c(str.trim());
        this.a.d(b2);
        b(str, b2);
    }

    public final void a(SpotifyError spotifyError, String str) {
        final $$Lambda$nyc$8YsVx0iPrj1W4pGgx_USfEacYg r0 = new $$Lambda$nyc$8YsVx0iPrj1W4pGgx_USfEacYg(this, spotifyError);
        this.o++;
        if (this.o < 2) {
            r0.complete(false);
            return;
        }
        this.o = 0;
        if (str == null) {
            r0.complete(false);
        } else {
            this.n.a(str, new defpackage.gpn.a() {
                public final void a() {
                    nyc.a(nyc.this);
                    r0.complete(true);
                }

                public final void a(int i) {
                    r0.complete(false);
                }

                public final void b() {
                    r0.complete(false);
                }

                public final void c() {
                    r0.complete(false);
                }

                public final void d() {
                    r0.complete(false);
                }
            });
        }
    }

    public final void a(Observable<CharSequence> observable, Observable<CharSequence> observable2) {
        this.i = observable;
        this.j = observable2;
        this.a.a(false);
        this.d.a = new e();
        this.d.a((wau) this, true, "");
    }

    public final void a(String str) {
        this.c.a(gbr.a(new e(), new j(), new j()));
        this.b.b(str);
    }

    public final void a(String str, String str2) {
        this.c.a(gbr.a(new e(), new f(), new j()));
        b(str, str2);
    }

    public final void ar_() {
        this.b.d();
    }

    public final void d() {
    }
}
