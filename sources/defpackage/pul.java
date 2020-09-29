package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: pul reason: default package */
public final class pul {
    public static ObservableTransformer<a, pui> a(ptt ptt, pum pum, kxz kxz) {
        return new $$Lambda$pul$azXZgpj9KAFRrC3NnP5OSK9OjfA(kxz, ptt, pum);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ptt ptt, pum pum, Boolean bool) {
        if (bool.booleanValue()) {
            return ptt.a().c((Function<? super T, ? extends R>) $$Lambda$Kow2Ac5p9xRqJQMEGb169QDV4.INSTANCE).e((Function<? super Throwable, ? extends T>) new $$Lambda$pul$G8kBx4we3GHO_UKIpIGWBC3A3gs<Object,Object>(pum));
        }
        String str = "radio-hub-no-network-empty-view";
        return Observable.b(pui.b(gyi.b().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) SpotifyIconV2.OFFLINE)).a(haf.builder().a(pum.a.getString(R.string.error_no_connection_title)).d(pum.a.getString(R.string.error_no_connection_body))).e(pum.a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pui a(pum pum, Throwable th) {
        String str = "radio-hub-error-empty-view";
        return pui.b(gyi.a(SpotifyIconV2.WARNING, pum.a.getString(R.string.error_general_title), pum.a.getString(R.string.error_general_body), pum.a(str)).toBuilder().a("radio-hub-placeholder", str).a());
    }
}
