package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import org.json.JSONObject;

/* renamed from: llw reason: default package */
public final class llw implements a, vno {
    final ujc a;
    final vnk b;
    Disposable c = Disposables.b();
    lmb d;
    private final llr e;
    private final Scheduler f;
    private final gne g;
    private final ufm h;
    private final rqu i;
    private final gnj j;
    private b k;

    public final void a(Credential credential) {
    }

    public final void d() {
    }

    public llw(ufm ufm, llr llr, Scheduler scheduler, gne gne, ujc ujc, a aVar, rqu rqu, vnk vnk, gnj gnj) {
        this.e = llr;
        this.f = scheduler;
        this.g = gne;
        this.a = ujc;
        this.h = ufm;
        this.i = rqu;
        this.b = vnk;
        this.j = gnj;
        aVar.a(new c() {
            public final void a() {
                super.a();
                llw.this.c.bf_();
            }
        });
    }

    public final void a(b bVar) {
        this.k = bVar;
    }

    public final void b() {
        this.c.bf_();
        this.c = this.e.b().a(this.f).a((Consumer<? super T>) new $$Lambda$llw$L38GjeE44X8imW3HDR5M23KHwX4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$llw$KU0Z_k2uJDbnHv7FZxRn9AyGZA<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(llq llq) {
        llq.a(new $$Lambda$llw$5WXbee7qKwE83MJtFJsrJLifOzM(this), new $$Lambda$llw$uluEOhRpHFXDnObJbuM3TayASg(this), new $$Lambda$llw$pGejGS91o3sWSNbyECiaRvwQn6Y(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.k.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Assertion.b("Failed to get facebook me", th);
        a(ErrorTypeIdentifier.FACEBOOK_GENERIC);
    }

    private void a(ErrorTypeIdentifier errorTypeIdentifier) {
        if (ErrorTypeIdentifier.NO_CONNECTION == errorTypeIdentifier) {
            this.k.as_();
        } else {
            this.k.e();
        }
        this.a.a(ScreenIdentifier.START, errorTypeIdentifier, (InputFieldIdentifier) null);
    }

    public final void a(SpotifyError spotifyError) {
        this.k.at_();
        if (SpotifyError.AP_NETWORK_DISABLED == spotifyError) {
            this.a.a(ScreenIdentifier.START, b(spotifyError), (InputFieldIdentifier) null);
            this.k.a(new $$Lambda$llw$F1AnXxlaTnMQE8Ye4gnTlKY_mp8(this), new $$Lambda$llw$7l_j2vzQBk_dAhV7ezVTagF2fvk(this));
            return;
        }
        boolean z = true;
        boolean z2 = spotifyError == SpotifyError.LOGIN_ACCOUNT_EXISTS;
        boolean z3 = this.d != null;
        if (!z2 || !z3) {
            z = false;
        }
        if (z) {
            this.j.a(llp.a(this.d));
        } else {
            a(b(spotifyError));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        this.k.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        this.h.a(false);
    }

    private static ErrorTypeIdentifier b(SpotifyError spotifyError) {
        if (spotifyError == SpotifyError.DNS) {
            return ErrorTypeIdentifier.NO_CONNECTION;
        }
        return ErrorTypeIdentifier.FACEBOOK_GENERIC;
    }

    public final void a() {
        this.j.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Assertion.c(String.format("Failed to get facebook me : %s", new Object[]{aVar.a}));
        a(ErrorTypeIdentifier.FACEBOOK_GENERIC);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        JSONObject jSONObject = cVar.a;
        this.d = lmb.a(jSONObject.optString("id"), (String) fay.a(rqu.b()), jSONObject.optString("name"), jSONObject.optString("email"));
        this.g.a(this.d.a(), this.d.b(), false).a(this.f).b((SingleObserver<? super T>) new SingleObserver<gnf>() {
            public final void onSubscribe(Disposable disposable) {
            }

            public final /* synthetic */ void c_(Object obj) {
                ((gnf) obj).a((gcs<b>) new $$Lambda$llw$2$ajBi0l0reiqpJJiCQP1DbjjTrsY<b>(this), (gcs<a>) new $$Lambda$llw$2$Q_M_M1yYkmGgeQcGBhqv2pKCO5E<a>(this));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                llw llw = llw.this;
                llw.a.b(ScreenIdentifier.START);
                llw.b.b = new h();
                llw.b.a((String) fay.a(llw.d.c()), (String) null, "https://www.facebook.com", (vno) llw);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                llw.this.a(SpotifyError.a(aVar.a));
            }

            public final void onError(Throwable th) {
                Logger.e(th, "could not login", new Object[0]);
                llw.this.a(SpotifyError.UNKNOWN);
            }
        });
    }
}
