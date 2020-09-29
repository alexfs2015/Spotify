package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import java.io.File;

/* renamed from: mnw reason: default package */
public final class mnw {
    private static final String[] d = {"_data"};
    public final Context a;
    public final a b;
    public final b c;

    /* renamed from: mnw$a */
    public interface a {
        String a(Uri uri);

        boolean a(Context context, Uri uri);
    }

    /* renamed from: mnw$b */
    public interface b {
        File getExternalStorageDirectory();
    }

    public mnw(Context context) {
        this.a = context;
        if (VERSION.SDK_INT >= 19) {
            this.b = new a() {
                public final boolean a(Context context, Uri uri) {
                    return DocumentsContract.isDocumentUri(context, uri);
                }

                public final String a(Uri uri) {
                    return DocumentsContract.getDocumentId(uri);
                }
            };
        } else {
            this.b = new a() {
                public final String a(Uri uri) {
                    return "";
                }

                public final boolean a(Context context, Uri uri) {
                    return false;
                }
            };
        }
        this.c = $$Lambda$EoBRsgVmx6w2BFXMy37UZxl92rE.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r9 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r9 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            r8 = this;
            r0 = 0
            android.content.Context r1 = r8.a     // Catch:{ IllegalArgumentException -> 0x0031, all -> 0x002e }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0031, all -> 0x002e }
            java.lang.String[] r4 = d     // Catch:{ IllegalArgumentException -> 0x0031, all -> 0x002e }
            r7 = 0
            r3 = r9
            r5 = r10
            r6 = r11
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0031, all -> 0x002e }
            if (r9 == 0) goto L_0x002b
            boolean r10 = r9.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x0029 }
            if (r10 == 0) goto L_0x002b
            java.lang.String r10 = "_data"
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ IllegalArgumentException -> 0x0029 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ IllegalArgumentException -> 0x0029 }
            if (r9 == 0) goto L_0x0028
            r9.close()
        L_0x0028:
            return r10
        L_0x0029:
            r10 = move-exception
            goto L_0x0033
        L_0x002b:
            if (r9 == 0) goto L_0x0040
            goto L_0x003d
        L_0x002e:
            r10 = move-exception
            r9 = r0
            goto L_0x0042
        L_0x0031:
            r10 = move-exception
            r9 = r0
        L_0x0033:
            java.lang.String r11 = "Unable to access cursor"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0041 }
            com.spotify.base.java.logging.Logger.e(r10, r11, r1)     // Catch:{ all -> 0x0041 }
            if (r9 == 0) goto L_0x0040
        L_0x003d:
            r9.close()
        L_0x0040:
            return r0
        L_0x0041:
            r10 = move-exception
        L_0x0042:
            if (r9 == 0) goto L_0x0047
            r9.close()
        L_0x0047:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnw.a(android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
