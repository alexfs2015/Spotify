package com.spotify.music.internal.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SpotifyProvider extends vtn {
    public rkq a;
    public hgk b;
    private ExecutorService c;

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        fay.a(super.onCreate());
        this.a.a();
        if (this.c == null) {
            this.c = Executors.newFixedThreadPool(5);
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c A[Catch:{ all -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r6, java.lang.String r7) {
        /*
            r5 = this;
            hgk r0 = r5.b
            r0.b()
            r0 = 0
            if (r6 != 0) goto L_0x000a
        L_0x0008:
            r1 = r0
            goto L_0x0034
        L_0x000a:
            java.util.List r1 = r6.getPathSegments()     // Catch:{ all -> 0x0068 }
            int r2 = r1.size()     // Catch:{ all -> 0x0068 }
            r3 = 2
            if (r2 < r3) goto L_0x0008
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "image"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x0025
            goto L_0x0008
        L_0x0025:
            java.lang.String r2 = "/"
            r3 = 1
            int r4 = r1.size()     // Catch:{ all -> 0x0068 }
            java.util.List r1 = r1.subList(r3, r4)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)     // Catch:{ all -> 0x0068 }
        L_0x0034:
            hgk r2 = r5.b     // Catch:{ all -> 0x0068 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x0062
            if (r1 != 0) goto L_0x003f
            goto L_0x0062
        L_0x003f:
            boolean r0 = defpackage.hda.a(r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0051
            hgk r6 = r5.b     // Catch:{ all -> 0x0068 }
            android.os.ParcelFileDescriptor r6 = defpackage.hda.a(r1, r6)     // Catch:{ all -> 0x0068 }
        L_0x004b:
            hgk r7 = r5.b
            r7.c()
            return r6
        L_0x0051:
            hgk r0 = r5.b     // Catch:{ all -> 0x0068 }
            hmu r0 = r0.d()     // Catch:{ all -> 0x0068 }
            android.os.ParcelFileDescriptor r0 = r0.a(r1)     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0062
            android.os.ParcelFileDescriptor r6 = super.openFile(r6, r7)     // Catch:{ all -> 0x0068 }
            goto L_0x004b
        L_0x0062:
            hgk r6 = r5.b
            r6.c()
            return r0
        L_0x0068:
            r6 = move-exception
            hgk r7 = r5.b
            r7.c()
            goto L_0x0070
        L_0x006f:
            throw r6
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.internal.provider.SpotifyProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }
}
