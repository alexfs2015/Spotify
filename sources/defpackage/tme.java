package defpackage;

import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: tme reason: default package */
public final class tme implements twc {
    final twd a;
    final PlaySourceProvider b;
    public uzt c;
    private final boolean d;

    public tme(twd twd, PlaySourceProvider playSourceProvider, boolean z) {
        this.a = twd;
        this.b = playSourceProvider;
        this.d = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (((r0 == null || r0.getEpisode() == null || r5.getUri().equals(r4.c.getEpisode().getUri())) ? false : true) != false) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.uys r5) {
        /*
            r4 = this;
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x005d
            uzt r0 = r4.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            uys r0 = r0.getEpisode()
            if (r0 != 0) goto L_0x001a
        L_0x0010:
            twd r0 = r4.a
            boolean r0 = r0.d(r5)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x005c
            com.spotify.music.podcastentityrow.PlaySourceProvider r0 = r4.b
            com.spotify.music.podcastentityrow.PlaySourceProvider$Source r0 = r0.a
            com.spotify.music.podcastentityrow.PlaySourceProvider$Source r3 = com.spotify.music.podcastentityrow.PlaySourceProvider.Source.EPISODE_LIST
            if (r0 != r3) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 != 0) goto L_0x004d
            uzt r0 = r4.c
            if (r0 == 0) goto L_0x004a
            uys r0 = r0.getEpisode()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r5.getUri()
            uzt r3 = r4.c
            uys r3 = r3.getEpisode()
            java.lang.String r3 = r3.getUri()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x0057
        L_0x004d:
            twd r0 = r4.a
            boolean r5 = r0.d(r5)
            if (r5 == 0) goto L_0x0057
            r5 = 1
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            if (r5 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            return r2
        L_0x005c:
            return r1
        L_0x005d:
            twd r0 = r4.a
            boolean r5 = r0.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tme.a(uys):boolean");
    }

    public final boolean b(uys uys) {
        return this.a.b(uys);
    }

    public final void a(String str, boolean z) {
        this.a.a(str, z);
    }

    public final void a(int i) {
        this.a.a = i;
    }

    public final int a() {
        return this.a.a;
    }

    public final boolean c(uys uys) {
        return this.a.c(uys);
    }
}
