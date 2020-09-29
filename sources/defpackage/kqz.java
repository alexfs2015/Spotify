package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: kqz reason: default package */
public final class kqz implements Function<RadioSeedBundle, Observable<RadioSeedBundle>> {
    private final RxResolver a;

    public final /* synthetic */ Object apply(Object obj) {
        RadioSeedBundle radioSeedBundle = (RadioSeedBundle) obj;
        return Observable.b(radioSeedBundle).h(new $$Lambda$kqz$0x161omvAIuv_NZDLEMQ8eHvs(this)).b((ObservableSource<? extends U>) Observable.b(radioSeedBundle), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$kqz$fsv8Nmc5OGgD1iV8hUhfBJAMRIc.INSTANCE);
    }

    kqz(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(RadioSeedBundle radioSeedBundle) {
        String radioSeed = radioSeedBundle.getRadioSeed();
        return this.a.resolve(new Request(Request.GET, String.format("hm://autoplay-enabled/query?uri=%s", new Object[]{Uri.encode(radioSeed)}))).h(new $$Lambda$kqz$FiPj7f3D4TUzlTKI9RlwyxKG6g(radioSeed));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(String str, Response response) {
        if (response.getStatus() == 200) {
            String valueOf = String.valueOf(response.getBodyString());
            if (!fax.a(valueOf)) {
                return Observable.b(valueOf);
            }
        }
        Logger.d("Autoplay not triggered: context uri: %s, response: %s", str, response);
        return Observable.c();
    }
}
