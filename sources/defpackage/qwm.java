package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger.SectionId;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger.UserIntent;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.Map;

/* renamed from: qwm reason: default package */
public final class qwm {
    public static ObservableTransformer<qwi, qwj> a(qvy qvy, qsz qsz, qul qul, txc txc, kxp kxp, kxc kxc, uqw uqw, MusicPagesFiltering musicPagesFiltering, qyl qyl, qwa qwa, qyh qyh, lkn lkn, qvh qvh, MusicPagesLogger musicPagesLogger, OffliningLogger offliningLogger, qzh qzh, qxg qxg) {
        qvy qvy2 = qvy;
        qsz qsz2 = qsz;
        txc txc2 = txc;
        kxp kxp2 = kxp;
        uqw uqw2 = uqw;
        MusicPagesFiltering musicPagesFiltering2 = musicPagesFiltering;
        qyl qyl2 = qyl;
        qyh qyh2 = qyh;
        Scheduler b = qwa.b();
        qsz.getClass();
        qsz.getClass();
        qsz.getClass();
        qul qul2 = qul;
        return klb.a().a(ae.class, (Consumer<G>) new $$Lambda$qwm$2ZlVqmSnUo9OGd46xhM7sM4Pjf4<G>(qsz), b).a(af.class, (Consumer<G>) new $$Lambda$qwm$wiZK030Jr8kUyipRaOFio2flAPY<G>(qsz), b).a(ag.class, (Consumer<G>) new $$Lambda$qwm$QznlNl1nJTw3W08_5asypRRRQ<G>(qsz), b).a(ah.class, (Consumer<G>) new $$Lambda$qwm$Saka40e9vtCU8M4i0Uec4vByGVY<G>(qsz), b).a(ai.class, (Action) new $$Lambda$sUg5UDQ4hwpOp83Bre3RImHbWC4(qsz), b).a(aj.class, (Action) new $$Lambda$sUg5UDQ4hwpOp83Bre3RImHbWC4(qsz), b).a(ak.class, (Action) new $$Lambda$wUMxA1ucGt6RgaBzSU9CArFdG_c(qsz), b).a(ap.class, (Consumer<G>) new $$Lambda$qwm$a6IAOpxiLB8AhvqyO4DCElKLgls<G>(txc), b).a(bg.class, (Consumer<G>) new $$Lambda$qwm$1oyb_7d6RHUHCZ039mRqeGh0SNM<G>(txc), b).a(aq.class, (Consumer<G>) new $$Lambda$qwm$Q1zxZxUHtA1pKH8FQRPgsHsuTUQ<G>(qyh2), b).a(bc.class, (Consumer<G>) new $$Lambda$qwm$EoC9EJZy3jAZEqje1gNU8tFN7E0<G>(lkn), b).a(bh.class, (Consumer<G>) new $$Lambda$qwm$ICtXX80EpQWsKOW8xh_reUmtI<G>(kxp2), b).a(bl.class, (Consumer<G>) new $$Lambda$qwm$e93gqnLXaSThwDI6ELUkjbBlzU<G>(kxp2), b).a(bk.class, (Consumer<G>) new $$Lambda$qwm$mgV0W7Mfy4vOqL9wp6N58Y7rU<G>(kxc), b).a(aw.class, (Consumer<G>) new $$Lambda$qwm$NJeogQkYrFzLtY2HtkUaAX83WY<G>(qvy), b).a(bd.class, (Action) new $$Lambda$qwm$SU12NWMn4paq3SATXyEJp8SCrY(qvy), b).a(ay.class, (Consumer<G>) new $$Lambda$qwm$IacSsxqFn5B3lCd0OUah9kdI6wY<G>(qvy), b).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$qwm$DW4x6kYz6nEKnCOCCSuTX3st5K0<G,E>(b, uqw2)).a(am.class, (ObservableTransformer<G, E>) new $$Lambda$qwm$9jbjZwmO63MnVortf38V7CMgo<G,E>(b, musicPagesFiltering2)).a(av.class, (Consumer<G>) new $$Lambda$qwm$QBPGtqWQtnj2PDKw7c1b8oYlZ74<G>(uqw2), b).a(au.class, (Consumer<G>) new $$Lambda$qwm$crAabX5vv3OOs6dMBCQh2LR8yo<G>(musicPagesFiltering2), b).a(an.class, (ObservableTransformer<G, E>) new $$Lambda$qwm$VmfSTeMfONGGmLmaL2YqH6XGCw<G,E>(qyl2, b)).a(ba.class, (Consumer<G>) new $$Lambda$qwm$yoZ8ElseoZmkDjqpJe9GSTMir6g<G>(qyl2), b).a(ao.class, (Consumer<G>) new $$Lambda$qwm$Cc458Qx7ZSntH2rOL7bNypqu3CA<G>(qvy), b).a(bf.class, (Consumer<G>) new $$Lambda$qwm$nBKV1broyf5KflU_v8Pi7kMUFLM<G>(qyh2), b).a(bi.class, (ObservableTransformer<G, E>) new $$Lambda$qwm$1g8IoZwa92Wo_0MOGKVLJex_XT0<G,E>(qul, b)).a(at.class, (Consumer<G>) new $$Lambda$qwm$dVQxT64Ab4cStPb5yERlYVlGnUE<G>(qvy), b).a(ax.class, (Consumer<G>) new $$Lambda$qwm$D_O8zG7rCq2Edvhwv2Bmgh5l67E<G>(qvy), b).a(as.class, (Consumer<G>) new $$Lambda$qwm$DBWJLnuIIg5Z9R5EEPgWxlGRkXI<G>(qvy), b).a(ar.class, (Consumer<G>) new $$Lambda$qwm$HLQcdjI9_EChJ_6IK2T0Sq98mCE<G>(qvy), b).a(al.class, (Consumer<G>) new $$Lambda$qwm$OyfOVqESnJm4fOIgb4ogww19l4<G>(qvy), b).a(az.class, (Consumer<G>) new $$Lambda$qwm$QK0cGBHZ19MwCwcOZCXWnzcPTo<G>(qvy), b).a(b.class, (Consumer<G>) new $$Lambda$qwm$R4vs1VCAKRlMcAA0okAN3UzfQ2Y<G>(qvh), b).a(be.class, (Consumer<G>) new $$Lambda$qwm$cncIaZ2WqQVHyy6OsXVXJAsVJuk<G>(qzh), b).a(bj.class, (Consumer<G>) new $$Lambda$qwm$FQti0E1R_STf_ZpNbKDubDAUBU<G>(qxg), b).a(bb.class, (Consumer<G>) new $$Lambda$qwm$xM6MIuvLkyZ_h2kAE41li26efS4<G>(qvy), b).a(a.class, (Consumer<G>) new $$Lambda$qwm$mimGtYrhcYUCeV53kppXtl5boaE<G>(qvy), b).a(s.class, musicPagesLogger.g()).a(t.class, musicPagesLogger.h()).a(e.class, musicPagesLogger.i()).a(u.class, musicPagesLogger.t()).a(v.class, musicPagesLogger.u()).a(j.class, musicPagesLogger.k()).a(k.class, musicPagesLogger.l()).a(q.class, musicPagesLogger.m()).a(r.class, musicPagesLogger.n()).a(ad.class, musicPagesLogger.o()).a(h.class, musicPagesLogger.p()).a(p.class, musicPagesLogger.q()).a(f.class, musicPagesLogger.r()).a(g.class, musicPagesLogger.s()).a(z.class, musicPagesLogger.x()).a(y.class, musicPagesLogger.y()).a(ab.class, musicPagesLogger.A()).a(aa.class, musicPagesLogger.B()).a(ac.class, musicPagesLogger.z()).a(x.class, musicPagesLogger.v()).a(m.class, (Consumer<G>) new $$Lambda$qwm$dJaatKgSmqrqWnFoBCc_vhW9pb8<G>(offliningLogger, musicPagesLogger)).a(o.class, musicPagesLogger.C()).a(i.class, musicPagesLogger.E()).a(n.class, musicPagesLogger.F()).a(d.class, musicPagesLogger.j()).a(l.class, musicPagesLogger.w()).a(w.class, musicPagesLogger.D()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableMap a(am amVar, ImmutableMap immutableMap) {
        a g = ImmutableMap.g();
        fdh R_ = amVar.c.R_();
        while (R_.hasNext()) {
            String str = (String) R_.next();
            Boolean bool = (Boolean) immutableMap.get(str);
            if (bool == null) {
                bool = (Boolean) amVar.b.get(str);
            }
            g.b(str, fav.a(bool, Boolean.FALSE));
        }
        return g.b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(OffliningLogger offliningLogger, MusicPagesLogger musicPagesLogger, m mVar) {
        offliningLogger.a(mVar.b, SourceElement.HEADER_TOGGLE, mVar.a);
        musicPagesLogger.a((String) null, SectionId.DOWNLOAD_TOGGLE, 0, InteractionType.HIT, mVar.a ? UserIntent.DOWNLOAD : UserIntent.REMOVE_DOWNLOADS);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qzh qzh, be beVar) {
        int i = beVar.a;
        SpotifyIconV2 spotifyIconV2 = beVar.b;
        if (!jsl.b(qzh.d.a.b())) {
            qzh.b.a(uos.a(qzh.a.getString(i), 3000).c(R.color.white).b(R.color.black).a());
            return;
        }
        qzh.c.a(spotifyIconV2, i, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qwj a(uqw uqw, c cVar) {
        return new ab(uqw.a(jst.a(cVar.a), cVar.b, cVar.c));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(defpackage.qyh r7, defpackage.qwi.bf r8) {
        /*
            qut r0 = r8.a
            java.lang.String r8 = r8.b
            java.lang.String r1 = "context_description"
            java.util.Map r8 = java.util.Collections.singletonMap(r1, r8)
            int r1 = r0.k()
            r2 = 0
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 > r3) goto L_0x003f
            java.util.ArrayList r3 = com.google.common.collect.Lists.a()
            r4 = 0
        L_0x0018:
            if (r4 >= r1) goto L_0x0032
            int r5 = r3.size()
            r6 = 16
            if (r5 > r6) goto L_0x0032
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r5 = r0.a(r4)
            boolean r6 = r5.v()
            if (r6 == 0) goto L_0x002f
            r3.add(r5)
        L_0x002f:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0032:
            int r0 = r3.size()
            r1 = 15
            if (r0 > r1) goto L_0x003f
            com.google.common.base.Optional r0 = com.google.common.base.Optional.b(r3)
            goto L_0x0043
        L_0x003f:
            com.google.common.base.Optional r0 = com.google.common.base.Optional.e()
        L_0x0043:
            boolean r1 = r0.b()
            r3 = 0
            if (r1 == 0) goto L_0x0093
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r1.<init>()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = r1.playerOptionsOverride(r4, r3, r3)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r1 = r1.build()
            com.spotify.mobile.android.cosmos.player.v2.Player r3 = r7.b
            java.lang.Object r0 = r0.c()
            java.util.List r0 = (java.util.List) r0
            int r4 = r0.size()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r4 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[r4]
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r0.next()
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r5 = (com.spotify.music.features.yourlibrary.musicpages.item.MusicItem) r5
            int r6 = r2 + 1
            java.lang.String r5 = r5.j()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r5 = com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.create(r5)
            r4[r2] = r5
            r2 = r6
            goto L_0x006b
        L_0x0085:
            sih r7 = r7.c
            java.lang.String r7 = r7.toString()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r7 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext.create(r7, r4, r8)
            r3.play(r7, r1)
            return
        L_0x0093:
            qyj r7 = r7.a
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.playerOptionsOverride(r1, r3, r3)
            ioo r1 = r7.a
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r0 = r0.build()
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.b
            r1.a(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwm.a(qyh, qwi$bf):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kxc kxc, bk bkVar) {
        if (bkVar.c) {
            kxc.a(bkVar.a, bkVar.b, true);
        } else {
            kxc.b(bkVar.a, bkVar.b, true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kxp kxp, bl blVar) {
        if (blVar.c) {
            kxp.a(blVar.a, blVar.b);
        } else {
            kxp.a(blVar.a);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kxp kxp, bh bhVar) {
        if (bhVar.b) {
            kxp.a(bhVar.a, "");
        } else {
            kxp.a(bhVar.a);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qyh qyh, aq aqVar) {
        MusicItem musicItem = aqVar.a;
        String str = aqVar.b;
        uqv uqv = aqVar.c;
        Map singletonMap = Collections.singletonMap("context_description", str);
        qyj qyj = qyh.a;
        Builder builder = new Builder();
        if (musicItem != null && musicItem.v()) {
            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, musicItem.j(), 0);
            builder.skipTo(playOptionsSkipTo);
        }
        if (uqv.a() != null) {
            qyj.a.c = uqv.a();
        }
        qyj.a.a(builder.build(), qyj.b, singletonMap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qsz qsz, ae aeVar) {
        String str = aeVar.a;
        qsz.a.a(spd.a(str).b(aeVar.b).a());
    }
}
