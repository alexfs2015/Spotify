package defpackage;

import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse;
import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse.RemoteConfigResponseCase;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.RemoteConfigSuccess;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigResponseV1.ResultCase;
import io.reactivex.functions.Function;

/* renamed from: rob reason: default package */
public final class rob implements Function<wsj<BootstrapResponse>, rog> {
    public final /* synthetic */ Object apply(Object obj) {
        RemoteConfigSuccess remoteConfigSuccess;
        wsj wsj = (wsj) obj;
        if (!wsj.a()) {
            return new roh();
        }
        BootstrapResponse bootstrapResponse = (BootstrapResponse) wsj.b();
        if (bootstrapResponse == null) {
            return new roh();
        }
        if (RemoteConfigResponseCase.a(bootstrapResponse.d) != RemoteConfigResponseCase.REMOTE_CONFIG_RESPONSE_V1 || ResultCase.a(bootstrapResponse.k().d) != ResultCase.SUCCESS) {
            return new roh();
        }
        RemoteConfigResponseV1 k = bootstrapResponse.k();
        if (k.d == 1) {
            remoteConfigSuccess = (RemoteConfigSuccess) k.e;
        } else {
            remoteConfigSuccess = RemoteConfigSuccess.l();
        }
        return new roi(remoteConfigSuccess.k().b());
    }
}
