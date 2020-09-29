package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vc reason: default package */
public final class vc implements vb {
    private final RoomDatabase a;
    private final oy b;

    public vc(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<va>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                va vaVar = (va) obj;
                if (vaVar.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, vaVar.a);
                }
                if (vaVar.b == null) {
                    pxVar.a(2);
                } else {
                    pxVar.a(2, vaVar.b);
                }
            }
        };
    }

    public final List<String> a(String str) {
        ph a2 = ph.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    public final void a(va vaVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(vaVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }
}