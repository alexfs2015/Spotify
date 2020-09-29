package defpackage;

import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;

/* renamed from: ssc reason: default package */
public final class ssc implements c {
    private final ssb a;

    public ssc(ssb ssb) {
        this.a = ssb;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(ViewGroup viewGroup) {
    }

    public final void b() {
        ssb ssb = this.a;
        ssb.a.bd_();
        Logger.b("LeakedSubPreventionLog: Successfully called unsubscribe. IsUnsubscribed(): %s ", Boolean.valueOf(ssb.a.b()));
    }
}
