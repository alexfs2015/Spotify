package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.placebobanner.PlaceboBannerService;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;

/* renamed from: ode reason: default package */
public final class ode {
    private final Context a;
    private final vhw b;

    public ode(Context context, vhw vhw) {
        this.a = context;
        this.b = vhw;
    }

    public final Observable<PlaceboBannerService> a() {
        return this.b.a(new Intent(this.a, PlaceboBannerService.class), PlaceboBannerService.class.getSimpleName()).b(AndroidSchedulers.a()).a(AndroidSchedulers.a()).c((Function<? super T, ? extends R>) $$Lambda$ode$6lD_GqxRyXsiTCuzhpkmPTRGmY.INSTANCE).a(1).a();
    }
}
