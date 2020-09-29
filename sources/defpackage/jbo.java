package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.google.common.base.Optional;
import java.io.InputStream;

/* renamed from: jbo reason: default package */
public final class jbo {
    private final a a;
    private final DisplayMetrics b;

    /* renamed from: jbo$a */
    public static class a {
    }

    public jbo(a aVar, DisplayMetrics displayMetrics) {
        this.a = aVar;
        this.b = displayMetrics;
    }

    public final Optional<Bitmap> a(xgo<xam> xgo) {
        if (!xgo.a() || xgo.b() == null) {
            return Optional.e();
        }
        try {
            InputStream d = ((xam) xgo.b()).d();
            Bitmap decodeStream = BitmapFactory.decodeStream(d);
            d.close();
            return Optional.c(decodeStream);
        } catch (Exception unused) {
            return Optional.e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b8, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        if (r3 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x00ad, B:21:0x00b6, B:28:0x00be] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00be */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.Optional<android.graphics.Bitmap> b(defpackage.xgo<defpackage.xam> r23) {
        /*
            r22 = this;
            r0 = r23
            boolean r1 = r23.a()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r23.b()
            if (r1 != 0) goto L_0x0010
            goto L_0x00cd
        L_0x0010:
            xal r1 = r0.a
            xac r1 = r1.f
            java.lang.String r2 = "X-Background-Top-Color"
            java.lang.String r1 = r1.a(r2)
            xal r2 = r0.a
            xac r2 = r2.f
            java.lang.String r3 = "X-Background-Bottom-Color"
            java.lang.String r2 = r2.a(r3)
            if (r1 == 0) goto L_0x00c6
            if (r2 != 0) goto L_0x002a
            goto L_0x00c6
        L_0x002a:
            java.lang.Object r0 = r23.b()     // Catch:{ IOException | IllegalArgumentException -> 0x00bf }
            xam r0 = (defpackage.xam) r0     // Catch:{ IOException | IllegalArgumentException -> 0x00bf }
            java.io.InputStream r3 = r0.d()     // Catch:{ IOException | IllegalArgumentException -> 0x00bf }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x00b3 }
            r4 = r22
            android.util.DisplayMetrics r5 = r4.b     // Catch:{ all -> 0x00b1 }
            int r5 = r5.widthPixels     // Catch:{ all -> 0x00b1 }
            int r6 = r5 << 4
            int r6 = r6 / 9
            android.graphics.LinearGradient r15 = new android.graphics.LinearGradient     // Catch:{ all -> 0x00b1 }
            r8 = 0
            r9 = 0
            r10 = 0
            float r14 = (float) r6     // Catch:{ all -> 0x00b1 }
            int r12 = android.graphics.Color.parseColor(r1)     // Catch:{ all -> 0x00b1 }
            int r13 = android.graphics.Color.parseColor(r2)     // Catch:{ all -> 0x00b1 }
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ all -> 0x00b1 }
            r7 = r15
            r11 = r14
            r2 = r14
            r14 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00b1 }
            android.graphics.Paint r1 = new android.graphics.Paint     // Catch:{ all -> 0x00b1 }
            r1.<init>()     // Catch:{ all -> 0x00b1 }
            r7 = 1
            r1.setDither(r7)     // Catch:{ all -> 0x00b1 }
            r1.setShader(r15)     // Catch:{ all -> 0x00b1 }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00b1 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r5, r6, r7)     // Catch:{ all -> 0x00b1 }
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch:{ all -> 0x00b1 }
            r7.<init>(r6)     // Catch:{ all -> 0x00b1 }
            r17 = 0
            r18 = 0
            float r5 = (float) r5     // Catch:{ all -> 0x00b1 }
            r16 = r7
            r19 = r5
            r20 = r2
            r21 = r1
            r16.drawRect(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00b1 }
            int r1 = r6.getWidth()     // Catch:{ all -> 0x00b1 }
            float r1 = (float) r1     // Catch:{ all -> 0x00b1 }
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            int r5 = r0.getWidth()     // Catch:{ all -> 0x00b1 }
            float r5 = (float) r5     // Catch:{ all -> 0x00b1 }
            float r5 = r5 * r2
            float r1 = r1 - r5
            int r5 = r6.getHeight()     // Catch:{ all -> 0x00b1 }
            float r5 = (float) r5     // Catch:{ all -> 0x00b1 }
            r8 = 1053609165(0x3ecccccd, float:0.4)
            float r5 = r5 * r8
            int r8 = r0.getHeight()     // Catch:{ all -> 0x00b1 }
            float r8 = (float) r8     // Catch:{ all -> 0x00b1 }
            float r8 = r8 * r2
            float r5 = r5 - r8
            r2 = 0
            r7.drawBitmap(r0, r1, r5, r2)     // Catch:{ all -> 0x00b1 }
            com.google.common.base.Optional r0 = com.google.common.base.Optional.b(r6)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00b0
            r3.close()     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
        L_0x00b0:
            return r0
        L_0x00b1:
            r0 = move-exception
            goto L_0x00b6
        L_0x00b3:
            r0 = move-exception
            r4 = r22
        L_0x00b6:
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L_0x00be
            r3.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r1     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
        L_0x00bf:
            r4 = r22
        L_0x00c1:
            com.google.common.base.Optional r0 = com.google.common.base.Optional.e()
            return r0
        L_0x00c6:
            r4 = r22
            com.google.common.base.Optional r0 = com.google.common.base.Optional.e()
            return r0
        L_0x00cd:
            r4 = r22
            com.google.common.base.Optional r0 = com.google.common.base.Optional.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbo.b(xgo):com.google.common.base.Optional");
    }
}
