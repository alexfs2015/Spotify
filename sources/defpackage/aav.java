package defpackage;

/* renamed from: aav reason: default package */
final class aav {
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.zu a(android.util.JsonReader r14, defpackage.xa r15) {
        /*
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0008:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = r14.nextName()
            int r1 = r0.hashCode()
            r9 = 101(0x65, float:1.42E-43)
            r10 = 0
            r11 = -1
            r12 = 1
            if (r1 == r9) goto L_0x0069
            r9 = 103(0x67, float:1.44E-43)
            if (r1 == r9) goto L_0x005f
            r9 = 111(0x6f, float:1.56E-43)
            if (r1 == r9) goto L_0x0055
            r9 = 3519(0xdbf, float:4.931E-42)
            if (r1 == r9) goto L_0x004b
            switch(r1) {
                case 114: goto L_0x0041;
                case 115: goto L_0x0037;
                case 116: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0073
        L_0x002d:
            java.lang.String r1 = "t"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 3
            goto L_0x0074
        L_0x0037:
            java.lang.String r1 = "s"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 4
            goto L_0x0074
        L_0x0041:
            java.lang.String r1 = "r"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 6
            goto L_0x0074
        L_0x004b:
            java.lang.String r1 = "nm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 0
            goto L_0x0074
        L_0x0055:
            java.lang.String r1 = "o"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 2
            goto L_0x0074
        L_0x005f:
            java.lang.String r1 = "g"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0069:
            java.lang.String r1 = "e"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 5
            goto L_0x0074
        L_0x0073:
            r0 = -1
        L_0x0074:
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0094;
                case 4: goto L_0x008e;
                case 5: goto L_0x0088;
                case 6: goto L_0x007b;
                default: goto L_0x0077;
            }
        L_0x0077:
            r14.skipValue()
            goto L_0x0008
        L_0x007b:
            int r0 = r14.nextInt()
            if (r0 != r12) goto L_0x0084
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x0086
        L_0x0084:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0086:
            r4 = r0
            goto L_0x0008
        L_0x0088:
            zi r8 = defpackage.aao.b(r14, r15)
            goto L_0x0008
        L_0x008e:
            zi r7 = defpackage.aao.b(r14, r15)
            goto L_0x0008
        L_0x0094:
            int r0 = r14.nextInt()
            if (r0 != r12) goto L_0x009d
            com.airbnb.lottie.model.content.GradientType r0 = com.airbnb.lottie.model.content.GradientType.Linear
            goto L_0x009f
        L_0x009d:
            com.airbnb.lottie.model.content.GradientType r0 = com.airbnb.lottie.model.content.GradientType.Radial
        L_0x009f:
            r3 = r0
            goto L_0x0008
        L_0x00a2:
            zg r6 = defpackage.aao.a(r14, r15)
            goto L_0x0008
        L_0x00a8:
            r14.beginObject()
            r0 = -1
        L_0x00ac:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.String r1 = r14.nextName()
            int r9 = r1.hashCode()
            r13 = 107(0x6b, float:1.5E-43)
            if (r9 == r13) goto L_0x00cd
            r13 = 112(0x70, float:1.57E-43)
            if (r9 == r13) goto L_0x00c3
            goto L_0x00d7
        L_0x00c3:
            java.lang.String r9 = "p"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00d7
            r1 = 0
            goto L_0x00d8
        L_0x00cd:
            java.lang.String r9 = "k"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00d7
            r1 = 1
            goto L_0x00d8
        L_0x00d7:
            r1 = -1
        L_0x00d8:
            if (r1 == 0) goto L_0x00e5
            if (r1 == r12) goto L_0x00e0
            r14.skipValue()
            goto L_0x00ac
        L_0x00e0:
            zf r5 = defpackage.aao.a(r14, r15, r0)
            goto L_0x00ac
        L_0x00e5:
            int r0 = r14.nextInt()
            goto L_0x00ac
        L_0x00ea:
            r14.endObject()
            goto L_0x0008
        L_0x00ef:
            java.lang.String r2 = r14.nextString()
            goto L_0x0008
        L_0x00f5:
            zu r14 = new zu
            r9 = 0
            r10 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aav.a(android.util.JsonReader, xa):zu");
    }
}
