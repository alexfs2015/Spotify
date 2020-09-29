package defpackage;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import java.util.concurrent.TimeUnit;

/* renamed from: ozz reason: default package */
public final class ozz {
    private final tmy a;
    private final boolean b;

    private static String a(String str, String str2, boolean z, boolean z2) {
        if (z) {
            return str;
        }
        if (z2) {
            return str2;
        }
        return null;
    }

    public ozz(tmy tmy, boolean z) {
        this.a = tmy;
        this.b = z;
    }

    public final pci a(uys uys, tms tms) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        tms tms2 = tms;
        Show t = uys.t();
        String str5 = "";
        String str6 = null;
        if (t != null) {
            String trim = t.a().trim();
            Covers b2 = t.b();
            if (b2 != null) {
                str6 = b2.getLargeUri();
            }
            String uri = t.getUri();
            str = b(uys.b(), t.b());
            str4 = trim;
            str3 = str6;
            str2 = uri;
        } else {
            str = b(uys.b(), null);
            str4 = str5;
            str2 = str4;
            str3 = null;
        }
        int m = uys.m();
        if ((tms2 instanceof b) || (tms2 instanceof a)) {
            int m2 = uys.m();
            Integer n = uys.n();
            if (n != null) {
                i = n.intValue();
            } else {
                i = 0;
            }
            i2 = m2 - i;
        } else {
            c cVar = (c) tms2;
            long j = cVar.d - cVar.c;
            i2 = (int) TimeUnit.MILLISECONDS.toSeconds(cVar.c);
            i = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        }
        int[] iArr = {i, i2};
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z = (tms2 instanceof c) && ((c) tms2).b;
        String a2 = this.a.a(str4, uys.s(), m, Integer.valueOf(i3), uys.o()).a(true).c(z).a();
        int a3 = tmx.a(uys.o(), z, m, i3);
        String trim2 = uys.a().trim();
        String str7 = trim2;
        String str8 = a2;
        pcc pcc = new pcc(a3, str7, str8, i4, m, str4, trim2, str3, str2, uys.getUri(), this.b, str, uys.v(), a(uys.u()), uys.i());
        return pcc;
    }

    public final paj a(uys uys, gzz gzz) {
        String str;
        String str2;
        String str3;
        String str4;
        ozz ozz;
        Show t = uys.t();
        Covers b2 = uys.b();
        String str5 = "";
        if (t != null) {
            String a2 = a(b2, t.b());
            String b3 = b(b2, t.b());
            String uri = t.getUri();
            str2 = t.a().trim();
            str = b3;
            str4 = a2;
            str3 = uri;
            ozz = this;
        } else {
            String a3 = a(b2, (Covers) null);
            ozz = this;
            str = b(b2, null);
            str3 = str5;
            str2 = str3;
            str4 = a3;
        }
        String a4 = ozz.a.a(str2, uys.s(), uys.m(), null, false).a(true).d(true).a();
        String trim = uys.d().trim();
        String trim2 = uys.a().trim();
        int a5 = a(uys.u());
        long millis = TimeUnit.SECONDS.toMillis((long) uys.m());
        pai pai = new pai(trim, uys.getUri(), trim2, a4, str4, a5, uys.u(), str3, str2, str, uys.i(), millis, gzz);
        return pai;
    }

    private static String a(Covers covers, Covers covers2) {
        if (covers == null) {
            return null;
        }
        String largeUri = covers.getLargeUri();
        String uri = covers.getUri();
        if (covers2 != null) {
            return a(largeUri, uri, a(largeUri, covers2.getLargeUri()), a(uri, covers2.getUri()));
        }
        return a(largeUri, uri, largeUri != null && !largeUri.isEmpty(), true ^ uri.isEmpty());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (defpackage.fax.a(r3) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(com.spotify.playlist.models.Covers r2, com.spotify.playlist.models.Covers r3) {
        /*
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x000e
            java.lang.String r3 = r3.getLargeUri()
            boolean r1 = defpackage.fax.a(r3)
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.getLargeUri()
            boolean r1 = defpackage.fax.a(r2)
            if (r1 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            boolean r2 = defpackage.fax.a(r0)
            if (r2 == 0) goto L_0x0024
            return r3
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozz.b(com.spotify.playlist.models.Covers, com.spotify.playlist.models.Covers):java.lang.String");
    }

    private static int a(uzf uzf) {
        return ((Integer) uzf.a((gct<f, R_>) $$Lambda$ozz$R5eQGj42UeTDOVdc05DD6P2neA.INSTANCE, (gct<h, R_>) $$Lambda$ozz$EPdR9B7KMYn9584nz9e17cDFyM.INSTANCE, (gct<b, R_>) $$Lambda$ozz$q35L4nRyZInoyIhUV2myk_JqaQs.INSTANCE, (gct<a, R_>) $$Lambda$ozz$6gW__d3QLLlZ2KqQlCQwp2144gw.INSTANCE, (gct<c, R_>) $$Lambda$ozz$gJLEb5UVbNrm51EgLOUTV9Rcx9w.INSTANCE, (gct<e, R_>) $$Lambda$ozz$eukOSHa32WmPunawv7rPiwIaCZA.INSTANCE, (gct<d, R_>) $$Lambda$ozz$eWh44QJcFDt_g8NnhvJQTahWDo8.INSTANCE, (gct<g, R_>) $$Lambda$ozz$h4FfZkcYwq2lMan7JbJRsQDc9Fo.INSTANCE)).intValue();
    }

    private static boolean a(String str, String str2) {
        return str != null && !str.isEmpty() && str2 != null && !str.equals(str2);
    }
}
