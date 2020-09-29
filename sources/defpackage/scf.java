package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import java.io.IOException;

/* renamed from: scf reason: default package */
final class scf implements FlowableTransformer<xgo<xam>, hcs> {
    private final ObjectMapper a;

    public scf(rwj rwj) {
        this.a = rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HubsJsonViewModel a(xgo xgo) {
        String str = "Failed to parse response body";
        try {
            xam xam = (xam) xgo.b();
            if (xgo.a() && xam != null) {
                return (HubsJsonViewModel) this.a.readValue(xam.e(), HubsJsonViewModel.class);
            }
            xam xam2 = xgo.b;
            if (!xgo.a() && xam2 != null) {
                byte[] e = xam2.e();
                if (e.length > 0) {
                    return (HubsJsonViewModel) this.a.readValue(e, HubsJsonViewModel.class);
                }
            }
            throw new RuntimeException(str);
        } catch (IOException e2) {
            throw new RuntimeException(str, e2);
        }
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return flowable.c((Function<? super T, ? extends R>) new $$Lambda$scf$kY17PciWrIIW11hlnirhuv8vM4<Object,Object>(this)).a(hcs.class);
    }
}
