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

/* renamed from: qym reason: default package */
public final class qym {
    final qyg a;
    final CompositeDisposable b = new CompositeDisposable();
    qyt c;
    private final boolean d;
    private final qye e;
    private final Scheduler f;
    private final wew<Request, Response> g;
    private a h = new a();

    /* renamed from: qym$a */
    final class a implements wev<Response> {
        a() {
        }

        /* access modifiers changed from: private */
        public void a(Throwable th) {
            Logger.e(th, "Error during voice search", new Object[0]);
            a();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Response response) {
            if (qym.this.c != null) {
                qyt qyt = qym.this.c;
                String viewUri = response.getViewUri();
                qyb qyb = qyt.d;
                Logger.b("Setting session activity to %s", viewUri);
                qyb.b.a(qyb.c.a(qyb.a, viewUri));
                if (qym.this.c.e) {
                    qym.this.a.a();
                }
            }
        }

        public final void a() {
            if (qym.this.c != null) {
                qym.this.c.a();
            }
        }

        public final /* synthetic */ void a(Object obj) {
            Completable completable;
            Response response = (Response) obj;
            qyg qyg = qym.this.a;
            PlayerContext playContext = response.getPlayContext();
            if (playContext == null) {
                completable = Completable.a((Throwable) new NullPointerException("Player context was null"));
            } else {
                Logger.b("Play prepared uri: %s", response.getViewUri());
                qyg.a.playWithViewUri(playContext, response.getPlayOptions(), response.getViewUri(), new a(0));
                completable = Completable.a();
            }
            qym.this.b.a(completable.a((Action) new $$Lambda$qym$a$DdNynI__xU_EvRmMVGw0Zk69JrM(this, response), (Consumer<? super Throwable>) new $$Lambda$qym$a$D8vT9cLDBUWEeVLKeid00Dyyew8<Object>(this)));
        }

        public final /* synthetic */ void a(Object obj, defpackage.wev.a aVar) {
            Completable completable;
            Response response = (Response) obj;
            qyg qyg = qym.this.a;
            PlayerContext playContext = response.getPlayContext();
            if (playContext == null) {
                completable = Completable.a((Throwable) new NullPointerException("Player context was null"));
            } else {
                Logger.b("Start preparing the context returned by speakeasy %s", response.toString());
                qyg.a.preparePlay(playContext, response.getPlayOptions(), new qyd(aVar));
                completable = Completable.a();
            }
            qym.this.b.a(completable.a((Action) new $$Lambda$qym$a$BIsGGNvQMAa5Oe35o8VC0N5piQ(response), (Consumer<? super Throwable>) new $$Lambda$qym$a$D8vT9cLDBUWEeVLKeid00Dyyew8<Object>(this)));
        }
    }

    public qym(qyg qyg, qye qye, boolean z, Scheduler scheduler, qyi qyi) {
        this.a = qyg;
        this.e = qye;
        this.f = scheduler;
        Logger.b("Google assistant Resolver is connected.", new Object[0]);
        this.d = z;
        this.g = new wew<>(qyi, this.h, scheduler);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Uri uri, qyt qyt, String str, String str2, String str3) {
        String uri2 = wer.a(wew.a(uri)).toString();
        rzt a2 = qyt.b.a();
        ParsedQuery parsedQuery = new ParsedQuery("PLAY", uri2);
        boolean z = this.d;
        fbp.a(a2);
        fbp.a(str3);
        return Observable.b(new Request(str, str2, parsedQuery, new SourceDevice(a2.f, a2.g, z ? GaiaTypes.TABLET.toJson() : GaiaTypes.SMARTPHONE.toJson(), str3)));
    }

    private Single<Request> a(Uri uri, String str, String str2, qyt qyt) {
        Observable a2 = this.e.a();
        $$Lambda$qym$lCJHyrIQ6RoBaKGGcoJWFFcJZY r1 = new $$Lambda$qym$lCJHyrIQ6RoBaKGGcoJWFFcJZY(this, uri, qyt, str, str2);
        return a2.a((Function<? super T, ? extends ObservableSource<? extends R>>) r1, false).a(0).a(this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, Request request) {
        wew<Request, Response> wew = this.g;
        wex wex = (wex) wew.a.get(uri);
        if (wex == null) {
            Logger.a("No attempts to prepare context were found. Search again and PLAY this time", new Object[0]);
            wew.a(uri, request);
            wex wex2 = (wex) wew.a.get(uri);
            if (wex2 != null) {
                wex2.b = true;
            }
        } else if (!wex.a) {
            Logger.a("Context is not yet prepared. Wait for prepare and try again", new Object[0]);
            wex.b = true;
        } else {
            T t = wex.c;
            if (t != null) {
                wew.b.a(t);
            } else {
                Logger.e("Something went very wrong", new Object[0]);
                wew.b.a();
            }
            wew.a.remove(uri);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e("Couldn't create request for play", new Object[0]);
        this.h.a();
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
        qyt qyt = this.c;
        if (qyt == null) {
            Logger.e("Session can not be null when searching", new Object[0]);
            this.h.a();
            return;
        }
        this.b.a(a(uri, str, str2, qyt).a((Consumer<? super T>) new $$Lambda$qym$VXIO511k27Qll49DBFlBs_Nxiw<Object>(this, uri), (Consumer<? super Throwable>) new $$Lambda$qym$45xQ_tMUd_hK29d8STFx_n3yD2U<Object>(this)));
    }

    public final void b(Uri uri, String str, String str2) {
        if (uri == null) {
            Logger.e("Uri can't be null", new Object[0]);
            this.h.a();
            return;
        }
        qyt qyt = this.c;
        if (qyt == null) {
            Logger.e("Session can not be null when searching", new Object[0]);
            this.h.a();
            return;
        }
        this.b.a(a(uri, str, str2, qyt).a((Consumer<? super T>) new $$Lambda$qym$lJDb8c7q7ro2CdrMAly7_RYe6s<Object>(this, uri), (Consumer<? super Throwable>) new $$Lambda$qym$HBhe1NvT9AGQSm5JJjIpvJ_yLw<Object>(this)));
    }
}
