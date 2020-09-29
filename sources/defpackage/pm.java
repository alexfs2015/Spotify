package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: pm reason: default package */
public final class pm {
    /* JADX INFO: finally extract failed */
    public static void a(pt ptVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor b = ptVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (b.moveToNext()) {
            try {
                arrayList.add(b.getString(0));
            } catch (Throwable th) {
                b.close();
                throw th;
            }
        }
        b.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                sb.append(str);
                ptVar.c(sb.toString());
            }
        }
    }
}
