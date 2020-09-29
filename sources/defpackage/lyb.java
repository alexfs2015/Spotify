package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
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

/* renamed from: lyb reason: default package */
public final class lyb implements afo, huq {
    private afn a;
    private afr b;
    private final Context c;
    private final String d;
    private final lyh e;
    private final hpt f;
    private final hqr g;
    private final Picasso h;
    private final Scheduler i;
    private final Scheduler j;
    private final CompositeDisposable k = new CompositeDisposable();
    private final lxy l;
    private final hwi m;
    private final lyj n;
    private final jty o;

    /* renamed from: lyb$a */
    static class a {
        final int a;
        final MediaBrowserItem b;
        final afs c;
        wgx d;
        Bitmap e;

        protected a(int i, MediaBrowserItem mediaBrowserItem, afs afs) {
            this.a = i;
            this.b = mediaBrowserItem;
            this.c = afs;
        }
    }

    public lyb(Context context, String str, lyh lyh, lxy lxy, hpt hpt, hqr hqr, lyj lyj, Picasso picasso, Scheduler scheduler, Scheduler scheduler2, jty jty, hwi hwi) {
        this.c = context;
        this.d = str;
        this.e = lyh;
        this.f = hpt;
        this.l = lxy;
        this.g = hqr;
        this.n = lyj;
        this.h = picasso;
        this.i = scheduler;
        this.j = scheduler2;
        this.o = jty;
        this.m = hwi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(acr acr, a aVar) {
        MediaBrowserItem mediaBrowserItem = aVar.b;
        afs afs = aVar.c;
        if (ActionType.BROWSABLE == mediaBrowserItem.b) {
            afs.a((acr) this.l.a(this.c, this.g, this.f, this.h, mediaBrowserItem.a));
            return;
        }
        if (ActionType.PLAYABLE == mediaBrowserItem.b) {
            afs.a(acr);
            afs.a((Object) mediaBrowserItem.a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.a(aVar.a, aVar.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(a aVar) {
        Bitmap bitmap = aVar.e;
        if (bitmap != null) {
            aVar.c.a(lyg.a(bitmap, CompressFormat.PNG, 100));
        }
    }

    public final void a() {
    }

    public final void a(acq acq) {
        this.a = (afn) acq;
        this.a.b(1);
        this.b = this.a.a(0);
        hpu a2 = this.f.a();
        String str = this.d;
        String str2 = "";
        a2.a(huo.a(str, "bmw.car_screen_listener".equals(str)).c(str2).d(str2).a(), this, 0, 30, this.g.d());
    }

    public final void a(agi agi) {
        String str = (String) agi.e();
        if (str != null) {
            this.m.a(str, this.f, this.g.d(), null, null, this.o);
        }
    }

    public final void a(List<MediaBrowserItem> list) {
        int size = list.size() * 20;
        if (list.size() > 6) {
            this.a.a(this.c.getString(R.string.loading), "");
            this.k.a(Observable.b(Boolean.TRUE).c((long) size, TimeUnit.MILLISECONDS, this.i).b(this.i).a(this.j).a((Consumer<? super T>) new $$Lambda$lyb$7ZkbTcIc52qLP2ohSdLAZ4IeuXM<Object>(this), (Consumer<? super Throwable>) $$Lambda$lyb$v3ClXQOuFlxPkWwhpSQMx12L7hY.INSTANCE));
        }
        ArrayList<a> arrayList = new ArrayList<>(list.size());
        afs[] afsArr = (afs[]) agj.a(this.b, afs.class, list.size());
        for (int i2 = 0; i2 < afsArr.length; i2++) {
            MediaBrowserItem mediaBrowserItem = (MediaBrowserItem) list.get(i2);
            afs afs = afsArr[i2];
            afs.a(jun.a(mediaBrowserItem.c, Locale.getDefault()));
            afs.a(this.n.a);
            arrayList.add(new a(i2, mediaBrowserItem, afs));
        }
        this.b.a(afsArr);
        this.k.a(Observable.a((Iterable<? extends T>) arrayList).c((long) size, TimeUnit.MILLISECONDS, this.i).b(this.i).a(this.j).a((Consumer<? super T>) new $$Lambda$lyb$oncd15odE2OxmodR4RR5nXAblFQ<Object>(this, ApplicationManager.INSTANCE.mApplication.a()), (Consumer<? super Throwable>) $$Lambda$lyb$DZmLCUBJG4pkW8IZikN5UcUklYc.INSTANCE));
        final FlowableProcessor l2 = UnicastProcessor.k().l();
        for (final a aVar : arrayList) {
            aVar.d = new wgx() {
                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    a aVar = aVar;
                    aVar.e = bitmap;
                    l2.b_(aVar);
                }

                public final void a(Drawable drawable) {
                }

                public final void b(Drawable drawable) {
                }
            };
            this.h.a(aVar.b.e).b(50, 50).a(aVar.d);
        }
        CompositeDisposable compositeDisposable = this.k;
        Flowable b2 = Flowable.b((long) (size + 75), TimeUnit.MILLISECONDS, this.i);
        ObjectHelper.a(b2, "subscriptionIndicator is null");
        compositeDisposable.a(RxJavaPlugins.a((Flowable<T>) new FlowableDelaySubscriptionOther<T>(l2, b2)).b(this.i).a((Consumer<? super T>) $$Lambda$lyb$y3IOYEcQRV03fKlMqHZITX58bjU.INSTANCE).a(this.j).a((Consumer<? super T>) new $$Lambda$lyb$diI9671SGpf5A2uwA1RAZIE3mQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$lyb$_KbqKQcP3abKy2u2r5L5h8mWUbc.INSTANCE));
    }

    public final void b() {
    }

    public final void c() {
        this.k.c();
    }
}
