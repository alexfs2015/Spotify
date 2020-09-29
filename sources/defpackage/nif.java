package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.IOException;

/* renamed from: nif reason: default package */
public final class nif implements SingleTransformer<wsj<wmg>, gzz> {
    private final ObjectMapper a;

    public nif(rnd rnd) {
        this.a = rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final SingleSource<gzz> a(Single<wsj<wmg>> single) {
        Single f = single.f(new $$Lambda$nif$FzNkVDU2TcV4LesR385xS3X9vbY(this));
        Class<gzz> cls = gzz.class;
        ObjectHelper.a(cls, "clazz is null");
        return f.f(Functions.a(cls));
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
}
