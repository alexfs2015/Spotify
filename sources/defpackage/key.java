package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;

/* renamed from: key reason: default package */
public final class key {
    Disposable a;
    private final imd b;
    private final kfb c;
    private final kfm d;
    private final Scheduler e;
    private final Scheduler f;

    key(imd imd, kfb kfb, kfm kfm, Scheduler scheduler, Scheduler scheduler2) {
        this.b = imd;
        this.c = kfb;
        this.d = kfm;
        this.e = scheduler;
        this.f = scheduler2;
    }

    /* access modifiers changed from: private */
    public static Boolean a(List<a> list) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            a aVar = (a) it.next();
            Logger.b("WazeInterAppConnectedState: sessionInfo.sessionId=%s", Integer.valueOf(aVar.a));
            ikn ikn = (ikn) aVar.b.get();
            if (ikn != null && 1 == ikn.i && ikn.c()) {
                if ("b3b13bd9904a4d6da4116e9c0d17be6d".equals(ikn.b().info.id)) {
                    z = true;
                    break;
                }
            }
        }
        Logger.b("WazeInterAppConnectedState: foundWaze=%b", Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.d.c(true);
            boolean b2 = this.d.b();
            Logger.b("WazeInterAppConnectedState setEnabled: wazeIsTurnedOn=%s", Boolean.valueOf(b2));
            if (b2) {
                this.c.a(false, "com.spotify.music.internal.service.waze.WAKE_BY_INTERAPP");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void a() {
        this.a = this.b.b.c((Function<? super T, ? extends R>) $$Lambda$key$1b0UQsjwFwuoEafRngwVII4sXJQ.INSTANCE).b(this.e).a(this.f).d((Consumer<? super T>) new $$Lambda$key$pQ1LTlvvh_3D2CSKDB7k7VNO4E<Object>(this));
    }
}
