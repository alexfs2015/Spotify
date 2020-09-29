package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.Disposables;

/* renamed from: pzz reason: default package */
public final class pzz implements c {
    private final pzn a;

    public pzz(pzn pzn) {
        this.a = pzn;
    }

    public final void ai_() {
        this.a.a();
    }

    public final void aj_() {
        pzn pzn = this.a;
        pzn.a.a(Disposables.a());
        pzn.b();
        Logger.b("TriggerEngine stopped", new Object[0]);
    }

    public final String c() {
        return "TriggerEngine";
    }
}
