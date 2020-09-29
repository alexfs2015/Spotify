package defpackage;

import android.database.Cursor;

/* renamed from: pg reason: default package */
public final class pg {
    public static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        String str2 = "`";
        StringBuilder sb = new StringBuilder(str2);
        sb.append(str);
        sb.append(str2);
        return cursor.getColumnIndexOrThrow(sb.toString());
    }
}
