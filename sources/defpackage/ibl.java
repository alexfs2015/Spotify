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

/* renamed from: ibl reason: default package */
public final class ibl {
    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent != null;
    }

    public static ObservableTransformer<ibk, ibm> a(hzy hzy, ids ids, kxz kxz, Context context, hec hec, Scheduler scheduler, hxf hxf, ibw ibw, ibv ibv) {
        return klb.a().a(f.class, (ObservableTransformer<G, E>) new $$Lambda$ibl$bsDwVAEt7G28ISfBqfj_fj8vxsM<G,E>(kxz, hzy, ids)).a(e.class, (ObservableTransformer<G, E>) new $$Lambda$ibl$eILSAfjxaf85l9qMQIbafaJZHmk<G,E>(hec, scheduler, ibv, context)).a(a.class, (Consumer<G>) new $$Lambda$ibl$OJQxb0upGWH3s2fs0yUiogF_WXA<G>(ibw), scheduler).a(b.class, (Consumer<G>) new $$Lambda$ibl$PK4pkW6TP7XL8Ns1pFQ92Z4lkM<G>(ibw), scheduler).a(c.class, (Consumer<G>) $$Lambda$ibl$gKxmE2DuCTJX7LgL88biiBLaOo.INSTANCE).a(d.class, (Consumer<G>) new $$Lambda$ibl$mizCtaDZRlRKRymR2WbWILu6og0<G>(hxf)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ho hoVar) {
        return hoVar.b != null && ((Boolean) hoVar.b).booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ibm b(AdSlotEvent adSlotEvent) {
        if (adSlotEvent.getAd().id() == null || Event.AVAILABLE != adSlotEvent.getEvent()) {
            return new b("no marquee returned");
        }
        return new c(adSlotEvent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ho hoVar) {
        return (hoVar.a == null || hoVar.b == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ibv ibv, Context context, ho hoVar) {
        fpt fpt = (fpt) hoVar.b;
        if (!(fpt == null || hoVar.a == null)) {
            Intent a = MarqueeActivity.a(context, fpt, ((e) hoVar.a).a);
            a.setFlags(268500992);
            context.startActivity(a);
        }
        return $$Lambda$TZZ61F64A9rkCCV34qGZPaPSI.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ibw ibw, a aVar) {
        ibw.c = true;
        ((Picasso) ibw.b.get()).a((Object) "marquee_album_art_tag");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ibw ibw, b bVar) {
        ibw.d = bVar.a.getAd();
        String extractMetadata = ibw.d != null ? ibw.d.extractMetadata("albumImageUri") : "";
        ibw.c = false;
        ((Picasso) ibw.b.get()).a(extractMetadata).a((Object) "marquee_album_art_tag").a((vsr) ibw);
    }
}
