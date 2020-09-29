package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.features.createplaylist.CreatePlaylistLogger;
import com.spotify.music.features.createplaylist.CreatePlaylistLogger.UserIntent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;

/* renamed from: mnk reason: default package */
public final class mnk {
    public final mnn a;
    public final CreatePlaylistLogger b;
    final Scheduler c;
    final rqb d;
    final CompositeDisposable e = new CompositeDisposable();
    private final vjv f;
    private final hgy g;
    private final mnm h;
    private final szp i;
    private final hdv j;
    private final mni k;
    private final mnl l;
    private final boolean m;

    /* renamed from: mnk$a */
    public static abstract class a {

        /* renamed from: mnk$a$a reason: collision with other inner class name */
        public interface C0057a {
            C0057a a(fqn fqn);

            C0057a a(String str);

            a a();

            C0057a b(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract fqn c();
    }

    public mnk(mnn mnn, CreatePlaylistLogger createPlaylistLogger, vjv vjv, Scheduler scheduler, final hgy hgy, mnm mnm, szp szp, hdv hdv, mni mni, mnl mnl, rqb rqb, final com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        this.a = mnn;
        this.b = createPlaylistLogger;
        this.f = vjv;
        this.c = scheduler;
        this.g = hgy;
        this.h = mnm;
        this.i = szp;
        this.j = hdv;
        this.k = mni;
        this.l = mnl;
        this.m = this.k.r().isEmpty();
        this.d = rqb;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(fqn fqn) {
                if (mnk.this.d.a(fqn)) {
                    mnk.this.a.m();
                }
            }

            public final void a() {
                mnk.this.e.c();
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void c() {
                mnk.this.e.c();
                mnk.this.e.a(hgy.a().a(mnk.this.c).a((Consumer<? super T>) new $$Lambda$mnk$1$BZ2ELV8mRe773Tv5PjANBn92_o<Object>(this), (Consumer<? super Throwable>) $$Lambda$mnk$1$9gpto78lL2wfuE6M4Ml2sQpXQNQ.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Optional optional, List list) {
        return this.f.a(str, list, optional).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(boolean z, List list, Optional optional, String str) {
        return Observable.a((ObservableSource<? extends T1>) this.g.a().j(), (ObservableSource<? extends T2>) (z ? this.j.a(list) : Single.b(Collections.emptyList())).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mnk$q5nFQZmcKzzp5_iZkCEhMFzVMQ<Object,Object>(this, str, optional), false), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$mnk$Y2aYQqup5GzV3ziAdcgtTz9_elU<Object,Object,Object>(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to create playlist", new Object[0]);
        this.a.l();
        this.a.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, a aVar) {
        if (z) {
            if (this.d.a(aVar.c())) {
                mnl mnl = this.l;
                String b2 = aVar.b();
                mnl.c.a = uzy.a(mnl.a.getString(R.string.toast_added_to_playlist, new Object[]{b2}), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
            } else {
                mnl mnl2 = this.l;
                String b3 = aVar.b();
                mnl2.b.a(SpotifyIconV2.ADD_TO_PLAYLIST, mnl2.a.getString(R.string.toast_added_to_playlist, new Object[]{b3}), R.string.toast_added_to_playlist, 0);
            }
        }
        this.a.a(aVar.a());
        if (this.m) {
            this.i.a(aVar.a());
        }
    }

    public final void a(String str) {
        this.a.a(true);
        this.b.a("dialog-buttons", fbo.a(str) ^ true ? UserIntent.CREATE : UserIntent.CREATE_DEFAULT_NAME_PLAYLIST);
        List r = this.k.r();
        jva a2 = jva.a(this.k.s());
        Optional c2 = a2.b == LinkType.COLLECTION_PLAYLIST_FOLDER ? Optional.c(a2.k()) : Optional.e();
        boolean isEmpty = true ^ r.isEmpty();
        this.a.k();
        this.e.a(this.h.a(str).d().h(new $$Lambda$mnk$LczPnsKzcBqDLRoBN2HOHVj9d2M(this, isEmpty, r, c2)).a(this.c).a((Consumer<? super T>) new $$Lambda$mnk$unO7OhH3fKTwKp5ERVdMpK5Dyyk<Object>(this, isEmpty), (Consumer<? super Throwable>) new $$Lambda$mnk$d6J1L64xMi6Bri7WSzjjTfM5pyk<Object>(this)));
    }
}
