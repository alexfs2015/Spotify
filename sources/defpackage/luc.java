package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: luc reason: default package */
public final class luc implements afa, hpe {
    private aez a;
    private afd b;
    private final Context c;
    private final String d;
    private final lui e;
    private final hne f;
    private final hop g;
    private final Picasso h;
    private final Scheduler i;
    private final Scheduler j;
    private final CompositeDisposable k = new CompositeDisposable();
    private final ltz l;
    private final htw m;
    private final luk n;

    /* renamed from: luc$a */
    static class a {
        final int a;
        final MediaBrowserItem b;
        final afe c;
        vsr d;
        Bitmap e;

        protected a(int i, MediaBrowserItem mediaBrowserItem, afe afe) {
            this.a = i;
            this.b = mediaBrowserItem;
            this.c = afe;
        }
    }

    public final void a() {
    }

    public final void b() {
    }

    public luc(Context context, String str, lui lui, ltz ltz, hne hne, hop hop, luk luk, Picasso picasso, Scheduler scheduler, Scheduler scheduler2, htw htw) {
        this.c = context;
        this.d = str;
        this.e = lui;
        this.f = hne;
        this.l = ltz;
        this.g = hop;
        this.n = luk;
        this.h = picasso;
        this.i = scheduler;
        this.j = scheduler2;
        this.m = htw;
    }

    public final void a(afu afu) {
        String str = (String) afu.e();
        if (str != null) {
            this.m.a(str, this.f, this.g.d(), null, null);
        }
    }

    public final void a(acc acc) {
        String str;
        this.a = (aez) acc;
        this.a.b(1);
        this.b = this.a.a(0);
        hnf a2 = this.f.a();
        if ("bmw.car_screen_listener".equals(this.d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            sb.append(":type:");
            sb.append(RootListType.DEFAULT);
            str = sb.toString();
        } else {
            str = this.d;
        }
        a2.a(hnd.a(str), null, this, 0, 30, this.g.d());
    }

    public final void c() {
        this.k.c();
    }

    public final void a(List<MediaBrowserItem> list) {
        int size = list.size() * 20;
        if (list.size() > 6) {
            this.a.a(this.c.getString(R.string.loading), "");
            this.k.a(Observable.b(Boolean.TRUE).c((long) size, TimeUnit.MILLISECONDS, this.i).b(this.i).a(this.j).a((Consumer<? super T>) new $$Lambda$luc$KqM37wW4CB5_dKnOW9tYAT2grGA<Object>(this), (Consumer<? super Throwable>) $$Lambda$luc$VGwOryQhIV2WQl1x4Wf6clliDUE.INSTANCE));
        }
        ArrayList<a> arrayList = new ArrayList<>(list.size());
        afe[] afeArr = (afe[]) afv.a(this.b, afe.class, list.size());
        for (int i2 = 0; i2 < afeArr.length; i2++) {
            MediaBrowserItem mediaBrowserItem = (MediaBrowserItem) list.get(i2);
            afe afe = afeArr[i2];
            afe.a(jsd.a(mediaBrowserItem.c, Locale.getDefault()));
            afe.a(this.n.a);
            arrayList.add(new a(i2, mediaBrowserItem, afe));
        }
        this.b.a(afeArr);
        this.k.a(Observable.a((Iterable<? extends T>) arrayList).c((long) size, TimeUnit.MILLISECONDS, this.i).b(this.i).a(this.j).a((Consumer<? super T>) new $$Lambda$luc$4ReIAl1VgLmxK3CXXGQFYr98eCQ<Object>(this, ApplicationManager.INSTANCE.mApplication.a()), (Consumer<? super Throwable>) $$Lambda$luc$Iqz0OxiYvFbA6mAQyeloBpXGRdk.INSTANCE));
        final FlowableProcessor l2 = UnicastProcessor.k().l();
        for (final a aVar : arrayList) {
            aVar.d = new vsr() {
                public final void a(Drawable drawable) {
                }

                public final void b(Drawable drawable) {
                }

                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    a aVar = aVar;
                    aVar.e = bitmap;
                    l2.b_(aVar);
                }
            };
            this.h.a(aVar.b.e).b(50, 50).a(aVar.d);
        }
        CompositeDisposable compositeDisposable = this.k;
        Flowable b2 = Flowable.b((long) (size + 75), TimeUnit.MILLISECONDS, this.i);
        ObjectHelper.a(b2, "subscriptionIndicator is null");
        compositeDisposable.a(RxJavaPlugins.a((Flowable<T>) new FlowableDelaySubscriptionOther<T>(l2, b2)).b(this.i).a((Consumer<? super T>) $$Lambda$luc$8SUh_iZU3AFWW53Vvc8npmtkpBc.INSTANCE).a(this.j).a((Consumer<? super T>) new $$Lambda$luc$WQSJZOekIKMRpO71wuxf9xyGY<Object>(this), (Consumer<? super Throwable>) $$Lambda$luc$T3P5Mq2h8M_r5Sgw_3fDRomSyi8.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.a(aVar.a, aVar.c);
    }

    public final void a(Throwable th) {
        this.a.b("COULD_NOT_LOAD_ERROR");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(a aVar) {
        Bitmap bitmap = aVar.e;
        if (bitmap != null) {
            aVar.c.a(luh.a(bitmap, CompressFormat.PNG, 100));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(acd acd, a aVar) {
        MediaBrowserItem mediaBrowserItem = aVar.b;
        afe afe = aVar.c;
        if (ActionType.BROWSABLE == mediaBrowserItem.b) {
            afe.a((acd) this.l.a(this.c, this.g, this.f, this.h, mediaBrowserItem.a));
            return;
        }
        if (ActionType.PLAYABLE == mediaBrowserItem.b) {
            afe.a(acd);
            afe.a((Object) mediaBrowserItem.a);
        }
    }
}
