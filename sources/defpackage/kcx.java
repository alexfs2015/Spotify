package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;

/* renamed from: kcx reason: default package */
public final class kcx {
    Disposable a;
    private final ijq b;
    private final kda c;
    private final kdl d;
    private final Scheduler e;
    private final Scheduler f;

    kcx(ijq ijq, kda kda, kdl kdl, Scheduler scheduler, Scheduler scheduler2) {
        this.b = ijq;
        this.c = kda;
        this.d = kdl;
        this.e = scheduler;
        this.f = scheduler2;
    }

    /* access modifiers changed from: protected */
    public final synchronized void a() {
        this.a = this.b.b.c((Function<? super T, ? extends R>) $$Lambda$kcx$ANV0zApfTnb9GGtJLkWpD6JCqfs.INSTANCE).b(this.e).a(this.f).d((Consumer<? super T>) new $$Lambda$kcx$tTU1l24kXONpDgLuYml4E47SNdg<Object>(this));
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
            iia iia = (iia) aVar.b.get();
            if (iia != null && 1 == iia.i && iia.c()) {
                if ("b3b13bd9904a4d6da4116e9c0d17be6d".equals(iia.b().info.id)) {
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
}
