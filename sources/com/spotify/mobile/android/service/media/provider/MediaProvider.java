package com.spotify.mobile.android.service.media.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MediaProvider extends wht {
    public rtw a;
    public who<vex> b;
    private UriMatcher c;
    private vex d;
    private byte[] e;

    private ParcelFileDescriptor a(Uri uri, String str) {
        Logger.a("Resolving image with uri: \"%s\".", uri);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        String str2 = "misu..ocmosnfoitp//cyntte:c";
        try {
            ParcelFileDescriptor openFileDescriptor = getContext().getContentResolver().openFileDescriptor(Uri.parse("content://com.spotify.music").buildUpon().encodedPath(uri.getEncodedPath()).build(), str);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return openFileDescriptor;
        } catch (NullPointerException e2) {
            e = e2;
            String str3 = " o%miu /laFmilt: oh gr/ee.tai w/das/d ";
            try {
                Logger.e(e, "Failed to load image with uri: \"%s\".", uri);
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            String str32 = " o%miu /laFmilt: oh gr/ee.tai w/das/d ";
            Logger.e(e, "Failed to load image with uri: \"%s\".", uri);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return null;
        }
    }

    private boolean a() {
        if (getContext() == null) {
            return false;
        }
        if (this.d == null) {
            this.d = (vex) this.b.get();
        }
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid = getContext().getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            String name = getClass().getName();
            for (String a2 : packagesForUid) {
                if (this.d.a(getContext(), a2, callingUid, name)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b() {
        String string = getContext().getString(R.string.media_provider_authority);
        this.c = new UriMatcher(-1);
        String str = "*aemoi/";
        this.c.addURI(string, "image/*", 0);
        String str2 = "cagnrbkdbu";
        int i = 5 << 1;
        this.c.addURI(string, "background", 1);
        String str3 = "hmigarbee/s";
        this.c.addURI(string, "share/image", 2);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        if (this.c == null) {
            b();
        }
        if (this.c.match(uri) != 2) {
            return null;
        }
        String str = "ea/mpijtge";
        return "image/jpeg";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (this.c == null) {
            b();
        }
        if (this.c.match(uri) != 2) {
            return null;
        }
        String str = "image";
        if (contentValues.containsKey(str)) {
            this.e = contentValues.getAsByteArray(str);
        }
        return uri;
    }

    public boolean onCreate() {
        fbp.a(super.onCreate());
        this.a.a();
        String str = "iCMaodnep.rvierredePao";
        Logger.a("MediaProvider.onCreate", new Object[0]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        android.os.Binder.restoreCallingIdentity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0066, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri r7, java.lang.String r8) {
        /*
            r6 = this;
            r5 = 2
            monitor-enter(r6)
            boolean r0 = r6.a()     // Catch:{ all -> 0x0067 }
            r5 = 7
            if (r0 != 0) goto L_0x0010
            android.content.res.AssetFileDescriptor r7 = super.openAssetFile(r7, r8)     // Catch:{ all -> 0x0067 }
            r5 = 5
            monitor-exit(r6)
            return r7
        L_0x0010:
            r5 = 5
            android.content.UriMatcher r0 = r6.c     // Catch:{ all -> 0x0067 }
            r5 = 1
            if (r0 != 0) goto L_0x001a
            r5 = 2
            r6.b()     // Catch:{ all -> 0x0067 }
        L_0x001a:
            r5 = 6
            android.content.UriMatcher r0 = r6.c     // Catch:{ all -> 0x0067 }
            int r0 = r0.match(r7)     // Catch:{ all -> 0x0067 }
            r5 = 7
            r1 = 1
            if (r0 == r1) goto L_0x0026
            goto L_0x005a
        L_0x0026:
            r5 = 3
            long r0 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0067 }
            r5 = 7
            android.content.Context r2 = r6.getContext()     // Catch:{ IOException -> 0x0048 }
            r5 = 2
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0048 }
            r5 = 4
            java.lang.String r3 = "mediaapi_background.png"
            r5 = 0
            android.content.res.AssetFileDescriptor r7 = r2.openFd(r3)     // Catch:{ IOException -> 0x0048 }
            r5 = 6
            android.os.Binder.restoreCallingIdentity(r0)     // Catch:{ all -> 0x0067 }
            r5 = 0
            monitor-exit(r6)
            r5 = 0
            return r7
        L_0x0045:
            r7 = move-exception
            r5 = 2
            goto L_0x0062
        L_0x0048:
            r2 = move-exception
            r5 = 1
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x0045 }
            r5 = 0
            r4 = 0
            r5 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0045 }
            r5 = 2
            com.spotify.base.java.logging.Logger.d(r2, r3, r4)     // Catch:{ all -> 0x0045 }
            android.os.Binder.restoreCallingIdentity(r0)     // Catch:{ all -> 0x0067 }
        L_0x005a:
            r5 = 2
            android.content.res.AssetFileDescriptor r7 = super.openAssetFile(r7, r8)     // Catch:{ all -> 0x0067 }
            r5 = 0
            monitor-exit(r6)
            return r7
        L_0x0062:
            android.os.Binder.restoreCallingIdentity(r0)     // Catch:{ all -> 0x0067 }
            r5 = 3
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r7 = move-exception
            r5 = 5
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.media.provider.MediaProvider.openAssetFile(android.net.Uri, java.lang.String):android.content.res.AssetFileDescriptor");
    }

    /* JADX INFO: finally extract failed */
    public synchronized ParcelFileDescriptor openFile(Uri uri, String str) {
        String str2 = "PidnvlpFetdeMiea.eioro";
        try {
            Logger.a("MediaProvider.openFile", new Object[0]);
            if (!a()) {
                return super.openFile(uri, str);
            }
            if (this.c == null) {
                b();
            }
            int match = this.c.match(uri);
            if (match == 0) {
                return a(uri, str);
            } else if (match != 2) {
                return super.openFile(uri, str);
            } else {
                return hvu.a(new ByteArrayInputStream(this.e));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
