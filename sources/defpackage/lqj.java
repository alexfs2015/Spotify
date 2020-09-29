package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import com.spotify.cosmos.router.Request;
import com.spotify.music.features.accountmanagement.AccountInfo;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lqj reason: default package */
public final class lqj {
    private final lqh a;
    private final lqf b;
    private final lqc c;
    private final lqd d;
    private final xil e;
    private AlertDialog f;
    private xip g;

    public lqj(lqh lqh, lqf lqf, lqc lqc, lqd lqd, xil xil) {
        this.a = lqh;
        this.b = lqf;
        this.c = lqc;
        this.d = lqd;
        this.e = xil;
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
            lqh lqh = this.a;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.bK.toString()));
            intent.setFlags(67108864);
            lqh.a.startActivity(intent);
            return;
        }
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.a();
    }

    public final void a() {
        lqc lqc = this.c;
        this.f = new Builder(lqc.a, 2132017714).setCancelable(false).setView(new ProgressBar(lqc.a)).setCancelable(false).create();
        this.f.show();
        lqd lqd = this.d;
        xii a2 = new gmp(AccountInfo.class, (rwl) gih.a(rwl.class), lqd.a, ((hhc) gih.a(hhc.class)).b()).resolve(new Request(Request.GET, "hm://subscription/v2/account_state")).a(1).a(this.e);
        $$Lambda$j6Z9rJAo10lzb_0jURrY1mP96s r1 = new $$Lambda$j6Z9rJAo10lzb_0jURrY1mP96s(this);
        this.g = xii.b((a<T>) new xjj<T>(a2, new xlq(xiv.a(), xiv.a(r1), r1))).a((xis<? super T>) new $$Lambda$lqj$33YwdTC9q_JIDcy5YZb5zH6R_jo<Object>(this), (xis<Throwable>) new $$Lambda$lqj$JuAGYwbmcICtwnuDsdQqlVyjI<Throwable>(this));
    }

    public final void b() {
        AlertDialog alertDialog = this.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        hhf.a(this.g);
        this.g = null;
    }
}
