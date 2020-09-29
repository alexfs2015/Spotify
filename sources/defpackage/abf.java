package defpackage;

/* renamed from: abf reason: default package */
final class abf {
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [aag] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r10v2, types: [aao] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.airbnb.lottie.model.content.ShapeStroke] */
    /* JADX WARNING: type inference failed for: r5v7, types: [aaj] */
    /* JADX WARNING: type inference failed for: r5v8, types: [aan] */
    /* JADX WARNING: type inference failed for: r5v9, types: [aai] */
    /* JADX WARNING: type inference failed for: r5v10, types: [aac] */
    /* JADX WARNING: type inference failed for: r5v11, types: [aap] */
    /* JADX WARNING: type inference failed for: r5v12, types: [aaf] */
    /* JADX WARNING: type inference failed for: r5v13, types: [aak] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.airbnb.lottie.model.content.ShapeTrimPath] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.airbnb.lottie.model.content.PolystarShape] */
    /* JADX WARNING: type inference failed for: r5v16, types: [com.airbnb.lottie.model.content.MergePaths] */
    /* JADX WARNING: type inference failed for: r5v17, types: [aal] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (r2.equals("gs") != false) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v4
      assigns: []
      uses: []
      mth insns count: 151
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0042 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016b  */
    /* JADX WARNING: Unknown variable types count: 18 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.aag a(android.util.JsonReader r9, defpackage.xo r10) {
        /*
            r9.beginObject()
            r0 = 2
            r1 = 2
        L_0x0005:
            boolean r2 = r9.hasNext()
            r3 = 0
            r4 = -1
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0047
            java.lang.String r2 = r9.nextName()
            int r7 = r2.hashCode()
            r8 = 100
            if (r7 == r8) goto L_0x002a
            r8 = 3717(0xe85, float:5.209E-42)
            if (r7 == r8) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            java.lang.String r7 = "ty"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0034
            r2 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r7 = "d"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = -1
        L_0x0035:
            if (r2 == 0) goto L_0x0042
            if (r2 == r6) goto L_0x003d
            r9.skipValue()
            goto L_0x0005
        L_0x003d:
            int r1 = r9.nextInt()
            goto L_0x0005
        L_0x0042:
            java.lang.String r2 = r9.nextString()
            goto L_0x0048
        L_0x0047:
            r2 = r5
        L_0x0048:
            if (r2 != 0) goto L_0x004b
            return r5
        L_0x004b:
            int r7 = r2.hashCode()
            switch(r7) {
                case 3239: goto L_0x00d3;
                case 3270: goto L_0x00c9;
                case 3295: goto L_0x00bf;
                case 3307: goto L_0x00b5;
                case 3308: goto L_0x00ac;
                case 3488: goto L_0x00a1;
                case 3633: goto L_0x0096;
                case 3646: goto L_0x008b;
                case 3669: goto L_0x0081;
                case 3679: goto L_0x0076;
                case 3681: goto L_0x006b;
                case 3705: goto L_0x005f;
                case 3710: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x00dd
        L_0x0054:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 5
            goto L_0x00de
        L_0x005f:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 9
            goto L_0x00de
        L_0x006b:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 1
            goto L_0x00de
        L_0x0076:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 10
            goto L_0x00de
        L_0x0081:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 6
            goto L_0x00de
        L_0x008b:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 12
            goto L_0x00de
        L_0x0096:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 8
            goto L_0x00de
        L_0x00a1:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 11
            goto L_0x00de
        L_0x00ac:
            java.lang.String r7 = "gs"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00b5:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 0
            goto L_0x00de
        L_0x00bf:
            java.lang.String r0 = "gf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 4
            goto L_0x00de
        L_0x00c9:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 3
            goto L_0x00de
        L_0x00d3:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 7
            goto L_0x00de
        L_0x00dd:
            r0 = -1
        L_0x00de:
            switch(r0) {
                case 0: goto L_0x0138;
                case 1: goto L_0x0133;
                case 2: goto L_0x012e;
                case 3: goto L_0x0128;
                case 4: goto L_0x0122;
                case 5: goto L_0x011c;
                case 6: goto L_0x0116;
                case 7: goto L_0x0110;
                case 8: goto L_0x010a;
                case 9: goto L_0x0104;
                case 10: goto L_0x00fe;
                case 11: goto L_0x00f3;
                case 12: goto L_0x00ed;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown shape type "
            r10.<init>(r0)
            r10.append(r2)
            goto L_0x0193
        L_0x00ed:
            aal r5 = defpackage.abx.a(r9, r10)
            goto L_0x0193
        L_0x00f3:
            com.airbnb.lottie.model.content.MergePaths r5 = defpackage.abs.a(r9)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r10.a(r0)
            goto L_0x0193
        L_0x00fe:
            com.airbnb.lottie.model.content.PolystarShape r5 = defpackage.abv.a(r9, r10)
            goto L_0x0193
        L_0x0104:
            com.airbnb.lottie.model.content.ShapeTrimPath r5 = defpackage.acd.a(r9, r10)
            goto L_0x0193
        L_0x010a:
            aak r5 = defpackage.abw.a(r9, r10)
            goto L_0x0193
        L_0x0110:
            aaf r5 = defpackage.abd.a(r9, r10, r1)
            goto L_0x0193
        L_0x0116:
            aap r5 = defpackage.acb.a(r9, r10)
            goto L_0x0193
        L_0x011c:
            aac r5 = defpackage.abb.a(r9, r10)
            goto L_0x0193
        L_0x0122:
            aai r5 = defpackage.abj.a(r9, r10)
            goto L_0x0193
        L_0x0128:
            aan r5 = defpackage.aca.a(r9, r10)
            goto L_0x0193
        L_0x012e:
            aaj r5 = defpackage.abk.a(r9, r10)
            goto L_0x0193
        L_0x0133:
            com.airbnb.lottie.model.content.ShapeStroke r5 = defpackage.acc.a(r9, r10)
            goto L_0x0193
        L_0x0138:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x013d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x018d
            java.lang.String r1 = r9.nextName()
            int r2 = r1.hashCode()
            r7 = 3371(0xd2b, float:4.724E-42)
            if (r2 == r7) goto L_0x015e
            r7 = 3519(0xdbf, float:4.931E-42)
            if (r2 == r7) goto L_0x0154
            goto L_0x0168
        L_0x0154:
            java.lang.String r2 = "nm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0168
            r1 = 0
            goto L_0x0169
        L_0x015e:
            java.lang.String r2 = "it"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0168
            r1 = 1
            goto L_0x0169
        L_0x0168:
            r1 = -1
        L_0x0169:
            if (r1 == 0) goto L_0x0188
            if (r1 == r6) goto L_0x0171
            r9.skipValue()
            goto L_0x013d
        L_0x0171:
            r9.beginArray()
        L_0x0174:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0184
            aag r1 = a(r9, r10)
            if (r1 == 0) goto L_0x0174
            r0.add(r1)
            goto L_0x0174
        L_0x0184:
            r9.endArray()
            goto L_0x013d
        L_0x0188:
            java.lang.String r5 = r9.nextString()
            goto L_0x013d
        L_0x018d:
            aao r10 = new aao
            r10.<init>(r5, r0)
            r5 = r10
        L_0x0193:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x019d
            r9.skipValue()
            goto L_0x0193
        L_0x019d:
            r9.endObject()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abf.a(android.util.JsonReader, xo):aag");
    }
}
