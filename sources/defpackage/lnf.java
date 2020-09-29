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

/* renamed from: lnf reason: default package */
public final class lnf implements lnb {
    private static final RootlistRequestPayload a;
    private final lnp b;
    private final uxc c;
    private final uxh d;
    private final uxn e;
    private final AddToPlaylistLogger f;
    private final Scheduler g;
    private final hbj h;
    private final hbc i;
    private final lnj j;
    private final String k;
    private final List<String> l;
    private final lmz m;
    private final Optional<String> n;
    private final defpackage.uxn.a o;
    private final CompositeDisposable p = new CompositeDisposable();
    private boolean q;
    private boolean r;

    /* renamed from: lnf$a */
    public static abstract class a {

        /* renamed from: lnf$a$a reason: collision with other inner class name */
        public interface C0050a {
            C0050a a(int i);

            C0050a a(b bVar);

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

    public lnf(lnp lnp, uxc uxc, uxh uxh, uxn uxn, AddToPlaylistLogger addToPlaylistLogger, Scheduler scheduler, hbj hbj, hbc hbc, lmy lmy, lmx lmx, lmz lmz, lnk lnk, lnm lnm) {
        this.b = lnp;
        this.k = lmx.al();
        jst a2 = jst.a(this.k);
        if (a2.b == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            this.n = Optional.c(a2.k());
        } else {
            this.n = Optional.e();
        }
        this.c = uxc;
        this.d = uxh;
        this.e = uxn;
        this.f = addToPlaylistLogger;
        this.g = scheduler;
        this.h = hbj;
        this.i = hbc;
        this.j = lnk.a(new defpackage.lnj.a() {
            public final void a(uyx uyx) {
            }

            public final void a(uyx uyx, Optional<List<String>> optional) {
            }

            public final void a(uyx uyx, List<String> list) {
            }
        });
        this.l = lmy.am();
        this.m = lmz;
        this.o = defpackage.uxn.a.m().a(Optional.b(a)).a(true).d(Optional.b(Boolean.TRUE)).b(Optional.b(lnm.a)).a();
    }

    public final void a() {
        this.f.a();
        this.b.ak();
        this.h.a(this.k, this.l);
    }

    public final void a(uyz uyz, int i2) {
        if (!this.q) {
            this.q = true;
            this.b.a(true);
            uyv r2 = uyz.r();
            if (!uyz.f() || r2 == null) {
                String uri = uyz.getUri();
                this.f.a(uri, i2);
                this.p.a(this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lnf$vWz83hHnLSOS6QMF7UCX_NLqVWU<Object,Object>(this, uri)).a(5, TimeUnit.SECONDS).h(new $$Lambda$lnf$6wwDTSAxXjhwnDJWweV1V0eR_Lk(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lnf$j0CWVvll5sUo73uN4aISK7DG1vo<Object,Object>(this, uyz)).a(this.g).a((Consumer<? super T>) new $$Lambda$lnf$iL17vZER7lYoiNHl7Q2umLQUEnY<Object>(this, uri, uyz), (Consumer<? super Throwable>) new $$Lambda$lnf$Vsyso8WrD2hLy3O7Z2LjB2lR5JY<Object>(this)));
                return;
            }
            this.b.a(r2.b(), r2.a(), this.l);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, List list) {
        return this.c.a(str, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource c(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return Single.a(th);
        }
        Logger.e("Unable to determine duplicates in a reasonable time. Will add the content anyway.", new Object[0]);
        return this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$lnf$iG2zeldw6uiiaPw26ZD5gSa0gqY.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(uyz uyz, b bVar) {
        if (bVar.c()) {
            return Single.b(new a().a(bVar).a(0).a());
        }
        return Single.b(bVar.b()).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lnf$K6VTSnxnthRRbcGTnX5akZEyuvM<Object,Object>(this, uyz));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(uyz uyz, List list) {
        return this.d.a(uyz.getUri(), list).c(1, TimeUnit.SECONDS).a((SingleSource<T>) Single.b(new a().a((b) null).a(list.size()).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, uyz uyz, a aVar) {
        String str2;
        this.f.a(this.m.n(), str, !this.l.isEmpty() ? (String) this.l.get(0) : "", this.m.q());
        if (aVar.a() == null) {
            lnj lnj = this.j;
            String title = uyz.getTitle();
            if (fax.a(title)) {
                str2 = lnj.a.getString(R.string.toast_added_to_generic_playlist);
            } else {
                str2 = lnj.a.getString(R.string.toast_added_to_playlist, new Object[]{title});
            }
            lnj.d.a = uos.a(str2, 3000).c(R.color.cat_white).b(R.color.cat_black).a();
            this.b.ak();
            return;
        }
        this.f.a.a(str, "duplicate-song-toastie", 0, ImpressionType.TOASTIE, RenderType.TOASTIE);
        lnj lnj2 = this.j;
        lnj2.d.a(uos.a(lnj2.a.getString(R.string.add_to_playlist_duplicates_toast_body, new Object[]{uyz.getTitle()}), 3000).c(R.color.cat_white).b(R.color.cat_black).a());
        this.q = false;
        this.b.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.b.a(false);
        this.q = false;
        if (th instanceof InsufficientStorageException) {
            lnj lnj = this.j;
            lnj.d.a(uos.a(lnj.a.getString(R.string.toast_playlist_size_limit_exceeded), CrashReportManager.TIME_WINDOW).c(R.color.cat_white).b(R.color.cat_black).a());
        } else {
            lnj lnj2 = this.j;
            lnj2.d.a = uos.a(lnj2.a.getString(R.string.error_general_title), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
        }
        Logger.e(th, "Adding track to playlist failed", new Object[0]);
    }

    public final void b() {
        this.p.c();
        this.p.a(this.e.b(this.n, this.o).a((BiPredicate<? super T, ? super T>) $$Lambda$lnf$Ur201keADMlMy8ifGDklx6LLpE.INSTANCE).a(this.g).a((Consumer<? super T>) new $$Lambda$lnf$cKwDtAIQmgKGo_YqwOmLhjp1aCU<Object>(this), (Consumer<? super Throwable>) $$Lambda$lnf$TRYtuUV9nDnromO9TflmECgjoBM.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(uyv uyv, uyv uyv2) {
        if (uyv == null || uyv2 == null || uyv.getUnrangedLength() != 0 || uyv2.getUnrangedLength() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyv uyv) {
        ArrayList a2 = Lists.a((E[]) uyv.getItems());
        if (uyv.getUnrangedLength() != 0) {
            this.b.a((List<uyz>) a2);
            this.b.ai();
        } else if (!fax.a(this.k)) {
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

    public final void c() {
        this.p.c();
    }
}
