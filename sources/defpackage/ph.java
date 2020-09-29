package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: ph reason: default package */
public final class ph {
    /* JADX INFO: finally extract failed */
    public static void a(po poVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor b = poVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
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
                poVar.c(sb.toString());
            }
        }
    }
}
