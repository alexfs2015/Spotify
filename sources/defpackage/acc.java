package defpackage;

/* renamed from: acc reason: default package */
final class acc {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.ShapeStroke a(android.util.JsonReader r19, defpackage.xo r20) {
        /*
            r0 = r19
            r1 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0012:
            boolean r12 = r19.hasNext()
            if (r12 == 0) goto L_0x01a3
            java.lang.String r12 = r19.nextName()
            int r13 = r12.hashCode()
            java.lang.String r15 = "o"
            java.lang.String r2 = "d"
            r17 = -1
            r14 = 99
            if (r13 == r14) goto L_0x0089
            r14 = 100
            if (r13 == r14) goto L_0x0081
            r14 = 111(0x6f, float:1.56E-43)
            if (r13 == r14) goto L_0x0079
            r14 = 119(0x77, float:1.67E-43)
            if (r13 == r14) goto L_0x006f
            r14 = 3447(0xd77, float:4.83E-42)
            if (r13 == r14) goto L_0x0065
            r14 = 3454(0xd7e, float:4.84E-42)
            if (r13 == r14) goto L_0x005b
            r14 = 3487(0xd9f, float:4.886E-42)
            if (r13 == r14) goto L_0x0051
            r14 = 3519(0xdbf, float:4.931E-42)
            if (r13 == r14) goto L_0x0047
            goto L_0x0093
        L_0x0047:
            java.lang.String r13 = "nm"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0093
            r14 = 0
            goto L_0x0094
        L_0x0051:
            java.lang.String r13 = "ml"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0093
            r14 = 6
            goto L_0x0094
        L_0x005b:
            java.lang.String r13 = "lj"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0093
            r14 = 5
            goto L_0x0094
        L_0x0065:
            java.lang.String r13 = "lc"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0093
            r14 = 4
            goto L_0x0094
        L_0x006f:
            java.lang.String r13 = "w"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0093
            r14 = 2
            goto L_0x0094
        L_0x0079:
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0093
            r14 = 3
            goto L_0x0094
        L_0x0081:
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0093
            r14 = 7
            goto L_0x0094
        L_0x0089:
            java.lang.String r13 = "c"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0093
            r14 = 1
            goto L_0x0094
        L_0x0093:
            r14 = -1
        L_0x0094:
            switch(r14) {
                case 0: goto L_0x0197;
                case 1: goto L_0x018f;
                case 2: goto L_0x0186;
                case 3: goto L_0x017e;
                case 4: goto L_0x016e;
                case 5: goto L_0x015e;
                case 6: goto L_0x0157;
                case 7: goto L_0x009e;
                default: goto L_0x0097;
            }
        L_0x0097:
            r18 = r11
            r19.skipValue()
            goto L_0x019f
        L_0x009e:
            r19.beginArray()
        L_0x00a1:
            boolean r12 = r19.hasNext()
            if (r12 == 0) goto L_0x013e
            r19.beginObject()
            r12 = 0
            r13 = 0
        L_0x00ac:
            boolean r14 = r19.hasNext()
            if (r14 == 0) goto L_0x00f3
            java.lang.String r14 = r19.nextName()
            r16 = r5
            int r5 = r14.hashCode()
            r18 = r11
            r11 = 110(0x6e, float:1.54E-43)
            if (r5 == r11) goto L_0x00d1
            r11 = 118(0x76, float:1.65E-43)
            if (r5 == r11) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            java.lang.String r5 = "v"
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00db
            r5 = 1
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r5 = "n"
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00db
            r5 = 0
            goto L_0x00dc
        L_0x00db:
            r5 = -1
        L_0x00dc:
            if (r5 == 0) goto L_0x00ee
            r11 = 1
            if (r5 == r11) goto L_0x00e9
            r19.skipValue()
        L_0x00e4:
            r5 = r16
            r11 = r18
            goto L_0x00ac
        L_0x00e9:
            zs r13 = defpackage.abc.a(r0, r1, r11)
            goto L_0x00e4
        L_0x00ee:
            java.lang.String r12 = r19.nextString()
            goto L_0x00e4
        L_0x00f3:
            r16 = r5
            r18 = r11
            r19.endObject()
            int r5 = r12.hashCode()
            r11 = 100
            if (r5 == r11) goto L_0x011f
            r14 = 103(0x67, float:1.44E-43)
            if (r5 == r14) goto L_0x0113
            r14 = 111(0x6f, float:1.56E-43)
            if (r5 == r14) goto L_0x010b
            goto L_0x0129
        L_0x010b:
            boolean r5 = r12.equals(r15)
            if (r5 == 0) goto L_0x0129
            r5 = 0
            goto L_0x012a
        L_0x0113:
            r14 = 111(0x6f, float:1.56E-43)
            java.lang.String r5 = "g"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0129
            r5 = 2
            goto L_0x012a
        L_0x011f:
            r14 = 111(0x6f, float:1.56E-43)
            boolean r5 = r12.equals(r2)
            if (r5 == 0) goto L_0x0129
            r5 = 1
            goto L_0x012a
        L_0x0129:
            r5 = -1
        L_0x012a:
            if (r5 == 0) goto L_0x013c
            r12 = 1
            r11 = 2
            if (r5 == r12) goto L_0x0133
            if (r5 == r11) goto L_0x0133
            goto L_0x0136
        L_0x0133:
            r3.add(r13)
        L_0x0136:
            r5 = r16
        L_0x0138:
            r11 = r18
            goto L_0x00a1
        L_0x013c:
            r5 = r13
            goto L_0x0138
        L_0x013e:
            r16 = r5
            r18 = r11
            r12 = 1
            r19.endArray()
            int r2 = r3.size()
            if (r2 != r12) goto L_0x0154
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            r3.add(r2)
        L_0x0154:
            r5 = r16
            goto L_0x019f
        L_0x0157:
            double r11 = r19.nextDouble()
            float r11 = (float) r11
            goto L_0x0012
        L_0x015e:
            r18 = r11
            r12 = 1
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r10 = r19.nextInt()
            int r10 = r10 - r12
            r10 = r2[r10]
            goto L_0x0012
        L_0x016e:
            r18 = r11
            r12 = 1
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r2 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r9 = r19.nextInt()
            int r9 = r9 - r12
            r9 = r2[r9]
            goto L_0x0012
        L_0x017e:
            r18 = r11
            zu r7 = defpackage.abc.a(r19, r20)
            goto L_0x0012
        L_0x0186:
            r18 = r11
            r12 = 1
            zs r8 = defpackage.abc.a(r0, r1, r12)
            goto L_0x0012
        L_0x018f:
            r18 = r11
            zr r6 = defpackage.abc.d(r19, r20)
            goto L_0x0012
        L_0x0197:
            r18 = r11
            java.lang.String r4 = r19.nextString()
            goto L_0x0012
        L_0x019f:
            r11 = r18
            goto L_0x0012
        L_0x01a3:
            r18 = r11
            com.airbnb.lottie.model.content.ShapeStroke r11 = new com.airbnb.lottie.model.content.ShapeStroke
            r0 = r11
            r1 = r4
            r2 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acc.a(android.util.JsonReader, xo):com.airbnb.lottie.model.content.ShapeStroke");
    }
}
