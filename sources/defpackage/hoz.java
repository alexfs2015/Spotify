package defpackage;

import android.os.Bundle;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: hoz reason: default package */
public final class hoz {
    public static final Object a = new Object();
    private static final hpd e = new hpd() {
        public final void a() {
        }

        public final boolean a(String str) {
            return false;
        }

        public final void a(String str, hpe hpe) {
            Logger.e("Couldn't find registered loader for the identifier %s", str);
            hpe.a(Collections.emptyList());
        }
    };
    public final Handler b = new Handler();
    public final Set<hpd> c = new LinkedHashSet(20);
    public fpt d;

    public final void a(hpd... hpdArr) {
        synchronized (a) {
            this.c.addAll(Arrays.asList(hpdArr));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hpd hpd, String str, Bundle bundle, hpe hpe) {
        hpd.a(str, hpe);
    }

    public final void b(hpd... hpdArr) {
        synchronized (a) {
            for (hpd a2 : hpdArr) {
                a2.a();
            }
            this.c.removeAll(Arrays.asList(hpdArr));
        }
    }

    public final void a(String str, Bundle bundle, hpe hpe) {
        hpd hpd;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                hpd = e;
                break;
            }
            hpd = (hpd) it.next();
            if (hpd.a(str)) {
                break;
            }
        }
        hpd hpd2 = hpd;
        Handler handler = this.b;
        $$Lambda$hoz$R8p1uCH3dW9sjWJLwvOVoQ6pTrE r2 = new $$Lambda$hoz$R8p1uCH3dW9sjWJLwvOVoQ6pTrE(this, hpd2, str, bundle, hpe);
        handler.post(r2);
    }
}
