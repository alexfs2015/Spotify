package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* renamed from: uf reason: default package */
public final class uf implements ue {
    private final RoomDatabase a;
    private final ot b;
    private final pd c;

    public uf(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<ud>(roomDatabase) {
            public final String a() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                ud udVar = (ud) obj;
                if (udVar.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, udVar.a);
                }
                psVar.a(2, (long) udVar.b);
            }
        };
        this.c = new pd(roomDatabase) {
            public final String a() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public final void a(ud udVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(udVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final void b(String str) {
        this.a.d();
        ps b2 = this.c.b();
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

    public final ud a(String str) {
        pc a2 = pc.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            return a3.moveToFirst() ? new ud(a3.getString(pg.a(a3, "work_spec_id")), a3.getInt(pg.a(a3, "system_id"))) : null;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
