package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoDecorateArtistItem extends Message<ProtoDecorateArtistItem, Builder> {
    public static final ProtoAdapter<ProtoDecorateArtistItem> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    private static final long serialVersionUID = 0;
    public final ProtoArtistMetadata artist_metadata;
    public final ProtoArtistCollectionState collection_state;
    public final String link;
    public final ProtoArtistOfflineState offline_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoDecorateArtistItem, Builder> {
        public ProtoArtistMetadata artist_metadata;
        public ProtoArtistCollectionState collection_state;
        public String link;
        public ProtoArtistOfflineState offline_state;

        public final Builder artist_metadata(ProtoArtistMetadata protoArtistMetadata) {
            this.artist_metadata = protoArtistMetadata;
            return this;
        }

        public final ProtoDecorateArtistItem build() {
            ProtoDecorateArtistItem protoDecorateArtistItem = r0;
            ProtoDecorateArtistItem protoDecorateArtistItem2 = new ProtoDecorateArtistItem(this.artist_metadata, this.collection_state, this.offline_state, this.link, super.buildUnknownFields());
            return protoDecorateArtistItem2;
        }

        public final Builder collection_state(ProtoArtistCollectionState protoArtistCollectionState) {
            this.collection_state = protoArtistCollectionState;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder offline_state(ProtoArtistOfflineState protoArtistOfflineState) {
            this.offline_state = protoArtistOfflineState;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateArtistItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateArtistItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateArtistItem protoDecorateArtistItem = (ProtoDecorateArtistItem) obj;
            int i = 0;
            int a = (protoDecorateArtistItem.artist_metadata != null ? ProtoArtistMetadata.ADAPTER.a(1, protoDecorateArtistItem.artist_metadata) : 0) + (protoDecorateArtistItem.collection_state != null ? ProtoArtistCollectionState.ADAPTER.a(2, protoDecorateArtistItem.collection_state) : 0) + (protoDecorateArtistItem.offline_state != null ? ProtoArtistOfflineState.ADAPTER.a(3, protoDecorateArtistItem.offline_state) : 0);
            if (protoDecorateArtistItem.link != null) {
                i = ProtoAdapter.i.a(4, protoDecorateArtistItem.link);
            }
            return a + i + protoDecorateArtistItem.a().h();
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
                    builder.artist_metadata((ProtoArtistMetadata) ProtoArtistMetadata.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.collection_state((ProtoArtistCollectionState) ProtoArtistCollectionState.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.offline_state((ProtoArtistOfflineState) ProtoArtistOfflineState.ADAPTER.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.link((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoDecorateArtistItem protoDecorateArtistItem = (ProtoDecorateArtistItem) obj;
            if (protoDecorateArtistItem.artist_metadata != null) {
                ProtoArtistMetadata.ADAPTER.a(whh, 1, protoDecorateArtistItem.artist_metadata);
            }
            if (protoDecorateArtistItem.collection_state != null) {
                ProtoArtistCollectionState.ADAPTER.a(whh, 2, protoDecorateArtistItem.collection_state);
            }
            if (protoDecorateArtistItem.offline_state != null) {
                ProtoArtistOfflineState.ADAPTER.a(whh, 3, protoDecorateArtistItem.offline_state);
            }
            if (protoDecorateArtistItem.link != null) {
                ProtoAdapter.i.a(whh, 4, protoDecorateArtistItem.link);
            }
            whh.a(protoDecorateArtistItem.a());
        }
    }

    public ProtoDecorateArtistItem(ProtoArtistMetadata protoArtistMetadata, ProtoArtistCollectionState protoArtistCollectionState, ProtoArtistOfflineState protoArtistOfflineState, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.artist_metadata = protoArtistMetadata;
        this.collection_state = protoArtistCollectionState;
        this.offline_state = protoArtistOfflineState;
        this.link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoDecorateArtistItem)) {
            return false;
        }
        ProtoDecorateArtistItem protoDecorateArtistItem = (ProtoDecorateArtistItem) obj;
        return a().equals(protoDecorateArtistItem.a()) && whk.a((Object) this.artist_metadata, (Object) protoDecorateArtistItem.artist_metadata) && whk.a((Object) this.collection_state, (Object) protoDecorateArtistItem.collection_state) && whk.a((Object) this.offline_state, (Object) protoDecorateArtistItem.offline_state) && whk.a((Object) this.link, (Object) protoDecorateArtistItem.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoArtistMetadata protoArtistMetadata = this.artist_metadata;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoArtistMetadata != null ? protoArtistMetadata.hashCode() : 0)) * 37;
        ProtoArtistCollectionState protoArtistCollectionState = this.collection_state;
        int hashCode3 = (hashCode2 + (protoArtistCollectionState != null ? protoArtistCollectionState.hashCode() : 0)) * 37;
        ProtoArtistOfflineState protoArtistOfflineState = this.offline_state;
        int hashCode4 = (hashCode3 + (protoArtistOfflineState != null ? protoArtistOfflineState.hashCode() : 0)) * 37;
        String str = this.link;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.artist_metadata != null) {
            sb.append(", artist_metadata=");
            sb.append(this.artist_metadata);
        }
        if (this.collection_state != null) {
            sb.append(", collection_state=");
            sb.append(this.collection_state);
        }
        if (this.offline_state != null) {
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        if (this.link != null) {
            String str = ",islnk=";
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateArtistItem{");
        replace.append('}');
        return replace.toString();
    }
}
