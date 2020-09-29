package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: hns reason: default package */
public abstract class hns extends jrd {
    private boolean a;
    protected fqn b;

    public final void a(int i, int i2, Intent intent) {
        if (i == 1) {
            c();
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.a = bundle.getBoolean("has-created-activity", false);
        }
        if (!this.a) {
            startActivityForResult(e(), 1);
            this.a = true;
        }
    }

    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract Intent e();

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("has-created-activity", this.a);
    }
}
