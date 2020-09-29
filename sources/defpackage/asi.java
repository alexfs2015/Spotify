package defpackage;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.MediaDrm.ProvisionRequest;
import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.Map;
import java.util.UUID;

/* renamed from: asi reason: default package */
public final class asi implements asg<ash> {
    private final UUID a;
    private final MediaDrm b;

    public static asi a(UUID uuid) {
        try {
            return new asi(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    private asi(UUID uuid) {
        bcu.a(uuid);
        bcu.a(!apv.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        this.b = new MediaDrm((bdw.a >= 27 || !apv.c.equals(uuid)) ? uuid : apv.b);
        if (apv.d.equals(uuid)) {
            if ("ASUS_Z00AD".equals(bdw.d)) {
                this.b.setPropertyString("securityLevel", "L3");
            }
        }
    }

    public final void a(b<? super ash> bVar) {
        this.b.setOnEventListener(new $$Lambda$asi$DUvoAhjPLooYsJxGfyfnItPUZ4(this, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(bArr, i);
    }

    public final byte[] a() {
        return this.b.openSession();
    }

    public final void a(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f6, code lost:
        if ("AFTM".equals(defpackage.bdw.d) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (r0 != null) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.asg.a a(byte[] r10, java.util.List<defpackage.asc.a> r11, int r12, java.util.HashMap<java.lang.String, java.lang.String> r13) {
        /*
            r9 = this;
            r0 = 0
            if (r11 == 0) goto L_0x015b
            java.util.UUID r1 = r9.a
            java.util.UUID r2 = defpackage.apv.d
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x00b0
            int r1 = defpackage.bdw.a
            r3 = 28
            r4 = 1
            if (r1 < r3) goto L_0x0083
            int r1 = r11.size()
            if (r1 <= r4) goto L_0x0083
            java.lang.Object r1 = r11.get(r2)
            asc$a r1 = (defpackage.asc.a) r1
            r3 = 0
            r5 = 0
        L_0x0023:
            int r6 = r11.size()
            if (r3 >= r6) goto L_0x005f
            java.lang.Object r6 = r11.get(r3)
            asc$a r6 = (defpackage.asc.a) r6
            boolean r7 = r6.d
            boolean r8 = r1.d
            if (r7 != r8) goto L_0x005d
            java.lang.String r7 = r6.b
            java.lang.String r8 = r1.b
            boolean r7 = defpackage.bdw.a(r7, r8)
            if (r7 == 0) goto L_0x005d
            java.lang.String r7 = r6.a
            java.lang.String r8 = r1.a
            boolean r7 = defpackage.bdw.a(r7, r8)
            if (r7 == 0) goto L_0x005d
            byte[] r7 = r6.c
            aua$a r7 = defpackage.aua.b(r7)
            if (r7 == 0) goto L_0x0053
            r7 = 1
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            if (r7 == 0) goto L_0x005d
            byte[] r6 = r6.c
            int r6 = r6.length
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L_0x0023
        L_0x005d:
            r3 = 0
            goto L_0x0060
        L_0x005f:
            r3 = 1
        L_0x0060:
            if (r3 == 0) goto L_0x0083
            byte[] r3 = new byte[r5]
            r4 = 0
            r5 = 0
        L_0x0066:
            int r6 = r11.size()
            if (r4 >= r6) goto L_0x007e
            java.lang.Object r6 = r11.get(r4)
            asc$a r6 = (defpackage.asc.a) r6
            byte[] r7 = r6.c
            int r7 = r7.length
            byte[] r6 = r6.c
            java.lang.System.arraycopy(r6, r2, r3, r5, r7)
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto L_0x0066
        L_0x007e:
            asc$a r11 = r1.a(r3)
            goto L_0x00b6
        L_0x0083:
            r1 = 0
        L_0x0084:
            int r3 = r11.size()
            if (r1 >= r3) goto L_0x00b0
            java.lang.Object r3 = r11.get(r1)
            asc$a r3 = (defpackage.asc.a) r3
            byte[] r5 = r3.c
            aua$a r5 = defpackage.aua.b(r5)
            if (r5 != 0) goto L_0x009a
            r5 = -1
            goto L_0x009c
        L_0x009a:
            int r5 = r5.b
        L_0x009c:
            int r6 = defpackage.bdw.a
            r7 = 23
            if (r6 >= r7) goto L_0x00a5
            if (r5 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            int r6 = defpackage.bdw.a
            if (r6 < r7) goto L_0x00ad
            if (r5 != r4) goto L_0x00ad
        L_0x00ab:
            r11 = r3
            goto L_0x00b6
        L_0x00ad:
            int r1 = r1 + 1
            goto L_0x0084
        L_0x00b0:
            java.lang.Object r11 = r11.get(r2)
            asc$a r11 = (defpackage.asc.a) r11
        L_0x00b6:
            java.util.UUID r1 = r9.a
            byte[] r2 = r11.c
            int r3 = defpackage.bdw.a
            r4 = 21
            if (r3 >= r4) goto L_0x00c8
            java.util.UUID r3 = defpackage.apv.d
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00f8
        L_0x00c8:
            java.util.UUID r3 = defpackage.apv.e
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = defpackage.bdw.c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = defpackage.bdw.d
            java.lang.String r4 = "AFTB"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00f8
            java.lang.String r3 = defpackage.bdw.d
            java.lang.String r4 = "AFTS"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00f8
            java.lang.String r3 = defpackage.bdw.d
            java.lang.String r4 = "AFTM"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0131
        L_0x00f8:
            aua$a r3 = defpackage.aua.b(r2)
            if (r3 != 0) goto L_0x00ff
            goto L_0x012e
        L_0x00ff:
            if (r1 == 0) goto L_0x012c
            java.util.UUID r4 = r3.a
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x012c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "UUID mismatch. Expected: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = ", got: "
            r4.append(r1)
            java.util.UUID r1 = r3.a
            r4.append(r1)
            java.lang.String r1 = "."
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r3 = "PsshAtomUtil"
            defpackage.bdd.c(r3, r1)
            goto L_0x012e
        L_0x012c:
            byte[] r0 = r3.c
        L_0x012e:
            if (r0 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r0 = r2
        L_0x0132:
            java.util.UUID r1 = r9.a
            java.lang.String r2 = r11.b
            int r3 = defpackage.bdw.a
            r4 = 26
            if (r3 >= r4) goto L_0x0157
            java.util.UUID r3 = defpackage.apv.c
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0157
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0154
            java.lang.String r1 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0157
        L_0x0154:
            java.lang.String r1 = "cenc"
            goto L_0x0158
        L_0x0157:
            r1 = r2
        L_0x0158:
            r4 = r0
            r5 = r1
            goto L_0x015e
        L_0x015b:
            r11 = r0
            r4 = r11
            r5 = r4
        L_0x015e:
            android.media.MediaDrm r2 = r9.b
            r3 = r10
            r6 = r12
            r7 = r13
            android.media.MediaDrm$KeyRequest r10 = r2.getKeyRequest(r3, r4, r5, r6, r7)
            java.util.UUID r12 = r9.a
            byte[] r13 = r10.getData()
            java.util.UUID r0 = defpackage.apv.c
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x0194
            int r12 = defpackage.bdw.a
            r0 = 27
            if (r12 < r0) goto L_0x017c
            goto L_0x0194
        L_0x017c:
            java.lang.String r12 = defpackage.bdw.a(r13)
            r13 = 43
            r0 = 45
            java.lang.String r12 = r12.replace(r13, r0)
            r13 = 47
            r0 = 95
            java.lang.String r12 = r12.replace(r13, r0)
            byte[] r13 = defpackage.bdw.c(r12)
        L_0x0194:
            java.lang.String r10 = r10.getDefaultUrl()
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x01aa
            if (r11 == 0) goto L_0x01aa
            java.lang.String r12 = r11.a
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x01aa
            java.lang.String r10 = r11.a
        L_0x01aa:
            asg$a r11 = new asg$a
            r11.<init>(r13, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asi.a(byte[], java.util.List, int, java.util.HashMap):asg$a");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (apv.c.equals(this.a)) {
            bArr2 = ary.a(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    public final c b() {
        ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new c(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public final void b(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    public final Map<String, String> c(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    public final String a(String str) {
        return this.b.getPropertyString(str);
    }

    public final void a(String str, String str2) {
        this.b.setPropertyString(str, str2);
    }

    public final /* synthetic */ asf d(byte[] bArr) {
        boolean z;
        if (bdw.a < 21 && apv.d.equals(this.a)) {
            if ("L3".equals(a("securityLevel"))) {
                z = true;
                return new ash(new MediaCrypto(this.a, bArr), z);
            }
        }
        z = false;
        return new ash(new MediaCrypto(this.a, bArr), z);
    }
}
