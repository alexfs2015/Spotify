package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.endpoint.share.ConsumerShareResponse;
import com.spotify.wrapped2019.v1.proto.ConsumerResponse;
import io.reactivex.Single;

/* renamed from: kgn reason: default package */
public interface kgn {
    @xhs(a = {"Accept: application/protobuf"})
    @xhn(a = "wrapped-backend/v1/sample/consumer?format=protobuf")
    Single<ConsumerResponse> a();

    @xhn(a = "wrapped-backend/v1/sample/consumer/share?format=json")
    Single<ConsumerShareResponse> b();
}
