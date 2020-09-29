package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: gfs reason: default package */
public final class gfs extends gfr {
    private final RoomDatabase a;
    private final ot b;

    public gfs(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<gfk>(roomDatabase) {
            public final String a() {
                return "INSERT OR ABORT INTO `Events`(`id`,`authenticated`,`eventName`,`sequenceId`,`sequenceNumber`,`fragments`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            public final /* synthetic */ void a(ps psVar, Object obj) {
                gfk gfk = (gfk) obj;
                psVar.a(1, gfk.a);
                Integer valueOf = gfk.b == null ? null : Integer.valueOf(gfk.b.booleanValue() ? 1 : 0);
                if (valueOf == null) {
                    psVar.a(2);
                } else {
                    psVar.a(2, (long) valueOf.intValue());
                }
                if (gfk.c == null) {
                    psVar.a(3);
                } else {
                    psVar.a(3, gfk.c);
                }
                if (gfk.d == null) {
                    psVar.a(4);
                } else {
                    psVar.a(4, gfk.d);
                }
                psVar.a(5, gfk.e);
                if (gfk.f == null) {
                    psVar.a(6);
                } else {
                    psVar.a(6, gfk.f);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public final long a(gfk gfk) {
        this.a.d();
        this.a.e();
        try {
            long b2 = this.b.b(gfk);
            this.a.g();
            return b2;
        } finally {
            this.a.f();
        }
    }

    public final void a(String str, byte[] bArr, gfm gfm, gfh gfh, gey gey, gej gej, boolean z) {
        this.a.e();
        try {
            super.a(str, bArr, gfm, gfh, gey, gej, z);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final List<gfk> a(int i, boolean z) {
        Integer num;
        pc a2 = pc.a("SELECT * FROM Events WHERE CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = ? ORDER BY id ASC LIMIT ?", 2);
        a2.a(1, z ? 1 : 0);
        a2.a(2, 20);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "id");
            int a5 = pg.a(a3, "authenticated");
            int a6 = pg.a(a3, "eventName");
            int a7 = pg.a(a3, "sequenceId");
            int a8 = pg.a(a3, "sequenceNumber");
            int a9 = pg.a(a3, "fragments");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                gfk gfk = new gfk();
                gfk.a = a3.getLong(a4);
                Boolean bool = null;
                if (a3.isNull(a5)) {
                    num = null;
                } else {
                    num = Integer.valueOf(a3.getInt(a5));
                }
                if (num != null) {
                    bool = Boolean.valueOf(num.intValue() != 0);
                }
                gfk.b = bool;
                gfk.c = a3.getString(a6);
                gfk.d = a3.getBlob(a7);
                gfk.e = a3.getLong(a8);
                gfk.f = a3.getBlob(a9);
                arrayList.add(gfk);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final void a(Collection<Long> collection) {
        this.a.d();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM Events WHERE id IN (");
        pi.a(sb, collection.size());
        sb.append(")");
        ps a2 = this.a.a(sb.toString());
        int i = 1;
        for (Long l : collection) {
            if (l == null) {
                a2.a(i);
            } else {
                a2.a(i, l.longValue());
            }
            i++;
        }
        this.a.e();
        try {
            a2.a();
            this.a.g();
        } finally {
            this.a.f();
        }
    }
}
