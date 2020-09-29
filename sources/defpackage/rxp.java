package defpackage;

import com.spotify.rcs.model.proto.Bootstrap.BootstrapRequest;
import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse;
import io.reactivex.Single;

/* renamed from: rxp reason: default package */
public interface rxp {
    @xhs(a = {"Accept: application/protobuf"})
    @xhw(a = "bootstrap/v1/bootstrap")
    Single<xgo<BootstrapResponse>> a(@xhi BootstrapRequest bootstrapRequest);
}
