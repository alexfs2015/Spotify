package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: fx reason: default package */
public final class fx {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    private fx(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    static fx a(int i) {
        return new fx(null, null, i);
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r19v0, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r1v16, types: [android.graphics.SweepGradient] */
    /* JADX WARNING: type inference failed for: r14v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r19v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r14v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r19v2, types: [android.graphics.RadialGradient]
      assigns: [android.graphics.RadialGradient, android.graphics.LinearGradient]
      uses: [android.graphics.RadialGradient, android.graphics.Shader, android.graphics.LinearGradient]
      mth insns count: 141
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fx a(android.content.res.Resources r26, int r27, android.content.res.Resources.Theme r28) {
        /*
            r0 = r26
            r1 = r28
            java.lang.String r2 = "centerColor"
            android.content.res.XmlResourceParser r4 = r26.getXml(r27)     // Catch:{ Exception -> 0x0179 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r4)     // Catch:{ Exception -> 0x0179 }
        L_0x000e:
            int r6 = r4.next()     // Catch:{ Exception -> 0x0179 }
            r7 = 2
            r8 = 1
            if (r6 == r7) goto L_0x0018
            if (r6 != r8) goto L_0x000e
        L_0x0018:
            if (r6 != r7) goto L_0x0171
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x0179 }
            r9 = -1
            int r10 = r6.hashCode()     // Catch:{ Exception -> 0x0179 }
            r11 = 89650992(0x557f730, float:1.01546526E-35)
            java.lang.String r12 = "gradient"
            r13 = 0
            if (r10 == r11) goto L_0x003b
            r11 = 1191572447(0x4705f3df, float:34291.87)
            if (r10 == r11) goto L_0x0031
            goto L_0x0042
        L_0x0031:
            java.lang.String r10 = "selector"
            boolean r10 = r6.equals(r10)     // Catch:{ Exception -> 0x0179 }
            if (r10 == 0) goto L_0x0042
            r9 = 0
            goto L_0x0042
        L_0x003b:
            boolean r10 = r6.equals(r12)     // Catch:{ Exception -> 0x0179 }
            if (r10 == 0) goto L_0x0042
            r9 = 1
        L_0x0042:
            if (r9 == 0) goto L_0x0162
            if (r9 != r8) goto L_0x0144
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x0179 }
            boolean r9 = r6.equals(r12)     // Catch:{ Exception -> 0x0179 }
            if (r9 == 0) goto L_0x0126
            int[] r6 = defpackage.ey.a.w     // Catch:{ Exception -> 0x0179 }
            android.content.res.TypedArray r6 = defpackage.gc.a(r0, r1, r5, r6)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = "startX"
            int r10 = defpackage.ey.a.F     // Catch:{ Exception -> 0x0179 }
            r11 = 0
            float r15 = defpackage.gc.a(r6, r4, r9, r10, r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = "startY"
            int r10 = defpackage.ey.a.G     // Catch:{ Exception -> 0x0179 }
            float r16 = defpackage.gc.a(r6, r4, r9, r10, r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = "endX"
            int r10 = defpackage.ey.a.H     // Catch:{ Exception -> 0x0179 }
            float r17 = defpackage.gc.a(r6, r4, r9, r10, r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = "endY"
            int r10 = defpackage.ey.a.I     // Catch:{ Exception -> 0x0179 }
            float r18 = defpackage.gc.a(r6, r4, r9, r10, r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = "centerX"
            int r10 = defpackage.ey.a.A     // Catch:{ Exception -> 0x0179 }
            float r9 = defpackage.gc.a(r6, r4, r9, r10, r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r10 = "centerY"
            int r12 = defpackage.ey.a.B     // Catch:{ Exception -> 0x0179 }
            float r10 = defpackage.gc.a(r6, r4, r10, r12, r11)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r12 = "type"
            int r14 = defpackage.ey.a.z     // Catch:{ Exception -> 0x0179 }
            int r12 = defpackage.gc.a(r6, r4, r12, r14, r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r14 = "startColor"
            int r3 = defpackage.ey.a.x     // Catch:{ Exception -> 0x0179 }
            int r3 = defpackage.gc.b(r6, r4, r14, r3, r13)     // Catch:{ Exception -> 0x0179 }
            boolean r14 = defpackage.gc.a(r4, r2)     // Catch:{ Exception -> 0x0179 }
            int r7 = defpackage.ey.a.E     // Catch:{ Exception -> 0x0179 }
            int r2 = defpackage.gc.b(r6, r4, r2, r7, r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "endColor"
            int r8 = defpackage.ey.a.y     // Catch:{ Exception -> 0x0179 }
            int r7 = defpackage.gc.b(r6, r4, r7, r8, r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = "tileMode"
            int r11 = defpackage.ey.a.D     // Catch:{ Exception -> 0x0179 }
            int r8 = defpackage.gc.a(r6, r4, r8, r11, r13)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r11 = "gradientRadius"
            int r13 = defpackage.ey.a.C     // Catch:{ Exception -> 0x0179 }
            r21 = r9
            r9 = 0
            float r22 = defpackage.gc.a(r6, r4, r11, r13, r9)     // Catch:{ Exception -> 0x0179 }
            r6.recycle()     // Catch:{ Exception -> 0x0179 }
            fz$a r0 = defpackage.fz.a(r0, r4, r5, r1)     // Catch:{ Exception -> 0x0179 }
            if (r0 == 0) goto L_0x00c6
            goto L_0x00d3
        L_0x00c6:
            if (r14 == 0) goto L_0x00ce
            fz$a r0 = new fz$a     // Catch:{ Exception -> 0x0179 }
            r0.<init>(r3, r2, r7)     // Catch:{ Exception -> 0x0179 }
            goto L_0x00d3
        L_0x00ce:
            fz$a r0 = new fz$a     // Catch:{ Exception -> 0x0179 }
            r0.<init>(r3, r7)     // Catch:{ Exception -> 0x0179 }
        L_0x00d3:
            r1 = 1
            if (r12 == r1) goto L_0x00f8
            r1 = 2
            if (r12 == r1) goto L_0x00ec
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x0179 }
            int[] r2 = r0.a     // Catch:{ Exception -> 0x0179 }
            float[] r0 = r0.b     // Catch:{ Exception -> 0x0179 }
            android.graphics.Shader$TileMode r21 = defpackage.fz.a(r8)     // Catch:{ Exception -> 0x0179 }
            r14 = r1
            r19 = r2
            r20 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0179 }
            goto L_0x0116
        L_0x00ec:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x0179 }
            int[] r2 = r0.a     // Catch:{ Exception -> 0x0179 }
            float[] r0 = r0.b     // Catch:{ Exception -> 0x0179 }
            r3 = r21
            r1.<init>(r3, r10, r2, r0)     // Catch:{ Exception -> 0x0179 }
            goto L_0x0116
        L_0x00f8:
            r3 = r21
            r1 = 0
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x011e
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x0179 }
            int[] r2 = r0.a     // Catch:{ Exception -> 0x0179 }
            float[] r0 = r0.b     // Catch:{ Exception -> 0x0179 }
            android.graphics.Shader$TileMode r25 = defpackage.fz.a(r8)     // Catch:{ Exception -> 0x0179 }
            r19 = r1
            r20 = r3
            r21 = r10
            r23 = r2
            r24 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0179 }
        L_0x0116:
            fx r0 = new fx     // Catch:{ Exception -> 0x0179 }
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0179 }
            return r0
        L_0x011e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            throw r0     // Catch:{ Exception -> 0x0179 }
        L_0x0126:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0179 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r1.<init>()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r2 = r4.getPositionDescription()     // Catch:{ Exception -> 0x0179 }
            r1.append(r2)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)     // Catch:{ Exception -> 0x0179 }
            r1.append(r6)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0179 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            throw r0     // Catch:{ Exception -> 0x0179 }
        L_0x0144:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0179 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r1.<init>()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r2 = r4.getPositionDescription()     // Catch:{ Exception -> 0x0179 }
            r1.append(r2)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)     // Catch:{ Exception -> 0x0179 }
            r1.append(r6)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0179 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            throw r0     // Catch:{ Exception -> 0x0179 }
        L_0x0162:
            android.content.res.ColorStateList r0 = defpackage.fw.a(r0, r4, r5, r1)     // Catch:{ Exception -> 0x0179 }
            fx r1 = new fx     // Catch:{ Exception -> 0x0179 }
            int r2 = r0.getDefaultColor()     // Catch:{ Exception -> 0x0179 }
            r3 = 0
            r1.<init>(r3, r0, r2)     // Catch:{ Exception -> 0x0179 }
            return r1
        L_0x0171:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            throw r0     // Catch:{ Exception -> 0x0179 }
        L_0x0179:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx.a(android.content.res.Resources, int, android.content.res.Resources$Theme):fx");
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean a(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = this.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.b) {
                this.b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        if (this.a == null) {
            ColorStateList colorStateList = this.c;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return a() || this.b != 0;
    }
}
