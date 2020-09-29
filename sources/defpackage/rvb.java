package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: rvb reason: default package */
public final class rvb extends c {
    public a a;
    private final glw<? extends Parcelable> b;

    public rvb(glw<? extends Parcelable> glw) {
        this.b = (glw) fay.a(glw);
    }

    public final void c(Bundle bundle) {
        this.b.a(bundle);
    }

    public final void aP_() {
        this.b.b.bf_();
        ((a) fay.a(this.a)).b(this);
        this.a = null;
    }

    public final void a(Bundle bundle) {
        glw<? extends Parcelable> glw = this.b;
        if (glw.c != null) {
            glx<T> glx = glw.c;
            if (bundle != null) {
                bundle.putParcelable("handle", glx.a);
                bundle.putLong("request-uptime-millis", glx.b);
                bundle.putLong("expiration-uptime-millis", glx.c);
                bundle.putInt("code-length", glx.d);
                bundle.putString("canonical-phone-number", glx.e);
            }
        }
    }

    public final void b(Bundle bundle) {
        this.b.a(bundle);
    }

    public final void e() {
        glw<? extends Parcelable> glw = this.b;
        if (glw.c != null) {
            if (SystemClock.uptimeMillis() < glw.c.c) {
                glw.a.a(glw.c.b, glw.c.c);
                return;
            }
            glw.a();
        }
    }

    public final void f() {
        this.b.a.a();
    }
}
