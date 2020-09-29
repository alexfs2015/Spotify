package defpackage;

/* renamed from: abb reason: default package */
public final class abb {
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aac a(android.util.JsonReader r14, defpackage.xo r15) {
        /*
            android.util.JsonToken r0 = r14.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0012
            r14.beginObject()
        L_0x0012:
            r1 = 0
            r4 = r1
            r5 = r4
            r8 = r5
            r10 = r8
            r12 = r10
            r13 = r12
        L_0x0019:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00f5
            java.lang.String r6 = r14.nextName()
            r7 = -1
            int r9 = r6.hashCode()
            r11 = 97
            if (r9 == r11) goto L_0x008f
            r11 = 3242(0xcaa, float:4.543E-42)
            if (r9 == r11) goto L_0x0085
            r11 = 3656(0xe48, float:5.123E-42)
            if (r9 == r11) goto L_0x007b
            r11 = 3676(0xe5c, float:5.151E-42)
            if (r9 == r11) goto L_0x0071
            r11 = 111(0x6f, float:1.56E-43)
            if (r9 == r11) goto L_0x0067
            r11 = 112(0x70, float:1.57E-43)
            if (r9 == r11) goto L_0x005d
            r11 = 114(0x72, float:1.6E-43)
            if (r9 == r11) goto L_0x0053
            r11 = 115(0x73, float:1.61E-43)
            if (r9 == r11) goto L_0x0049
            goto L_0x0099
        L_0x0049:
            java.lang.String r9 = "s"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 2
            goto L_0x009a
        L_0x0053:
            java.lang.String r9 = "r"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 4
            goto L_0x009a
        L_0x005d:
            java.lang.String r9 = "p"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 1
            goto L_0x009a
        L_0x0067:
            java.lang.String r9 = "o"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 5
            goto L_0x009a
        L_0x0071:
            java.lang.String r9 = "so"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 6
            goto L_0x009a
        L_0x007b:
            java.lang.String r9 = "rz"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 3
            goto L_0x009a
        L_0x0085:
            java.lang.String r9 = "eo"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 7
            goto L_0x009a
        L_0x008f:
            java.lang.String r9 = "a"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0099
            r6 = 0
            goto L_0x009a
        L_0x0099:
            r6 = -1
        L_0x009a:
            switch(r6) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a8;
                case 7: goto L_0x00a2;
                default: goto L_0x009d;
            }
        L_0x009d:
            r14.skipValue()
            goto L_0x0019
        L_0x00a2:
            zs r13 = defpackage.abc.a(r14, r15, r3)
            goto L_0x0019
        L_0x00a8:
            zs r12 = defpackage.abc.a(r14, r15, r3)
            goto L_0x0019
        L_0x00ae:
            zu r5 = defpackage.abc.a(r14, r15)
            goto L_0x0019
        L_0x00b4:
            java.lang.String r6 = "Lottie doesn't support 3D layers."
            r15.a(r6)
        L_0x00b9:
            zs r10 = defpackage.abc.a(r14, r15, r3)
            goto L_0x0019
        L_0x00bf:
            zx r4 = new zx
            aby r6 = defpackage.aby.a
            java.util.List r6 = defpackage.abc.a(r14, r15, r6)
            r4.<init>(r6)
            goto L_0x0019
        L_0x00cc:
            aad r8 = defpackage.aaz.b(r14, r15)
            goto L_0x0019
        L_0x00d2:
            r14.beginObject()
        L_0x00d5:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00f0
            java.lang.String r6 = r14.nextName()
            java.lang.String r7 = "k"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00ec
            zv r1 = defpackage.aaz.a(r14, r15)
            goto L_0x00d5
        L_0x00ec:
            r14.skipValue()
            goto L_0x00d5
        L_0x00f0:
            r14.endObject()
            goto L_0x0019
        L_0x00f5:
            if (r0 == 0) goto L_0x00fa
            r14.endObject()
        L_0x00fa:
            if (r1 != 0) goto L_0x0101
            zv r1 = new zv
            r1.<init>()
        L_0x0101:
            r7 = r1
            if (r4 != 0) goto L_0x0110
            zx r4 = new zx
            aco r14 = new aco
            r15 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r15, r15)
            r4.<init>(r14)
        L_0x0110:
            r9 = r4
            if (r5 != 0) goto L_0x0118
            zu r5 = new zu
            r5.<init>()
        L_0x0118:
            r11 = r5
            aac r14 = new aac
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abb.a(android.util.JsonReader, xo):aac");
    }
}
