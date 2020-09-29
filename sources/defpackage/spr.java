package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;

/* renamed from: spr reason: default package */
public final class spr {
    private final a a;
    private final spb b;
    private final gbr<Intent> c;

    public spr(a aVar, spb spb, gbr<Intent> gbr) {
        this.a = aVar;
        this.b = spb;
        this.c = gbr;
    }

    public final gjs<Intent> a(spa spa, String str) {
        a aVar = this.a;
        $$Lambda$spr$LjVhhksrCJ6v8lKique8punYr6w r1 = new $$Lambda$spr$LjVhhksrCJ6v8lKique8punYr6w(this, spa);
        StringBuilder sb = new StringBuilder("Push ");
        sb.append(str);
        sb.append(" to the backstack");
        return aVar.a(r1, sb.toString(), $$Lambda$spr$Nvi6UTrgaNp8W2q1IEU8BPwW70k.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(spa spa, Intent intent, fpt fpt, SessionState sessionState) {
        spa spa2 = spa;
        Intent intent2 = intent;
        this.b.a(spa2.create(intent2, jst.a(intent.getDataString()), intent.getStringExtra("title"), fpt, sessionState), intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String c(Intent intent) {
        StringBuilder sb = new StringBuilder("Triggered by a ");
        sb.append(jst.a(intent.getDataString()).h());
        sb.append(" intent");
        return sb.toString();
    }

    public final gjs<Intent> a(spq spq, String str) {
        a aVar = this.a;
        spp spp = new spp(aVar.a, aVar.b, aVar.c, aVar.d, (wuv<Intent, fpt, SessionState, Completable>) new $$Lambda$spr$EZpC8_rvf0wHoSOUp5usE0IfvWo<Intent,fpt,SessionState,Completable>(this, spq), str, (wut<Intent, String>) $$Lambda$spr$zs6tyLrECFCKTa9MMn2xYSuCg7Q.INSTANCE);
        return spp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(spq spq, Intent intent, fpt fpt, SessionState sessionState) {
        return spq.resolve(intent, fpt, sessionState).e(new $$Lambda$spr$GF5vcAb3nEV9sgM_5I5zoacl2HI(this, intent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Intent intent, spw spw) {
        return (Completable) spw.a($$Lambda$spr$oIpCBnPwQKZYAJX_wVnCFhaIlo.INSTANCE, new $$Lambda$spr$hmu3vxafVbASxp2iflq5qCE0dKg(this, intent), new $$Lambda$spr$MRxeydqc8jBef_e9N8BITDLlA(this, intent));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(Intent intent) {
        StringBuilder sb = new StringBuilder("Triggered by a ");
        sb.append(jst.a(intent.getDataString()).h());
        sb.append(" intent");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, Intent intent) {
        this.b.a(cVar.a, intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent) {
        this.c.accept(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(Intent intent, b bVar) {
        return Completable.a((Action) new $$Lambda$spr$FLkSmFBSwN13MwWoSvPCqLosNE(this, new Intent(intent).setData(Uri.parse(bVar.a.h()))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(Intent intent, c cVar) {
        return Completable.a((Action) new $$Lambda$spr$Hqhvk_yN04MZHQTpzACBDSegNl8(this, cVar, intent));
    }
}
