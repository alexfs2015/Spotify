package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: mpq reason: default package */
public final class mpq {
    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(mot mot, mpr mpr, Boolean bool) {
        if (bool.booleanValue()) {
            return mot.a().d().c((Function<? super T, ? extends R>) $$Lambda$HQTV4RoPCL4rdGn9S0CLpogqAo.INSTANCE).e((Function<? super Throwable, ? extends T>) new $$Lambda$mpq$DoAAyWfkT87Qu25rFNujSgc2g0I<Object,Object>(mpr));
        }
        String str = "daily-mix-hub-no-network-empty-view";
        return Observable.b(mpm.b(hbb.b().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) SpotifyIconV2.OFFLINE)).a(hcy.builder().a(mpr.a.getString(R.string.error_no_connection_title)).d(mpr.a.getString(R.string.error_no_connection_body))).e(mpr.a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a()));
    }

    public static ObservableTransformer<mpl, mpm> a(mot mot, mpr mpr, lbi lbi) {
        return kok.a().a(a.class, b(mot, mpr, lbi)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mpm a(mpr mpr, Throwable th) {
        String str = "daily-mix-hub-error-empty-view";
        return mpm.b(hbb.a(SpotifyIconV2.WARNING, mpr.a.getString(R.string.error_general_title), mpr.a.getString(R.string.error_general_body), mpr.a(str)).toBuilder().a("daily-mix-hub-placeholder", str).a());
    }

    private static ObservableTransformer<a, mpm> b(mot mot, mpr mpr, lbi lbi) {
        return new $$Lambda$mpq$LT1nb1nRZTiCRWSLXAHI1AItS70(lbi, mot, mpr);
    }
}
