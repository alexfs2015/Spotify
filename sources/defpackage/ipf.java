package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateArtistItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ipf reason: default package */
public final class ipf extends jwa<vku> {
    public ipf(RxResolver rxResolver, xil xil, xil xil2) {
        super(rxResolver, xil, xil2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-collection").appendEncodedPath("unstable/@/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, vku> a(byte[] bArr) {
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.e.size());
        for (ProtoDecorateArtistItem protoDecorateArtistItem : a.e) {
            String str = protoDecorateArtistItem.e;
            boolean z = true;
            ProtoArtistMetadata k = (protoDecorateArtistItem.d & 1) == 1 ? protoDecorateArtistItem.k() : null;
            ProtoArtistOfflineState m = (protoDecorateArtistItem.d & 4) == 4 ? protoDecorateArtistItem.m() : null;
            if ((protoDecorateArtistItem.d & 2) != 2) {
                z = false;
            }
            hashMap.put(str, isb.a(k, m, z ? protoDecorateArtistItem.l() : null, (String) null, 0));
        }
        return hashMap;
    }
}
