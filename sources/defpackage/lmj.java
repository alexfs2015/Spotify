package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import com.spotify.cosmos.router.Request;
import com.spotify.music.features.accountmanagement.AccountInfo;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lmj reason: default package */
public final class lmj {
    private final lmh a;
    private final lmf b;
    private final lmc c;
    private final lmd d;
    private final wug e;
    private AlertDialog f;
    private wuk g;

    public lmj(lmh lmh, lmf lmf, lmc lmc, lmd lmd, wug wug) {
        this.a = lmh;
        this.b = lmf;
        this.c = lmc;
        this.d = lmd;
        this.e = wug;
    }

    public final void a() {
        lmc lmc = this.c;
        this.f = new Builder(lmc.a, 2132017711).setCancelable(false).setView(new ProgressBar(lmc.a)).setCancelable(false).create();
        this.f.show();
        lmd lmd = this.d;
        wud a2 = new glb(AccountInfo.class, (rnf) ggw.a(rnf.class), lmd.a, ((heg) ggw.a(heg.class)).b()).resolve(new Request(Request.GET, "hm://subscription/v2/account_state")).a(1).a(this.e);
        $$Lambda$rN4U_FXRzcX4Qxy5ezeRr_fmf40 r1 = new $$Lambda$rN4U_FXRzcX4Qxy5ezeRr_fmf40(this);
        this.g = wud.b((a<T>) new wve<T>(a2, new wxl(wuq.a(), wuq.a(r1), r1))).a((wun<? super T>) new $$Lambda$lmj$Opw7wsaNTrELSs_5V3ZSxhNCI<Object>(this), (wun<Throwable>) new $$Lambda$lmj$O0hbbFLzt86i0KXvHEzl2NCEQwc<Throwable>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.a();
    }

    public final void b() {
        AlertDialog alertDialog = this.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        hej.a(this.g);
        this.g = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AccountInfo accountInfo) {
        boolean z = false;
        if (accountInfo.hasSubscription() && accountInfo.willRecur() && !accountInfo.isGracePeriod() && accountInfo.getPaymentProvider() != null) {
            String provider = accountInfo.getPaymentProvider().getProvider();
            if (!"itunesiap".equalsIgnoreCase(provider) && !"familyplan".equalsIgnoreCase(provider) && !"partner".equalsIgnoreCase(provider)) {
                z = true;
            }
        }
        if (z) {
            lmh lmh = this.a;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.bL.toString()));
            intent.setFlags(67108864);
            lmh.a.startActivity(intent);
            return;
        }
        this.a.a();
    }
}
