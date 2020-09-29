package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import java.util.concurrent.TimeUnit;

/* renamed from: scl reason: default package */
public final class scl implements ObservableTransformer<f, sbs> {
    private final sap a;

    public scl(sap sap) {
        this.a = sap;
    }

    public final ObservableSource<sbs> apply(Observable<f> observable) {
        return observable.b(200, TimeUnit.MILLISECONDS).a((ObservableTransformer<? super T, ? extends R>) new sce<Object,Object>(new $$Lambda$scl$g7qGDpb8N_pbjyHauhmRN1yqoHA(this), $$Lambda$d6uL7W6XV_rMN7EKd03rzdLjzs.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(f fVar) {
        return this.a.a(fVar.a, fVar.b).f($$Lambda$scl$Zney65in7KcsLjdIY2UaPW09u4A.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static sbs a(QueryAutocompleteResult queryAutocompleteResult) {
        return sbs.a((sbw) new a(queryAutocompleteResult));
    }
}
