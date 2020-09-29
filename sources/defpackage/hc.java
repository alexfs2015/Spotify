package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hc reason: default package */
public final class hc {
    static final dt<String, Typeface> a = new dt<>(16);
    static final Object b = new Object();
    static final dv<String, ArrayList<defpackage.hd.a<c>>> c = new dv<>();
    private static final hd d = new hd("fonts", 10, 10000);
    private static final Comparator<byte[]> e = new Comparator<byte[]>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            int i2;
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    };

    /* renamed from: hc$a */
    public static class a {
        final int a;
        final b[] b;

        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }
    }

    /* renamed from: hc$b */
    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        final int e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) hr.a(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }
    }

    /* renamed from: hc$c */
    static final class c {
        final Typeface a;
        final int b;

        c(Typeface typeface, int i) {
            this.a = typeface;
            this.b = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        r3 = d;
        r3.a(new defpackage.hd.AnonymousClass2(r3, r1, new android.os.Handler(), new defpackage.hc.AnonymousClass3()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(final android.content.Context r2, final defpackage.hb r3, final defpackage.gb.a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            dt<java.lang.String, android.graphics.Typeface> r1 = a
            java.lang.Object r1 = r1.a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.a(r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            hc$c r2 = a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.b
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.a
            r4.a(r3, r5)
            goto L_0x0040
        L_0x003b:
            int r3 = r2.b
            r4.a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.a
            return r2
        L_0x0043:
            hc$1 r1 = new hc$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            hd r3 = d     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.a(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            hc$c r3 = (defpackage.hc.c) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            hc$2 r3 = new hc$2
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = b
            monitor-enter(r4)
            dv<java.lang.String, java.util.ArrayList<hd$a<hc$c>>> r5 = c     // Catch:{ all -> 0x0098 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0098 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x0098 }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
            r5.add(r3)     // Catch:{ all -> 0x0098 }
            dv<java.lang.String, java.util.ArrayList<hd$a<hc$c>>> r3 = c     // Catch:{ all -> 0x0098 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0098 }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            hd r3 = d
            hc$3 r4 = new hc$3
            r4.<init>(r0)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            hd$2 r6 = new hd$2
            r6.<init>(r1, r5, r4)
            r3.a(r6)
            return r2
        L_0x0098:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc.a(android.content.Context, hb, gb$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    static c a(Context context, hb hbVar, int i) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = hbVar.a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                StringBuilder sb = new StringBuilder("No package found for authority: ");
                sb.append(str);
                throw new NameNotFoundException(sb.toString());
            } else if (resolveContentProvider.packageName.equals(hbVar.b)) {
                List a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a2, e);
                List<List<byte[]>> a3 = hbVar.d != null ? hbVar.d : fy.a(resources, 0);
                int i2 = 0;
                while (true) {
                    if (i2 >= a3.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList = new ArrayList((Collection) a3.get(i2));
                    Collections.sort(arrayList, e);
                    if (a(a2, arrayList)) {
                        break;
                    }
                    i2++;
                }
                a aVar = resolveContentProvider == null ? new a(1, null) : new a(0, a(context, hbVar, resolveContentProvider.authority, null));
                int i3 = -3;
                if (aVar.a == 0) {
                    Typeface a4 = gf.a(context, null, aVar.b, i);
                    if (a4 != null) {
                        i3 = 0;
                    }
                    return new c(a4, i3);
                }
                if (aVar.a == 1) {
                    i3 = -2;
                }
                return new c(null, i3);
            } else {
                StringBuilder sb2 = new StringBuilder("Found content provider ");
                sb2.append(str);
                sb2.append(", but package was not ");
                sb2.append(hbVar.b);
                throw new NameNotFoundException(sb2.toString());
            }
        } catch (NameNotFoundException unused) {
            return new c(null, -1);
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (b bVar : bVarArr) {
            if (bVar.e == 0) {
                Uri uri = bVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, gl.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.hc.b[] a(android.content.Context r23, defpackage.hb r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
            r0 = r24
            r1 = r25
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r4)
            android.net.Uri$Builder r3 = r3.authority(r1)
            android.net.Uri r3 = r3.build()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            android.net.Uri$Builder r4 = r5.scheme(r4)
            android.net.Uri$Builder r1 = r4.authority(r1)
            java.lang.String r4 = "file"
            android.net.Uri$Builder r1 = r1.appendPath(r4)
            android.net.Uri r1 = r1.build()
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0145 }
            r6 = 16
            java.lang.String r8 = "font_variation_settings"
            r11 = 7
            java.lang.String r12 = "result_code"
            java.lang.String r13 = "font_italic"
            java.lang.String r14 = "font_weight"
            java.lang.String r15 = "font_ttc_index"
            java.lang.String r4 = "file_id"
            java.lang.String r7 = "_id"
            r9 = 1
            r10 = 0
            if (r5 <= r6) goto L_0x0084
            android.content.ContentResolver r5 = r23.getContentResolver()     // Catch:{ all -> 0x0145 }
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ all -> 0x0145 }
            r11[r10] = r7     // Catch:{ all -> 0x0145 }
            r11[r9] = r4     // Catch:{ all -> 0x0145 }
            r6 = 2
            r11[r6] = r15     // Catch:{ all -> 0x0145 }
            r6 = 3
            r11[r6] = r8     // Catch:{ all -> 0x0145 }
            r6 = 4
            r11[r6] = r14     // Catch:{ all -> 0x0145 }
            r6 = 5
            r11[r6] = r13     // Catch:{ all -> 0x0145 }
            r6 = 6
            r11[r6] = r12     // Catch:{ all -> 0x0145 }
            java.lang.String r8 = "query = ?"
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x0145 }
            r6[r10] = r0     // Catch:{ all -> 0x0145 }
            r0 = 0
            r16 = r6
            r6 = r3
            r19 = r7
            r7 = r11
            r11 = 1
            r9 = r16
            r20 = r2
            r2 = 0
            r10 = r0
            r0 = 1
            r11 = r26
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0145 }
            r11 = r19
            r2 = 1
            goto L_0x00b6
        L_0x0084:
            r20 = r2
            r19 = r7
            r2 = 0
            r10 = 1
            android.content.ContentResolver r5 = r23.getContentResolver()     // Catch:{ all -> 0x0145 }
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ all -> 0x0145 }
            r11 = r19
            r7[r2] = r11     // Catch:{ all -> 0x0145 }
            r7[r10] = r4     // Catch:{ all -> 0x0145 }
            r6 = 2
            r7[r6] = r15     // Catch:{ all -> 0x0145 }
            r6 = 3
            r7[r6] = r8     // Catch:{ all -> 0x0145 }
            r6 = 4
            r7[r6] = r14     // Catch:{ all -> 0x0145 }
            r6 = 5
            r7[r6] = r13     // Catch:{ all -> 0x0145 }
            r6 = 6
            r7[r6] = r12     // Catch:{ all -> 0x0145 }
            java.lang.String r8 = "query = ?"
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x0145 }
            r9[r2] = r0     // Catch:{ all -> 0x0145 }
            r0 = 0
            r6 = r3
            r2 = 1
            r10 = r0
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0145 }
            r5 = r0
        L_0x00b6:
            if (r5 == 0) goto L_0x0134
            int r0 = r5.getCount()     // Catch:{ all -> 0x0132 }
            if (r0 <= 0) goto L_0x0134
            int r0 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x0132 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0132 }
            r6.<init>()     // Catch:{ all -> 0x0132 }
            int r7 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x0132 }
            int r4 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x0132 }
            int r8 = r5.getColumnIndex(r15)     // Catch:{ all -> 0x0132 }
            int r9 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x0132 }
            int r10 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x0132 }
        L_0x00db:
            boolean r11 = r5.moveToNext()     // Catch:{ all -> 0x0132 }
            if (r11 == 0) goto L_0x0136
            r11 = -1
            if (r0 == r11) goto L_0x00eb
            int r12 = r5.getInt(r0)     // Catch:{ all -> 0x0132 }
            r22 = r12
            goto L_0x00ed
        L_0x00eb:
            r22 = 0
        L_0x00ed:
            if (r8 == r11) goto L_0x00f6
            int r12 = r5.getInt(r8)     // Catch:{ all -> 0x0132 }
            r19 = r12
            goto L_0x00f8
        L_0x00f6:
            r19 = 0
        L_0x00f8:
            if (r4 != r11) goto L_0x0103
            long r12 = r5.getLong(r7)     // Catch:{ all -> 0x0132 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r3, r12)     // Catch:{ all -> 0x0132 }
            goto L_0x010b
        L_0x0103:
            long r12 = r5.getLong(r4)     // Catch:{ all -> 0x0132 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r1, r12)     // Catch:{ all -> 0x0132 }
        L_0x010b:
            r18 = r12
            if (r9 == r11) goto L_0x0116
            int r12 = r5.getInt(r9)     // Catch:{ all -> 0x0132 }
            r20 = r12
            goto L_0x011a
        L_0x0116:
            r12 = 400(0x190, float:5.6E-43)
            r20 = 400(0x190, float:5.6E-43)
        L_0x011a:
            if (r10 == r11) goto L_0x0125
            int r11 = r5.getInt(r10)     // Catch:{ all -> 0x0132 }
            if (r11 != r2) goto L_0x0125
            r21 = 1
            goto L_0x0127
        L_0x0125:
            r21 = 0
        L_0x0127:
            hc$b r11 = new hc$b     // Catch:{ all -> 0x0132 }
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0132 }
            r6.add(r11)     // Catch:{ all -> 0x0132 }
            goto L_0x00db
        L_0x0132:
            r0 = move-exception
            goto L_0x0147
        L_0x0134:
            r6 = r20
        L_0x0136:
            if (r5 == 0) goto L_0x013b
            r5.close()
        L_0x013b:
            r0 = 0
            hc$b[] r0 = new defpackage.hc.b[r0]
            java.lang.Object[] r0 = r6.toArray(r0)
            hc$b[] r0 = (defpackage.hc.b[]) r0
            return r0
        L_0x0145:
            r0 = move-exception
            r5 = 0
        L_0x0147:
            if (r5 == 0) goto L_0x014c
            r5.close()
        L_0x014c:
            goto L_0x014e
        L_0x014d:
            throw r0
        L_0x014e:
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc.a(android.content.Context, hb, java.lang.String, android.os.CancellationSignal):hc$b[]");
    }
}
