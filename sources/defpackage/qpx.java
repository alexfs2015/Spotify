package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.ParsedQuery;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Request;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Response;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.SourceDevice;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: qpx reason: default package */
public final class qpx {
    final qpr a;
    final CompositeDisposable b = new CompositeDisposable();
    qqe c;
    private final boolean d;
    private final qpp e;
    private final Scheduler f;
    private final vrn<Request, Response> g;
    private a h = new a();

    /* renamed from: qpx$a */
    final class a implements vrm<Response> {
        public final /* synthetic */ void a(Object obj) {
            Completable completable;
            Response response = (Response) obj;
            qpr qpr = qpx.this.a;
            PlayerContext playContext = response.getPlayContext();
            if (playContext == null) {
                completable = Completable.a((Throwable) new NullPointerException("Player context was null"));
            } else {
                Logger.b("Play prepared uri: %s", response.getViewUri());
                qpr.a.playWithViewUri(playContext, response.getPlayOptions(), response.getViewUri(), new a(0));
                completable = Completable.a();
            }
            qpx.this.b.a(completable.a((Action) new $$Lambda$qpx$a$DMkhKGi3P79veDwh7gUjo2TXJIw(this, response), (Consumer<? super Throwable>) new $$Lambda$qpx$a$k8KNG2YtT1CTuAuHhd3MNCXprg<Object>(this)));
        }

        public final /* synthetic */ void a(Object obj, defpackage.vrm.a aVar) {
            Completable completable;
            Response response = (Response) obj;
            qpr qpr = qpx.this.a;
            PlayerContext playContext = response.getPlayContext();
            if (playContext == null) {
                completable = Completable.a((Throwable) new NullPointerException("Player context was null"));
            } else {
                Logger.b("Start preparing the context returned by speakeasy %s", response.toString());
                qpr.a.preparePlay(playContext, response.getPlayOptions(), new qpn(aVar));
                completable = Completable.a();
            }
            qpx.this.b.a(completable.a((Action) new $$Lambda$qpx$a$lQJxvs3R8GwXb4T7ph4O4Vz8zw(response), (Consumer<? super Throwable>) new $$Lambda$qpx$a$k8KNG2YtT1CTuAuHhd3MNCXprg<Object>(this)));
        }

        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Response response) {
            if (qpx.this.c != null) {
                qqe qqe = qpx.this.c;
                String viewUri = response.getViewUri();
                qpl qpl = qqe.d;
                Logger.b("Setting session activity to %s", viewUri);
                qpl.b.a(qpl.c.a(qpl.a, viewUri));
                if (qpx.this.c.e) {
                    qpx.this.a.a();
                }
            }
        }

        /* access modifiers changed from: private */
        public void a(Throwable th) {
            Logger.e(th, "Error during voice search", new Object[0]);
            a();
        }

        public final void a() {
            if (qpx.this.c != null) {
                qpx.this.c.a();
            }
        }
    }

    public qpx(qpr qpr, qpp qpp, boolean z, Scheduler scheduler, qpt qpt) {
        this.a = qpr;
        this.e = qpp;
        this.f = scheduler;
        Logger.b("Google assistant Resolver is connected.", new Object[0]);
        this.d = z;
        this.g = new vrn<>(qpt, this.h, scheduler);
    }

    public final void a() {
        Logger.b("Google assistant Resolver is disconnected.", new Object[0]);
        this.b.c();
        this.c = null;
    }

    public final void a(Uri uri, String str, String str2) {
        if (uri == null) {
            Logger.e("Uri can't be null", new Object[0]);
            this.h.a();
            return;
        }
        qqe qqe = this.c;
        if (qqe == null) {
            Logger.e("Session can not be null when searching", new Object[0]);
            this.h.a();
            return;
        }
        this.b.a(a(uri, str, str2, qqe).a((Consumer<? super T>) new $$Lambda$qpx$BNZsB40GOHO8vKrXoXlykCLqAaU<Object>(this, uri), (Consumer<? super Throwable>) new $$Lambda$qpx$R7V0hkhqny94CpkaNAUFPbhmI5A<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Uri uri, Request request) {
        this.g.a(uri, request);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Couldn't create request for prepare", new Object[0]);
        this.h.a();
    }

    public final void b(Uri uri, String str, String str2) {
        if (uri == null) {
            Logger.e("Uri can't be null", new Object[0]);
            this.h.a();
            return;
        }
        qqe qqe = this.c;
        if (qqe == null) {
            Logger.e("Session can not be null when searching", new Object[0]);
            this.h.a();
            return;
        }
        this.b.a(a(uri, str, str2, qqe).a((Consumer<? super T>) new $$Lambda$qpx$QzP2T9wQ7HRlj4Y1p0s_ROhCRI<Object>(this, uri), (Consumer<? super Throwable>) new $$Lambda$qpx$cc8am96Qixn4ODZ8qcHDdKNXgPE<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, Request request) {
        vrn<Request, Response> vrn = this.g;
        vro vro = (vro) vrn.a.get(uri);
        if (vro == null) {
            Logger.a("No attempts to prepare context were found. Search again and PLAY this time", new Object[0]);
            vrn.a(uri, request);
            vro vro2 = (vro) vrn.a.get(uri);
            if (vro2 != null) {
                vro2.b = true;
            }
        } else if (!vro.a) {
            Logger.a("Context is not yet prepared. Wait for prepare and try again", new Object[0]);
            vro.b = true;
        } else {
            T t = vro.c;
            if (t != null) {
                vrn.b.a(t);
            } else {
                Logger.e("Something went very wrong", new Object[0]);
                vrn.b.a();
            }
            vrn.a.remove(uri);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e("Couldn't create request for play", new Object[0]);
        this.h.a();
    }

    private Single<Request> a(Uri uri, String str, String str2, qqe qqe) {
        Observable a2 = this.e.a();
        $$Lambda$qpx$cnS7u2yQcpKaLRgrVLFAGMIzSs r1 = new $$Lambda$qpx$cnS7u2yQcpKaLRgrVLFAGMIzSs(this, uri, qqe, str, str2);
        return a2.a((Function<? super T, ? extends ObservableSource<? extends R>>) r1, false).a(0).a(this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Uri uri, qqe qqe, String str, String str2, String str3) {
        String str4;
        String uri2 = qpo.a(vrn.a(uri)).toString();
        rqi a2 = qqe.b.a();
        ParsedQuery parsedQuery = new ParsedQuery("PLAY", uri2);
        boolean z = this.d;
        fay.a(a2);
        fay.a(str3);
        if (z) {
            str4 = GaiaTypes.TABLET.toJson();
        } else {
            str4 = GaiaTypes.SMARTPHONE.toJson();
        }
        return Observable.b(new Request(str, str2, parsedQuery, new SourceDevice(a2.f, a2.g, str4, str3)));
    }
}
