package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;

/* renamed from: py reason: default package */
final class py implements pt {
    private static final String[] a = new String[0];
    private final SQLiteDatabase b;

    static {
        String[] strArr = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    py(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public final Cursor a(final pw pwVar) {
        return this.b.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                pwVar.a(new qb(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, pwVar.b(), a, null);
    }

    public final px a(String str) {
        return new qc(this.b.compileStatement(str));
    }

    public final void a() {
        this.b.beginTransaction();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.b == sQLiteDatabase;
    }

    public final Cursor b(String str) {
        return a((pw) new ps(str));
    }

    public final void b() {
        this.b.endTransaction();
    }

    public final void c() {
        this.b.setTransactionSuccessful();
    }

    public final void c(String str) {
        this.b.execSQL(str);
    }

    public final void close() {
        this.b.close();
    }

    public final boolean d() {
        return this.b.inTransaction();
    }

    public final boolean e() {
        return this.b.isOpen();
    }

    public final String f() {
        return this.b.getPath();
    }

    public final List<Pair<String, String>> g() {
        return this.b.getAttachedDbs();
    }
}
