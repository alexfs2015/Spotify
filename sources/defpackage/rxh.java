package defpackage;

import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse;
import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse.RemoteConfigResponseCase;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.RemoteConfigSuccess;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.ResultCase;
import io.reactivex.functions.Function;

/* renamed from: rxh reason: default package */
public final class rxh implements Function<xgo<BootstrapResponse>, rxm> {
    public final /* synthetic */ Object apply(Object obj) {
        xgo xgo = (xgo) obj;
        if (!xgo.a()) {
            return new rxn();
        }
        BootstrapResponse bootstrapResponse = (BootstrapResponse) xgo.b();
        if (bootstrapResponse == null) {
            return new rxn();
        }
        if (RemoteConfigResponseCase.a(bootstrapResponse.d) != RemoteConfigResponseCase.REMOTE_CONFIG_RESPONSE_V1 || ResultCase.a(bootstrapResponse.k().d) != ResultCase.SUCCESS) {
            return new rxn();
        }
        RemoteConfigResponseV1 k = bootstrapResponse.k();
        return new rxo((k.d == 1 ? (RemoteConfigSuccess) k.e : RemoteConfigSuccess.l()).k().b());
    }
}
