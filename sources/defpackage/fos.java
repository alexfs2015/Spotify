package defpackage;

import android.os.Bundle;

/* renamed from: fos reason: default package */
public final class fos extends foq {
    private String b;

    fos(String str, Bundle bundle) {
        super(str, bundle);
    }

    /* access modifiers changed from: protected */
    public final void b(Bundle bundle) {
        this.b = bundle.getString("searchText", "");
    }
}
