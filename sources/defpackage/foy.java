package defpackage;

import android.content.ContentValues;

/* renamed from: foy reason: default package */
public final class foy {
    public final ContentValues a = new ContentValues();
    private final int b;
    private String c = "NORMAL";

    public foy(int i) {
        this.b = i;
        this.a.put("idNo", Integer.toString(i));
    }

    public final void a(String str, fpi fpi) {
        if (fpi != null) {
            this.a.put(str, fpi.a());
            return;
        }
        throw new IllegalArgumentException("FieldData is null");
    }
}
