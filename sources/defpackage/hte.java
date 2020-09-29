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

/* renamed from: hte reason: default package */
public final class hte {
    public final CompositeDisposable a = new CompositeDisposable();
    private final htc b;
    private final Scheduler c;

    /* renamed from: hte$a */
    static class a {
        boolean a;
        boolean b;

        public a(boolean z, boolean z2) {
            Logger.b("playback?%b offlined?%b", Boolean.valueOf(z2), Boolean.valueOf(z));
            this.a = z2;
            this.b = z;
        }
    }

    /* renamed from: hte$b */
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

        public final void onActionSuccess() {
            this.b = Optional.b(Boolean.TRUE);
            this.d.countDown();
        }

        public final void onActionForbidden(List<String> list) {
            this.b = Optional.b(Boolean.FALSE);
            this.a = Optional.b(list);
            this.d.countDown();
        }

        public final Single<Boolean> a() {
            return Single.a((SingleOnSubscribe<T>) new $$Lambda$hte$b$m2lAynIwTe343Y3a7qqEoCWTp9s<T>(this)).b(this.c);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(SingleEmitter singleEmitter) {
            singleEmitter.a((Cancellable) new $$Lambda$hte$b$K99I0zIAmDAnFPqoosvheMhge28(this));
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
    }

    public hte(htc htc, Scheduler scheduler) {
        this.b = htc;
        this.c = scheduler;
    }

    public final ActionCallback a(String str, ActionCallback actionCallback) {
        b bVar = new b(this.c);
        this.a.a(Single.a((SingleSource<? extends T1>) this.b.a(str), (SingleSource<? extends T2>) bVar.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$HxWlA1S29VvJ_76DRjxSD8XsoVk.INSTANCE).a(2, TimeUnit.SECONDS, this.c).c((Consumer<? super Throwable>) $$Lambda$hte$VxcyeF4UY8wrP5VNMj5gWw90Kyc.INSTANCE).a((Consumer<? super T>) new $$Lambda$hte$ylTN88Rp4kNlQ_XYujKUAZabw<Object>(actionCallback, bVar), (Consumer<? super Throwable>) $$Lambda$hte$ACLeuaOP7kREX1CEErxTpbmiX8.INSTANCE));
        return bVar;
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
}
