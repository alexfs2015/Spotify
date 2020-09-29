package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uc reason: default package */
public final class uc implements ub {
    private final RoomDatabase a;
    private final ot b;

    public uc(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<ua>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                ua uaVar = (ua) obj;
                if (uaVar.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, uaVar.a);
                }
                if (uaVar.b == null) {
                    psVar.a(2);
                } else {
                    psVar.a(2, uaVar.b);
                }
            }
        };
    }

    public final void a(ua uaVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(uaVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final boolean a(String str) {
        pc a2 = pc.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            boolean z = false;
            if (a3.moveToFirst() && a3.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<String> b(String str) {
        pc a2 = pc.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final boolean c(String str) {
        pc a2 = pc.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            boolean z = false;
            if (a3.moveToFirst() && a3.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
