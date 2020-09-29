package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: qdh reason: default package */
public final class qdh {
    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(qcp qcp, qdi qdi, Boolean bool) {
        if (bool.booleanValue()) {
            return qcp.a().c((Function<? super T, ? extends R>) $$Lambda$cuxKGNFCKgQGe76DJVUpyntmeTs.INSTANCE).e((Function<? super Throwable, ? extends T>) new $$Lambda$qdh$WYoWgiXF9QB8LZstp20EmDJhFIc<Object,Object>(qdi));
        }
        String str = "radio-hub-no-network-empty-view";
        return Observable.b(qde.b(hbb.b().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) SpotifyIconV2.OFFLINE)).a(hcy.builder().a(qdi.a.getString(R.string.error_no_connection_title)).d(qdi.a.getString(R.string.error_no_connection_body))).e(qdi.a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a()));
    }

    public static ObservableTransformer<a, qde> a(qcp qcp, qdi qdi, lbi lbi) {
        return new $$Lambda$qdh$n8TCLyMC9gh7f4CEv86Qyg3JgI(lbi, qcp, qdi);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qde a(qdi qdi, Throwable th) {
        String str = "radio-hub-error-empty-view";
        return qde.b(hbb.a(SpotifyIconV2.WARNING, qdi.a.getString(R.string.error_general_title), qdi.a.getString(R.string.error_general_body), qdi.a(str)).toBuilder().a("radio-hub-placeholder", str).a());
    }
}
