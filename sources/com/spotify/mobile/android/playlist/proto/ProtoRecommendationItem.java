package com.spotify.mobile.android.playlist.proto;

import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackPlayState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoRecommendationItem extends Message<ProtoRecommendationItem, Builder> {
    public static final ProtoAdapter<ProtoRecommendationItem> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final ProtoTrackCollectionState track_collection_state;
    public final ProtoTrackMetadata track_metadata;
    public final ProtoTrackOfflineState track_offline_state;
    public final ProtoTrackPlayState track_play_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoRecommendationItem, Builder> {
        public ProtoTrackCollectionState track_collection_state;
        public ProtoTrackMetadata track_metadata;
        public ProtoTrackOfflineState track_offline_state;
        public ProtoTrackPlayState track_play_state;

        public final ProtoRecommendationItem build() {
            ProtoRecommendationItem protoRecommendationItem = r0;
            ProtoRecommendationItem protoRecommendationItem2 = new ProtoRecommendationItem(this.track_metadata, this.track_collection_state, this.track_offline_state, this.track_play_state, super.buildUnknownFields());
            return protoRecommendationItem2;
        }

        public final Builder track_collection_state(ProtoTrackCollectionState protoTrackCollectionState) {
            this.track_collection_state = protoTrackCollectionState;
            return this;
        }

        public final Builder track_metadata(ProtoTrackMetadata protoTrackMetadata) {
            this.track_metadata = protoTrackMetadata;
            return this;
        }

        public final Builder track_offline_state(ProtoTrackOfflineState protoTrackOfflineState) {
            this.track_offline_state = protoTrackOfflineState;
            return this;
        }

        public final Builder track_play_state(ProtoTrackPlayState protoTrackPlayState) {
            this.track_play_state = protoTrackPlayState;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoRecommendationItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoRecommendationItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoRecommendationItem protoRecommendationItem = (ProtoRecommendationItem) obj;
            int i = 0;
            int a = (protoRecommendationItem.track_metadata != null ? ProtoTrackMetadata.ADAPTER.a(1, protoRecommendationItem.track_metadata) : 0) + (protoRecommendationItem.track_collection_state != null ? ProtoTrackCollectionState.ADAPTER.a(2, protoRecommendationItem.track_collection_state) : 0) + (protoRecommendationItem.track_offline_state != null ? ProtoTrackOfflineState.ADAPTER.a(3, protoRecommendationItem.track_offline_state) : 0);
            if (protoRecommendationItem.track_play_state != null) {
                i = ProtoTrackPlayState.ADAPTER.a(4, protoRecommendationItem.track_play_state);
            }
            return a + i + protoRecommendationItem.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.track_metadata((ProtoTrackMetadata) ProtoTrackMetadata.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.track_collection_state((ProtoTrackCollectionState) ProtoTrackCollectionState.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.track_offline_state((ProtoTrackOfflineState) ProtoTrackOfflineState.ADAPTER.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.track_play_state((ProtoTrackPlayState) ProtoTrackPlayState.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoRecommendationItem protoRecommendationItem = (ProtoRecommendationItem) obj;
            if (protoRecommendationItem.track_metadata != null) {
                ProtoTrackMetadata.ADAPTER.a(whh, 1, protoRecommendationItem.track_metadata);
            }
            if (protoRecommendationItem.track_collection_state != null) {
                ProtoTrackCollectionState.ADAPTER.a(whh, 2, protoRecommendationItem.track_collection_state);
            }
            if (protoRecommendationItem.track_offline_state != null) {
                ProtoTrackOfflineState.ADAPTER.a(whh, 3, protoRecommendationItem.track_offline_state);
            }
            if (protoRecommendationItem.track_play_state != null) {
                ProtoTrackPlayState.ADAPTER.a(whh, 4, protoRecommendationItem.track_play_state);
            }
            whh.a(protoRecommendationItem.a());
        }
    }

    public ProtoRecommendationItem(ProtoTrackMetadata protoTrackMetadata, ProtoTrackCollectionState protoTrackCollectionState, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackPlayState protoTrackPlayState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.track_metadata = protoTrackMetadata;
        this.track_collection_state = protoTrackCollectionState;
        this.track_offline_state = protoTrackOfflineState;
        this.track_play_state = protoTrackPlayState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoRecommendationItem)) {
            return false;
        }
        ProtoRecommendationItem protoRecommendationItem = (ProtoRecommendationItem) obj;
        return a().equals(protoRecommendationItem.a()) && whk.a((Object) this.track_metadata, (Object) protoRecommendationItem.track_metadata) && whk.a((Object) this.track_collection_state, (Object) protoRecommendationItem.track_collection_state) && whk.a((Object) this.track_offline_state, (Object) protoRecommendationItem.track_offline_state) && whk.a((Object) this.track_play_state, (Object) protoRecommendationItem.track_play_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoTrackMetadata protoTrackMetadata = this.track_metadata;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoTrackMetadata != null ? protoTrackMetadata.hashCode() : 0)) * 37;
        ProtoTrackCollectionState protoTrackCollectionState = this.track_collection_state;
        int hashCode3 = (hashCode2 + (protoTrackCollectionState != null ? protoTrackCollectionState.hashCode() : 0)) * 37;
        ProtoTrackOfflineState protoTrackOfflineState = this.track_offline_state;
        int hashCode4 = (hashCode3 + (protoTrackOfflineState != null ? protoTrackOfflineState.hashCode() : 0)) * 37;
        ProtoTrackPlayState protoTrackPlayState = this.track_play_state;
        if (protoTrackPlayState != null) {
            i2 = protoTrackPlayState.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.track_metadata != null) {
            sb.append(", track_metadata=");
            sb.append(this.track_metadata);
        }
        if (this.track_collection_state != null) {
            String str = "otsae=_tl ctns_corait,cke";
            sb.append(", track_collection_state=");
            sb.append(this.track_collection_state);
        }
        if (this.track_offline_state != null) {
            String str2 = "ak_mfeteircstfo,a=tnl ";
            sb.append(", track_offline_state=");
            sb.append(this.track_offline_state);
        }
        if (this.track_play_state != null) {
            String str3 = "tp_,okya_ea=satlrt ";
            sb.append(", track_play_state=");
            sb.append(this.track_play_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoRecommendationItem{");
        replace.append('}');
        return replace.toString();
    }
}
