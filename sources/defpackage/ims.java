package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateArtistItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ims reason: default package */
public final class ims extends jts<uyr> {
    public ims(RxResolver rxResolver, wug wug, wug wug2) {
        super(rxResolver, wug, wug2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-collection").appendEncodedPath("unstable/@/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, uyr> a(byte[] bArr) {
        ProtoArtistMetadata protoArtistMetadata;
        ProtoArtistOfflineState protoArtistOfflineState;
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.e.size());
        for (ProtoDecorateArtistItem protoDecorateArtistItem : a.e) {
            String str = protoDecorateArtistItem.e;
            boolean z = true;
            if ((protoDecorateArtistItem.d & 1) == 1) {
                protoArtistMetadata = protoDecorateArtistItem.k();
            } else {
                protoArtistMetadata = null;
            }
            if ((protoDecorateArtistItem.d & 4) == 4) {
                protoArtistOfflineState = protoDecorateArtistItem.m();
            } else {
                protoArtistOfflineState = null;
            }
            if ((protoDecorateArtistItem.d & 2) != 2) {
                z = false;
            }
            hashMap.put(str, ipo.a(protoArtistMetadata, protoArtistOfflineState, z ? protoDecorateArtistItem.l() : null, (String) null, 0));
        }
        return hashMap;
    }
}
