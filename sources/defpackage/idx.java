package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeActivity;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import com.squareup.picasso.Picasso;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;

/* renamed from: idx reason: default package */
public final class idx {
    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ieh ieh, Context context, ho hoVar) {
        fqn fqn = (fqn) hoVar.b;
        if (!(fqn == null || hoVar.a == null)) {
            Intent a = MarqueeActivity.a(context, fqn, ((e) hoVar.a).a);
            a.setFlags(268500992);
            context.startActivity(a);
        }
        return $$Lambda$TZZ61F64A9rkCCV34qGZPaPSI.INSTANCE;
    }

    public static ObservableTransformer<idw, idy> a(ick ick, igf igf, lbi lbi, Context context, hgy hgy, Scheduler scheduler, hzr hzr, iei iei, ieh ieh) {
        return kok.a().a(f.class, (ObservableTransformer<G, E>) new $$Lambda$idx$bvtDCNSgO8DybSCaCeDCOUfgaxI<G,E>(lbi, ick, igf)).a(e.class, (ObservableTransformer<G, E>) new $$Lambda$idx$mZ9gd721ZIdI8g3lryPQrm4zWA<G,E>(hgy, scheduler, ieh, context)).a(a.class, (Consumer<G>) new $$Lambda$idx$T643ws6HFBqXik8atmVf3MCBSEI<G>(iei), scheduler).a(b.class, (Consumer<G>) new $$Lambda$idx$lFstDpyDO4GgtKnUlnByuP5ktEQ<G>(iei), scheduler).a(c.class, (Consumer<G>) $$Lambda$idx$zdgPTq8OztflTIRxkZfmybkG4zA.INSTANCE).a(d.class, (Consumer<G>) new $$Lambda$idx$tYnTTrCFmpdeoE1gYJyfDT2CJzs<G>(hzr)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(iei iei, a aVar) {
        iei.c = true;
        ((Picasso) iei.b.get()).a((Object) "marquee_album_art_tag");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(iei iei, b bVar) {
        iei.d = bVar.a.getAd();
        String extractMetadata = iei.d != null ? iei.d.extractMetadata("albumImageUri") : "";
        iei.c = false;
        ((Picasso) iei.b.get()).a(extractMetadata).a((Object) "marquee_album_art_tag").a((wgx) iei);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent != null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ho hoVar) {
        return (hoVar.a == null || hoVar.b == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ idy b(AdSlotEvent adSlotEvent) {
        return (adSlotEvent.getAd().id() == null || Event.AVAILABLE != adSlotEvent.getEvent()) ? new b("no marquee returned") : new c(adSlotEvent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ho hoVar) {
        return hoVar.b != null && ((Boolean) hoVar.b).booleanValue();
    }
}
