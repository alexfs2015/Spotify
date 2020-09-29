package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger.UserIntent;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
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
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: lrd reason: default package */
public final class lrd implements lrb, defpackage.lrj.a {
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

    /* renamed from: lrd$a */
    public static abstract class a {

        /* renamed from: lrd$a$a reason: collision with other inner class name */
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

    public lrd(lrp lrp, vje vje, vjj vjj, vjp vjp, AddToPlaylistLogger addToPlaylistLogger, Scheduler scheduler, hec hec, hdv hdv, lqy lqy, lqz lqz, lqx lqx, lrk lrk, lrm lrm) {
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
        this.j = lrk.a(this);
        this.l = lqy.am();
        this.m = lqz;
        this.o = defpackage.vjp.a.m().a(Optional.b(a)).a(false).d(Optional.b(Boolean.TRUE)).b(Optional.b(lrm.a)).a();
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
        return bVar.c() ? Single.b(new a().a(bVar).a(0).a()) : Single.b(bVar.b()).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lrd$pSf73DknWGvr0F77tPWB3i08Qfw<Object,Object>(this, vlc));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, vlc vlc, a aVar) {
        String str2 = str;
        this.f.a(this.m.n(), str, !this.l.isEmpty() ? (String) this.l.get(0) : "", this.m.q());
        b a2 = aVar.a();
        if (a2 == null) {
            vlc vlc2 = vlc;
            this.j.a(vlc);
            this.b.ak();
            return;
        }
        vlc vlc3 = vlc;
        if (a2.b().size() == 1) {
            this.f.a.a(str, "duplicate-song-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
            this.j.a(vlc, Collections.singletonList((String) this.l.get(0)), Optional.e(), R.string.add_to_playlist_duplicates_dialog_title, R.string.add_to_playlist_duplicates_dialog_body_single, R.string.add_to_playlist_duplicates_dialog_button_skip_single, R.string.add_to_playlist_duplicates_dialog_button_add_single);
        } else {
            this.f.a.a(str, "duplicate-songs-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
            this.j.a(vlc, a2.b(), Optional.b(a2.a()), R.string.add_to_playlist_duplicates_dialog_title, R.string.add_to_playlist_duplicates_dialog_body_multiple, R.string.add_to_playlist_duplicates_dialog_button_skip_multiple, R.string.add_to_playlist_duplicates_dialog_button_add_multiple);
        }
        this.b.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        if (th instanceof InsufficientStorageException) {
            this.j.b();
        } else {
            this.j.a();
        }
        Logger.e(th, "Adding track to playlist failed", new Object[0]);
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
    public /* synthetic */ void b(vla vla) {
        this.j.a(vla);
        this.b.ak();
    }

    private void b(vla vla, List<String> list) {
        this.p.a(this.d.a(vla.getUri(), list).c(1, TimeUnit.SECONDS).a(this.g).a((Action) new $$Lambda$lrd$fnSTbfvPUMDfhbtQvXP698zO8(this, vla), (Consumer<? super Throwable>) new $$Lambda$lrd$j1RupW0wsYS_0iAqX9RHCkzC7B8<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.b.a(false);
        this.q = false;
        if (th instanceof InsufficientStorageException) {
            this.j.b();
        } else {
            this.j.a();
        }
        Logger.e(th, "Adding track to playlist failed", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource d(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return Single.a(th);
        }
        Logger.e("Unable to determine duplicates in a reasonable time. Will add the content anyway.", new Object[0]);
        return this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$lrd$EbWBZEtYg9bihYuvpJkjB1ooQD0.INSTANCE);
    }

    public final void a() {
        this.f.a();
        this.b.ak();
        this.h.a(this.k, this.l);
    }

    public final void a(vla vla) {
        this.f.a(vla.getUri(), "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.CANCEL);
        this.q = false;
    }

    public final void a(vla vla, Optional<List<String>> optional) {
        if (!optional.b()) {
            this.f.a(vla.getUri());
            this.q = false;
        } else if (((List) optional.c()).isEmpty()) {
            this.f.a(vla.getUri());
            this.b.ak();
        } else {
            this.f.a(vla.getUri(), "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.ADD_NON_DUPLICATE_TRACKS);
            b(vla, (List) optional.c());
        }
    }

    public final void a(vla vla, List<String> list) {
        this.f.a(vla.getUri(), "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.ADD_ALL_TRACKS);
        b(vla, list);
    }

    public final void a(vlc vlc, int i2) {
        if (!this.q) {
            this.q = true;
            this.b.a(true);
            vky r2 = vlc.r();
            if (!vlc.f() || r2 == null) {
                String uri = vlc.getUri();
                this.f.a(uri, i2);
                this.p.a(this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lrd$bJ69v3cKMC_syHuSJu_dzuNH9wU<Object,Object>(this, uri)).a(5, TimeUnit.SECONDS).h(new $$Lambda$lrd$kYnlp_ZNk23UDbIen4EE4epILdk(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lrd$VBHEo3KKeSugQXiCc9TOiZvt9Mw<Object,Object>(this, vlc)).a(this.g).a((Consumer<? super T>) new $$Lambda$lrd$tuFHYHs5hEepwOvbrHg88B2sRL4<Object>(this, uri, vlc), (Consumer<? super Throwable>) new $$Lambda$lrd$Es2nkpTYO4OULGYnXkPTGM81eg<Object>(this)));
                return;
            }
            this.b.a(r2.b(), r2.a(), this.l);
        }
    }

    public final void b() {
        this.p.c();
        this.p.a(this.e.b(this.n, this.o).a((BiPredicate<? super T, ? super T>) $$Lambda$lrd$Q_fdDxhCEUHbc6f0VVV_0DQpLRs.INSTANCE).a(this.g).a((Consumer<? super T>) new $$Lambda$lrd$fxpaOsuzmalhwAnICL5u_aEZLtE<Object>(this), (Consumer<? super Throwable>) $$Lambda$lrd$MvcFcwvtsWlwZSzG8Oiqdq6ztQs.INSTANCE));
    }

    public final void c() {
        this.p.c();
    }
}
