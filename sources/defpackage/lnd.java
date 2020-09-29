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

/* renamed from: lnd reason: default package */
public final class lnd implements lnb, defpackage.lnj.a {
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

    /* renamed from: lnd$a */
    public static abstract class a {

        /* renamed from: lnd$a$a reason: collision with other inner class name */
        public interface C0049a {
            C0049a a(int i);

            C0049a a(b bVar);

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

    public lnd(lnp lnp, uxc uxc, uxh uxh, uxn uxn, AddToPlaylistLogger addToPlaylistLogger, Scheduler scheduler, hbj hbj, hbc hbc, lmy lmy, lmz lmz, lmx lmx, lnk lnk, lnm lnm) {
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
        this.j = lnk.a(this);
        this.l = lmy.am();
        this.m = lmz;
        this.o = defpackage.uxn.a.m().a(Optional.b(a)).a(false).d(Optional.b(Boolean.TRUE)).b(Optional.b(lnm.a)).a();
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
                this.p.a(this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lnd$ug1CfNOk8MezCpOPqT0kE6x6bcQ<Object,Object>(this, uri)).a(5, TimeUnit.SECONDS).h(new $$Lambda$lnd$6X1Mq48SK9yR6o9lw8Z3MWCsLTs(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lnd$7FLldXRivRrOjuPNQgkAtnVfb_s<Object,Object>(this, uyz)).a(this.g).a((Consumer<? super T>) new $$Lambda$lnd$VkOHQ7ilW9dgkVyKkvCTA09A4kQ<Object>(this, uri, uyz), (Consumer<? super Throwable>) new $$Lambda$lnd$MOH9yfKIYQ5G__K_kG7Ki_Sv8ug<Object>(this)));
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
    public /* synthetic */ SingleSource d(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return Single.a(th);
        }
        Logger.e("Unable to determine duplicates in a reasonable time. Will add the content anyway.", new Object[0]);
        return this.i.a(this.l).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$lnd$tmdsdOLHLTb3B0m1J7r3s6t9onQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(uyz uyz, b bVar) {
        if (bVar.c()) {
            return Single.b(new a().a(bVar).a(0).a());
        }
        return Single.b(bVar.b()).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lnd$zp97eQGIIU4ZpnHccmcmDRAkvhA<Object,Object>(this, uyz));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(uyz uyz, List list) {
        return this.d.a(uyz.getUri(), list).c(1, TimeUnit.SECONDS).a((SingleSource<T>) Single.b(new a().a((b) null).a(list.size()).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, uyz uyz, a aVar) {
        String str2 = str;
        this.f.a(this.m.n(), str, !this.l.isEmpty() ? (String) this.l.get(0) : "", this.m.q());
        b a2 = aVar.a();
        if (a2 == null) {
            uyz uyz2 = uyz;
            this.j.a(uyz);
            this.b.ak();
            return;
        }
        uyz uyz3 = uyz;
        if (a2.b().size() == 1) {
            this.f.a.a(str, "duplicate-song-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
            this.j.a(uyz, Collections.singletonList((String) this.l.get(0)), Optional.e(), R.string.add_to_playlist_duplicates_dialog_title, R.string.add_to_playlist_duplicates_dialog_body_single, R.string.add_to_playlist_duplicates_dialog_button_skip_single, R.string.add_to_playlist_duplicates_dialog_button_add_single);
        } else {
            this.f.a.a(str, "duplicate-songs-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
            this.j.a(uyz, a2.b(), Optional.b(a2.a()), R.string.add_to_playlist_duplicates_dialog_title, R.string.add_to_playlist_duplicates_dialog_body_multiple, R.string.add_to_playlist_duplicates_dialog_button_skip_multiple, R.string.add_to_playlist_duplicates_dialog_button_add_multiple);
        }
        this.b.a(false);
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

    public final void b() {
        this.p.c();
        this.p.a(this.e.b(this.n, this.o).a((BiPredicate<? super T, ? super T>) $$Lambda$lnd$fpXliN_fFcFdTAAl_ihjvkZcYQU.INSTANCE).a(this.g).a((Consumer<? super T>) new $$Lambda$lnd$Na11w8fPszyw46G_Tyl1O8vWWiQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$lnd$2FjDZO5VuRqM6PjDQUHa5wxPn24.INSTANCE));
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

    public final void a(uyx uyx, Optional<List<String>> optional) {
        if (!optional.b()) {
            this.f.a(uyx.getUri());
            this.q = false;
        } else if (((List) optional.c()).isEmpty()) {
            this.f.a(uyx.getUri());
            this.b.ak();
        } else {
            this.f.a(uyx.getUri(), "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.ADD_NON_DUPLICATE_TRACKS);
            b(uyx, (List) optional.c());
        }
    }

    public final void a(uyx uyx, List<String> list) {
        this.f.a(uyx.getUri(), "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.ADD_ALL_TRACKS);
        b(uyx, list);
    }

    public final void a(uyx uyx) {
        this.f.a(uyx.getUri(), "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.CANCEL);
        this.q = false;
    }

    private void b(uyx uyx, List<String> list) {
        this.p.a(this.d.a(uyx.getUri(), list).c(1, TimeUnit.SECONDS).a(this.g).a((Action) new $$Lambda$lnd$77iwCA6pYP2he6G8qcHWbdtvZc(this, uyx), (Consumer<? super Throwable>) new $$Lambda$lnd$eTIimrInzuAuJYpy2IZ0MlsZlEg<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uyx uyx) {
        this.j.a(uyx);
        this.b.ak();
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
}
