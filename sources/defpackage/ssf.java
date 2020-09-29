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

/* renamed from: ssf reason: default package */
public final class ssf {
    final List<NowPlayingWidget> a = new LinkedList();
    final CompositeDisposable b = new CompositeDisposable();
    ssg c;
    private final Flowable<ImmutableList<NowPlayingWidget>> d;
    private final tac e;
    private final Scheduler f;
    private final Scheduler g;

    public ssf(Flowable<ImmutableList<NowPlayingWidget>> flowable, tac tac, a aVar, Scheduler scheduler, Scheduler scheduler2) {
        this.d = flowable;
        this.e = tac;
        this.f = scheduler;
        this.g = scheduler2;
        aVar.a(new c() {
            public final void c() {
                for (NowPlayingWidget b : ssf.this.a) {
                    b.b();
                }
                ssf.this.b.a(ssf.this.d.a(Functions.a()).c(ImmutableList.a((Collection<? extends E>) ssf.this.a)).b(2, 1).c((Function<? super T, ? extends R>) $$Lambda$ssf$cYXxQRp1ov7KSc9zmcV796S9qo.INSTANCE).a(ssf.this.g).a((Consumer<? super T>) new $$Lambda$ssf$VsxXj1Xbox1nSC7OswQXD0OROOc<Object>(ssf.this), (Consumer<? super Throwable>) new $$Lambda$ssf$8pumlUe6uiEHdFvfHS_UMdcQx0o<Object>(ssf.this)));
                ssf.this.b.a(ssf.b(ssf.this));
            }

            public final void a() {
                ssf.this.b.c();
                ssf.this.a();
            }
        });
    }

    public final void a(ssg ssg) {
        this.c = (ssg) fay.a(ssg);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ItemDiffResult a(List list) {
        return new ItemDiffResult((ImmutableList) list.get(1), (ImmutableList) list.get(0));
    }

    /* access modifiers changed from: private */
    public void a(ItemDiffResult<NowPlayingWidget> itemDiffResult) {
        AnonymousClass2 r0 = new ItemDiffResult.a<NowPlayingWidget>() {
            public final /* synthetic */ void a(Object obj, int i) {
                NowPlayingWidget nowPlayingWidget = (NowPlayingWidget) obj;
                ssf.this.c.a(nowPlayingWidget, i);
                nowPlayingWidget.b();
                ssf.this.a.add(i, nowPlayingWidget);
            }

            public final /* synthetic */ void b(Object obj, int i) {
                ((NowPlayingWidget) obj).d();
                ssf.this.c.a(i);
                ssf.this.a.remove(i);
            }
        };
        ArrayList<Operation> arrayList = new ArrayList<>(1);
        itemDiffResult.c.a((of) new of(arrayList) {
            private /* synthetic */ List a;

            public final void a(int i, int i2, Object obj) {
            }

            public final void c(int i, int i2) {
            }

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

            public final void b(int i, int i2) {
                for (Operation operation : this.a) {
                    if (operation.a >= i && operation.c != Action.REMOVAL) {
                        operation.d -= i2;
                    }
                }
                this.a.add(new Operation(i, i2, Action.REMOVAL));
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
    public static /* synthetic */ boolean b(ImmutableList immutableList) {
        return !immutableList.isEmpty();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ImmutableList immutableList) {
        this.e.a(0, ImpressionType.PAGE.toString(), "");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wrf a(Flowable flowable, ImmutableList immutableList) {
        $$Lambda$2QVr3YrMG4miB7Y0QYJMamPGXfY r0 = $$Lambda$2QVr3YrMG4miB7Y0QYJMamPGXfY.INSTANCE;
        Callable d2 = Functions.d();
        ObjectHelper.a(r0, "keySelector is null");
        ObjectHelper.a(d2, "collectionSupplier is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDistinct<T>(flowable, r0, d2)).c((long) immutableList.size());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ssd ssd) {
        int b2 = ssd.b();
        Type a2 = ssd.a();
        this.e.a(b2, ImpressionType.WIDGET.toString(), a2.toString());
        for (NowPlayingWidget nowPlayingWidget : this.a) {
            if (nowPlayingWidget.a() == a2) {
                nowPlayingWidget.c();
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        for (NowPlayingWidget d2 : this.a) {
            d2.d();
        }
    }

    static /* synthetic */ Disposable b(ssf ssf) {
        Flowable a2 = ssf.c.a(1.0f);
        Flowable<ImmutableList<NowPlayingWidget>> flowable = ssf.d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler scheduler = ssf.f;
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(scheduler, "scheduler is null");
        FlowableDelay flowableDelay = new FlowableDelay(flowable, Math.max(0, 1), timeUnit, scheduler, false);
        return RxJavaPlugins.a((Flowable<T>) flowableDelay).a((Predicate<? super T>) $$Lambda$ssf$cdlt1PsK6QRPRQFex5571suwdA4.INSTANCE).a((Consumer<? super T>) new $$Lambda$ssf$A3qDYnmPJr29KT7zxXDSz2NCfAc<Object>(ssf)).e(new $$Lambda$ssf$6WfMzVQULBhZTocMczmCvTywQgI(a2)).a((Consumer<? super T>) new $$Lambda$ssf$HCerEYcgzHCdy8Vabm7z54tFWCo<Object>(ssf), (Consumer<? super Throwable>) $$Lambda$ssf$O5_rVsNSnQ9FjOnEsih0m8lWJts.INSTANCE);
    }
}
