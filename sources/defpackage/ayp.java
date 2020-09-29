package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;

/* renamed from: ayp reason: default package */
public final class ayp implements ays {
    /* JADX WARNING: type inference failed for: r0v12, types: [aza] */
    /* JADX WARNING: type inference failed for: r0v13, types: [aur] */
    /* JADX WARNING: type inference failed for: r0v16, types: [avq] */
    /* JADX WARNING: type inference failed for: r0v17, types: [atq] */
    /* JADX WARNING: type inference failed for: r0v18, types: [aut] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<defpackage.ast, java.lang.Boolean> a(defpackage.ast r15, android.net.Uri r16, defpackage.aqe r17, java.util.List<defpackage.aqe> r18, defpackage.asc r19, defpackage.bdt r20, defpackage.asu r21) {
        /*
            r14 = this;
            r0 = r15
            r1 = r17
            r2 = r18
            r9 = r20
            r10 = r21
            if (r0 == 0) goto L_0x006f
            boolean r2 = r0 instanceof defpackage.avq
            if (r2 != 0) goto L_0x006a
            boolean r2 = r0 instanceof defpackage.atx
            if (r2 == 0) goto L_0x0014
            goto L_0x006a
        L_0x0014:
            boolean r2 = r0 instanceof defpackage.aza
            if (r2 == 0) goto L_0x0024
            aza r0 = new aza
            java.lang.String r1 = r1.w
            r0.<init>(r1, r9)
            android.util.Pair r0 = a(r0)
            return r0
        L_0x0024:
            boolean r1 = r0 instanceof defpackage.aut
            if (r1 == 0) goto L_0x0032
            aut r0 = new aut
            r0.<init>()
            android.util.Pair r0 = a(r0)
            return r0
        L_0x0032:
            boolean r1 = r0 instanceof defpackage.aur
            if (r1 == 0) goto L_0x0040
            aur r0 = new aur
            r0.<init>()
            android.util.Pair r0 = a(r0)
            return r0
        L_0x0040:
            boolean r1 = r0 instanceof defpackage.atq
            if (r1 == 0) goto L_0x004e
            atq r0 = new atq
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
            aut r0 = new aut
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
            atq r0 = new atq
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
            avq r0 = a(r1, r2, r9)
            goto L_0x010f
        L_0x00ec:
            atx r0 = new atx
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
            aur r0 = new aur
            r0.<init>()
            goto L_0x010f
        L_0x0108:
            aza r0 = new aza
            java.lang.String r3 = r1.w
            r0.<init>(r3, r9)
        L_0x010f:
            r21.a()
            boolean r3 = a(r0, r10)
            if (r3 == 0) goto L_0x011d
            android.util.Pair r0 = a(r0)
            return r0
        L_0x011d:
            boolean r3 = r0 instanceof defpackage.aza
            if (r3 != 0) goto L_0x0133
            aza r3 = new aza
            java.lang.String r4 = r1.w
            r3.<init>(r4, r9)
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x0133
            android.util.Pair r0 = a(r3)
            return r0
        L_0x0133:
            boolean r3 = r0 instanceof defpackage.aut
            if (r3 != 0) goto L_0x0147
            aut r3 = new aut
            r3.<init>()
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x0147
            android.util.Pair r0 = a(r3)
            return r0
        L_0x0147:
            boolean r3 = r0 instanceof defpackage.aur
            if (r3 != 0) goto L_0x015b
            aur r3 = new aur
            r3.<init>()
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x015b
            android.util.Pair r0 = a(r3)
            return r0
        L_0x015b:
            boolean r3 = r0 instanceof defpackage.atq
            if (r3 != 0) goto L_0x016f
            atq r3 = new atq
            r3.<init>(r13, r11)
            boolean r4 = a(r3, r10)
            if (r4 == 0) goto L_0x016f
            android.util.Pair r0 = a(r3)
            return r0
        L_0x016f:
            boolean r3 = r0 instanceof defpackage.atx
            if (r3 != 0) goto L_0x0193
            atx r11 = new atx
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
            boolean r3 = r0 instanceof defpackage.avq
            if (r3 != 0) goto L_0x01a6
            avq r1 = a(r1, r2, r9)
            boolean r2 = a(r1, r10)
            if (r2 == 0) goto L_0x01a6
            android.util.Pair r0 = a(r1)
            return r0
        L_0x01a6:
            android.util.Pair r0 = a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayp.a(ast, android.net.Uri, aqe, java.util.List, asc, bdt, asu):android.util.Pair");
    }

    private static avq a(aqe aqe, List<aqe> list, bdt bdt) {
        int i;
        if (list != null) {
            i = 48;
        } else {
            list = Collections.singletonList(aqe.a(null, "application/cea-608", 0, null));
            i = 16;
        }
        String str = aqe.d;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(bdg.e(str))) {
                i |= 2;
            }
            if (!"video/avc".equals(bdg.d(str))) {
                i |= 4;
            }
        }
        return new avq(2, bdt, new auv(i, list));
    }

    private static Pair<ast, Boolean> a(ast ast) {
        return new Pair<>(ast, Boolean.valueOf((ast instanceof aut) || (ast instanceof aur) || (ast instanceof atq)));
    }

    /* JADX INFO: finally extract failed */
    private static boolean a(ast ast, asu asu) {
        try {
            boolean a = ast.a(asu);
            asu.a();
            return a;
        } catch (EOFException unused) {
            asu.a();
            return false;
        } catch (Throwable th) {
            asu.a();
            throw th;
        }
    }
}
