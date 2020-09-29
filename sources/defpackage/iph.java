package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest.ProtoDecorateTrackItem;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iph reason: default package */
public final class iph extends jwa<vlf> {
    public iph(RxResolver rxResolver, xil xil, xil xil2) {
        super(rxResolver, xil, xil2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-collection").appendEncodedPath("unstable/@/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, vlf> a(byte[] bArr) {
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.f.size());
        for (ProtoDecorateTrackItem protoDecorateTrackItem : a.f) {
            String str = protoDecorateTrackItem.e;
            boolean z = true;
            ProtoTrackMetadata k = (protoDecorateTrackItem.d & 1) == 1 ? protoDecorateTrackItem.k() : null;
            ProtoTrackOfflineState l = (protoDecorateTrackItem.d & 2) == 2 ? protoDecorateTrackItem.l() : null;
            ProtoTrackPlayState m = (protoDecorateTrackItem.d & 4) == 4 ? protoDecorateTrackItem.m() : null;
            if ((protoDecorateTrackItem.d & 8) != 8) {
                z = false;
            }
            hashMap.put(str, isb.a(k, l, m, z ? protoDecorateTrackItem.n() : null, 0, null));
        }
        return hashMap;
    }
}
