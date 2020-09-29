package defpackage;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import java.util.concurrent.TimeUnit;

/* renamed from: phi reason: default package */
public final class phi {
    private final tyx a;
    private final tyt b;
    private final boolean c;

    public phi(tyx tyx, tyt tyt, boolean z) {
        this.a = tyx;
        this.b = tyt;
        this.c = z;
    }

    private static int a(vli vli) {
        return ((Integer) vli.a((gee<f, R_>) $$Lambda$phi$45BXAmXo1RN0fVJ2tAboQgLmVVM.INSTANCE, (gee<h, R_>) $$Lambda$phi$Hf9qxR3viH1DePulzIancHgrZSQ.INSTANCE, (gee<b, R_>) $$Lambda$phi$abJndQPyelHhjufNdRjpPd6yc4Q.INSTANCE, (gee<a, R_>) $$Lambda$phi$sZOk1TZvYa6_ozxoU2sxAY2tClc.INSTANCE, (gee<c, R_>) $$Lambda$phi$PRTQpl8jNBRhH6NGCw93xmiuLb4.INSTANCE, (gee<e, R_>) $$Lambda$phi$H9NDdj78ctjcygmcNDno7A_zM.INSTANCE, (gee<d, R_>) $$Lambda$phi$yNc4bRGczjnU1rGh34It7D8InA.INSTANCE, (gee<g, R_>) $$Lambda$phi$xrrJu55_hfwTkYs_51WoMiNBiw.INSTANCE)).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (defpackage.fbo.a(r3) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(com.spotify.playlist.models.Covers r2, com.spotify.playlist.models.Covers r3) {
        /*
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x000e
            java.lang.String r3 = r3.getLargeUri()
            boolean r1 = defpackage.fbo.a(r3)
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.getLargeUri()
            boolean r1 = defpackage.fbo.a(r2)
            if (r1 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            boolean r2 = defpackage.fbo.a(r0)
            if (r2 == 0) goto L_0x0024
            return r3
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phi.a(com.spotify.playlist.models.Covers, com.spotify.playlist.models.Covers):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r4 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r6 != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.phs a(defpackage.vkv r21, defpackage.hcs r22, defpackage.hcs r23) {
        /*
            r20 = this;
            com.spotify.playlist.models.Show r0 = r21.t()
            com.spotify.playlist.models.Covers r1 = r21.b()
            java.lang.String r2 = ""
            r3 = 0
            if (r0 == 0) goto L_0x0025
            com.spotify.playlist.models.Covers r2 = r0.b()
            java.lang.String r1 = a(r1, r2)
            java.lang.String r2 = r0.getUri()
            java.lang.String r0 = r0.a()
            java.lang.String r0 = r0.trim()
            r13 = r0
            r14 = r1
            r12 = r2
            goto L_0x002c
        L_0x0025:
            java.lang.String r1 = a(r1, r3)
            r14 = r1
            r12 = r2
            r13 = r12
        L_0x002c:
            com.spotify.playlist.models.Covers r0 = r21.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0083
            com.spotify.playlist.models.Show r4 = r21.t()
            if (r4 == 0) goto L_0x0062
            com.spotify.playlist.models.Covers r4 = r4.b()
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = r0.getLargeUri()
            java.lang.String r0 = r0.getUri()
            java.lang.String r6 = r4.getLargeUri()
            java.lang.String r4 = r4.getUri()
            boolean r6 = defpackage.tyt.a(r5, r6)
            boolean r4 = defpackage.tyt.a(r0, r4)
            if (r6 == 0) goto L_0x005e
            r0 = r20
            r3 = r5
            goto L_0x0085
        L_0x005e:
            if (r4 == 0) goto L_0x0083
        L_0x0060:
            r3 = r0
            goto L_0x0083
        L_0x0062:
            java.lang.String r4 = r0.getLargeUri()
            java.lang.String r0 = r0.getUri()
            if (r4 == 0) goto L_0x0074
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            boolean r6 = r0.isEmpty()
            r6 = r6 ^ r2
            if (r5 == 0) goto L_0x0080
            r0 = r20
            r3 = r4
            goto L_0x0085
        L_0x0080:
            if (r6 == 0) goto L_0x0083
            goto L_0x0060
        L_0x0083:
            r0 = r20
        L_0x0085:
            tyx r4 = r0.a
            int r6 = r21.s()
            int r7 = r21.m()
            r8 = 0
            r9 = 0
            r5 = r13
            tyx$b r4 = r4.a(r5, r6, r7, r8, r9)
            tyx$b r4 = r4.a(r2)
            tyx$b r2 = r4.d(r2)
            java.lang.String r8 = r2.a()
            java.lang.String r2 = r21.d()
            java.lang.String r5 = r2.trim()
            java.lang.String r2 = r21.a()
            java.lang.String r7 = r2.trim()
            vli r2 = r21.u()
            int r10 = a(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r4 = r21.m()
            r16 = r14
            long r14 = (long) r4
            long r17 = r2.toMillis(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            if (r23 == 0) goto L_0x00df
            java.util.List r1 = r23.body()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00df
            java.util.List r1 = r23.body()
            r2.addAll(r1)
        L_0x00df:
            java.lang.String r6 = r21.getUri()
            vli r11 = r21.u()
            boolean r15 = r21.i()
            phr r1 = new phr
            r4 = r1
            r9 = r3
            r14 = r16
            r16 = r17
            r18 = r22
            r19 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phi.a(vkv, hcs, hcs):phs");
    }

    public final pjr a(vkv vkv, tyn tyn) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        tyn tyn2 = tyn;
        Show t = vkv.t();
        String str5 = "";
        String str6 = null;
        if (t != null) {
            String trim = t.a().trim();
            Covers b2 = t.b();
            if (b2 != null) {
                str6 = b2.getLargeUri();
            }
            String uri = t.getUri();
            str = a(vkv.b(), t.b());
            str4 = trim;
            str3 = str6;
            str2 = uri;
        } else {
            str = a(vkv.b(), (Covers) null);
            str4 = str5;
            str2 = str4;
            str3 = null;
        }
        int m = vkv.m();
        if ((tyn2 instanceof b) || (tyn2 instanceof a)) {
            int m2 = vkv.m();
            Integer n = vkv.n();
            i = n != null ? n.intValue() : 0;
            i2 = m2 - i;
        } else {
            c cVar = (c) tyn2;
            long j = cVar.d - cVar.c;
            i2 = (int) TimeUnit.MILLISECONDS.toSeconds(cVar.c);
            i = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        }
        int[] iArr = {i, i2};
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z = (tyn2 instanceof c) && ((c) tyn2).b;
        String a2 = this.a.a(str4, vkv.s(), m, Integer.valueOf(i3), vkv.o()).a(true).c(z).a();
        int a3 = tyw.a(vkv.o(), z, m, i3);
        String trim2 = vkv.a().trim();
        pjl pjl = new pjl(a3, trim2, a2, i4, m, str4, trim2, str3, str2, vkv.getUri(), this.c, str, vkv.v(), a(vkv.u()), vkv.i());
        return pjl;
    }
}
