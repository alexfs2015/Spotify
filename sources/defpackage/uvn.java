package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.Downloader;

/* renamed from: uvn reason: default package */
public final class uvn implements Downloader {
    private final String a;
    private final ContentResolver b;

    public uvn(Context context) {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(context.getPackageName());
        sb.append("/image/");
        this(sb.toString(), context.getContentResolver());
    }

    private uvn(String str, ContentResolver contentResolver) {
        this.a = str;
        this.b = contentResolver;
    }

    private Uri a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(Uri.encode(str));
        return Uri.parse(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.Downloader.a a(android.net.Uri r6, int r7) {
        /*
            r5 = this;
            java.lang.String r7 = r6.toString()
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "spotify"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "spotify:image:"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 14
            java.lang.String r7 = r7.substring(r0)
            java.nio.charset.Charset r0 = defpackage.far.c
            byte[] r7 = r7.getBytes(r0)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r2)
            android.net.Uri r7 = r5.a(r7)
            goto L_0x0069
        L_0x002e:
            java.lang.String r0 = "spotify:localfileimage:"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0056
            java.nio.charset.Charset r0 = defpackage.far.c
            byte[] r7 = r7.getBytes(r0)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r2)
            android.net.Uri r7 = r5.a(r7)
            goto L_0x0069
        L_0x0045:
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            goto L_0x005b
        L_0x0056:
            android.net.Uri r7 = r5.a(r7)
            goto L_0x0069
        L_0x005b:
            java.nio.charset.Charset r0 = defpackage.far.c
            byte[] r7 = r7.getBytes(r0)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r2)
            android.net.Uri r7 = r5.a(r7)
        L_0x0069:
            r0 = 0
            android.content.ContentResolver r1 = r5.b     // Catch:{ FileNotFoundException -> 0x0071 }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0071 }
            goto L_0x007c
        L_0x0071:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r1, r3)
            r1 = r0
        L_0x007c:
            if (r1 != 0) goto L_0x008c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            java.lang.String r6 = "Failed to loaded image: %s -> %s"
            com.spotify.base.java.logging.Logger.e(r6, r1)
            return r0
        L_0x008c:
            com.squareup.picasso.Downloader$a r6 = new com.squareup.picasso.Downloader$a
            r3 = 0
            r6.<init>(r1, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvn.a(android.net.Uri, int):com.squareup.picasso.Downloader$a");
    }
}
