package defpackage;

import defpackage.wec;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: weg reason: default package */
public abstract class weg<H extends wec> extends wdf<Object> {
    static final byte[] b = {13, 10};
    private static final byte[] c = {48, 13, 10};
    private static final byte[] d = {48, 13, 10, 13, 10};
    private static final vyv e = vzw.a(vzw.b(2).b(b));
    private static final vyv f = vzw.a(vzw.b(5).b(d));
    private int g = 0;

    /* access modifiers changed from: protected */
    public abstract void a(vyv vyv, H h);

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.wav r11, java.lang.Object r12, java.util.List<java.lang.Object> r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wec
            r1 = 1
            r2 = 2
            java.lang.String r3 = "unexpected message type: "
            if (r0 == 0) goto L_0x0048
            int r0 = r10.g
            if (r0 != 0) goto L_0x0032
            r0 = r12
            wec r0 = (defpackage.wec) r0
            vyw r4 = r11.c()
            vyv r4 = r4.a()
            r10.a(r4, (H) r0)
            wea r5 = r0.d()
            a(r5, r4)
            byte[] r5 = b
            r4.b(r5)
            boolean r0 = defpackage.wem.a(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 2
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            r10.g = r0
            goto L_0x0049
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r3)
            java.lang.String r12 = defpackage.wjn.a(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0048:
            r4 = 0
        L_0x0049:
            boolean r0 = r12 instanceof defpackage.vyv
            if (r0 == 0) goto L_0x005c
            r5 = r12
            vyv r5 = (defpackage.vyv) r5
            boolean r5 = r5.f()
            if (r5 != 0) goto L_0x005c
            vyv r11 = defpackage.vzw.a
            r13.add(r11)
            return
        L_0x005c:
            boolean r5 = r12 instanceof defpackage.wdw
            if (r5 != 0) goto L_0x006e
            if (r0 != 0) goto L_0x006e
            boolean r6 = r12 instanceof defpackage.wbw
            if (r6 == 0) goto L_0x0067
            goto L_0x006e
        L_0x0067:
            if (r4 == 0) goto L_0x015c
            r13.add(r4)
            goto L_0x015c
        L_0x006e:
            int r6 = r10.g
            if (r6 == 0) goto L_0x0179
            if (r5 == 0) goto L_0x0081
            r0 = r12
            wdw r0 = (defpackage.wdw) r0
            vyv r0 = r0.a()
            int r0 = r0.g()
        L_0x007f:
            long r6 = (long) r0
            goto L_0x0096
        L_0x0081:
            if (r0 == 0) goto L_0x008b
            r0 = r12
            vyv r0 = (defpackage.vyv) r0
            int r0 = r0.g()
            goto L_0x007f
        L_0x008b:
            boolean r0 = r12 instanceof defpackage.wbw
            if (r0 == 0) goto L_0x0163
            r0 = r12
            wbw r0 = (defpackage.wbw) r0
            long r6 = r0.b()
        L_0x0096:
            int r0 = r10.g
            r3 = 0
            r8 = 0
            if (r0 != r1) goto L_0x00dc
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x00c9
            if (r4 == 0) goto L_0x00bc
            int r11 = r4.h()
            long r0 = (long) r11
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            if (r5 == 0) goto L_0x00bc
            r11 = r12
            wdw r11 = (defpackage.wdw) r11
            vyv r11 = r11.a()
            r4.a(r11)
            r13.add(r4)
            goto L_0x00d4
        L_0x00bc:
            if (r4 == 0) goto L_0x00c1
            r13.add(r4)
        L_0x00c1:
            java.lang.Object r11 = b(r12)
            r13.add(r11)
            goto L_0x00d4
        L_0x00c9:
            if (r4 == 0) goto L_0x00cf
            r13.add(r4)
            goto L_0x00d4
        L_0x00cf:
            vyv r11 = defpackage.vzw.a
            r13.add(r11)
        L_0x00d4:
            boolean r11 = r12 instanceof defpackage.weo
            if (r11 == 0) goto L_0x0152
            r10.g = r3
            goto L_0x015c
        L_0x00dc:
            if (r0 != r2) goto L_0x015d
            if (r4 == 0) goto L_0x00e3
            r13.add(r4)
        L_0x00e3:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            java.lang.String r0 = java.lang.Long.toHexString(r6)
            java.nio.charset.Charset r1 = defpackage.whb.b
            byte[] r0 = r0.getBytes(r1)
            vyw r1 = r11.c()
            int r4 = r0.length
            int r4 = r4 + r2
            vyv r1 = r1.a(r4)
            r1.b(r0)
            byte[] r0 = b
            r1.b(r0)
            r13.add(r1)
            java.lang.Object r0 = b(r12)
            r13.add(r0)
            vyv r0 = e
            vyv r0 = r0.s()
            r13.add(r0)
        L_0x0116:
            boolean r0 = r12 instanceof defpackage.weo
            if (r0 == 0) goto L_0x0153
            weo r12 = (defpackage.weo) r12
            wea r12 = r12.c()
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x0130
            vyv r11 = f
            vyv r11 = r11.s()
            r13.add(r11)
            goto L_0x0150
        L_0x0130:
            vyw r11 = r11.c()
            vyv r11 = r11.a()
            byte[] r0 = c
            r11.b(r0)
            a(r12, r11)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0148
        L_0x0141:
            r12 = move-exception
            r11.B()
            io.netty.util.internal.PlatformDependent.a(r12)
        L_0x0148:
            byte[] r12 = b
            r11.b(r12)
            r13.add(r11)
        L_0x0150:
            r10.g = r3
        L_0x0152:
            return
        L_0x0153:
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x015c
            vyv r11 = defpackage.vzw.a
            r13.add(r11)
        L_0x015c:
            return
        L_0x015d:
            java.lang.Error r11 = new java.lang.Error
            r11.<init>()
            throw r11
        L_0x0163:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r3)
            java.lang.String r12 = defpackage.wjn.a(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0179:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r3)
            java.lang.String r12 = defpackage.wjn.a(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            goto L_0x0190
        L_0x018f:
            throw r11
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.weg.a(wav, java.lang.Object, java.util.List):void");
    }

    private static void a(wea wea, vyv vyv) {
        Iterator a = wea.a();
        while (a.hasNext()) {
            Entry entry = (Entry) a.next();
            CharSequence charSequence = (CharSequence) entry.getKey();
            CharSequence charSequence2 = (CharSequence) entry.getValue();
            int length = charSequence.length();
            int length2 = charSequence2.length();
            vyv.d(length + length2 + 4);
            int d2 = vyv.d();
            web.a(vyv, d2, charSequence, length);
            int i = d2 + length;
            int i2 = i + 1;
            vyv.b(i, 58);
            int i3 = i2 + 1;
            vyv.b(i2, 32);
            web.a(vyv, i3, charSequence2, length2);
            int i4 = i3 + length2;
            int i5 = i4 + 1;
            vyv.b(i4, 13);
            int i6 = i5 + 1;
            vyv.b(i5, 10);
            vyv.b(i6);
        }
    }

    public boolean a(Object obj) {
        return (obj instanceof wef) || (obj instanceof vyv) || (obj instanceof wbw);
    }

    private static Object b(Object obj) {
        if (obj instanceof vyv) {
            return ((vyv) obj).A();
        }
        if (obj instanceof wdw) {
            return ((wdw) obj).a().A();
        }
        if (obj instanceof wbw) {
            return ((wbw) obj).d();
        }
        StringBuilder sb = new StringBuilder("unexpected message type: ");
        sb.append(wjn.a(obj));
        throw new IllegalStateException(sb.toString());
    }
}
