package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateAlbumItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: imq reason: default package */
public final class imq extends jts<uyq> {
    public imq(RxResolver rxResolver, wug wug, wug wug2) {
        super(rxResolver, wug, wug2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-collection").appendEncodedPath("unstable/@/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, uyq> a(byte[] bArr) {
        ProtoAlbumMetadata protoAlbumMetadata;
        ProtoAlbumOfflineState protoAlbumOfflineState;
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.d.size());
        for (ProtoDecorateAlbumItem protoDecorateAlbumItem : a.d) {
            String str = protoDecorateAlbumItem.e;
            boolean z = true;
            if ((protoDecorateAlbumItem.d & 1) == 1) {
                protoAlbumMetadata = protoDecorateAlbumItem.k();
            } else {
                protoAlbumMetadata = null;
            }
            if ((protoDecorateAlbumItem.d & 4) == 4) {
                protoAlbumOfflineState = protoDecorateAlbumItem.m();
            } else {
                protoAlbumOfflineState = null;
            }
            if ((protoDecorateAlbumItem.d & 2) != 2) {
                z = false;
            }
            hashMap.put(str, ipo.a(protoAlbumMetadata, protoAlbumOfflineState, z ? protoDecorateAlbumItem.l() : null, (String) null, 0));
        }
        return hashMap;
    }
}
