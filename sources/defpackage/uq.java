package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uq reason: default package */
public final class uq implements up {
    private final RoomDatabase a;
    private final oy b;

    public uq(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<uo>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                uo uoVar = (uo) obj;
                if (uoVar.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, uoVar.a);
                }
                if (uoVar.b == null) {
                    pxVar.a(2);
                } else {
                    pxVar.a(2, uoVar.b);
                }
            }
        };
    }

    public final void a(uo uoVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(uoVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final boolean a(String str) {
        ph a2 = ph.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
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
        ph a2 = ph.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
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
        ph a2 = ph.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
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
