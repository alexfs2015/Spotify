package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gfq reason: default package */
public final class gfq implements gfp {
    private final RoomDatabase a;

    public gfq(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final List<gfo> a() {
        pc a2 = pc.a("SELECT eventName, sequenceNumberNext, COUNT(sequenceNumber) AS storageSize,MIN(sequenceNumber) AS sequenceNumberMin FROM EventSequenceNumbers LEFT JOIN Events USING (eventName)GROUP BY eventName", 0);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "eventName");
            int a5 = pg.a(a3, "sequenceNumberNext");
            int a6 = pg.a(a3, "storageSize");
            int a7 = pg.a(a3, "sequenceNumberMin");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                gfo gfo = new gfo();
                gfo.a = a3.getString(a4);
                if (a3.isNull(a5)) {
                    gfo.c = null;
                } else {
                    gfo.c = Long.valueOf(a3.getLong(a5));
                }
                if (a3.isNull(a6)) {
                    gfo.d = null;
                } else {
                    gfo.d = Long.valueOf(a3.getLong(a6));
                }
                if (a3.isNull(a7)) {
                    gfo.b = null;
                } else {
                    gfo.b = Long.valueOf(a3.getLong(a7));
                }
                arrayList.add(gfo);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
