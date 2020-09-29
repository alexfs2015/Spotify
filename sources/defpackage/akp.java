package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

/* renamed from: akp reason: default package */
public class akp extends ContentProvider {
    private static final String a = akp.class.getName();

    private static Pair<UUID, String> a(Uri uri) {
        String str = "..";
        try {
            String[] split = uri.getPath().substring(1).split("/");
            String str2 = split[0];
            String str3 = split[1];
            if (!str.contentEquals(str2) && !str.contentEquals(str3)) {
                return new Pair<>(UUID.fromString(str2), str3);
            }
            throw new Exception();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str, UUID uuid, String str2) {
        return String.format("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2});
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair a2 = a(uri);
        if (a2 != null) {
            try {
                File a3 = ane.a((UUID) a2.first, (String) a2.second);
                if (a3 != null) {
                    return ParcelFileDescriptor.open(a3, 268435456);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                String str2 = a;
                StringBuilder sb = new StringBuilder("Got unexpected exception:");
                sb.append(e);
                Log.e(str2, sb.toString());
                throw e;
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
