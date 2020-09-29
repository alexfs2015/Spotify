package defpackage;

import android.os.Bundle;

/* renamed from: fpm reason: default package */
public final class fpm extends fpk {
    private String b;

    fpm(String str, Bundle bundle) {
        super(str, bundle);
    }

    /* access modifiers changed from: protected */
    public final void b(Bundle bundle) {
        this.b = bundle.getString("searchText", "");
    }
}
