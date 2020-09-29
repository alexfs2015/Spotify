package defpackage;

import android.graphics.Shader.TileMode;
import java.util.List;

/* renamed from: fz reason: default package */
final class fz {

    /* renamed from: fz$a */
    static final class a {
        final int[] a;
        final float[] b;

        a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = ((Integer) list.get(i)).intValue();
                this.b[i] = ((Float) list2.get(i)).floatValue();
            }
        }
    }

    static TileMode a(int i) {
        return i != 1 ? i != 2 ? TileMode.CLAMP : TileMode.MIRROR : TileMode.REPEAT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.fz.a a(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0083
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0083
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = defpackage.ey.a.J
            android.content.res.TypedArray r3 = defpackage.gc.a(r8, r11, r10, r3)
            int r5 = defpackage.ey.a.K
            boolean r5 = r3.hasValue(r5)
            int r6 = defpackage.ey.a.L
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x0068
            if (r6 == 0) goto L_0x0068
            int r5 = defpackage.ey.a.K
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = defpackage.ey.a.L
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0068:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0083:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x008f
            fz$a r8 = new fz$a
            r8.<init>(r4, r2)
            return r8
        L_0x008f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):fz$a");
    }
}
