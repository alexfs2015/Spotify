package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* renamed from: ut reason: default package */
public final class ut implements us {
    private final RoomDatabase a;
    private final oy b;
    private final pi c;

    public ut(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<ur>(roomDatabase) {
            public final String a() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                ur urVar = (ur) obj;
                if (urVar.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, urVar.a);
                }
                pxVar.a(2, (long) urVar.b);
            }
        };
        this.c = new pi(roomDatabase) {
            public final String a() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public final ur a(String str) {
        ph a2 = ph.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            return a3.moveToFirst() ? new ur(a3.getString(pl.a(a3, "work_spec_id")), a3.getInt(pl.a(a3, "system_id"))) : null;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final void a(ur urVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(urVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final void b(String str) {
        this.a.d();
        px b2 = this.c.b();
        if (str == null) {
            b2.a(1);
        } else {
            b2.a(1, str);
        }
        this.a.e();
        try {
            b2.a();
            this.a.g();
        } finally {
            this.a.f();
            this.c.a(b2);
        }
    }
}
