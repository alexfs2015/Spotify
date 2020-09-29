package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateAlbumItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ipd reason: default package */
public final class ipd extends jwa<vkt> {
    public ipd(RxResolver rxResolver, xil xil, xil xil2) {
        super(rxResolver, xil, xil2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-collection").appendEncodedPath("unstable/@/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, vkt> a(byte[] bArr) {
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.d.size());
        for (ProtoDecorateAlbumItem protoDecorateAlbumItem : a.d) {
            String str = protoDecorateAlbumItem.e;
            boolean z = true;
            ProtoAlbumMetadata k = (protoDecorateAlbumItem.d & 1) == 1 ? protoDecorateAlbumItem.k() : null;
            ProtoAlbumOfflineState m = (protoDecorateAlbumItem.d & 4) == 4 ? protoDecorateAlbumItem.m() : null;
            if ((protoDecorateAlbumItem.d & 2) != 2) {
                z = false;
            }
            hashMap.put(str, isb.a(k, m, z ? protoDecorateAlbumItem.l() : null, (String) null, 0));
        }
        return hashMap;
    }
}
