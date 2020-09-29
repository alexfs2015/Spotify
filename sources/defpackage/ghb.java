package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ghb reason: default package */
public final class ghb implements gha {
    private final RoomDatabase a;

    public ghb(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final List<ggz> a() {
        ph a2 = ph.a("SELECT eventName, sequenceNumberNext, COUNT(sequenceNumber) AS storageSize,MIN(sequenceNumber) AS sequenceNumberMin FROM EventSequenceNumbers LEFT JOIN Events USING (eventName)GROUP BY eventName", 0);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "eventName");
            int a5 = pl.a(a3, "sequenceNumberNext");
            int a6 = pl.a(a3, "storageSize");
            int a7 = pl.a(a3, "sequenceNumberMin");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                ggz ggz = new ggz();
                ggz.a = a3.getString(a4);
                if (a3.isNull(a5)) {
                    ggz.c = null;
                } else {
                    ggz.c = Long.valueOf(a3.getLong(a5));
                }
                if (a3.isNull(a6)) {
                    ggz.d = null;
                } else {
                    ggz.d = Long.valueOf(a3.getLong(a6));
                }
                if (a3.isNull(a7)) {
                    ggz.b = null;
                } else {
                    ggz.b = Long.valueOf(a3.getLong(a7));
                }
                arrayList.add(ggz);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
