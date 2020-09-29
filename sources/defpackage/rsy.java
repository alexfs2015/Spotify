package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import java.io.IOException;

/* renamed from: rsy reason: default package */
final class rsy implements FlowableTransformer<wsj<wmg>, gzz> {
    private final ObjectMapper a;

    public rsy(rnd rnd) {
        this.a = rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HubsJsonViewModel a(wsj wsj) {
        String str = "Failed to parse response body";
        try {
            wmg wmg = (wmg) wsj.b();
            if (wsj.a() && wmg != null) {
                return (HubsJsonViewModel) this.a.readValue(wmg.e(), HubsJsonViewModel.class);
            }
            wmg wmg2 = wsj.b;
            if (!wsj.a() && wmg2 != null) {
                byte[] e = wmg2.e();
                if (e.length > 0) {
                    return (HubsJsonViewModel) this.a.readValue(e, HubsJsonViewModel.class);
                }
            }
            throw new RuntimeException(str);
        } catch (IOException e2) {
            throw new RuntimeException(str, e2);
        }
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return flowable.c((Function<? super T, ? extends R>) new $$Lambda$rsy$W4_xI0qOItVFXdU_8TZbqEQ4LNQ<Object,Object>(this)).a(gzz.class);
    }
}
