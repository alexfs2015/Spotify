package defpackage;

import android.os.Bundle;

/* renamed from: fpl reason: default package */
public final class fpl extends fpk {
    private int b;
    private String c;

    fpl(String str, Bundle bundle) {
        super(str, bundle);
    }

    /* access modifiers changed from: protected */
    public final void b(Bundle bundle) {
        this.b = bundle.getInt("selectedItemIndex", -1);
        this.c = bundle.getString("selectedItem", "");
    }
}
