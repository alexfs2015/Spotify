package com.spotify.mobile.android.service.media.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MediaProvider extends vtn {
    public rkq a;
    public vti<ruk> b;
    private UriMatcher c;
    private ruk d;
    private byte[] e;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        fay.a(super.onCreate());
        this.a.a();
        Logger.a("MediaProvider.onCreate", new Object[0]);
        return true;
    }

    public String getType(Uri uri) {
        if (this.c == null) {
            b();
        }
        if (this.c.match(uri) != 2) {
            return null;
        }
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

    public synchronized ParcelFileDescriptor openFile(Uri uri, String str) {
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
            return htg.a(new ByteArrayInputStream(this.e));
        }
    }

    /* JADX INFO: finally extract failed */
    private ParcelFileDescriptor a(Uri uri, String str) {
        Logger.a("Resolving image with uri: \"%s\".", uri);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ParcelFileDescriptor openFileDescriptor = getContext().getContentResolver().openFileDescriptor(Uri.parse("content://com.spotify.music").buildUpon().encodedPath(uri.getEncodedPath()).build(), str);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return openFileDescriptor;
        } catch (IOException | NullPointerException e2) {
            Logger.e(e2, "Failed to load image with uri: \"%s\".", uri);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return null;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public synchronized AssetFileDescriptor openAssetFile(Uri uri, String str) {
        if (!a()) {
            return super.openAssetFile(uri, str);
        }
        if (this.c == null) {
            b();
        }
        if (this.c.match(uri) == 1) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AssetFileDescriptor openFd = getContext().getAssets().openFd("mediaapi_background.png");
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return openFd;
            } catch (IOException e2) {
                try {
                    Logger.d(e2, e2.getMessage(), new Object[0]);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        }
        return super.openAssetFile(uri, str);
    }

    private boolean a() {
        if (getContext() == null) {
            return false;
        }
        if (this.d == null) {
            this.d = (ruk) this.b.get();
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
        this.c.addURI(string, "image/*", 0);
        this.c.addURI(string, "background", 1);
        this.c.addURI(string, "share/image", 2);
    }
}
