package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* renamed from: gfn reason: default package */
public final class gfn implements gfm {
    private final RoomDatabase a;
    private final ot b;

    public gfn(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<gfl>(roomDatabase) {
            public final String a() {
                return "INSERT OR REPLACE INTO `EventSequenceNumbers`(`eventName`,`sequenceNumberNext`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                gfl gfl = (gfl) obj;
                if (gfl.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, gfl.a);
                }
                psVar.a(2, gfl.b);
            }
        };
    }

    public final void a(gfl gfl) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(gfl);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final long a(String str) {
        pc a2 = pc.a("SELECT sequenceNumberNext FROM EventSequenceNumbers WHERE eventName = ?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            return a3.moveToFirst() ? a3.getLong(0) : 0;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final int a() {
        int i = 0;
        pc a2 = pc.a("SELECT count(*) FROM EventSequenceNumbers", 0);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            if (a3.moveToFirst()) {
                i = a3.getInt(0);
            }
            return i;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
