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

/* renamed from: imu reason: default package */
public final class imu extends jts<uzc> {
    public imu(RxResolver rxResolver, wug wug, wug wug2) {
        super(rxResolver, wug, wug2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-collection").appendEncodedPath("unstable/@/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, uzc> a(byte[] bArr) {
        ProtoTrackMetadata protoTrackMetadata;
        ProtoTrackOfflineState protoTrackOfflineState;
        ProtoTrackPlayState protoTrackPlayState;
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.f.size());
        for (ProtoDecorateTrackItem protoDecorateTrackItem : a.f) {
            String str = protoDecorateTrackItem.e;
            boolean z = true;
            if ((protoDecorateTrackItem.d & 1) == 1) {
                protoTrackMetadata = protoDecorateTrackItem.k();
            } else {
                protoTrackMetadata = null;
            }
            if ((protoDecorateTrackItem.d & 2) == 2) {
                protoTrackOfflineState = protoDecorateTrackItem.l();
            } else {
                protoTrackOfflineState = null;
            }
            if ((protoDecorateTrackItem.d & 4) == 4) {
                protoTrackPlayState = protoDecorateTrackItem.m();
            } else {
                protoTrackPlayState = null;
            }
            if ((protoDecorateTrackItem.d & 8) != 8) {
                z = false;
            }
            hashMap.put(str, ipo.a(protoTrackMetadata, protoTrackOfflineState, protoTrackPlayState, z ? protoDecorateTrackItem.n() : null, 0, null));
        }
        return hashMap;
    }
}
