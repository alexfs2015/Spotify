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

/* renamed from: pmz reason: default package */
public final class pmz {
    final pnd a;
    final pmx b;
    private final QueueManager c;
    private final pmt d;
    private final hec e;

    /* renamed from: pmz$a */
    final class a implements wum {
        private final Optional<Response> a;

        /* synthetic */ a(pmz pmz, Optional optional, byte b2) {
            this(optional);
        }

        private a(Optional<Response> optional) {
            this.a = optional;
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
                pmz r0 = defpackage.pmz.this
                pmx r0 = r0.b
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
                pmz r0 = defpackage.pmz.this
                pnd r0 = r0.a
                r1 = 2131953912(0x7f1308f8, float:1.9544308E38)
                r0.b(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pmz.a.call():void");
        }
    }

    public pmz(QueueManager queueManager, pmt pmt, pnd pnd, pmx pmx, hec hec) {
        this.c = queueManager;
        this.d = pmt;
        this.a = pnd;
        this.b = pmx;
        this.e = hec;
    }

    private void a(wud<Response> wud, wum wum) {
        Flowable a2 = this.e.a();
        BlockingFirstSubscriber blockingFirstSubscriber = new BlockingFirstSubscriber();
        a2.a((FlowableSubscriber<? super T>) blockingFirstSubscriber);
        Object a3 = blockingFirstSubscriber.a();
        if (a3 == null) {
            throw new NoSuchElementException();
        } else if (!jsl.c((fpt) a3)) {
            this.b.a();
        } else {
            wzi a4 = wzi.a(wud.f($$Lambda$TEwiueFhGkgnCUdPLZKBe7aJCww.INSTANCE).h($$Lambda$pmz$4sK5r0lap_UveR2STTleDsHj5xs.INSTANCE).i(new $$Lambda$pmz$t7YeQniQSZs6lzR8wEjxtQqShOg(this, wum)));
            a4.b(a4.a.c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(wum wum, Optional optional) {
        if (!optional.b() || ((Response) optional.c()).getStatus() != 200) {
            return wub.a((wum) new a(this, optional, 0)).b((wud<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
        }
        return wub.a(wum).b((wud<T>) ScalarSynchronousObservable.d(Boolean.TRUE));
    }

    public final void a(List<PlayerTrack> list, boolean z) {
        a(vun.a((ObservableSource<T>) this.c.addTracksToQueue(list), BackpressureStrategy.BUFFER), (wum) new $$Lambda$pmz$8TXkbD7kXwOrRNzc2gzmoKYjNw(this, z, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, List list) {
        if (z) {
            if (list.size() == 1) {
                this.a.a(AnonymousClass1.a[jst.a(((PlayerTrack) list.get(0)).uri()).b.ordinal()] != 1 ? R.string.toast_added_to_queue : R.string.toast_added_episode_to_queue);
                return;
            }
            this.a.a(R.string.toast_added_items_to_queue);
        }
    }

    public final void a(String str) {
        wud d2 = wuh.a(this.d.a(str)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$pmz$iw5P2rZEiqAxHpfClpwNScwjPuE<Object,Object>(this));
        pnd pnd = this.a;
        pnd.getClass();
        a(d2, (wum) new $$Lambda$LXhPX0r3lKWdO_0hbcVDl9wqBpg(pnd));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(List list) {
        return vun.a((ObservableSource<T>) this.c.addTracksToQueue(list), BackpressureStrategy.BUFFER);
    }
}
