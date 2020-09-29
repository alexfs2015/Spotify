package defpackage;

import com.spotify.collection.endpoints.proto.TrackListMetadata.ProtoTrackListMetadataResponse;

/* renamed from: gdm reason: default package */
public final class gdm {
    public static gdl a(final ProtoTrackListMetadataResponse protoTrackListMetadataResponse) {
        return new gdl() {
            public final int a() {
                return protoTrackListMetadataResponse.d;
            }

            public final vli b() {
                return vlj.a(protoTrackListMetadataResponse.e, protoTrackListMetadataResponse.f);
            }
        };
    }
}
