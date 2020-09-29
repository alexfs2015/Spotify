package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader;
import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader.BansResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: qtu reason: default package */
public final class qtu {
    private final BansLoader a;
    private Observable<BansResponse> b;

    public qtu(BansLoader bansLoader) {
        this.a = bansLoader;
    }

    public final Observable<Boolean> a() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$qtu$L_ky1_ZYLZlMaVfLzeue5Cj6Eg4.INSTANCE);
    }

    public final Observable<Boolean> b() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$qtu$RwzwaVhAEVF6TfXzPF4IdSK1o6g.INSTANCE);
    }

    private Observable<BansResponse> c() {
        if (this.b == null) {
            this.b = this.a.a().a(1).a();
        }
        return this.b;
    }
}
