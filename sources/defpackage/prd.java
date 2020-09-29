package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.Disposables;

/* renamed from: prd reason: default package */
public final class prd implements c {
    private final pqr a;

    public final String c() {
        return "TriggerEngine";
    }

    public prd(pqr pqr) {
        this.a = pqr;
    }

    public final void ai_() {
        this.a.a();
    }

    public final void aj_() {
        pqr pqr = this.a;
        pqr.a.a(Disposables.a());
        pqr.b();
        Logger.b("TriggerEngine stopped", new Object[0]);
    }
}
