package defpackage;

import defpackage.wsi;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: wsm reason: default package */
public abstract class wsm<H extends wsi> extends wrl<Object> {
    static final byte[] b = {13, 10};
    private static final byte[] c = {48, 13, 10};
    private static final byte[] d = {48, 13, 10, 13, 10};
    private static final wnb e = woc.a(woc.b(2).b(b));
    private static final wnb f = woc.a(woc.b(5).b(d));
    private int g = 0;

    private static void a(wsg wsg, wnb wnb) {
        Iterator a = wsg.a();
        while (a.hasNext()) {
            Entry entry = (Entry) a.next();
            CharSequence charSequence = (CharSequence) entry.getKey();
            CharSequence charSequence2 = (CharSequence) entry.getValue();
            int length = charSequence.length();
            int length2 = charSequence2.length();
            wnb.d(length + length2 + 4);
            int d2 = wnb.d();
            wsh.a(wnb, d2, charSequence, length);
            int i = d2 + length;
            int i2 = i + 1;
            wnb.b(i, 58);
            int i3 = i2 + 1;
            wnb.b(i2, 32);
            wsh.a(wnb, i3, charSequence2, length2);
            int i4 = i3 + length2;
            int i5 = i4 + 1;
            wnb.b(i4, 13);
            int i6 = i5 + 1;
            wnb.b(i5, 10);
            wnb.b(i6);
        }
    }

    private static Object b(Object obj) {
        if (obj instanceof wnb) {
            return ((wnb) obj).A();
        }
        if (obj instanceof wsc) {
            return ((wsc) obj).a().A();
        }
        if (obj instanceof wqc) {
            return ((wqc) obj).d();
        }
        StringBuilder sb = new StringBuilder("unexpected message type: ");
        sb.append(wxt.a(obj));
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public abstract void a(wnb wnb, H h);

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.wpb r11, java.lang.Object r12, java.util.List<java.lang.Object> r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wsi
            r1 = 1
            r2 = 2
            java.lang.String r3 = "unexpected message type: "
            if (r0 == 0) goto L_0x0048
            int r0 = r10.g
            if (r0 != 0) goto L_0x0032
            r0 = r12
            wsi r0 = (defpackage.wsi) r0
            wnc r4 = r11.c()
            wnb r4 = r4.a()
            r10.a(r4, (H) r0)
            wsg r5 = r0.d()
            a(r5, r4)
            byte[] r5 = b
            r4.b(r5)
            boolean r0 = defpackage.wss.a(r0)
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
            java.lang.String r12 = defpackage.wxt.a(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0048:
            r4 = 0
        L_0x0049:
            boolean r0 = r12 instanceof defpackage.wnb
            if (r0 == 0) goto L_0x005c
            r5 = r12
            wnb r5 = (defpackage.wnb) r5
            boolean r5 = r5.f()
            if (r5 != 0) goto L_0x005c
            wnb r11 = defpackage.woc.a
            r13.add(r11)
            return
        L_0x005c:
            boolean r5 = r12 instanceof defpackage.wsc
            if (r5 != 0) goto L_0x006e
            if (r0 != 0) goto L_0x006e
            boolean r6 = r12 instanceof defpackage.wqc
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
            wsc r0 = (defpackage.wsc) r0
            wnb r0 = r0.a()
            int r0 = r0.g()
        L_0x007f:
            long r6 = (long) r0
            goto L_0x0096
        L_0x0081:
            if (r0 == 0) goto L_0x008b
            r0 = r12
            wnb r0 = (defpackage.wnb) r0
            int r0 = r0.g()
            goto L_0x007f
        L_0x008b:
            boolean r0 = r12 instanceof defpackage.wqc
            if (r0 == 0) goto L_0x0163
            r0 = r12
            wqc r0 = (defpackage.wqc) r0
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
            wsc r11 = (defpackage.wsc) r11
            wnb r11 = r11.a()
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
            wnb r11 = defpackage.woc.a
            r13.add(r11)
        L_0x00d4:
            boolean r11 = r12 instanceof defpackage.wsu
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
            java.nio.charset.Charset r1 = defpackage.wvh.b
            byte[] r0 = r0.getBytes(r1)
            wnc r1 = r11.c()
            int r4 = r0.length
            int r4 = r4 + r2
            wnb r1 = r1.a(r4)
            r1.b(r0)
            byte[] r0 = b
            r1.b(r0)
            r13.add(r1)
            java.lang.Object r0 = b(r12)
            r13.add(r0)
            wnb r0 = e
            wnb r0 = r0.s()
            r13.add(r0)
        L_0x0116:
            boolean r0 = r12 instanceof defpackage.wsu
            if (r0 == 0) goto L_0x0153
            wsu r12 = (defpackage.wsu) r12
            wsg r12 = r12.c()
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x0130
            wnb r11 = f
            wnb r11 = r11.s()
            r13.add(r11)
            goto L_0x0150
        L_0x0130:
            wnc r11 = r11.c()
            wnb r11 = r11.a()
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
            wnb r11 = defpackage.woc.a
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
            java.lang.String r12 = defpackage.wxt.a(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0179:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r3)
            java.lang.String r12 = defpackage.wxt.a(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            goto L_0x0190
        L_0x018f:
            throw r11
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsm.a(wpb, java.lang.Object, java.util.List):void");
    }

    public boolean a(Object obj) {
        return (obj instanceof wsl) || (obj instanceof wnb) || (obj instanceof wqc);
    }
}
