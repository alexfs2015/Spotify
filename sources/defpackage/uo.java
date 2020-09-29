package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uo reason: default package */
public final class uo implements un {
    private final RoomDatabase a;
    private final ot b;

    public uo(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<um>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                um umVar = (um) obj;
                if (umVar.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, umVar.a);
                }
                if (umVar.b == null) {
                    psVar.a(2);
                } else {
                    psVar.a(2, umVar.b);
                }
            }
        };
    }

    public final void a(um umVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(umVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final List<String> a(String str) {
        pc a2 = pc.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}
