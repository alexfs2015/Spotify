package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.music.podcastentityrow.PlaySourceProvider;
import com.spotify.music.podcastentityrow.PlaySourceProvider.Source;

/* renamed from: txo reason: default package */
public final class txo implements txn {
    private final Context a;
    private final jor<ufx> b;
    private final uia c;
    private final txq d;
    private final ufg e;
    private final uil f;
    private final PlaySourceProvider g;
    private final sso h;

    public txo(Context context, jor<ufx> jor, uia uia, txq txq, ufg ufg, uil uil, PlaySourceProvider playSourceProvider, sso sso) {
        this.a = context;
        this.b = jor;
        this.c = uia;
        this.d = txq;
        this.e = ufg;
        this.f = uil;
        this.g = playSourceProvider;
        this.h = sso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, int i, View view) {
        jok.a(this.a, this.b, ufx.a(vkv, "contextual_episode", i), this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, View view) {
        this.g.a = Source.CONTEXTUAL_EPISODE;
        this.e.a(vkv, new vkv[]{vkv}, "contextual_episode", 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, vkv[] vkvArr, int i, View view) {
        this.g.a = Source.CONTEXTUAL_EPISODE;
        this.e.a(vkv, vkvArr, "contextual_episode", i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if ((r2.b.a == com.spotify.music.podcastentityrow.PlaySourceProvider.Source.CONTEXTUAL_EPISODE) != false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ucs r7, defpackage.vkv r8, defpackage.vkv[] r9) {
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
            txq r2 = r6.d
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
            uig r2 = r2.a
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
            txq r4 = r6.d
            boolean r4 = r4.b(r8)
            r7.c(r4)
            if (r1 >= 0) goto L_0x0066
            -$$Lambda$txo$gr-SlmlCz2MUDOs4l8cFhi7b4NI r9 = new -$$Lambda$txo$gr-SlmlCz2MUDOs4l8cFhi7b4NI
            r9.<init>(r6, r8)
            r7.a(r9)
            goto L_0x006e
        L_0x0066:
            -$$Lambda$txo$sQgx1EyVvLQJ_QBGYeK9sH4-LwM r4 = new -$$Lambda$txo$sQgx1EyVvLQJ_QBGYeK9sH4-LwM
            r4.<init>(r6, r8, r9, r1)
            r7.a(r4)
        L_0x006e:
            java.lang.String r9 = r8.a()
            r7.a(r9)
            uil r9 = r6.f
            java.lang.String r9 = r9.a(r3, r8, r2, r0)
            r7.b(r9)
            -$$Lambda$txo$NPzrT8Sn5iUDG_oeulxmVy-ltFY r9 = new -$$Lambda$txo$NPzrT8Sn5iUDG_oeulxmVy-ltFY
            r9.<init>(r6, r8, r1)
            r7.b(r9)
            defpackage.uia.b(r7, r8)
            defpackage.uia.a(r7, r8, r5)
            uia r9 = r6.c
            r9.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txo.a(ucs, vkv, vkv[]):void");
    }
}
