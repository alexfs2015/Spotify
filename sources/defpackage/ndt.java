package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.hubs.view.proto.View;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.io.IOException;

/* renamed from: ndt reason: default package */
public final class ndt implements c<wsj<wmg>, gzz> {
    private final ObjectMapper a;
    private final boolean b;

    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).f(new $$Lambda$ndt$2RQl3mN7vpFV4eRlPd1B4CcwW50(this));
    }

    public ndt(rnd rnd, boolean z) {
        this.a = rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.b = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(wsj wsj) {
        String str = "Failed to parse response body";
        try {
            wmg wmg = (wmg) wsj.b();
            if (!wsj.a() || wmg == null) {
                wmg wmg2 = wsj.b;
                if (!wsj.a() && wmg2 != null) {
                    byte[] e = wmg2.e();
                    if (e.length > 0) {
                        if (this.b) {
                            return rss.a(View.a(e));
                        }
                        return (gzz) this.a.readValue(e, HubsJsonViewModel.class);
                    }
                }
                throw new RuntimeException(str);
            }
            byte[] e2 = wmg.e();
            if (this.b) {
                return rss.a(View.a(e2));
            }
            return (gzz) this.a.readValue(e2, HubsJsonViewModel.class);
        } catch (IOException e3) {
            throw new RuntimeException(str, e3);
        }
    }
}
