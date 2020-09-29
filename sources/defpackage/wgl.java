package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* renamed from: wgl reason: default package */
public final class wgl implements wfy {
    private LinkedHashMap<String, Bitmap> a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public wgl(int i) {
        if (i > 0) {
            this.b = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    public wgl(Context context) {
        this(whb.c(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.c     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.c     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.c     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.c     // Catch:{ all -> 0x0071 }
            int r0 = defpackage.whb.a(r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.c = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.e     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.e = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0075
        L_0x0074:
            throw r4
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgl.a(int):void");
    }

    public final synchronized int a() {
        return this.c;
    }

    public final Bitmap a(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = (Bitmap) this.a.get(str);
                if (bitmap != null) {
                    this.f++;
                    return bitmap;
                }
                this.g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.d++;
            this.c += whb.a(bitmap);
            Bitmap bitmap2 = (Bitmap) this.a.put(str, bitmap);
            if (bitmap2 != null) {
                this.c -= whb.a(bitmap2);
            }
        }
        a(this.b);
    }

    public final synchronized int b() {
        return this.b;
    }
}
