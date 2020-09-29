package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.video.model.PlayerError;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: hvs reason: default package */
public final class hvs {
    public final CompositeDisposable a = new CompositeDisposable();
    private final hvq b;
    private final Scheduler c;

    /* renamed from: hvs$a */
    static class a {
        boolean a;
        boolean b;

        public a(boolean z, boolean z2) {
            Logger.b("playback?%b offlined?%b", Boolean.valueOf(z2), Boolean.valueOf(z));
            this.a = z2;
            this.b = z;
        }
    }

    /* renamed from: hvs$b */
    static class b implements ActionCallback {
        Optional<List<String>> a;
        private Optional<Boolean> b;
        private final Scheduler c;
        private final CountDownLatch d = new CountDownLatch(1);

        b(Scheduler scheduler) {
            this.c = scheduler;
            this.b = Optional.e();
            this.a = Optional.e();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(SingleEmitter singleEmitter) {
            singleEmitter.a((Cancellable) new $$Lambda$hvs$b$bcjP_v2B8h8rlfOiKVRxKRGDN8(this));
            try {
                boolean await = this.d.await(2, TimeUnit.SECONDS);
                if (!this.b.b() || !await) {
                    this.a = Optional.b(Collections.singletonList("Player not responding"));
                    singleEmitter.a(Boolean.FALSE);
                    return;
                }
                singleEmitter.a(this.b.c());
            } catch (InterruptedException e) {
                singleEmitter.b(e);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            this.b = Optional.e();
            this.a = Optional.e();
        }

        public final Single<Boolean> a() {
            return Single.a((SingleOnSubscribe<T>) new $$Lambda$hvs$b$rrD1r_97UDP3GwnHgoIpFi9HlOs<T>(this)).b(this.c);
        }

        public final void onActionForbidden(List<String> list) {
            this.b = Optional.b(Boolean.FALSE);
            this.a = Optional.b(list);
            this.d.countDown();
        }

        public final void onActionSuccess() {
            this.b = Optional.b(Boolean.TRUE);
            this.d.countDown();
        }
    }

    public hvs(hvq hvq, Scheduler scheduler) {
        this.b = hvq;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ActionCallback actionCallback, b bVar, a aVar) {
        if (!aVar.a || !aVar.b) {
            ArrayList arrayList = new ArrayList(5);
            if (!aVar.a) {
                ArrayList arrayList2 = new ArrayList(5);
                if (bVar.a.b()) {
                    arrayList2.addAll((Collection) bVar.a.c());
                }
                arrayList.addAll(arrayList2);
            }
            if (!aVar.b) {
                arrayList.add(PlayerError.ERROR_IN_OFFLINE_MODE);
            }
            actionCallback.onActionForbidden(arrayList);
            return;
        }
        actionCallback.onActionSuccess();
    }

    public final ActionCallback a(String str, ActionCallback actionCallback) {
        b bVar = new b(this.c);
        this.a.a(Single.a((SingleSource<? extends T1>) this.b.a(str), (SingleSource<? extends T2>) bVar.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$TgNnl5V88xT2e4cgJs5jM6uzbbE.INSTANCE).a(2, TimeUnit.SECONDS, this.c).c((Consumer<? super Throwable>) $$Lambda$hvs$iE1uRbcdH7zIDJOOuB_V1nv0b1g.INSTANCE).a((Consumer<? super T>) new $$Lambda$hvs$NXjDdalgLCCq_tDwpAJUx1tDkc8<Object>(actionCallback, bVar), (Consumer<? super Throwable>) $$Lambda$hvs$XmCOc3vrty1R5HIINm_32GWlYY.INSTANCE));
        return bVar;
    }
}
