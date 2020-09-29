package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: sfo reason: default package */
public final class sfo implements sfn {
    private final sbf a;
    private final Function<rzv, gzz> b;

    public sfo(sbf sbf, Function<rzv, gzz> function) {
        this.a = sbf;
        this.b = function;
    }

    public final Single<sgg<gzz>> a(sgh sgh) {
        String str;
        if (sgh.c()) {
            return Single.b(sgg.c());
        }
        boolean z = sgh instanceof sgl;
        if (z) {
            str = ((sgl) sgh).c;
        } else {
            StringBuilder sb = new StringBuilder("Request is not a drilldown request to parse the drilldown path: ");
            sb.append(sgh);
            Assertion.b(sb.toString());
            str = "";
        }
        Optional<Integer> e = Optional.e();
        if (z) {
            e = ((sgl) sgh).d;
        } else {
            StringBuilder sb2 = new StringBuilder("Request is not a drilldown request to parse the next offset: ");
            sb2.append(sgh);
            Assertion.b(sb2.toString());
        }
        return this.a.c(sgh.b(), str, sgh.a()).f(new $$Lambda$sfo$PBSo2gyXRAK2eAZShWhYCSPmxc(sgh, str, e)).f(this.b).f(new $$Lambda$sfo$P21nmifKddewW2IB1a3sq3NwSIw(sgh));
    }

    /* access modifiers changed from: private */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.rzv a(defpackage.sgh r6, java.lang.String r7, com.google.common.base.Optional r8, com.spotify.searchview.proto.DrillDownViewResponse r9) {
        /*
            java.lang.String r1 = r6.d()
            sgd r6 = r6.a
            sgc r6 = r6.a
            java.lang.String r2 = r6.b()
            int r6 = r7.hashCode()
            switch(r6) {
                case -1865828127: goto L_0x0065;
                case -1415163932: goto L_0x005b;
                case -1249499312: goto L_0x0051;
                case -1002263574: goto L_0x0046;
                case -865716088: goto L_0x003c;
                case -732362228: goto L_0x0032;
                case 109413654: goto L_0x0028;
                case 1567481600: goto L_0x001e;
                case 1664968622: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x006f
        L_0x0014:
            java.lang.String r6 = "audioepisodes"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 7
            goto L_0x0070
        L_0x001e:
            java.lang.String r6 = "audioshows"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 5
            goto L_0x0070
        L_0x0028:
            java.lang.String r6 = "shows"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 6
            goto L_0x0070
        L_0x0032:
            java.lang.String r6 = "artists"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 0
            goto L_0x0070
        L_0x003c:
            java.lang.String r6 = "tracks"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 1
            goto L_0x0070
        L_0x0046:
            java.lang.String r6 = "profiles"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 8
            goto L_0x0070
        L_0x0051:
            java.lang.String r6 = "genres"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 4
            goto L_0x0070
        L_0x005b:
            java.lang.String r6 = "albums"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 2
            goto L_0x0070
        L_0x0065:
            java.lang.String r6 = "playlists"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 3
            goto L_0x0070
        L_0x006f:
            r6 = -1
        L_0x0070:
            switch(r6) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0089;
                case 2: goto L_0x0086;
                case 3: goto L_0x0083;
                case 4: goto L_0x0080;
                case 5: goto L_0x007d;
                case 6: goto L_0x007d;
                case 7: goto L_0x007a;
                case 8: goto L_0x0077;
                default: goto L_0x0073;
            }
        L_0x0073:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_UNKNOWN
        L_0x0075:
            r3 = r6
            goto L_0x008f
        L_0x0077:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_PROFILE
            goto L_0x0075
        L_0x007a:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_AUDIO_EPISODE
            goto L_0x0075
        L_0x007d:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_AUDIO_SHOW
            goto L_0x0075
        L_0x0080:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_GENRE
            goto L_0x0075
        L_0x0083:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_PLAYLIST
            goto L_0x0075
        L_0x0086:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_ALBUM
            goto L_0x0075
        L_0x0089:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_TRACK
            goto L_0x0075
        L_0x008c:
            com.spotify.searchview.proto.EntityType r6 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_ARTIST
            goto L_0x0075
        L_0x008f:
            rzk r6 = new rzk
            r0 = r6
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfo.a(sgh, java.lang.String, com.google.common.base.Optional, com.spotify.searchview.proto.DrillDownViewResponse):rzv");
    }
}
