package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: px reason: default package */
final class px extends pw implements ps {
    private final SQLiteStatement a;

    px(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final int a() {
        return this.a.executeUpdateDelete();
    }

    public final long b() {
        return this.a.executeInsert();
    }
}
