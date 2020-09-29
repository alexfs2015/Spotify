package defpackage;

import android.os.RemoteException;

@cfp
/* renamed from: bfl reason: default package */
public final class bfl {
    private final Object a = new Object();
    private drq b;
    private a c;

    /* renamed from: bfl$a */
    public static abstract class a {
    }

    public final drq a() {
        drq drq;
        synchronized (this.a) {
            drq = this.b;
        }
        return drq;
    }

    public final void a(drq drq) {
        synchronized (this.a) {
            this.b = drq;
            if (this.c != null) {
                a aVar = this.c;
                bxo.a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
                synchronized (this.a) {
                    this.c = aVar;
                    if (this.b != null) {
                        try {
                            this.b.a((drt) new dso(aVar));
                        } catch (RemoteException e) {
                            cpn.a("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        }
                    }
                }
            }
        }
    }
}
