package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: amx reason: default package */
public final class amx {
    private static Handler a;
    private static ann b = new ann(8);
    private static ann c = new ann(2);
    private static final Map<d, c> d = new HashMap();

    /* renamed from: amx$a */
    static class a implements Runnable {
        private Context a;
        private d b;
        private boolean c;

        a(Context context, d dVar, boolean z) {
            this.a = context;
            this.b = dVar;
            this.c = z;
        }

        public final void run() {
            amx.a(this.b, this.a, this.c);
        }
    }

    /* renamed from: amx$b */
    static class b implements Runnable {
        private Context a;
        private d b;

        b(Context context, d dVar) {
            this.a = context;
            this.b = dVar;
        }

        public final void run() {
            amx.a(this.b, this.a);
        }
    }

    /* renamed from: amx$c */
    static class c {
        defpackage.ann.a a;
        amy b;
        boolean c;

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* renamed from: amx$d */
    static class d {
        Uri a;
        Object b;

        d(Uri uri, Object obj) {
            this.a = uri;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a == this.a && dVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 1073) * 37) + this.b.hashCode();
        }
    }

    private static c a(d dVar) {
        c cVar;
        synchronized (d) {
            cVar = (c) d.remove(dVar);
        }
        return cVar;
    }

    private static synchronized Handler a() {
        Handler handler;
        synchronized (amx.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v15, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.facebook.FacebookException] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r11v20 */
    /* JADX WARNING: type inference failed for: r11v21 */
    /* JADX WARNING: type inference failed for: r11v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r11 = 0;
        r2 = false;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        r10 = th;
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4
      assigns: []
      uses: []
      mth insns count: 96
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.amx.d r10, android.content.Context r11) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00af, all -> 0x00a6 }
            android.net.Uri r4 = r10.a     // Catch:{ IOException -> 0x00af, all -> 0x00a6 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00af, all -> 0x00a6 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00af, all -> 0x00a6 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x00af, all -> 0x00a6 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00af, all -> 0x00a6 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x0092
            r11 = 301(0x12d, float:4.22E-43)
            if (r4 == r11) goto L_0x005f
            r11 = 302(0x12e, float:4.23E-43)
            if (r4 == r11) goto L_0x005f
            java.io.InputStream r11 = r3.getErrorStream()     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r4.<init>()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r11 == 0) goto L_0x0049
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r5.<init>(r11)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r6 = 128(0x80, float:1.794E-43)
            char[] r7 = new char[r6]     // Catch:{ IOException -> 0x005d, all -> 0x005a }
        L_0x003b:
            int r8 = r5.read(r7, r1, r6)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r8 <= 0) goto L_0x0045
            r4.append(r7, r1, r8)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            goto L_0x003b
        L_0x0045:
            defpackage.ank.a(r5)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = "Unexpected error while downloading an image."
            r4.append(r5)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
        L_0x004e:
            com.facebook.FacebookException r5 = new com.facebook.FacebookException     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r5.<init>(r4)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r4 = r0
            r0 = r5
            goto L_0x009a
        L_0x005a:
            r10 = move-exception
            r0 = r11
            goto L_0x00a8
        L_0x005d:
            r4 = move-exception
            goto L_0x00b2
        L_0x005f:
            java.lang.String r11 = "location"
            java.lang.String r11 = r3.getHeaderField(r11)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            boolean r2 = defpackage.ank.a(r11)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            if (r2 != 0) goto L_0x008a
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            android.net.Uri r2 = r10.a     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            defpackage.anj.a(r2, r11)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            amx$c r2 = a(r10)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            if (r2 == 0) goto L_0x008a
            boolean r4 = r2.c     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            if (r4 != 0) goto L_0x008a
            amy r2 = r2.b     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            amx$d r4 = new amx$d     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            java.lang.Object r5 = r10.b     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            r4.<init>(r11, r5)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
            a(r2, r4, r1)     // Catch:{ IOException -> 0x008e, all -> 0x00a1 }
        L_0x008a:
            r11 = r0
            r4 = r11
            r2 = 0
            goto L_0x009a
        L_0x008e:
            r4 = move-exception
            r11 = r0
            r2 = 0
            goto L_0x00b2
        L_0x0092:
            java.io.InputStream r11 = defpackage.ana.a(r11, r3)     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
        L_0x009a:
            defpackage.ank.a(r11)
            defpackage.ank.a(r3)
            goto L_0x00bb
        L_0x00a1:
            r10 = move-exception
            goto L_0x00a8
        L_0x00a3:
            r4 = move-exception
            r11 = r0
            goto L_0x00b2
        L_0x00a6:
            r10 = move-exception
            r3 = r0
        L_0x00a8:
            defpackage.ank.a(r0)
            defpackage.ank.a(r3)
            throw r10
        L_0x00af:
            r4 = move-exception
            r11 = r0
            r3 = r11
        L_0x00b2:
            defpackage.ank.a(r11)
            defpackage.ank.a(r3)
            r9 = r4
            r4 = r0
            r0 = r9
        L_0x00bb:
            if (r2 == 0) goto L_0x00c0
            a(r10, r0, r4, r1)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amx.a(amx$d, android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.amx.d r2, android.content.Context r3, boolean r4) {
        /*
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L_0x0014
            android.net.Uri r4 = r2.a
            android.net.Uri r4 = defpackage.anj.a(r4)
            if (r4 == 0) goto L_0x0014
            java.io.InputStream r4 = defpackage.ana.a(r4, r3)
            if (r4 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r4 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x001d
            android.net.Uri r4 = r2.a
            java.io.InputStream r4 = defpackage.ana.a(r4, r3)
        L_0x001d:
            if (r4 == 0) goto L_0x002a
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4)
            defpackage.ank.a(r4)
            a(r2, r1, r3, r0)
            return
        L_0x002a:
            amx$c r3 = a(r2)
            if (r3 == 0) goto L_0x0042
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x0042
            amy r3 = r3.b
            ann r4 = b
            amx$b r0 = new amx$b
            android.content.Context r1 = r3.a
            r0.<init>(r1, r2)
            a(r3, r2, r4, r0)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amx.a(amx$d, android.content.Context, boolean):void");
    }

    private static void a(d dVar, Exception exc, Bitmap bitmap, boolean z) {
        c a2 = a(dVar);
        if (a2 != null && !a2.c) {
            final amy amy = a2.b;
            final defpackage.amy.b bVar = amy.c;
            if (bVar != null) {
                Handler a3 = a();
                final Exception exc2 = exc;
                final boolean z2 = z;
                final Bitmap bitmap2 = bitmap;
                AnonymousClass1 r1 = new Runnable() {
                    public final void run() {
                        bVar.a(new amz(amy, exc2, z2, bitmap2));
                    }
                };
                a3.post(r1);
            }
        }
    }

    public static void a(amy amy) {
        if (amy != null) {
            d dVar = new d(amy.b, amy.e);
            synchronized (d) {
                c cVar = (c) d.get(dVar);
                if (cVar != null) {
                    cVar.b = amy;
                    cVar.c = false;
                    cVar.a.b();
                } else {
                    a(amy, dVar, amy.d);
                }
            }
        }
    }

    private static void a(amy amy, d dVar, ann ann, Runnable runnable) {
        synchronized (d) {
            c cVar = new c(0);
            cVar.b = amy;
            d.put(dVar, cVar);
            cVar.a = ann.a(runnable, true);
        }
    }

    private static void a(amy amy, d dVar, boolean z) {
        a(amy, dVar, c, (Runnable) new a(amy.a, dVar, z));
    }

    public static boolean b(amy amy) {
        boolean z;
        d dVar = new d(amy.b, amy.e);
        synchronized (d) {
            c cVar = (c) d.get(dVar);
            z = true;
            if (cVar == null) {
                z = false;
            } else if (cVar.a.a()) {
                d.remove(dVar);
            } else {
                cVar.c = true;
            }
        }
        return z;
    }
}
