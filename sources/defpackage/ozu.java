package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: ozu reason: default package */
public final class ozu {
    private final onc a;
    private final ozn b;
    private final hec c;
    private final gkm d;
    private final Scheduler e;
    private final fqn f;
    private final a g;
    private final omh h;
    private final ozp i;
    private final tvn j;

    public ozu(onc onc, ozp ozp, fqn fqn, hec hec, gkm gkm, omh omh, a aVar, Scheduler scheduler, ozn ozn, tvn tvn) {
        this.a = onc;
        this.i = ozp;
        this.e = scheduler;
        this.c = hec;
        this.d = gkm;
        this.h = omh;
        this.g = aVar;
        this.f = fqn;
        this.b = ozn;
        this.j = tvn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(vld vld) {
        vlc a2 = vld.a();
        this.h.a = vld;
        FormatListType a3 = this.j.a(a2.p());
        String uri = a2.getUri();
        String a4 = this.j.a(a3, uri, this.f);
        Optional e2 = uri.equals(a4) ? Optional.e() : Optional.b(a4);
        if (e2.b()) {
            this.c.a((String) e2.c(), this.d);
            return Completable.b();
        } else if (!this.b.ai()) {
            return Completable.a();
        } else {
            this.b.aj();
            LicenseLayout a5 = this.h.a();
            this.c.a(a2.getUri(), this.g.a(this.h.b(), this.f, a5).a(a5).d().i());
            return Completable.b();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource b(vld vld) {
        return vld == null ? Single.a(new Throwable("Could not create playlist from response as playlistEntity is null")) : vld.a() == null ? Single.a(new Throwable("Could not create playlist from response as playlistEntity.getPlaylist() is null")) : Single.b(vld);
    }

    public final Completable a() {
        Completable a2 = this.a.a();
        ozp ozp = this.i;
        return a2.a((SingleSource<T>) ozp.b.a(ozp.a, ozp.c)).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$ozu$kbU4fojVjpy4JM5fSeHlNNz4j2w.INSTANCE).a(this.e).e(new $$Lambda$ozu$PKyNvbCfNKf9a4mfaqViK_DU2v0(this));
    }
}
