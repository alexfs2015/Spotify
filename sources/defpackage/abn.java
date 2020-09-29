package defpackage;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: abn reason: default package */
class abn {
    private static final Interpolator a = new LinearInterpolator();
    private static dw<WeakReference<Interpolator>> b;

    abn() {
    }

    static <T> acl<T> a(JsonReader jsonReader, xo xoVar, float f, ace<T> ace, boolean z) {
        return z ? a(xoVar, jsonReader, f, ace) : new acl<>(ace.a(jsonReader, f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> defpackage.acl<T> a(defpackage.xo r17, android.util.JsonReader r18, float r19, defpackage.ace<T> r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r18.beginObject()
            r5 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0012:
            boolean r10 = r18.hasNext()
            if (r10 == 0) goto L_0x00d3
            java.lang.String r10 = r18.nextName()
            r11 = -1
            int r13 = r10.hashCode()
            r3 = 101(0x65, float:1.42E-43)
            r4 = 1
            if (r13 == r3) goto L_0x0089
            r3 = 111(0x6f, float:1.56E-43)
            if (r13 == r3) goto L_0x007f
            r3 = 3701(0xe75, float:5.186E-42)
            if (r13 == r3) goto L_0x0075
            r3 = 3707(0xe7b, float:5.195E-42)
            if (r13 == r3) goto L_0x006b
            r3 = 104(0x68, float:1.46E-43)
            if (r13 == r3) goto L_0x0061
            r3 = 105(0x69, float:1.47E-43)
            if (r13 == r3) goto L_0x0057
            r3 = 115(0x73, float:1.61E-43)
            if (r13 == r3) goto L_0x004d
            r3 = 116(0x74, float:1.63E-43)
            if (r13 == r3) goto L_0x0043
            goto L_0x0093
        L_0x0043:
            java.lang.String r3 = "t"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 0
            goto L_0x0094
        L_0x004d:
            java.lang.String r3 = "s"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 1
            goto L_0x0094
        L_0x0057:
            java.lang.String r3 = "i"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 4
            goto L_0x0094
        L_0x0061:
            java.lang.String r3 = "h"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 5
            goto L_0x0094
        L_0x006b:
            java.lang.String r3 = "to"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 6
            goto L_0x0094
        L_0x0075:
            java.lang.String r3 = "ti"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 7
            goto L_0x0094
        L_0x007f:
            java.lang.String r3 = "o"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 3
            goto L_0x0094
        L_0x0089:
            java.lang.String r3 = "e"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 2
            goto L_0x0094
        L_0x0093:
            r3 = -1
        L_0x0094:
            switch(r3) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00b4;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00a2;
                case 7: goto L_0x009c;
                default: goto L_0x0097;
            }
        L_0x0097:
            r18.skipValue()
            goto L_0x0012
        L_0x009c:
            android.graphics.PointF r15 = defpackage.abm.b(r18, r19)
            goto L_0x0012
        L_0x00a2:
            android.graphics.PointF r14 = defpackage.abm.b(r18, r19)
            goto L_0x0012
        L_0x00a8:
            int r3 = r18.nextInt()
            if (r3 != r4) goto L_0x00b1
            r5 = 1
            goto L_0x0012
        L_0x00b1:
            r5 = 0
            goto L_0x0012
        L_0x00b4:
            android.graphics.PointF r7 = defpackage.abm.b(r18, r19)
            goto L_0x0012
        L_0x00ba:
            android.graphics.PointF r6 = defpackage.abm.b(r18, r19)
            goto L_0x0012
        L_0x00c0:
            java.lang.Object r8 = r2.a(r0, r1)
            goto L_0x0012
        L_0x00c6:
            java.lang.Object r9 = r2.a(r0, r1)
            goto L_0x0012
        L_0x00cc:
            double r3 = r18.nextDouble()
            float r12 = (float) r3
            goto L_0x0012
        L_0x00d3:
            r18.endObject()
            if (r5 == 0) goto L_0x00de
            android.view.animation.Interpolator r0 = a
            r11 = r0
            r10 = r9
            goto L_0x014d
        L_0x00de:
            if (r6 == 0) goto L_0x0149
            if (r7 == 0) goto L_0x0149
            float r0 = r6.x
            float r2 = -r1
            float r0 = defpackage.acj.a(r0, r2, r1)
            r6.x = r0
            float r0 = r6.y
            r3 = 1120403456(0x42c80000, float:100.0)
            r4 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = defpackage.acj.a(r0, r4, r3)
            r6.y = r0
            float r0 = r7.x
            float r0 = defpackage.acj.a(r0, r2, r1)
            r7.x = r0
            float r0 = r7.y
            float r0 = defpackage.acj.a(r0, r4, r3)
            r7.y = r0
            float r0 = r6.x
            float r2 = r6.y
            float r3 = r7.x
            float r4 = r7.y
            int r0 = defpackage.ack.a(r0, r2, r3, r4)
            java.lang.ref.WeakReference r2 = a(r0)
            if (r2 == 0) goto L_0x0123
            java.lang.Object r3 = r2.get()
            r4 = r3
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            r16 = r4
            goto L_0x0125
        L_0x0123:
            r16 = 0
        L_0x0125:
            if (r2 == 0) goto L_0x0129
            if (r16 != 0) goto L_0x0145
        L_0x0129:
            float r2 = r6.x
            float r2 = r2 / r1
            float r3 = r6.y
            float r3 = r3 / r1
            float r4 = r7.x
            float r4 = r4 / r1
            float r5 = r7.y
            float r5 = r5 / r1
            android.view.animation.Interpolator r1 = defpackage.je.a(r2, r3, r4, r5)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0143 }
            r2.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0143 }
            a(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0143 }
            r11 = r1
            goto L_0x014c
        L_0x0143:
            r16 = r1
        L_0x0145:
            r10 = r8
            r11 = r16
            goto L_0x014d
        L_0x0149:
            android.view.animation.Interpolator r0 = a
            r11 = r0
        L_0x014c:
            r10 = r8
        L_0x014d:
            acl r0 = new acl
            r13 = 0
            r7 = r0
            r8 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.g = r14
            r0.h = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abn.a(xo, android.util.JsonReader, float, ace):acl");
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (abn.class) {
            if (b == null) {
                b = new dw<>();
            }
            weakReference = (WeakReference) b.a(i, null);
        }
        return weakReference;
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (abn.class) {
            b.b(i, weakReference);
        }
    }
}
