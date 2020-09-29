package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;

/* renamed from: szy reason: default package */
public final class szy {
    private final a a;
    private final szi b;
    private final gcp<Intent> c;

    public szy(a aVar, szi szi, gcp<Intent> gcp) {
        this.a = aVar;
        this.b = szi;
        this.c = gcp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(Intent intent, b bVar) {
        return Completable.a((Action) new $$Lambda$szy$XznLFgTVHeJP1f51FyOg4_2HSDU(this, new Intent(intent).setData(Uri.parse(bVar.a.h()))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(Intent intent, c cVar) {
        return Completable.a((Action) new $$Lambda$szy$IIVizeTqCrhIlPUeZdB9f5kBpyc(this, cVar, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(szx szx, Intent intent, fqn fqn, SessionState sessionState) {
        return szx.resolve(intent, fqn, sessionState).e(new $$Lambda$szy$uD1yUjJ8yGsZGT8GiNhl7271fas(this, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Intent intent, tad tad) {
        return (Completable) tad.a($$Lambda$szy$i174dZTuSdF_D8aG5DzMUGclMYY.INSTANCE, new $$Lambda$szy$eWWpnr_gMg5bdDV7_49O9mxRGUM(this, intent), new $$Lambda$szy$y3s2F23NmeJklFc1a0h78gR5C2U(this, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent) {
        this.c.accept(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(szh szh, Intent intent, fqn fqn, SessionState sessionState) {
        szh szh2 = szh;
        Intent intent2 = intent;
        this.b.a(szh2.create(intent2, jva.a(intent.getDataString()), intent.getStringExtra("title"), fqn, sessionState), intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, Intent intent) {
        this.b.a(cVar.a, intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(Intent intent) {
        StringBuilder sb = new StringBuilder("Triggered by a ");
        sb.append(jva.a(intent.getDataString()).h());
        sb.append(" intent");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String c(Intent intent) {
        StringBuilder sb = new StringBuilder("Triggered by a ");
        sb.append(jva.a(intent.getDataString()).h());
        sb.append(" intent");
        return sb.toString();
    }

    public final gld<Intent> a(szh szh, String str) {
        a aVar = this.a;
        $$Lambda$szy$q6r9LolEbHKb4ERXM6veuF9s_E0 r1 = new $$Lambda$szy$q6r9LolEbHKb4ERXM6veuF9s_E0(this, szh);
        StringBuilder sb = new StringBuilder("Push ");
        sb.append(str);
        sb.append(" to the backstack");
        return aVar.a(r1, sb.toString(), $$Lambda$szy$fFg4U2Mbb9nUHieKm8K6kqo4A0.INSTANCE);
    }

    public final gld<Intent> a(szx szx, String str) {
        a aVar = this.a;
        szw szw = new szw(aVar.a, aVar.b, aVar.c, aVar.d, (xja<Intent, fqn, SessionState, Completable>) new $$Lambda$szy$kUqUXlzpOpyK27kyirCqPqTnl3w<Intent,fqn,SessionState,Completable>(this, szx), str, (xiy<Intent, String>) $$Lambda$szy$kDhdvWWkl2uAYU2nUhTGVve_u0.INSTANCE);
        return szw;
    }
}
