package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateShowItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState;
import com.spotify.playlist.models.Show;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rxc reason: default package */
public final class rxc extends jts<Show> {
    public rxc(RxResolver rxResolver, wug wug, wug wug2) {
        super(rxResolver, wug, wug2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-show").appendEncodedPath("unstable/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, Show> a(byte[] bArr) {
        ProtoShowMetadata protoShowMetadata;
        ProtoShowCollectionState protoShowCollectionState;
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.d.size());
        for (ProtoDecorateShowItem protoDecorateShowItem : a.d) {
            String str = protoDecorateShowItem.e;
            boolean z = true;
            if ((protoDecorateShowItem.d & 1) == 1) {
                protoShowMetadata = protoDecorateShowItem.k();
            } else {
                protoShowMetadata = null;
            }
            if ((protoDecorateShowItem.d & 2) == 2) {
                protoShowCollectionState = protoDecorateShowItem.l();
            } else {
                protoShowCollectionState = null;
            }
            if ((protoDecorateShowItem.d & 4) != 4) {
                z = false;
            }
            hashMap.put(str, uzz.a(protoShowMetadata, protoShowCollectionState, z ? protoDecorateShowItem.m() : null, 0, false, -1));
        }
        return hashMap;
    }
}
