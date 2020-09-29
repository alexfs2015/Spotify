package defpackage;

import android.content.DialogInterface;
import com.facebook.FacebookException;
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
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: lpw reason: default package */
public final class lpw implements a, wau {
    final uun a;
    final waq b;
    Disposable c = Disposables.b();
    lqb d;
    private final lpr e;
    private final Scheduler f;
    private final got g;
    private final ura h;
    private final saf i;
    private final goy j;
    private b k;

    public lpw(ura ura, lpr lpr, Scheduler scheduler, got got, uun uun, a aVar, saf saf, waq waq, goy goy) {
        this.e = lpr;
        this.f = scheduler;
        this.g = got;
        this.a = uun;
        this.h = ura;
        this.i = saf;
        this.b = waq;
        this.j = goy;
        aVar.a(new c() {
            public final void a() {
                super.a();
                lpw.this.c.bd_();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        this.h.a(false);
    }

    private void a(ErrorTypeIdentifier errorTypeIdentifier, SpotifyError spotifyError) {
        String str;
        if (spotifyError == null) {
            str = null;
        } else {
            str = String.format(Locale.US, "Error code %d", new Object[]{Integer.valueOf(spotifyError.mCode)});
        }
        this.a.a(ScreenIdentifier.START, errorTypeIdentifier, null, str);
        Logger.e("FacebookSSO login error, SpotifyError=%s", str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Assertion.b("Failed to get facebook me", th);
        this.k.as_();
        this.a.a(ScreenIdentifier.START, ErrorTypeIdentifier.FACEBOOK_GENERIC, (InputFieldIdentifier) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Assertion.c(String.format("Failed to get facebook me : %s", new Object[]{aVar.a}));
        this.k.as_();
        this.a.a(ScreenIdentifier.START, ErrorTypeIdentifier.FACEBOOK_GENERIC, (InputFieldIdentifier) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.k.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        JSONObject jSONObject = cVar.a;
        this.d = lqb.a(jSONObject.optString("id"), (String) fbp.a(saf.b()), jSONObject.optString("name"), jSONObject.optString("email"));
        this.g.a(this.d.a(), this.d.b(), false).a(this.f).b((SingleObserver<? super T>) new SingleObserver<gou>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                lpw.this.a(SpotifyError.a(aVar.a));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                lpw lpw = lpw.this;
                lpw.a.b(ScreenIdentifier.START);
                lpw.b.a = new l();
                lpw.b.a((String) fbp.a(lpw.d.c()), (String) null, "https://www.facebook.com", (wau) lpw);
            }

            public final /* synthetic */ void c_(Object obj) {
                ((gou) obj).a((ged<b>) new $$Lambda$lpw$2$DpZ4MMk9kveAXuiP997i2JRKmiU<b>(this), (ged<a>) new $$Lambda$lpw$2$n4QM8ubYH2GqlIqluldmNR1uxCg<a>(this));
            }

            public final void onError(Throwable th) {
                Logger.e(th, "could not login", new Object[0]);
                lpw.this.a(SpotifyError.UNKNOWN);
            }

            public final void onSubscribe(Disposable disposable) {
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lpq lpq) {
        lpq.a(new $$Lambda$lpw$A_ulF6k5D4TCmLXaHOGTBxRVbo8(this), new $$Lambda$lpw$mnkQhRWqcaAeqgOAKHRNFx7TRY(this), new $$Lambda$lpw$97qZQpBi35oREtMVzAtgW9MZgQ(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        this.k.a();
    }

    public final void a() {
        this.k.a();
    }

    public final void a(FacebookException facebookException) {
        if ("net::ERR_INTERNET_DISCONNECTED".equals(facebookException.getMessage())) {
            a(SpotifyError.DNS);
        } else {
            a(SpotifyError.UNKNOWN);
        }
    }

    public final void a(Credential credential) {
    }

    public final void a(SpotifyError spotifyError) {
        this.k.c();
        boolean z = true;
        if (SpotifyError.AP_NETWORK_DISABLED == spotifyError) {
            a(ErrorTypeIdentifier.OFFLINE_MODE, spotifyError);
            this.k.a(new $$Lambda$lpw$r76NFl6Kr2qdaChD6VYzxYaqFXY(this), new $$Lambda$lpw$6al7npObAiySM0dz6sLw34nGhPM(this));
            return;
        }
        boolean z2 = spotifyError == SpotifyError.LOGIN_ACCOUNT_EXISTS;
        boolean z3 = this.d != null;
        if (!z2 || !z3) {
            z = false;
        }
        if (z) {
            this.j.a(lpp.a(this.d));
        } else if (spotifyError == SpotifyError.DNS) {
            this.k.e();
            a(ErrorTypeIdentifier.NO_CONNECTION, spotifyError);
        } else {
            this.k.as_();
            a(ErrorTypeIdentifier.FACEBOOK_GENERIC, spotifyError);
        }
    }

    public final /* synthetic */ void a(Object obj) {
        b();
    }

    public final void a(b bVar) {
        this.k = bVar;
    }

    public final void ar_() {
        this.j.d();
    }

    public final void b() {
        this.c.bd_();
        this.c = this.e.b().a(this.f).a((Consumer<? super T>) new $$Lambda$lpw$_FpzQLYdlVyTmnRJV1xrQSfkAJ4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$lpw$7A26ksusdmSZ3eRb4iGQjJNzAHw<Object>(this));
    }

    public final void d() {
    }
}
