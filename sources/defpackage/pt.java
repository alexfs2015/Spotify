package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;

/* renamed from: pt reason: default package */
final class pt implements po {
    private static final String[] a = new String[0];
    private final SQLiteDatabase b;

    static {
        String[] strArr = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    pt(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public final ps a(String str) {
        return new px(this.b.compileStatement(str));
    }

    public final void a() {
        this.b.beginTransaction();
    }

    public final void b() {
        this.b.endTransaction();
    }

    public final void c() {
        this.b.setTransactionSuccessful();
    }

    public final boolean d() {
        return this.b.inTransaction();
    }

    public final Cursor b(String str) {
        return a((pr) new pn(str));
    }

    public final Cursor a(final pr prVar) {
        return this.b.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                prVar.a(new pw(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, prVar.b(), a, null);
    }

    public final void c(String str) {
        this.b.execSQL(str);
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

    public final void close() {
        this.b.close();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.b == sQLiteDatabase;
    }
}
