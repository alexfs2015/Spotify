package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.EnumSet;

/* renamed from: nrz reason: default package */
public final class nrz implements defpackage.nrw.a, vno {
    final nrw a;
    final gnj b;
    final ujc c;
    final vnk d;
    final CompositeDisposable e = new CompositeDisposable();
    final hvl f;
    Disposable g = Disposables.b();
    EnumSet<InputFieldIdentifier> h;
    Observable<CharSequence> i;
    Observable<CharSequence> j;
    private final Scheduler k;
    private final Scheduler l;
    private final gne m;
    private final gny n;
    private int o;
    private Credential p;

    /* renamed from: nrz$a */
    interface a {
        void complete(boolean z);
    }

    public final void d() {
    }

    public nrz(nrw nrw, gnj gnj, ujc ujc, Scheduler scheduler, Scheduler scheduler2, vnk vnk, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, gne gne, gny gny, hvl hvl) {
        this.a = nrw;
        this.b = gnj;
        this.c = ujc;
        this.k = scheduler;
        this.l = scheduler2;
        this.d = vnk;
        this.m = gne;
        this.n = gny;
        this.f = hvl;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(Throwable th) {
            }

            public final void c() {
                super.c();
                CompositeDisposable compositeDisposable = nrz.this.e;
                nrz nrz = nrz.this;
                compositeDisposable.a(nrz.i.b(1).a(nrz.k).a((Consumer<? super T>) new $$Lambda$nrz$3AoxnnxorKSNoFAFl2bnko0BUqg<Object>(nrz, InputFieldIdentifier.USERNAME), (Consumer<? super Throwable>) new $$Lambda$nrz$kM2VzfiZ_ZQfqjzwbrQf6bpjwM<Object>(InputFieldIdentifier.USERNAME)));
                CompositeDisposable compositeDisposable2 = nrz.this.e;
                nrz nrz2 = nrz.this;
                compositeDisposable2.a(nrz2.j.b(1).a(nrz2.k).a((Consumer<? super T>) new $$Lambda$nrz$3AoxnnxorKSNoFAFl2bnko0BUqg<Object>(nrz2, InputFieldIdentifier.PASSWORD), (Consumer<? super Throwable>) new $$Lambda$nrz$kM2VzfiZ_ZQfqjzwbrQf6bpjwM<Object>(InputFieldIdentifier.PASSWORD)));
                CompositeDisposable compositeDisposable3 = nrz.this.e;
                nrz nrz3 = nrz.this;
                compositeDisposable3.a(nrz.a(nrz3, (Observable) nrz3.i, (Observable) nrz.this.j));
                nrz.this.e.a(nrz.this.f.a.a((Consumer<? super T>) new $$Lambda$nrz$1$5O6fLwg0jG2zGsatiBPTb5A2vq4<Object>(this), (Consumer<? super Throwable>) $$Lambda$nrz$1$IzWjix6E0BnfxeY54vsYclH9PAo.INSTANCE));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(SessionState sessionState) {
                boolean z = false;
                if (sessionState.loggedIn()) {
                    nrz nrz = nrz.this;
                    String e = nrz.a.e();
                    String ae = nrz.a.ae();
                    nrz.c.b(ScreenIdentifier.LOGIN);
                    if (!fax.a(e) && !fax.a(ae)) {
                        z = true;
                    }
                    if (z) {
                        nrz.d.b = new d();
                        nrz.d.a(e, ae, vnk.a, (vno) nrz);
                    } else {
                        nrz.b.d();
                    }
                } else if (sessionState.loggingIn()) {
                    nrz.this.a.d((int) R.string.login_spotify_button_logging_in);
                    nrz.this.a.a(false);
                    nrz.this.a.aj();
                }
            }

            public final void a() {
                super.a();
                nrz.this.g.bf_();
                nrz.this.e.c();
                nrz.this.h.clear();
            }
        });
    }

    public final void a(Observable<CharSequence> observable, Observable<CharSequence> observable2) {
        this.i = observable;
        this.j = observable2;
        this.h = EnumSet.noneOf(InputFieldIdentifier.class);
        this.a.a(false);
        this.d.b = new d();
        this.d.a((vno) this, true, vnk.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            this.c.a(ScreenIdentifier.LOGIN, ClickIdentifier.GET_HELP_BUTTON, DialogIdentifier.RESET_PASSWORD_GET_HELP);
            this.b.b(this.a.e());
            return;
        }
        if (i2 == -2) {
            this.c.a(ScreenIdentifier.LOGIN, ClickIdentifier.TRY_AGAIN_BUTTON, DialogIdentifier.RESET_PASSWORD_GET_HELP);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputFieldIdentifier inputFieldIdentifier, CharSequence charSequence) {
        if (charSequence.length() > 0 && !this.h.contains(inputFieldIdentifier)) {
            this.h.add(inputFieldIdentifier);
            this.c.a(ScreenIdentifier.LOGIN, inputFieldIdentifier);
        }
    }

    public final void a(String str) {
        this.c.a(ScreenIdentifier.LOGIN, ClickIdentifier.RESET_PASSWORD_MAGICLINK_BUTTON);
        this.b.b(str);
    }

    public final void a(String str, String str2) {
        this.c.a(ScreenIdentifier.LOGIN, ClickIdentifier.LOGIN_BUTTON);
        b(str, str2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return Boolean.valueOf(!charSequence.toString().trim().isEmpty() && charSequence2.length() > 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to observe the input fields.", new Object[0]);
        this.a.a(false);
    }

    public final void a(Credential credential) {
        this.p = credential;
        String str = this.p.a;
        String b2 = fax.b(this.p.b);
        this.a.c(str.trim());
        this.a.d(b2);
        b(str, b2);
    }

    public final void a() {
        this.b.d();
    }

    private void b(final String str, String str2) {
        this.a.d((int) R.string.login_spotify_button_logging_in);
        this.a.a(false);
        this.a.aj();
        this.m.b(str, str2, false).a(this.l).b((SingleObserver<? super T>) new SingleObserver<gnf>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(b bVar) {
            }

            public final /* synthetic */ void c_(Object obj) {
                ((gnf) obj).a((gcs<b>) $$Lambda$nrz$3$tMEVzrkV97ocwokA74WZRtLTco.INSTANCE, (gcs<defpackage.gnf.a>) new $$Lambda$nrz$3$kGrlnvBaU0whxRY6Mni86TTSE<defpackage.gnf.a>(this, str));
            }

            public final void onSubscribe(Disposable disposable) {
                nrz.this.g.bf_();
                nrz.this.g = disposable;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(String str, defpackage.gnf.a aVar) {
                nrz.this.a(SpotifyError.a(aVar.a), str);
            }

            public final void onError(Throwable th) {
                nrz.this.a(SpotifyError.a(SpotifyError.UNKNOWN.mCode), str);
            }
        });
    }

    public final void a(SpotifyError spotifyError, String str) {
        final $$Lambda$nrz$uHgJwsaCkLGdECcbOFrJcWowA4 r0 = new $$Lambda$nrz$uHgJwsaCkLGdECcbOFrJcWowA4(this, spotifyError);
        this.o++;
        if (this.o < 2) {
            r0.complete(false);
            return;
        }
        this.o = 0;
        if (str == null) {
            r0.complete(false);
        } else {
            this.n.a(str, new defpackage.gny.a() {
                public final void b() {
                    r0.complete(false);
                }

                public final void a() {
                    nrz.a(nrz.this);
                    r0.complete(true);
                }

                public final void c() {
                    r0.complete(false);
                }

                public final void d() {
                    r0.complete(false);
                }

                public final void a(int i) {
                    r0.complete(false);
                }
            });
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
                this.c.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.INVALID_USERNAME_OR_PASSWORD, (InputFieldIdentifier) null);
                if (this.p != null) {
                    this.d.b = new d();
                    this.d.a(this.p);
                    this.p = null;
                }
                return;
            case AP_SOCKET:
            case AP_PROTOCOL:
            case DNS:
                this.a.ag();
                this.c.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.NO_CONNECTION, (InputFieldIdentifier) null);
                return;
            case LOGIN_REGION_MISMATCH:
                this.a.ai();
                this.c.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.REGION_MISSMATCH, (InputFieldIdentifier) null);
                return;
            case AP_NETWORK_DISABLED:
                this.a.e(spotifyError.mResourceId);
                this.a.ah();
                return;
            case LOGIN_UNKNOWN_ERROR:
                this.a.af();
                this.c.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.GENERIC, (InputFieldIdentifier) null);
                return;
            default:
                this.a.e(spotifyError.mResourceId);
                this.c.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.GENERIC, (InputFieldIdentifier) null);
                return;
        }
    }

    static /* synthetic */ Disposable a(nrz nrz, Observable observable, Observable observable2) {
        Observable a2 = Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) observable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$nrz$AKcC3QLfRAustwKb1o7b19BK0.INSTANCE).a(nrz.l);
        nrw nrw = nrz.a;
        nrw.getClass();
        return a2.a((Consumer<? super T>) new $$Lambda$jkvfYRVHaeuZqk4f3HP7anXtqfU<Object>(nrw), (Consumer<? super Throwable>) new $$Lambda$nrz$LMlAeUeCCDmQfuufEd7KBPSDX4g<Object>(nrz));
    }

    static /* synthetic */ void a(nrz nrz) {
        nrw nrw = nrz.a;
        String e2 = nrw.e();
        new $$Lambda$nrz$Vjck8eKKio1WaQnuhc0dER0Ne94(nrz);
        nrw.e(e2);
    }
}
