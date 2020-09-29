package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

/* renamed from: kor reason: default package */
public final class kor implements Runnable {
    public fqn a;
    private final WeakReference<lbr> b;
    private final WeakReference<kf> c;
    private final String d;

    public kor(kf kfVar, lbr lbr, fqn fqn) {
        this.c = new WeakReference<>(fbp.a(kfVar));
        this.b = new WeakReference<>(fbp.a(lbr));
        this.a = fqn;
        this.d = kfVar.getClass().getSimpleName();
    }

    public final void run() {
        Fragment m = ((lbr) fbp.a(this.b.get())).m();
        if (this.a != null && m != null && !m.B) {
            Object obj = this.c.get();
            String str = this.d;
            boolean z = false;
            if (obj != null) {
                kf kfVar = (kf) obj;
                Assertion.a((Object) m);
                Bundle bundle = m.i;
                String str2 = "FlagsArgumentHelper.Flags";
                fqn fqn = (bundle == null || !bundle.containsKey(str2)) ? null : (fqn) bundle.getParcelable(str2);
                fqn fqn2 = this.a;
                fqk fqk = gwf.c;
                fbp.a(fqn2);
                if (fqn != null && !fqn.a(fqn2, fqk)) {
                    z = true;
                }
                if (z) {
                    fqn fqn3 = this.a;
                    Bundle bundle2 = m.i;
                    if (bundle2 != null && bundle2.containsKey(str2)) {
                        bundle2.putParcelable(str2, fqn3);
                    }
                    kk i = kfVar.i();
                    i.b();
                    kr a2 = i.a();
                    a2.b(m);
                    a2.c(m);
                    a2.c();
                }
                return;
            }
            throw new NullPointerException(fbt.a("This runnable was posted to run, but its fragment activity(%s) has gone out of scope. Did you forget to remove the callback in onStop or onDestroy?", str));
        }
    }
}
