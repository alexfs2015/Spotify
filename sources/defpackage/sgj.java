package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateResponse;
import java.util.Map;

/* renamed from: sgj reason: default package */
public final class sgj extends jwa<vkv> {
    public sgj(RxResolver rxResolver, xil xil, xil xil2) {
        super(rxResolver, xil, xil2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-show").appendEncodedPath("unstable/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, vkv> a(byte[] bArr) {
        return vmn.a(ProtoDecorateResponse.a(bArr));
    }
}
