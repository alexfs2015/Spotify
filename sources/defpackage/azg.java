package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;

/* renamed from: azg reason: default package */
public final class azg implements azj {
    private static Pair<atk, Boolean> a(atk atk) {
        return new Pair<>(atk, Boolean.valueOf((atk instanceof avk) || (atk instanceof avi) || (atk instanceof auh)));
    }

    private static awh a(aqv aqv, List<aqv> list, bek bek) {
        int i;
        if (list != null) {
            i = 48;
        } else {
            list = Collections.singletonList(aqv.a(null, "application/cea-608", 0, null));
            i = 16;
        }
        String str = aqv.d;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(bdx.e(str))) {
                i |= 2;
            }
            if (!"video/avc".equals(bdx.d(str))) {
                i |= 4;
            }
        }
        return new awh(2, bek, new avm(i, list));
    }

    /* JADX INFO: finally extract failed */
    private static boolean a(atk atk, atl atl) {
        try {
            boolean a = atk.a(atl);
            atl.a();
            return a;
        } catch (EOFException unused) {
            atl.a();
            return false;
        } catch (Throwable th) {
            atl.a();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [azr] */
    /* JADX WARNING: type inference failed for: r0v13, types: [avi] */
    /* JADX WARNING: type inference failed for: r0v16, types: [awh] */
    /* JADX WARNING: type inference failed for: r0v17, types: [auh] */
    /* JADX WARNING: type inference failed for: r0v18, types: [avk] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<defpackage.atk, java.lang.Boolean> a(defpackage.atk r15, android.net.Uri r16, defpackage.aqv r17, java.util.List<defpackage.aqv> r18, defpackage.ast r19, defpackage.bek r20, defpackage.atl r21) {
        /*
            r14 = this;
            r0 = r15
            r1 = r17
            r2 = r18
            r9 = r20
            r10 = r21
            if (r0 == 0) goto L_0x006f
            boolean r2 = r0 instanceof defpackage.awh
            if (r2 != 0) goto L_0x006a
            boolean r2 = r0 instanceof defpackage.auo
            if (r2 == 0) goto L_0x0014
            goto L_0x006a
        L_0x0014:
            boolean r2 = r0 instanceof defpackage.azr
            if (r2 == 0) goto L_0x0024
            azr r0 = new azr
            java.lang.String r1 = r1.w
            r0.<init>(r1, r9)
            android.util.Pair r0 = a(r0)
            return r0
        L_0x0024:
            boolean r1 = r0 instanceof defpackage.avk
            if (r1 == 0) goto L_0x0032
            avk r0 = new avk
            r0.<init>()
            android.util.Pair r0 = a(r0)
            return r0
        L_0x0032:
            boolean r1 = r0 instanceof defpackage.avi
            if (r1 == 0) goto L_0x0040
            avi r0 = new avi
            r0.<init>()
            android.util.Pair r0 = a(r0)
            return r0
        L_0x0040:
            boolean r1 = r0 instanceof defpackage.auh
            if (r1 == 0) goto L_0x004e
            auh r0 = new auh
            r0.<init>()
            android.util.Pair r0 = a(r0)
            return r0
        L_0x004e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected previousExtractor type: "
            r2.<init>(r3)
            java.lang.Class r0 = r15.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006a:
            android.util.Pair r0 = a(r15)
            return r0
        L_0x006f:
            java.lang.String r0 = r16.getLastPathSegment()
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = ""
        L_0x0077:
            java.lang.String r3 = r1.f
            java.lang.String r4 = "text/vtt"
            boolean r3 = r4.equals(r3)
            r11 = 0
            r13 = 0
            if (r3 != 0) goto L_0x0108
            java.lang.String r3 = ".webvtt"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x0108
            java.lang.String r3 = ".vtt"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x0096
            goto L_0x0108
        L_0x0096:
            java.lang.String r3 = ".aac"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x00a5
            avk r0 = new avk
            r0.<init>()
            goto L_0x010f
        L_0x00a5:
            java.lang.String r3 = ".ac3"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x0102
            java.lang.String r3 = ".ec3"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x00b6
            goto L_0x0102
        L_0x00b6:
            java.lang.String r3 = ".mp3"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x00c4
            auh r0 = new auh
            r0.<init>(r13, r11)
            goto L_0x010f
        L_0x00c4:
            java.lang.String r3 = ".mp4"
            boolean r4 = r0.endsWith(r3)
            if (r4 != 0) goto L_0x00ec
            int r4 = r0.length()
            int r4 = r4 + -4
            java.lang.String r5 = ".m4"
            boolean r4 = r0.startsWith(r5, r4)
            if (r4 != 0) goto L_0x00ec
            int r4 = r0.length()
            int r4 = r4 + -5
            boolean r0 = r0.startsWith(r3, r4)
            if (r0 == 0) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            awh r0 = a(r1, r2, r9)
            goto L_0x010f
        L_0x00ec:
            auo r0 = new auo
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x00f4
            r8 = r2
            goto L_0x00f9
        L_0x00f4:
            java.util.List r3 = java.util.Collections.emptyList()
            r8 = r3
        L_0x00f9:
            r3 = r0
            r5 = r20
            r7 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x010f
        L_0x0102:
            avi r0 = new avi
            r0.<init>()
            goto L_0x010f
        L_0x0108:
            azr r0 = new azr
            java.lang.String r3 = r1.w
            r0.<init>(r3, r9)
        L_0x010f:
            r21.a()
            boolean r3 = a(r0, r10)
            if (r3 == 0) goto L_0x011d
            android.util.Pair r0 = a(r0)
            return r0
        L_0x011d:
            boolean r3 = r0 instanceof defpackage.azr
            if (r3 != 0) goto L_0x0133
            azr r3 = new azr
            java.lang.String r4 = r1.w
            r3.<init>(r4, r9)
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x0133
            android.util.Pair r0 = a(r3)
            return r0
        L_0x0133:
            boolean r3 = r0 instanceof defpackage.avk
            if (r3 != 0) goto L_0x0147
            avk r3 = new avk
            r3.<init>()
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x0147
            android.util.Pair r0 = a(r3)
            return r0
        L_0x0147:
            boolean r3 = r0 instanceof defpackage.avi
            if (r3 != 0) goto L_0x015b
            avi r3 = new avi
            r3.<init>()
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x015b
            android.util.Pair r0 = a(r3)
            return r0
        L_0x015b:
            boolean r3 = r0 instanceof defpackage.auh
            if (r3 != 0) goto L_0x016f
            auh r3 = new auh
            r3.<init>(r13, r11)
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x016f
            android.util.Pair r0 = a(r3)
            return r0
        L_0x016f:
            boolean r3 = r0 instanceof defpackage.auo
            if (r3 != 0) goto L_0x0193
            auo r11 = new auo
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x017b
            r8 = r2
            goto L_0x0180
        L_0x017b:
            java.util.List r3 = java.util.Collections.emptyList()
            r8 = r3
        L_0x0180:
            r3 = r11
            r5 = r20
            r7 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r3 = a(r11, r10)
            if (r3 == 0) goto L_0x0193
            android.util.Pair r0 = a(r11)
            return r0
        L_0x0193:
            boolean r3 = r0 instanceof defpackage.awh
            if (r3 != 0) goto L_0x01a6
            awh r1 = a(r1, r2, r9)
            boolean r2 = a(r1, r10)
            if (r2 == 0) goto L_0x01a6
            android.util.Pair r0 = a(r1)
            return r0
        L_0x01a6:
            android.util.Pair r0 = a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azg.a(atk, android.net.Uri, aqv, java.util.List, ast, bek, atl):android.util.Pair");
    }
}
