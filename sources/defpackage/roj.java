package defpackage;

import com.spotify.rcs.model.proto.Bootstrap.BootstrapRequest;
import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse;
import io.reactivex.Single;

/* renamed from: roj reason: default package */
public interface roj {
    @wtn(a = {"Accept: application/protobuf"})
    @wtr(a = "bootstrap/v1/bootstrap")
    Single<wsj<BootstrapResponse>> a(@wtd BootstrapRequest bootstrapRequest);
}
