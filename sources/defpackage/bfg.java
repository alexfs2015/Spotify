package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: bfg reason: default package */
public class bfg {
    private final dps a;
    private final Context b;
    private final dqm c;

    /* renamed from: bfg$a */
    public static class a {
        private final Context a;
        private final dqp b;

        private a(Context context, dqp dqp) {
            this.a = context;
            this.b = dqp;
        }

        public a(Context context, String str) {
            this((Context) bxo.a(context, (Object) "context cannot be null"), (dqp) dpw.a(context, false, (a<T>) new dqa<T>(dqe.b(), context, str, new edf())));
        }

        public final a a(bff bff) {
            try {
                this.b.a((dqj) new dpl(bff));
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            return this;
        }

        public final a a(bfq bfq) {
            try {
                this.b.a(new dvg(bfq));
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            return this;
        }

        public final a a(defpackage.bfs.a aVar) {
            try {
                this.b.a((dwr) new dxr(aVar));
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            return this;
        }

        public final a a(defpackage.bft.a aVar) {
            try {
                this.b.a((dwu) new dxs(aVar));
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            return this;
        }

        public final a a(defpackage.bfw.a aVar) {
            try {
                this.b.a((dxg) new dxw(aVar));
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            return this;
        }

        public final a a(String str, b bVar, defpackage.bfu.a aVar) {
            try {
                this.b.a(str, new dxv(bVar), aVar == null ? null : new dxt(aVar));
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            return this;
        }

        public final bfg a() {
            try {
                return new bfg(this.a, this.b.a());
            } catch (RemoteException e) {
                cpn.a("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    bfg(Context context, dqm dqm) {
        this(context, dqm, dps.a);
    }

    private bfg(Context context, dqm dqm, dps dps) {
        this.b = context;
        this.c = dqm;
        this.a = dps;
    }

    public final void a(dry dry) {
        try {
            this.c.a(dps.a(this.b, dry));
        } catch (RemoteException e) {
            cpn.a("Failed to load ad.", e);
        }
    }
}
