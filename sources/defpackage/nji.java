package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.hubs.view.proto.View;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.io.IOException;

/* renamed from: nji reason: default package */
public final class nji implements c<xgo<xam>, hcs> {
    private final ObjectMapper a;
    private final boolean b;

    public nji(rwj rwj, boolean z) {
        this.a = rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.b = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(xgo xgo) {
        String str = "Failed to parse response body";
        try {
            xam xam = (xam) xgo.b();
            if (!xgo.a() || xam == null) {
                xam xam2 = xgo.b;
                if (!xgo.a() && xam2 != null) {
                    byte[] e = xam2.e();
                    if (e.length > 0) {
                        return this.b ? sbz.a(View.a(e)) : (hcs) this.a.readValue(e, HubsJsonViewModel.class);
                    }
                }
                throw new RuntimeException(str);
            }
            byte[] e2 = xam.e();
            return this.b ? sbz.a(View.a(e2)) : (hcs) this.a.readValue(e2, HubsJsonViewModel.class);
        } catch (IOException e3) {
            throw new RuntimeException(str, e3);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) new $$Lambda$nji$kptsx9yYgbwwUZ7TvNiFCZF1lEo<Object,Object>(this));
    }
}
