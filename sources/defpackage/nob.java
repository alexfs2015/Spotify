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

/* renamed from: nob reason: default package */
public final class nob implements SingleTransformer<xgo<xam>, hcs> {
    private final ObjectMapper a;

    public nob(rwj rwj) {
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

    public final SingleSource<hcs> apply(Single<xgo<xam>> single) {
        Single f = single.f(new $$Lambda$nob$mZ2ndRvQpZL9tMqd8hnWgVNNoI(this));
        Class<hcs> cls = hcs.class;
        ObjectHelper.a(cls, "clazz is null");
        return f.f(Functions.a(cls));
    }
}
