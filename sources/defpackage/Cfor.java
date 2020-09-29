package defpackage;

import android.os.Bundle;

/* renamed from: for reason: invalid class name and default package */
public final class Cfor extends foq {
    private int b;
    private String c;

    Cfor(String str, Bundle bundle) {
        super(str, bundle);
    }

    /* access modifiers changed from: protected */
    public final void b(Bundle bundle) {
        this.b = bundle.getInt("selectedItemIndex", -1);
        this.c = bundle.getString("selectedItem", "");
    }
}
