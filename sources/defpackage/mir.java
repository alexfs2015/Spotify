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

/* renamed from: mir reason: default package */
public final class mir {
    public final miu a;
    public final CreatePlaylistLogger b;
    final Scheduler c;
    final rgz d;
    final CompositeDisposable e = new CompositeDisposable();
    private final uxt f;
    private final hec g;
    private final mit h;
    private final spi i;
    private final hbc j;
    private final mip k;
    private final mis l;
    private final boolean m;

    /* renamed from: mir$a */
    public static abstract class a {

        /* renamed from: mir$a$a reason: collision with other inner class name */
        public interface C0056a {
            C0056a a(fpt fpt);

            C0056a a(String str);

            a a();

            C0056a b(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract fpt c();
    }

    public mir(miu miu, CreatePlaylistLogger createPlaylistLogger, uxt uxt, Scheduler scheduler, final hec hec, mit mit, spi spi, hbc hbc, mip mip, mis mis, rgz rgz, final com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        this.a = miu;
        this.b = createPlaylistLogger;
        this.f = uxt;
        this.c = scheduler;
        this.g = hec;
        this.h = mit;
        this.i = spi;
        this.j = hbc;
        this.k = mip;
        this.l = mis;
        this.m = this.k.r().isEmpty();
        this.d = rgz;
        aVar.a(new c() {
            public final void c() {
                mir.this.e.c();
                mir.this.e.a(hec.a().a(mir.this.c).a((Consumer<? super T>) new $$Lambda$mir$1$T79QigYGihfwRCEaaRMxrHXiKQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$mir$1$UkBIZalA9bvo5rejarxWB3CISk.INSTANCE));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(fpt fpt) {
                if (mir.this.d.a(fpt)) {
                    mir.this.a.m();
                }
            }

            public final void a() {
                mir.this.e.c();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final void a(String str) {
        Optional optional;
        this.a.a(true);
        this.b.a("dialog-buttons", fax.a(str) ^ true ? UserIntent.CREATE : UserIntent.CREATE_DEFAULT_NAME_PLAYLIST);
        List r = this.k.r();
        jst a2 = jst.a(this.k.s());
        if (a2.b == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            optional = Optional.c(a2.k());
        } else {
            optional = Optional.e();
        }
        boolean isEmpty = true ^ r.isEmpty();
        this.a.k();
        this.e.a(this.h.a(str).d().h(new $$Lambda$mir$Zzizn9Z7Vmk2XM7F4akNgvGu4(this, isEmpty, r, optional)).a(this.c).a((Consumer<? super T>) new $$Lambda$mir$J3OBMoK_MSH8uMcr7krH90NlU<Object>(this, isEmpty), (Consumer<? super Throwable>) new $$Lambda$mir$crlnFtSrUmlK8w8zJEHyKd1GOuY<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(boolean z, List list, Optional optional, String str) {
        Single single;
        if (z) {
            single = this.j.a(list);
        } else {
            single = Single.b(Collections.emptyList());
        }
        return Observable.a((ObservableSource<? extends T1>) this.g.a().j(), (ObservableSource<? extends T2>) single.d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mir$elDKaWr8fKROzBkSgYsdS8zTXQ<Object,Object>(this, str, optional), false), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$mir$xkUSCMr4v1FyXmKR1Jz6iB7HFc<Object,Object,Object>(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Optional optional, List list) {
        return this.f.a(str, list, optional).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, a aVar) {
        if (z) {
            if (this.d.a(aVar.c())) {
                mis mis = this.l;
                String b2 = aVar.b();
                mis.c.a = uos.a(mis.a.getString(R.string.toast_added_to_playlist, new Object[]{b2}), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
            } else {
                mis mis2 = this.l;
                String b3 = aVar.b();
                mis2.b.a(SpotifyIconV2.ADD_TO_PLAYLIST, mis2.a.getString(R.string.toast_added_to_playlist, new Object[]{b3}), R.string.toast_added_to_playlist, 0);
            }
        }
        this.a.a(aVar.a());
        if (this.m) {
            this.i.a(aVar.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to create playlist", new Object[0]);
        this.a.l();
        this.a.a(false);
    }
}
