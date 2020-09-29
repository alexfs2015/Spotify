package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoDecorateTrackItem extends Message<ProtoDecorateTrackItem, Builder> {
    public static final ProtoAdapter<ProtoDecorateTrackItem> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    private static final long serialVersionUID = 0;
    public final ProtoTrackCollectionState collection_state;
    public final String link;
    public final ProtoTrackOfflineState offline_state;
    public final ProtoTrackPlayState play_state;
    public final ProtoTrackMetadata track_metadata;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoDecorateTrackItem, Builder> {
        public ProtoTrackCollectionState collection_state;
        public String link;
        public ProtoTrackOfflineState offline_state;
        public ProtoTrackPlayState play_state;
        public ProtoTrackMetadata track_metadata;

        public final ProtoDecorateTrackItem build() {
            ProtoDecorateTrackItem protoDecorateTrackItem = r0;
            ProtoDecorateTrackItem protoDecorateTrackItem2 = new ProtoDecorateTrackItem(this.track_metadata, this.offline_state, this.play_state, this.collection_state, this.link, super.buildUnknownFields());
            return protoDecorateTrackItem2;
        }

        public final Builder collection_state(ProtoTrackCollectionState protoTrackCollectionState) {
            this.collection_state = protoTrackCollectionState;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder offline_state(ProtoTrackOfflineState protoTrackOfflineState) {
            this.offline_state = protoTrackOfflineState;
            return this;
        }

        public final Builder play_state(ProtoTrackPlayState protoTrackPlayState) {
            this.play_state = protoTrackPlayState;
            return this;
        }

        public final Builder track_metadata(ProtoTrackMetadata protoTrackMetadata) {
            this.track_metadata = protoTrackMetadata;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateTrackItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateTrackItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateTrackItem protoDecorateTrackItem = (ProtoDecorateTrackItem) obj;
            int i = 0;
            int a = (protoDecorateTrackItem.track_metadata != null ? ProtoTrackMetadata.ADAPTER.a(1, protoDecorateTrackItem.track_metadata) : 0) + (protoDecorateTrackItem.offline_state != null ? ProtoTrackOfflineState.ADAPTER.a(2, protoDecorateTrackItem.offline_state) : 0) + (protoDecorateTrackItem.play_state != null ? ProtoTrackPlayState.ADAPTER.a(3, protoDecorateTrackItem.play_state) : 0) + (protoDecorateTrackItem.collection_state != null ? ProtoTrackCollectionState.ADAPTER.a(4, protoDecorateTrackItem.collection_state) : 0);
            if (protoDecorateTrackItem.link != null) {
                i = ProtoAdapter.i.a(5, protoDecorateTrackItem.link);
            }
            return a + i + protoDecorateTrackItem.a().h();
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
                    builder.offline_state((ProtoTrackOfflineState) ProtoTrackOfflineState.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.play_state((ProtoTrackPlayState) ProtoTrackPlayState.ADAPTER.a(whg));
                } else if (b == 4) {
                    builder.collection_state((ProtoTrackCollectionState) ProtoTrackCollectionState.ADAPTER.a(whg));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.link((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoDecorateTrackItem protoDecorateTrackItem = (ProtoDecorateTrackItem) obj;
            if (protoDecorateTrackItem.track_metadata != null) {
                ProtoTrackMetadata.ADAPTER.a(whh, 1, protoDecorateTrackItem.track_metadata);
            }
            if (protoDecorateTrackItem.offline_state != null) {
                ProtoTrackOfflineState.ADAPTER.a(whh, 2, protoDecorateTrackItem.offline_state);
            }
            if (protoDecorateTrackItem.play_state != null) {
                ProtoTrackPlayState.ADAPTER.a(whh, 3, protoDecorateTrackItem.play_state);
            }
            if (protoDecorateTrackItem.collection_state != null) {
                ProtoTrackCollectionState.ADAPTER.a(whh, 4, protoDecorateTrackItem.collection_state);
            }
            if (protoDecorateTrackItem.link != null) {
                ProtoAdapter.i.a(whh, 5, protoDecorateTrackItem.link);
            }
            whh.a(protoDecorateTrackItem.a());
        }
    }

    public ProtoDecorateTrackItem(ProtoTrackMetadata protoTrackMetadata, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackPlayState protoTrackPlayState, ProtoTrackCollectionState protoTrackCollectionState, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.track_metadata = protoTrackMetadata;
        this.offline_state = protoTrackOfflineState;
        this.play_state = protoTrackPlayState;
        this.collection_state = protoTrackCollectionState;
        this.link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoDecorateTrackItem)) {
            return false;
        }
        ProtoDecorateTrackItem protoDecorateTrackItem = (ProtoDecorateTrackItem) obj;
        return a().equals(protoDecorateTrackItem.a()) && whk.a((Object) this.track_metadata, (Object) protoDecorateTrackItem.track_metadata) && whk.a((Object) this.offline_state, (Object) protoDecorateTrackItem.offline_state) && whk.a((Object) this.play_state, (Object) protoDecorateTrackItem.play_state) && whk.a((Object) this.collection_state, (Object) protoDecorateTrackItem.collection_state) && whk.a((Object) this.link, (Object) protoDecorateTrackItem.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            ProtoTrackMetadata protoTrackMetadata = this.track_metadata;
            int i2 = 0;
            int hashCode2 = (hashCode + (protoTrackMetadata != null ? protoTrackMetadata.hashCode() : 0)) * 37;
            ProtoTrackOfflineState protoTrackOfflineState = this.offline_state;
            int hashCode3 = (hashCode2 + (protoTrackOfflineState != null ? protoTrackOfflineState.hashCode() : 0)) * 37;
            ProtoTrackPlayState protoTrackPlayState = this.play_state;
            int hashCode4 = (hashCode3 + (protoTrackPlayState != null ? protoTrackPlayState.hashCode() : 0)) * 37;
            ProtoTrackCollectionState protoTrackCollectionState = this.collection_state;
            int hashCode5 = (hashCode4 + (protoTrackCollectionState != null ? protoTrackCollectionState.hashCode() : 0)) * 37;
            String str = this.link;
            if (str != null) {
                i2 = str.hashCode();
            }
            i = hashCode5 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.track_metadata != null) {
            String str = "akst r,et=_damaca";
            sb.append(", track_metadata=");
            sb.append(this.track_metadata);
        }
        if (this.offline_state != null) {
            String str2 = "=onmtiae,ef_s lf";
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        if (this.play_state != null) {
            String str3 = "ps_yotae= tal";
            sb.append(", play_state=");
            sb.append(this.play_state);
        }
        if (this.collection_state != null) {
            String str4 = "toni bllccotea_=ets";
            sb.append(", collection_state=");
            sb.append(this.collection_state);
        }
        if (this.link != null) {
            String str5 = ",lik =b";
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateTrackItem{");
        replace.append('}');
        return replace.toString();
    }
}
