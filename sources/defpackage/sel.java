package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: sel reason: default package */
public final class sel extends c {
    public a a;
    private final gnl<? extends Parcelable> b;

    public sel(gnl<? extends Parcelable> gnl) {
        this.b = (gnl) fbp.a(gnl);
    }

    public final void a(Bundle bundle) {
        gnl<? extends Parcelable> gnl = this.b;
        if (gnl.c != null) {
            gnm<T> gnm = gnl.c;
            if (bundle != null) {
                bundle.putParcelable("handle", gnm.a);
                bundle.putLong("request-uptime-millis", gnm.b);
                bundle.putLong("expiration-uptime-millis", gnm.c);
                bundle.putInt("code-length", gnm.d);
                bundle.putString("canonical-phone-number", gnm.e);
            }
        }
    }

    public final void aN_() {
        this.b.b.bd_();
        ((a) fbp.a(this.a)).b(this);
        this.a = null;
    }

    public final void b(Bundle bundle) {
        this.b.a(bundle);
    }

    public final void c(Bundle bundle) {
        this.b.a(bundle);
    }

    public final void e() {
        gnl<? extends Parcelable> gnl = this.b;
        if (gnl.c != null) {
            if (SystemClock.uptimeMillis() < gnl.c.c) {
                gnl.a.a(gnl.c.b, gnl.c.c);
                return;
            }
            gnl.a();
        }
    }

    public final void f() {
        this.b.a.a();
    }
}
