package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

/* renamed from: wjb reason: default package */
final class wjb extends ContextWrapper {
    private final String a;
    private final String b;

    public wjb(Context context, String str, String str2) {
        super(context);
        this.b = str;
        this.a = str2;
    }

    public final File getCacheDir() {
        return new File(super.getCacheDir(), this.a);
    }

    public final File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.a);
        file.mkdirs();
        return new File(file, str);
    }

    public final File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.a);
    }

    public final File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.a);
    }

    public final File getFilesDir() {
        return new File(super.getFilesDir(), this.a);
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(":");
        sb.append(str);
        return super.getSharedPreferences(sb.toString(), i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
