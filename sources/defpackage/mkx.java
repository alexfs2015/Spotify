package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: mkx reason: default package */
public final class mkx {
    public static ObservableTransformer<mks, mkt> a(mka mka, mky mky, kxz kxz) {
        return klb.a().a(a.class, b(mka, mky, kxz)).a();
    }

    private static ObservableTransformer<a, mkt> b(mka mka, mky mky, kxz kxz) {
        return new $$Lambda$mkx$rFF6ALVi2T9oAI3LOkIRpvyWuM(kxz, mka, mky);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(mka mka, mky mky, Boolean bool) {
        if (bool.booleanValue()) {
            return mka.a().d().c((Function<? super T, ? extends R>) $$Lambda$ERezvQLG3VNl6yYM54bmbof4R4Y.INSTANCE).e((Function<? super Throwable, ? extends T>) new $$Lambda$mkx$e5o9XI1Ykaz_UvS1tuHdGWfnmys<Object,Object>(mky));
        }
        String str = "daily-mix-hub-no-network-empty-view";
        return Observable.b(mkt.b(gyi.b().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) SpotifyIconV2.OFFLINE)).a(haf.builder().a(mky.a.getString(R.string.error_no_connection_title)).d(mky.a.getString(R.string.error_no_connection_body))).e(mky.a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mkt a(mky mky, Throwable th) {
        String str = "daily-mix-hub-error-empty-view";
        return mkt.b(gyi.a(SpotifyIconV2.WARNING, mky.a.getString(R.string.error_general_title), mky.a.getString(R.string.error_general_body), mky.a(str)).toBuilder().a("daily-mix-hub-placeholder", str).a());
    }
}
