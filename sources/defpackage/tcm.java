package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.container.ItemDiffResult;
import com.spotify.music.newplaying.scroll.container.ItemDiffResult.AnonymousClass3;
import com.spotify.music.newplaying.scroll.container.ItemDiffResult.Operation;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.ImpressionType;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableDelay;
import io.reactivex.internal.operators.flowable.FlowableDistinct;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: tcm reason: default package */
public final class tcm {
    final List<NowPlayingWidget> a = new LinkedList();
    final CompositeDisposable b = new CompositeDisposable();
    tcn c;
    private final Flowable<ImmutableList<NowPlayingWidget>> d;
    private final tkj e;
    private final Scheduler f;
    private final Scheduler g;

    public tcm(Flowable<ImmutableList<NowPlayingWidget>> flowable, tkj tkj, a aVar, Scheduler scheduler, Scheduler scheduler2) {
        this.d = flowable;
        this.e = tkj;
        this.f = scheduler;
        this.g = scheduler2;
        aVar.a(new c() {
            public final void a() {
                tcm.this.b.c();
                tcm.this.a();
            }

            public final void c() {
                for (NowPlayingWidget b : tcm.this.a) {
                    b.b();
                }
                tcm.this.b.a(tcm.this.d.a(Functions.a()).c(ImmutableList.a((Collection<? extends E>) tcm.this.a)).b(2, 1).c((Function<? super T, ? extends R>) $$Lambda$tcm$VKON4JIUF_4afjlM1FIClwFhXIk.INSTANCE).a(tcm.this.g).a((Consumer<? super T>) new $$Lambda$tcm$_pFo0vtuE6BQMyJ28hhkChsM1w<Object>(tcm.this), (Consumer<? super Throwable>) new $$Lambda$tcm$G0xyPMmyTpV2FZ0Hb1BmtLwxdE<Object>(tcm.this)));
                tcm.this.b.a(tcm.b(tcm.this));
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ItemDiffResult a(List list) {
        return new ItemDiffResult((ImmutableList) list.get(1), (ImmutableList) list.get(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xfk a(Flowable flowable, ImmutableList immutableList) {
        $$Lambda$idzipdaDJwxzw8AjDTRqofpVo r0 = $$Lambda$idzipdaDJwxzw8AjDTRqofpVo.INSTANCE;
        Callable d2 = Functions.d();
        ObjectHelper.a(r0, "keySelector is null");
        ObjectHelper.a(d2, "collectionSupplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDistinct<T>(flowable, r0, d2)).c((long) immutableList.size());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ImmutableList immutableList) {
        this.e.a(0, ImpressionType.PAGE.toString(), "");
    }

    /* access modifiers changed from: private */
    public void a(ItemDiffResult<NowPlayingWidget> itemDiffResult) {
        AnonymousClass2 r0 = new ItemDiffResult.a<NowPlayingWidget>() {
            public final /* synthetic */ void a(Object obj, int i) {
                NowPlayingWidget nowPlayingWidget = (NowPlayingWidget) obj;
                tcm.this.c.a(nowPlayingWidget, i);
                nowPlayingWidget.b();
                tcm.this.a.add(i, nowPlayingWidget);
            }

            public final /* synthetic */ void b(Object obj, int i) {
                ((NowPlayingWidget) obj).d();
                tcm.this.c.a(i);
                tcm.this.a.remove(i);
            }
        };
        ArrayList<Operation> arrayList = new ArrayList<>(1);
        itemDiffResult.c.a((ok) new ok(arrayList) {
            private /* synthetic */ List a;

            {
                this.a = r2;
            }

            public final void a(int i, int i2) {
                for (Operation operation : this.a) {
                    if (operation.a >= i && operation.c != Action.REMOVAL) {
                        operation.d += i2;
                    }
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    this.a.add(new Operation(i + i3, 1, Action.ADDITION));
                }
            }

            public final void a(int i, int i2, Object obj) {
            }

            public final void b(int i, int i2) {
                for (Operation operation : this.a) {
                    if (operation.a >= i && operation.c != Action.REMOVAL) {
                        operation.d -= i2;
                    }
                }
                this.a.add(new Operation(i, i2, Action.REMOVAL));
            }

            public final void c(int i, int i2) {
            }
        });
        for (Operation operation : arrayList) {
            int i = operation.a + operation.d;
            int i2 = operation.b + i;
            int i3 = AnonymousClass3.a[operation.c.ordinal()];
            if (i3 == 1) {
                while (i < i2) {
                    r0.a(itemDiffResult.a.get(i), i - operation.d);
                    i++;
                }
            } else if (i3 == 2) {
                for (int i4 = i; i4 < i2; i4++) {
                    r0.b(itemDiffResult.b.get(i4), i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e("Error observing NPV widgets: %s", th.toString());
        a();
        this.a.clear();
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tck tck) {
        int b2 = tck.b();
        Type a2 = tck.a();
        this.e.a(b2, ImpressionType.WIDGET.toString(), a2.toString());
        for (NowPlayingWidget nowPlayingWidget : this.a) {
            if (nowPlayingWidget.a() == a2) {
                nowPlayingWidget.c();
                return;
            }
        }
    }

    static /* synthetic */ Disposable b(tcm tcm) {
        Flowable a2 = tcm.c.a(1.0f);
        Flowable<ImmutableList<NowPlayingWidget>> flowable = tcm.d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler scheduler = tcm.f;
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        FlowableDelay flowableDelay = new FlowableDelay(flowable, Math.max(0, 1), timeUnit, scheduler, false);
        return RxJavaPlugins.a((Flowable<T>) flowableDelay).a((Predicate<? super T>) $$Lambda$tcm$oPQLTOQbmukOR9ZYocrwyeKF5SY.INSTANCE).a((Consumer<? super T>) new $$Lambda$tcm$XdygcU9ftw8uAPf2K4ZZripDCb8<Object>(tcm)).e(new $$Lambda$tcm$JrDt2TtwoSdbLKtGmB13zplscg(a2)).a((Consumer<? super T>) new $$Lambda$tcm$kBcth9CJeob_OBXHGX8W2NcyAhQ<Object>(tcm), (Consumer<? super Throwable>) $$Lambda$tcm$vjByMNfEDJL0wB9FS5iSK3AQvc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ImmutableList immutableList) {
        return !immutableList.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        for (NowPlayingWidget d2 : this.a) {
            d2.d();
        }
    }

    public final void a(tcn tcn) {
        this.c = (tcn) fbp.a(tcn);
    }
}
