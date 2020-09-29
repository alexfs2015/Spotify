package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.playlist.endpoints.exceptions.InsufficientStorageException;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: lrf reason: default package */
public final class lrf implements lrb {
    private static final RootlistRequestPayload a;
    private final lrp b;
    private final vje c;
    private final vjj d;
    private final vjp e;
    private final AddToPlaylistLogger f;
    private final Scheduler g;
    private final hec h;
    private final hdv i;
    private final lrj j;
    private final String k;
    private final List<String> l;
    private final lqz m;
    private final Optional<String> n;
    private final defpackage.vjp.a o;
    private final CompositeDisposable p = new CompositeDisposable();
    private boolean q;
    private boolean r;

    /* renamed from: lrf$a */
    public static abstract class a {

        /* renamed from: lrf$a$a reason: collision with other inner class name */
        public interface C0051a {
            C0051a a(int i);

            C0051a a(b bVar);

            a a();
        }

        public abstract b a();

        public abstract int b();
    }

    static {
        PlaylistMetadataDecorationPolicy a2 = PlaylistMetadataDecorationPolicy.builder().e(Boolean.TRUE).d(Boolean.TRUE).g(Boolean.TRUE).a(Boolean.TRUE).a(PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a(Boolean.TRUE).a()).a();
        FolderMetadataDecorationPolicy a3 = FolderMetadataDecorationPolicy.builder().c(Boolean.TRUE).b(Boolean.TRUE).a(Boolean.TRUE).d(Boolean.TRUE).e(Boolean.TRUE).f(Boolean.TRUE).g(Boolean.TRUE).a();
        a = RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a2).a(a3).a(RootlistRequestDecorationPolicy.builder().b(Boolean.TRUE).c(Boolean.TRUE).a()).a()).a();
    }

    public lrf(lrp lrp, vje vje, vjj vjj, vjp vjp, AddToPlaylistLogger addToPlaylistLogger, Scheduler scheduler, hec hec, hdv hdv, lqy lqy, lqx lqx, lqz lqz, lrk lrk, lrm lrm) {
        this.b = lrp;
        this.k = lqx.al();
        jva a2 = jva.a(this.k);
        if (a2.b == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            this.n = Optional.c(a2.k());
        } else {
            this.n = Optional.e();
        }
        this.c = vje;
        this.d = vjj;
        this.e = vjp;
        this.f = addToPlaylistLogger;
        this.g = scheduler;
        this.h = hec;
        this.i = hdv;
        this.j = lrk.a(new defpackage.lrj.a() {
            public final void a(vla vla) {
            }

            public final void a(vla vla, Optional<List<String>> optional) {
            }

            public final void a(vla vla, List<String> list) {
            }
        });
        this.l = lqy.am();
        this.m = lqz;
        this.o = defpackage.vjp.a.m().a(Optional.b(a)).a(true).d(Optional.b(Boolean.TRUE)).b(Optional.b(lrm.a)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, List list) {
        return this.c.a(str, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(vlc vlc, List list) {
        return this.d.a(vlc.getUri(), list).c(1, TimeUnit.SECONDS).a((SingleSource<T>) Single.b(new a().a((b) null).a(list.size()).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(vlc vlc, b bVar) {
        return bVar.c() ? Single.b(new a().a(bVar).a(0).a()) : Single.b(bVar.b()).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lrf$fFJnSEgMn15EkXaKKE0h7j5KZHM<Object,Object>(this, vlc));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, vlc vlc, a aVar) {
        this.f.a(this.m.n(), str, !this.l.isEmpty() ? (String) this.l.get(0) : "", this.m.q());
        if (aVar.a() == null) {
            lrj lrj = this.j;
            String title = vlc.getTitle();
            lrj.d.a = uzy.a(fbo.a(title) ? lrj.a.getString(R.string.toast_added_to_generic_playlist) : lrj.a.getString(R.string.toast_added_to_playlist, new Object[]{title}), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
            this.b.ak();
            return;
        }
        this.f.a.a(str, "duplicate-song-toastie", 0, ImpressionType.TOASTIE, RenderType.TOASTIE);
        lrj lrj2 = this.j;
        lrj2.d.a(uzy.a(lrj2.a.getString(R.string.add_to_playlist_duplicates_toast_body, new Object[]{vlc.getTitle()}), 3000).c(R.color.cat_white).b(R.color.cat_black).a());
        this.q = false;
        this.b.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vky vky) {
        ArrayList a2 = Lists.a((E[]) vky.getItems());
        if (vky.getUnrangedLength() != 0) {
            this.b.a((List<vlc>) a2);
            this.b.ai();
        } else if (!fbo.a(this.k)) {
            this.b.ah();
        } else {
            this.b.ak();
            this.h.a(this.l);
        }
        if (!this.r) {
            this.b.a(false);
        }
        this.r = true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(vky vky, vky vky2) {
        return vky != null && vky2 != null && vky.getUnrangedLength() == 0 && vky2.getUnrangedLength() == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.b.a(false);
        this.q = false;
        if (th instanceof InsufficientStorageException) {
            lrj lrj = this.j;
            lrj.d.a(uzy.a(lrj.a.getString(R.string.toast_playlist_size_limit_exceeded), CrashReportManager.TIME_WINDOW).c(R.color.cat_white).b(R.color.cat_black).a());
        } else {
            lrj lrj2 = this.j;
            lrj2.d.a = uzy.a(lrj2.a.getString(R.string.error_general_title), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
        }
        Logger.e(th, "Adding track to playlist failed", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource c(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return Single.a(th);
        }
        Logger.e("Unable to determine duplicates in a reasonable time. Will add the content anyway.", new Object[0]);
        return this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$lrf$w2KNSWbNMbIZxWlHEhCuW73c3Do.INSTANCE);
    }

    public final void a() {
        this.f.a();
        this.b.ak();
        this.h.a(this.k, this.l);
    }

    public final void a(vlc vlc, int i2) {
        if (!this.q) {
            this.q = true;
            this.b.a(true);
            vky r2 = vlc.r();
            if (!vlc.f() || r2 == null) {
                String uri = vlc.getUri();
                this.f.a(uri, i2);
                this.p.a(this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lrf$WL6mUDs7MHuL1yEeoCN8RWxNKgM<Object,Object>(this, uri)).a(5, TimeUnit.SECONDS).h(new $$Lambda$lrf$WLEnGv7SxDTrvKlahhLL2TjtxI(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lrf$mZ3Y43eUlvDOEOrf8r51lnLkHeM<Object,Object>(this, vlc)).a(this.g).a((Consumer<? super T>) new $$Lambda$lrf$_FecvzhV4FxVHhoayZtzVIpQx7s<Object>(this, uri, vlc), (Consumer<? super Throwable>) new $$Lambda$lrf$lvBf7SDu_YsmixeKhm7FboR9J2Q<Object>(this)));
                return;
            }
            this.b.a(r2.b(), r2.a(), this.l);
        }
    }

    public final void b() {
        this.p.c();
        this.p.a(this.e.b(this.n, this.o).a((BiPredicate<? super T, ? super T>) $$Lambda$lrf$M09pnjROxaDNq0fnueOK84rVeo.INSTANCE).a(this.g).a((Consumer<? super T>) new $$Lambda$lrf$PaofD4qpdB9w1i9zh2zeBMxkreU<Object>(this), (Consumer<? super Throwable>) $$Lambda$lrf$H1BNAxP_AbCwAUcBLkX7p4sk2U.INSTANCE));
    }

    public final void c() {
        this.p.c();
    }
}
