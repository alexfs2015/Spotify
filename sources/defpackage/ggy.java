package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* renamed from: ggy reason: default package */
public final class ggy implements ggx {
    private final RoomDatabase a;
    private final oy b;

    public ggy(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<ggw>(roomDatabase) {
            public final String a() {
                return "INSERT OR REPLACE INTO `EventSequenceNumbers`(`eventName`,`sequenceNumberNext`) VALUES (?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                ggw ggw = (ggw) obj;
                if (ggw.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, ggw.a);
                }
                pxVar.a(2, ggw.b);
            }
        };
    }

    public final int a() {
        int i = 0;
        ph a2 = ph.a("SELECT count(*) FROM EventSequenceNumbers", 0);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
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

    public final long a(String str) {
        ph a2 = ph.a("SELECT sequenceNumberNext FROM EventSequenceNumbers WHERE eventName = ?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            return a3.moveToFirst() ? a3.getLong(0) : 0;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final void a(ggw ggw) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(ggw);
            this.a.g();
        } finally {
            this.a.f();
        }
    }
}
