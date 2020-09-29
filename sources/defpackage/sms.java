package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import java.util.concurrent.TimeUnit;

/* renamed from: sms reason: default package */
public final class sms implements ObservableTransformer<f, slz> {
    private final skw a;

    public sms(skw skw) {
        this.a = skw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(f fVar) {
        return this.a.a(fVar.a, fVar.b).f($$Lambda$sms$3TFBGg65kkk0_lCG6Umsgx0uyU.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static slz a(QueryAutocompleteResult queryAutocompleteResult) {
        return slz.a((smd) new a(queryAutocompleteResult));
    }

    public final ObservableSource<slz> apply(Observable<f> observable) {
        return observable.b(200, TimeUnit.MILLISECONDS).a((ObservableTransformer<? super T, ? extends R>) new sml<Object,Object>(new $$Lambda$sms$u0cTR6KbTK4NUhqeKh9Wr_ciaVk(this), $$Lambda$wufEvCTMrfmRLbbKZ6H43lESUU.INSTANCE));
    }
}
