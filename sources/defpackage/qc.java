package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: qc reason: default package */
final class qc extends qb implements px {
    private final SQLiteStatement a;

    qc(SQLiteStatement sQLiteStatement) {
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
