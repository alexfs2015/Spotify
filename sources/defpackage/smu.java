package defpackage;

import com.spotify.music.libs.search.offline.model.OfflineResults;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: smu reason: default package */
public final class smu implements ObservableTransformer<g, slz> {
    private final sks a;

    public smu(sks sks) {
        this.a = sks;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(String str) {
        return this.a.a(str).f($$Lambda$smu$6CqQP4mwGsgSP_0lZRhjou09zo.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static slz a(OfflineResults offlineResults) {
        return slz.a((smd) new d(offlineResults));
    }

    public final ObservableSource<slz> apply(Observable<g> observable) {
        return observable.b(200, TimeUnit.MILLISECONDS).c((Function<? super T, ? extends R>) $$Lambda$uLu7SaaNS3ZhoVz0U_hhotsfN1M.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) new sml<Object,Object>(new $$Lambda$smu$13mzaLNo1VdvNq_9YfanQFzk_JM(this), $$Lambda$vTCAL2mdN0VykNAogxAMt9HGVnE.INSTANCE));
    }
}
