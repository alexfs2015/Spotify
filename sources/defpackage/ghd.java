package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ghd reason: default package */
public final class ghd extends ghc {
    private final RoomDatabase a;
    private final oy b;

    public ghd(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<ggv>(roomDatabase) {
            public final String a() {
                return "INSERT OR ABORT INTO `Events`(`id`,`authenticated`,`eventName`,`sequenceId`,`sequenceNumber`,`fragments`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            public final /* synthetic */ void a(px pxVar, Object obj) {
                ggv ggv = (ggv) obj;
                pxVar.a(1, ggv.a);
                Integer valueOf = ggv.b == null ? null : Integer.valueOf(ggv.b.booleanValue() ? 1 : 0);
                if (valueOf == null) {
                    pxVar.a(2);
                } else {
                    pxVar.a(2, (long) valueOf.intValue());
                }
                if (ggv.c == null) {
                    pxVar.a(3);
                } else {
                    pxVar.a(3, ggv.c);
                }
                if (ggv.d == null) {
                    pxVar.a(4);
                } else {
                    pxVar.a(4, ggv.d);
                }
                pxVar.a(5, ggv.e);
                if (ggv.f == null) {
                    pxVar.a(6);
                } else {
                    pxVar.a(6, ggv.f);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public final long a(ggv ggv) {
        this.a.d();
        this.a.e();
        try {
            long b2 = this.b.b(ggv);
            this.a.g();
            return b2;
        } finally {
            this.a.f();
        }
    }

    public final List<ggv> a(int i, boolean z) {
        ph a2 = ph.a("SELECT * FROM Events WHERE CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = ? ORDER BY id ASC LIMIT ?", 2);
        a2.a(1, z ? 1 : 0);
        a2.a(2, 20);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "id");
            int a5 = pl.a(a3, "authenticated");
            int a6 = pl.a(a3, "eventName");
            int a7 = pl.a(a3, "sequenceId");
            int a8 = pl.a(a3, "sequenceNumber");
            int a9 = pl.a(a3, "fragments");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                ggv ggv = new ggv();
                ggv.a = a3.getLong(a4);
                Boolean bool = null;
                Integer valueOf = a3.isNull(a5) ? null : Integer.valueOf(a3.getInt(a5));
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                ggv.b = bool;
                ggv.c = a3.getString(a6);
                ggv.d = a3.getBlob(a7);
                ggv.e = a3.getLong(a8);
                ggv.f = a3.getBlob(a9);
                arrayList.add(ggv);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final void a(String str, byte[] bArr, ggx ggx, ggs ggs, ggj ggj, gfu gfu, boolean z) {
        this.a.e();
        try {
            super.a(str, bArr, ggx, ggs, ggj, gfu, z);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final void a(Collection<Long> collection) {
        this.a.d();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM Events WHERE id IN (");
        pn.a(sb, collection.size());
        sb.append(")");
        px a2 = this.a.a(sb.toString());
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
