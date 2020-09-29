package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.music.podcastentityrow.PlaySourceProvider;
import com.spotify.music.podcastentityrow.PlaySourceProvider.Source;

/* renamed from: tmc reason: default package */
public final class tmc implements tmb {
    private final Context a;
    private final jmf<ttu> b;
    private final tvx c;
    private final tme d;
    private final ttd e;
    private final twi f;
    private final PlaySourceProvider g;
    private final sih h;

    public tmc(Context context, jmf<ttu> jmf, tvx tvx, tme tme, ttd ttd, twi twi, PlaySourceProvider playSourceProvider, sih sih) {
        this.a = context;
        this.b = jmf;
        this.c = tvx;
        this.d = tme;
        this.e = ttd;
        this.f = twi;
        this.g = playSourceProvider;
        this.h = sih;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, View view) {
        this.g.a = Source.CONTEXTUAL_EPISODE;
        this.e.a(uys, new uys[]{uys}, "contextual_episode", 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, uys[] uysArr, int i, View view) {
        this.g.a = Source.CONTEXTUAL_EPISODE;
        this.e.a(uys, uysArr, "contextual_episode", i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, int i, View view) {
        jly.a(this.a, this.b, ttu.a(uys, "contextual_episode", i), this.h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if ((r2.b.a == com.spotify.music.podcastentityrow.PlaySourceProvider.Source.CONTEXTUAL_EPISODE) != false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.tqp r7, defpackage.uys r8, defpackage.uys[] r9) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r9.length
            if (r1 >= r2) goto L_0x0019
            java.lang.String r2 = r8.getUri()
            r3 = r9[r1]
            java.lang.String r3 = r3.getUri()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0019:
            r1 = -1
        L_0x001a:
            tme r2 = r6.d
            com.spotify.music.podcastentityrow.PlaySourceProvider r3 = r2.b
            com.spotify.music.podcastentityrow.PlaySourceProvider$Source r3 = r3.a
            com.spotify.music.podcastentityrow.PlaySourceProvider$Source r4 = com.spotify.music.podcastentityrow.PlaySourceProvider.Source.NO_CLICK
            r5 = 1
            if (r3 == r4) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x0037
            com.spotify.music.podcastentityrow.PlaySourceProvider r3 = r2.b
            com.spotify.music.podcastentityrow.PlaySourceProvider$Source r3 = r3.a
            com.spotify.music.podcastentityrow.PlaySourceProvider$Source r4 = com.spotify.music.podcastentityrow.PlaySourceProvider.Source.CONTEXTUAL_EPISODE
            if (r3 != r4) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x0041
        L_0x0037:
            twd r2 = r2.a
            boolean r2 = r2.d(r8)
            if (r2 == 0) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            com.spotify.playlist.models.Show r3 = r8.t()
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = r3.a()
            goto L_0x004f
        L_0x004d:
            java.lang.String r3 = ""
        L_0x004f:
            r7.a(r2)
            tme r4 = r6.d
            boolean r4 = r4.b(r8)
            r7.c(r4)
            if (r1 >= 0) goto L_0x0066
            -$$Lambda$tmc$p7U7uBL2k8bT28jUI7KdnskOlv8 r9 = new -$$Lambda$tmc$p7U7uBL2k8bT28jUI7KdnskOlv8
            r9.<init>(r6, r8)
            r7.a(r9)
            goto L_0x006e
        L_0x0066:
            -$$Lambda$tmc$-fFxTTzs27h3VIvuWD4Ar8p9CAY r4 = new -$$Lambda$tmc$-fFxTTzs27h3VIvuWD4Ar8p9CAY
            r4.<init>(r6, r8, r9, r1)
            r7.a(r4)
        L_0x006e:
            java.lang.String r9 = r8.a()
            r7.a(r9)
            twi r9 = r6.f
            java.lang.String r9 = r9.a(r3, r8, r2, r0)
            r7.b(r9)
            -$$Lambda$tmc$ypvhE8IQG9LVv7U4Ocazc5s1AKE r9 = new -$$Lambda$tmc$ypvhE8IQG9LVv7U4Ocazc5s1AKE
            r9.<init>(r6, r8, r1)
            r7.b(r9)
            defpackage.tvx.b(r7, r8)
            defpackage.tvx.a(r7, r8, r5)
            tvx r9 = r6.c
            r9.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmc.a(tqp, uys, uys[]):void");
    }
}
