package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader;
import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader.BansResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: rcj reason: default package */
public final class rcj {
    private final BansLoader a;
    private Observable<BansResponse> b;

    public rcj(BansLoader bansLoader) {
        this.a = bansLoader;
    }

    private Observable<BansResponse> c() {
        if (this.b == null) {
            this.b = this.a.a().a(1).a();
        }
        return this.b;
    }

    public final Observable<Boolean> a() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$rcj$8MGaiMMlQuwxMa62y9SH1q12Gg.INSTANCE);
    }

    public final Observable<Boolean> b() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$rcj$7BMdCVn6Q1uZDhVzSMg9QtmYSvI.INSTANCE);
    }
}
