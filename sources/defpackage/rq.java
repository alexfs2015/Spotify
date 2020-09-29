package defpackage;

/* renamed from: rq reason: default package */
public final class rq {
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.content.res.XmlResourceParser] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.animation.Interpolator] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r4v3, types: [rt] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.animation.BounceInterpolator] */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.animation.AnticipateOvershootInterpolator] */
    /* JADX WARNING: type inference failed for: r4v5, types: [android.view.animation.OvershootInterpolator] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.view.animation.AnticipateInterpolator] */
    /* JADX WARNING: type inference failed for: r4v7, types: [android.view.animation.CycleInterpolator] */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.view.animation.AccelerateDecelerateInterpolator] */
    /* JADX WARNING: type inference failed for: r4v8, types: [android.view.animation.DecelerateInterpolator] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r4v10, types: [android.view.animation.AccelerateInterpolator] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.view.animation.LinearInterpolator] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v5
      assigns: []
      uses: []
      mth insns count: 134
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
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARNING: Unknown variable types count: 18 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.animation.Interpolator a(android.content.Context r6, int r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.view.animation.Interpolator r6 = android.view.animation.AnimationUtils.loadInterpolator(r6, r7)
            return r6
        L_0x000b:
            r0 = 17563663(0x10c000f, float:2.571398E-38)
            java.lang.String r1 = "Can't load animation resource ID #0x"
            r2 = 0
            if (r7 != r0) goto L_0x0023
            ks r6 = new ks     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            return r6
        L_0x0019:
            r6 = move-exception
            r0 = r2
            goto L_0x014c
        L_0x001d:
            r6 = move-exception
            goto L_0x011a
        L_0x0020:
            r6 = move-exception
            goto L_0x0133
        L_0x0023:
            r0 = 17563661(0x10c000d, float:2.5713975E-38)
            if (r7 != r0) goto L_0x002e
            kt r6 = new kt     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            return r6
        L_0x002e:
            r0 = 17563662(0x10c000e, float:2.5713978E-38)
            if (r7 != r0) goto L_0x0039
            ku r6 = new ku     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            return r6
        L_0x0039:
            android.content.res.Resources r0 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            android.content.res.XmlResourceParser r0 = r0.getAnimation(r7)     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001d }
            r6.getResources()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r6.getTheme()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            int r3 = r0.getDepth()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
        L_0x004b:
            int r4 = r0.next()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r5 = 3
            if (r4 != r5) goto L_0x0058
            int r5 = r0.getDepth()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 <= r3) goto L_0x010c
        L_0x0058:
            r5 = 1
            if (r4 == r5) goto L_0x010c
            r5 = 2
            if (r4 != r5) goto L_0x004b
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            java.lang.String r4 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            java.lang.String r5 = "linearInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x0074
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x004b
        L_0x0074:
            java.lang.String r5 = "accelerateInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x0083
            android.view.animation.AccelerateInterpolator r4 = new android.view.animation.AccelerateInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
        L_0x0081:
            r2 = r4
            goto L_0x004b
        L_0x0083:
            java.lang.String r5 = "decelerateInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x0091
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x0081
        L_0x0091:
            java.lang.String r5 = "accelerateDecelerateInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x009f
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x004b
        L_0x009f:
            java.lang.String r5 = "cycleInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x00ad
            android.view.animation.CycleInterpolator r4 = new android.view.animation.CycleInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x0081
        L_0x00ad:
            java.lang.String r5 = "anticipateInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x00bb
            android.view.animation.AnticipateInterpolator r4 = new android.view.animation.AnticipateInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x0081
        L_0x00bb:
            java.lang.String r5 = "overshootInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x00c9
            android.view.animation.OvershootInterpolator r4 = new android.view.animation.OvershootInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x0081
        L_0x00c9:
            java.lang.String r5 = "anticipateOvershootInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x00d7
            android.view.animation.AnticipateOvershootInterpolator r4 = new android.view.animation.AnticipateOvershootInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x0081
        L_0x00d7:
            java.lang.String r5 = "bounceInterpolator"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r5 == 0) goto L_0x00e6
            android.view.animation.BounceInterpolator r2 = new android.view.animation.BounceInterpolator     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x004b
        L_0x00e6:
            java.lang.String r5 = "pathInterpolator"
            boolean r4 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            if (r4 == 0) goto L_0x00f4
            rt r4 = new rt     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r4.<init>(r6, r2, r0)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            goto L_0x0081
        L_0x00f4:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "Unknown interpolator name: "
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            r6.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x0114, all -> 0x0112 }
        L_0x010c:
            if (r0 == 0) goto L_0x0111
            r0.close()
        L_0x0111:
            return r2
        L_0x0112:
            r6 = move-exception
            goto L_0x014c
        L_0x0114:
            r6 = move-exception
            r2 = r0
            goto L_0x011a
        L_0x0117:
            r6 = move-exception
            r2 = r0
            goto L_0x0133
        L_0x011a:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0019 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0019 }
            r3.<init>(r1)     // Catch:{ all -> 0x0019 }
            java.lang.String r7 = java.lang.Integer.toHexString(r7)     // Catch:{ all -> 0x0019 }
            r3.append(r7)     // Catch:{ all -> 0x0019 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0019 }
            r0.<init>(r7)     // Catch:{ all -> 0x0019 }
            r0.initCause(r6)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0133:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0019 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0019 }
            r3.<init>(r1)     // Catch:{ all -> 0x0019 }
            java.lang.String r7 = java.lang.Integer.toHexString(r7)     // Catch:{ all -> 0x0019 }
            r3.append(r7)     // Catch:{ all -> 0x0019 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0019 }
            r0.<init>(r7)     // Catch:{ all -> 0x0019 }
            r0.initCause(r6)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x014c:
            if (r0 == 0) goto L_0x0151
            r0.close()
        L_0x0151:
            goto L_0x0153
        L_0x0152:
            throw r6
        L_0x0153:
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq.a(android.content.Context, int):android.view.animation.Interpolator");
    }
}
