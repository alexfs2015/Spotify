package defpackage;

import android.content.ContentValues;

/* renamed from: foe reason: default package */
public final class foe {
    public final ContentValues a = new ContentValues();
    private final int b;
    private String c = "NORMAL";

    public foe(int i) {
        this.b = i;
        this.a.put("idNo", Integer.toString(i));
    }

    public final void a(String str, foo foo) {
        if (foo != null) {
            this.a.put(str, foo.a());
            return;
        }
        throw new IllegalArgumentException("FieldData is null");
    }
}
