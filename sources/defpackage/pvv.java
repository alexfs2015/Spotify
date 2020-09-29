package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.ObservableSource;
import io.reactivex.internal.subscribers.BlockingFirstSubscriber;
import java.util.List;
import java.util.NoSuchElementException;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: pvv reason: default package */
public final class pvv {
    final pvz a;
    final pvt b;
    private final QueueManager c;
    private final pvp d;
    private final hgy e;

    /* renamed from: pvv$a */
    final class a implements xir {
        private final Optional<Response> a;

        private a(Optional<Response> optional) {
            this.a = optional;
        }

        /* synthetic */ a(pvv pvv, Optional optional, byte b2) {
            this(optional);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void call() {
            /*
                r8 = this;
                com.google.common.base.Optional<com.spotify.cosmos.router.Response> r0 = r8.a
                boolean r0 = r0.b()
                if (r0 == 0) goto L_0x0074
                com.google.common.base.Optional<com.spotify.cosmos.router.Response> r0 = r8.a
                java.lang.Object r0 = r0.c()
                com.spotify.cosmos.router.Response r0 = (com.spotify.cosmos.router.Response) r0
                int r1 = r0.getStatus()
                r2 = 403(0x193, float:5.65E-43)
                r3 = 1
                r4 = 0
                if (r1 != r2) goto L_0x004c
                java.util.Map r1 = r0.getHeaders()
                java.lang.String r2 = "forbidden-reasons"
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x0041
                java.lang.String r2 = ","
                java.lang.String[] r1 = r1.split(r2)
                int r2 = r1.length
                r5 = 0
            L_0x0030:
                if (r5 >= r2) goto L_0x0041
                r6 = r1[r5]
                java.lang.String r7 = "mft_disallow"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x003e
                r1 = 1
                goto L_0x0042
            L_0x003e:
                int r5 = r5 + 1
                goto L_0x0030
            L_0x0041:
                r1 = 0
            L_0x0042:
                if (r1 == 0) goto L_0x004c
                pvv r0 = defpackage.pvv.this
                pvt r0 = r0.b
                r0.a()
                return
            L_0x004c:
                int r1 = r0.getStatus()
                r2 = 409(0x199, float:5.73E-43)
                if (r1 != r2) goto L_0x005c
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r1 = "Conflict, the queue has been modified before this request."
                com.spotify.base.java.logging.Logger.d(r1, r0)
                goto L_0x0074
            L_0x005c:
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r0.getStatus()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r4] = r2
                java.util.Map r0 = r0.getHeaders()
                r1[r3] = r0
                java.lang.String r0 = "Unknown error while updating the queue. Status: %d, headers: [%s]"
                com.spotify.base.java.logging.Logger.d(r0, r1)
            L_0x0074:
                pvv r0 = defpackage.pvv.this
                pvz r0 = r0.a
                r1 = 2131953924(0x7f130904, float:1.9544333E38)
                r0.b(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pvv.a.call():void");
        }
    }

    public pvv(QueueManager queueManager, pvp pvp, pvz pvz, pvt pvt, hgy hgy) {
        this.c = queueManager;
        this.d = pvp;
        this.a = pvz;
        this.b = pvt;
        this.e = hgy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(List list) {
        return wit.a((ObservableSource<T>) this.c.addTracksToQueue(list), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(xir xir, Optional optional) {
        return (!optional.b() || ((Response) optional.c()).getStatus() != 200) ? xig.a((xir) new a(this, optional, 0)).b((xii<T>) ScalarSynchronousObservable.d(Boolean.TRUE)) : xig.a(xir).b((xii<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
    }

    private void a(xii<Response> xii, xir xir) {
        Flowable a2 = this.e.a();
        BlockingFirstSubscriber blockingFirstSubscriber = new BlockingFirstSubscriber();
        a2.a((FlowableSubscriber<? super T>) blockingFirstSubscriber);
        Object a3 = blockingFirstSubscriber.a();
        if (a3 == null) {
            throw new NoSuchElementException();
        } else if (!jus.c((fqn) a3)) {
            this.b.a();
        } else {
            xnn a4 = xnn.a(xii.e((xiy<? super T, ? extends R>) $$Lambda$xfSb1uAPRAWWXW0C2PkskwBKDS0.INSTANCE).g($$Lambda$pvv$29peBtwirK0DhPsY4NyfsDLBr4.INSTANCE).h(new $$Lambda$pvv$LwDzBy2NTWSipgN0fMIuxh7twI(this, xir)));
            a4.b(a4.a.c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, List list) {
        if (z) {
            if (list.size() == 1) {
                this.a.a(AnonymousClass1.a[jva.a(((PlayerTrack) list.get(0)).uri()).b.ordinal()] != 1 ? R.string.toast_added_to_queue : R.string.toast_added_episode_to_queue);
                return;
            }
            this.a.a(R.string.toast_added_items_to_queue);
        }
    }

    public final void a(String str) {
        xii d2 = xim.a(this.d.a(str)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$pvv$O2CXjNEoLWxa__G_bSlHHXKPUs<Object,Object>(this));
        pvz pvz = this.a;
        pvz.getClass();
        a(d2, (xir) new $$Lambda$zvvVihUx7_eCmSoI_OwWP5Aii8g(pvz));
    }

    public final void a(List<PlayerTrack> list, boolean z) {
        a(wit.a((ObservableSource<T>) this.c.addTracksToQueue(list), BackpressureStrategy.BUFFER), (xir) new $$Lambda$pvv$ehnOJOL5RSxSAgTcVSyO4xkEvb4(this, z, list));
    }
}
