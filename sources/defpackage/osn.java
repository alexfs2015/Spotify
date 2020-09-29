package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: osn reason: default package */
public final class osn {
    public final SerialDisposable a = new SerialDisposable();
    public final CompletableSubject b = CompletableSubject.f();
    private final ofy c;
    private final osh d;
    private final ose e;
    private final hbj f;
    private final gjb g;
    private final Scheduler h;
    private final fpt i;
    private final a j;
    private final ofd k;
    private final osj l;
    private final tjv m;

    public osn(ofy ofy, osj osj, fpt fpt, hbj hbj, gjb gjb, ofd ofd, a aVar, Scheduler scheduler, osh osh, ose ose, tjv tjv) {
        this.c = ofy;
        this.l = osj;
        this.h = scheduler;
        this.f = hbj;
        this.g = gjb;
        this.k = ofd;
        this.j = aVar;
        this.i = fpt;
        this.d = osh;
        this.e = ose;
        this.m = tjv;
    }

    public final void a() {
        SerialDisposable serialDisposable = this.a;
        Completable a2 = this.c.a();
        osj osj = this.l;
        serialDisposable.a(a2.a((SingleSource<T>) osj.b.a(osj.a, osj.c)).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$osn$5Ks0Lk7zXRAuH7r77pueLsO3gD0.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$osn$WM0gtDvdAn6C9VYxrmfU4VZ65Ms<Object>(this), (Consumer<? super Throwable>) new $$Lambda$osn$5uC53grA8x7EsAKQXdoJyUDIu0I<Object>(this)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource b(uza uza) {
        if (uza == null) {
            return Single.a(new Throwable("Could not create playlist from response as playlistEntity is null"));
        }
        if (uza.a() == null) {
            return Single.a(new Throwable("Could not create playlist from response as playlistEntity.getPlaylist() is null"));
        }
        return Single.b(uza);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uza uza) {
        Optional optional;
        uyz a2 = uza.a();
        this.k.a = uza;
        FormatListType a3 = this.m.a(a2.p());
        String uri = a2.getUri();
        String a4 = this.m.a(a3, uri, this.i);
        if (uri.equals(a4)) {
            optional = Optional.e();
        } else if (this.e.c()) {
            jst a5 = jst.a(a4);
            if (this.e.ah().b()) {
                optional = Optional.c(a5.i((String) this.e.ah().c()));
            } else {
                optional = Optional.c(a5.p());
            }
        } else {
            optional = Optional.b(a4);
        }
        if (optional.b()) {
            this.f.a((String) optional.c(), this.g);
        } else if (this.d.ai()) {
            this.d.aj();
            LicenseLayout a6 = this.k.a();
            this.f.a(a2.getUri(), this.j.a(this.k.b(), this.i, a6).a(a6).d().i());
        } else {
            this.b.onComplete();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        if (!this.b.g()) {
            this.b.onError(th);
        }
    }
}
