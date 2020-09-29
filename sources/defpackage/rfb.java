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

/* renamed from: rfb reason: default package */
public final class rfb {
    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableMap a(am amVar, ImmutableMap immutableMap) {
        a g = ImmutableMap.g();
        fdz R_ = amVar.c.R_();
        while (R_.hasNext()) {
            String str = (String) R_.next();
            Boolean bool = (Boolean) immutableMap.get(str);
            if (bool == null) {
                bool = (Boolean) amVar.b.get(str);
            }
            g.b(str, fbm.a(bool, Boolean.FALSE));
        }
        return g.b();
    }

    public static ObservableTransformer<rex, rey> a(ren ren, rbo rbo, rda rda, ujf ujf, lay lay, lal lal, vcb vcb, MusicPagesFiltering musicPagesFiltering, rha rha, rep rep, rgw rgw, lon lon, rdu rdu, MusicPagesLogger musicPagesLogger, OffliningLogger offliningLogger, rid rid, rfv rfv) {
        ren ren2 = ren;
        rbo rbo2 = rbo;
        ujf ujf2 = ujf;
        lay lay2 = lay;
        vcb vcb2 = vcb;
        MusicPagesFiltering musicPagesFiltering2 = musicPagesFiltering;
        rha rha2 = rha;
        rgw rgw2 = rgw;
        Scheduler b = rep.b();
        rbo.getClass();
        rbo.getClass();
        rbo.getClass();
        rda rda2 = rda;
        return kok.a().a(ae.class, (Consumer<G>) new $$Lambda$rfb$N440fAXoHyEM08s1rIRPTgRvifY<G>(rbo), b).a(af.class, (Consumer<G>) new $$Lambda$rfb$6zgCZ7sF8OX295uoHG9Nx8Fr6s<G>(rbo), b).a(ag.class, (Consumer<G>) new $$Lambda$rfb$TPObSL4NeiUsHfuojWFftW_yPfc<G>(rbo), b).a(ah.class, (Consumer<G>) new $$Lambda$rfb$vyx175ShLp2ibOoPI6eBPXhGQo<G>(rbo), b).a(ai.class, (Action) new $$Lambda$uYphDVCarv0m9f4sL8WwsOZajHo(rbo), b).a(aj.class, (Action) new $$Lambda$uYphDVCarv0m9f4sL8WwsOZajHo(rbo), b).a(ak.class, (Action) new $$Lambda$mtA19DoxN5UyrMQhNoL4FaLP8Kk(rbo), b).a(ap.class, (Consumer<G>) new $$Lambda$rfb$qTVcSO5oOmUvtVD61MV8BXk0L9k<G>(ujf), b).a(bg.class, (Consumer<G>) new $$Lambda$rfb$Z8fALnPJWeCunvpiClSccmJVSc<G>(ujf), b).a(aq.class, (Consumer<G>) new $$Lambda$rfb$u1hhG8fHBwwmIYQwZCYGBnwamMg<G>(rgw2), b).a(bc.class, (Consumer<G>) new $$Lambda$rfb$96U21G7IdOBmYQGafNrzO6Gjg8<G>(lon), b).a(bh.class, (Consumer<G>) new $$Lambda$rfb$UM9bumHhTgkzqsNTOc3z1zjMAzo<G>(lay2), b).a(bl.class, (Consumer<G>) new $$Lambda$rfb$mwWR_9LG8JEjW9eQWGNWVV7BONA<G>(lay2), b).a(bk.class, (Consumer<G>) new $$Lambda$rfb$ZsysJKtIbNY2bc5yhePQiIZ6z7Q<G>(lal), b).a(aw.class, (Consumer<G>) new $$Lambda$rfb$PmvHRGYYA4HlmjskrbkHA7vZo<G>(ren), b).a(bd.class, (Action) new $$Lambda$rfb$739f8jXAQSEIcIIdWXlYKJttKI8(ren), b).a(ay.class, (Consumer<G>) new $$Lambda$rfb$2cf3_IgARZVvjspTfJlzp0ynp0E<G>(ren), b).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$rfb$ZdSeOoOTtxzBYJwoHmHLFrJJDTI<G,E>(b, vcb2)).a(am.class, (ObservableTransformer<G, E>) new $$Lambda$rfb$IFnxIuhGF1v0V5J_lSVLfB1xftE<G,E>(b, musicPagesFiltering2)).a(av.class, (Consumer<G>) new $$Lambda$rfb$vVIKh7N7AQFS2dKzCo7tfDdj80<G>(vcb2), b).a(au.class, (Consumer<G>) new $$Lambda$rfb$i_v6xzy2byKgKVIDmBmG3Yb4hvM<G>(musicPagesFiltering2), b).a(an.class, (ObservableTransformer<G, E>) new $$Lambda$rfb$9PWCK0YrwWvbqOwukPJ8OQoek<G,E>(rha2, b)).a(ba.class, (Consumer<G>) new $$Lambda$rfb$M_NuwwL4SwMFR7BofVIDFkmlsvw<G>(rha2), b).a(ao.class, (Consumer<G>) new $$Lambda$rfb$hdB1Evpi8CHdtHM7qXrdP8QOREA<G>(ren), b).a(bf.class, (Consumer<G>) new $$Lambda$rfb$_JLE310YQIiqpkYBdiTz7Fmjli8<G>(rgw2), b).a(bi.class, (ObservableTransformer<G, E>) new $$Lambda$rfb$Oy6WvjmKL3O4I5ln3OcL0R2sFQE<G,E>(rda, b)).a(at.class, (Consumer<G>) new $$Lambda$rfb$Y81Sm2oY1QzagWLedbMnfNqOk<G>(ren), b).a(ax.class, (Consumer<G>) new $$Lambda$rfb$HOtadOp86kVIqAGFYuReVCY51dU<G>(ren), b).a(as.class, (Consumer<G>) new $$Lambda$rfb$xwQssddvLXtXhNRJYmr2MocqgGI<G>(ren), b).a(ar.class, (Consumer<G>) new $$Lambda$rfb$1CmXds0INZMhqOR7qPwtUNuu9Eo<G>(ren), b).a(al.class, (Consumer<G>) new $$Lambda$rfb$aIjGw1s_dM2kuzClTGCjoR8Kpfk<G>(ren), b).a(az.class, (Consumer<G>) new $$Lambda$rfb$MwIFxRPhy4gl9dy51VDJT3VakHs<G>(ren), b).a(b.class, (Consumer<G>) new $$Lambda$rfb$SlgbXmWcucA1VUyMHWSr5IHKLXY<G>(rdu), b).a(be.class, (Consumer<G>) new $$Lambda$rfb$n_I5I_uI8SjyQ7oHDXTFMoj0vm4<G>(rid), b).a(bj.class, (Consumer<G>) new $$Lambda$rfb$3fZ1D5NJDmPtASOnRzZI5InSLfo<G>(rfv), b).a(bb.class, (Consumer<G>) new $$Lambda$rfb$K8fk45W99hR_9EbUD5u_caTeLw<G>(ren), b).a(a.class, (Consumer<G>) new $$Lambda$rfb$RTCuPEPbgQUyQLtcy98lMCZLn0<G>(ren), b).a(s.class, musicPagesLogger.g()).a(t.class, musicPagesLogger.h()).a(e.class, musicPagesLogger.i()).a(u.class, musicPagesLogger.t()).a(v.class, musicPagesLogger.u()).a(j.class, musicPagesLogger.k()).a(k.class, musicPagesLogger.l()).a(q.class, musicPagesLogger.m()).a(r.class, musicPagesLogger.n()).a(ad.class, musicPagesLogger.o()).a(h.class, musicPagesLogger.p()).a(p.class, musicPagesLogger.q()).a(f.class, musicPagesLogger.r()).a(g.class, musicPagesLogger.s()).a(z.class, musicPagesLogger.x()).a(y.class, musicPagesLogger.y()).a(ab.class, musicPagesLogger.A()).a(aa.class, musicPagesLogger.B()).a(ac.class, musicPagesLogger.z()).a(x.class, musicPagesLogger.v()).a(m.class, (Consumer<G>) new $$Lambda$rfb$QjDKLkNMuMV66as_1zxabDnqCtE<G>(offliningLogger, musicPagesLogger)).a(o.class, musicPagesLogger.C()).a(i.class, musicPagesLogger.E()).a(n.class, musicPagesLogger.F()).a(d.class, musicPagesLogger.j()).a(l.class, musicPagesLogger.w()).a(w.class, musicPagesLogger.D()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rey a(vcb vcb, c cVar) {
        return new ab(vcb.a(jva.a(cVar.a), cVar.b, cVar.c));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(OffliningLogger offliningLogger, MusicPagesLogger musicPagesLogger, m mVar) {
        offliningLogger.a(mVar.b, SourceElement.HEADER_TOGGLE, mVar.a);
        musicPagesLogger.a((String) null, SectionId.DOWNLOAD_TOGGLE, 0, InteractionType.HIT, mVar.a ? UserIntent.DOWNLOAD : UserIntent.REMOVE_DOWNLOADS);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(lal lal, bk bkVar) {
        if (bkVar.c) {
            lal.a(bkVar.a, bkVar.b, true);
        } else {
            lal.b(bkVar.a, bkVar.b, true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(lay lay, bh bhVar) {
        if (bhVar.b) {
            lay.a(bhVar.a, "");
        } else {
            lay.a(bhVar.a);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(lay lay, bl blVar) {
        if (blVar.c) {
            lay.a(blVar.a, blVar.b);
        } else {
            lay.a(blVar.a);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(rbo rbo, ae aeVar) {
        String str = aeVar.a;
        rbo.a.a(szk.a(str).b(aeVar.b).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(rgw rgw, aq aqVar) {
        MusicItem musicItem = aqVar.a;
        String str = aqVar.b;
        vca vca = aqVar.c;
        Map singletonMap = Collections.singletonMap("context_description", str);
        rgy rgy = rgw.a;
        Builder builder = new Builder();
        if (musicItem != null && musicItem.v()) {
            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, musicItem.j(), 0);
            builder.skipTo(playOptionsSkipTo);
        }
        if (vca.a() != null) {
            rgy.a.c = vca.a();
        }
        rgy.a.a(builder.build(), rgy.b, singletonMap);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(defpackage.rgw r7, defpackage.rex.bf r8) {
        /*
            rdi r0 = r8.a
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
            sso r7 = r7.c
            java.lang.String r7 = r7.toString()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r7 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext.create(r7, r4, r8)
            r3.play(r7, r1)
            return
        L_0x0093:
            rgy r7 = r7.a
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.playerOptionsOverride(r1, r3, r3)
            irb r1 = r7.a
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r0 = r0.build()
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.b
            r1.a(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfb.a(rgw, rex$bf):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(rid rid, be beVar) {
        int i = beVar.a;
        SpotifyIconV2 spotifyIconV2 = beVar.b;
        if (!jus.b(rid.d.a.d())) {
            rid.b.a(uzy.a(rid.a.getString(i), 3000).c(R.color.white).b(R.color.black).a());
            return;
        }
        rid.c.a(spotifyIconV2, i, 0);
    }
}
