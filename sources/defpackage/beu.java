package defpackage;

import android.os.RemoteException;

@cey
/* renamed from: beu reason: default package */
public final class beu {
    private final Object a = new Object();
    private dqz b;
    private a c;

    /* renamed from: beu$a */
    public static abstract class a {
    }

    public final dqz a() {
        dqz dqz;
        synchronized (this.a) {
            dqz = this.b;
        }
        return dqz;
    }

    public final void a(dqz dqz) {
        synchronized (this.a) {
            this.b = dqz;
            if (this.c != null) {
                a aVar = this.c;
                bwx.a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
                synchronized (this.a) {
                    this.c = aVar;
                    if (this.b != null) {
                        try {
                            this.b.a((drc) new drx(aVar));
                        } catch (RemoteException e) {
                            cow.a("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        }
                    }
                }
            }
        }
    }
}
