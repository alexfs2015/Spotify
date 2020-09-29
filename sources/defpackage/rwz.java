package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateResponse;
import java.util.Map;

/* renamed from: rwz reason: default package */
public final class rwz extends jts<uys> {
    public rwz(RxResolver rxResolver, wug wug, wug wug2) {
        super(rxResolver, wug, wug2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-show").appendEncodedPath("unstable/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, uys> a(byte[] bArr) {
        return uzz.a(ProtoDecorateResponse.a(bArr));
    }
}
