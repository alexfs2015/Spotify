package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: akw reason: default package */
public final class akw {
    public aku a;

    public akw(Context context) {
        this.a = new aku(context, (String) null, (aju) null);
    }

    public akw(Context context, String str) {
        this.a = new aku(context, str, (aju) null);
    }

    public akw(String str, String str2, aju aju) {
        this.a = new aku(str, str2, (aju) null);
    }

    public final void a(String str, Bundle bundle) {
        if (akc.n()) {
            this.a.a(str, bundle);
        }
    }

    public final void a(String str, double d, Bundle bundle) {
        if (akc.n()) {
            this.a.a(str, Double.valueOf(d), bundle, false, alg.b());
        }
    }

    public final void a(String str) {
        if (akc.n()) {
            this.a.a(str, null, null);
        }
    }

    public final void a(String str, Double d, Bundle bundle) {
        if (akc.n()) {
            this.a.a(str, null, bundle);
        }
    }

    public final void b(String str, Bundle bundle) {
        if (akc.n()) {
            this.a.a(str, null, bundle);
        }
    }
}
