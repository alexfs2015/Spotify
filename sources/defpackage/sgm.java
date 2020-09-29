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

/* renamed from: sgm reason: default package */
public final class sgm extends jwa<Show> {
    public sgm(RxResolver rxResolver, xil xil, xil xil2) {
        super(rxResolver, xil, xil2);
    }

    public final String a() {
        Builder appendQueryParameter = new Builder().scheme("sp").authority("core-show").appendEncodedPath("unstable/decorate").appendQueryParameter("responseFormat", "protobuf");
        if (this.a) {
            appendQueryParameter.appendQueryParameter("preferCached", "true");
        }
        return appendQueryParameter.build().toString();
    }

    public final Map<String, Show> a(byte[] bArr) {
        ProtoDecorateResponse a = ProtoDecorateResponse.a(bArr);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a.d.size());
        for (ProtoDecorateShowItem protoDecorateShowItem : a.d) {
            String str = protoDecorateShowItem.e;
            boolean z = true;
            ProtoShowMetadata k = (protoDecorateShowItem.d & 1) == 1 ? protoDecorateShowItem.k() : null;
            ProtoShowCollectionState l = (protoDecorateShowItem.d & 2) == 2 ? protoDecorateShowItem.l() : null;
            if ((protoDecorateShowItem.d & 4) != 4) {
                z = false;
            }
            hashMap.put(str, vmn.a(k, l, z ? protoDecorateShowItem.m() : null, 0, false, -1));
        }
        return hashMap;
    }
}
