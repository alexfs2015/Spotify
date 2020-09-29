package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.placebobanner.PlaceboBannerService;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;

/* renamed from: okk reason: default package */
public final class okk {
    private final Context a;
    private final vvb b;

    public okk(Context context, vvb vvb) {
        this.a = context;
        this.b = vvb;
    }

    public final Observable<PlaceboBannerService> a() {
        return this.b.a(new Intent(this.a, PlaceboBannerService.class), PlaceboBannerService.class.getSimpleName()).b(AndroidSchedulers.a()).a(AndroidSchedulers.a()).c((Function<? super T, ? extends R>) $$Lambda$okk$9YzRFlOJEOaSBwQlRT7CjZqqg.INSTANCE).a(1).a();
    }
}
