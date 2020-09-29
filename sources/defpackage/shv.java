package defpackage;

import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;

/* renamed from: shv reason: default package */
public final class shv implements c {
    private final shu a;

    public final void a(ViewGroup viewGroup) {
    }

    public shv(shu shu) {
        this.a = shu;
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        shu shu = this.a;
        shu.a.bf_();
        Logger.b("LeakedSubPreventionLog: Successfully called unsubscribe. IsUnsubscribed(): %s ", Boolean.valueOf(shu.a.b()));
    }
}
