package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

/* renamed from: kli reason: default package */
public final class kli implements Runnable {
    public fpt a;
    private final WeakReference<kyi> b;
    private final WeakReference<ka> c;
    private final String d;

    public kli(ka kaVar, kyi kyi, fpt fpt) {
        this.c = new WeakReference<>(fay.a(kaVar));
        this.b = new WeakReference<>(fay.a(kyi));
        this.a = fpt;
        this.d = kaVar.getClass().getSimpleName();
    }

    public final void run() {
        Fragment m = ((kyi) fay.a(this.b.get())).m();
        if (this.a != null && m != null && !m.B) {
            Object obj = this.c.get();
            String str = this.d;
            boolean z = false;
            if (obj != null) {
                ka kaVar = (ka) obj;
                Assertion.a((Object) m);
                Bundle bundle = m.i;
                String str2 = "FlagsArgumentHelper.Flags";
                fpt fpt = (bundle == null || !bundle.containsKey(str2)) ? null : (fpt) bundle.getParcelable(str2);
                fpt fpt2 = this.a;
                fpq fpq = guf.c;
                fay.a(fpt2);
                if (fpt != null && !fpt.a(fpt2, fpq)) {
                    z = true;
                }
                if (z) {
                    fpt fpt3 = this.a;
                    Bundle bundle2 = m.i;
                    if (bundle2 != null && bundle2.containsKey(str2)) {
                        bundle2.putParcelable(str2, fpt3);
                    }
                    kf i = kaVar.i();
                    i.b();
                    km a2 = i.a();
                    a2.b(m);
                    a2.c(m);
                    a2.c();
                }
                return;
            }
            throw new NullPointerException(fbc.a("This runnable was posted to run, but its fragment activity(%s) has gone out of scope. Did you forget to remove the callback in onStop or onDestroy?", str));
        }
    }
}
