package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoDecorateAlbumItem extends Message<ProtoDecorateAlbumItem, Builder> {
    public static final ProtoAdapter<ProtoDecorateAlbumItem> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    private static final long serialVersionUID = 0;
    public final ProtoAlbumMetadata album_metadata;
    public final ProtoAlbumCollectionState collection_state;
    public final String link;
    public final ProtoAlbumOfflineState offline_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoDecorateAlbumItem, Builder> {
        public ProtoAlbumMetadata album_metadata;
        public ProtoAlbumCollectionState collection_state;
        public String link;
        public ProtoAlbumOfflineState offline_state;

        public final Builder album_metadata(ProtoAlbumMetadata protoAlbumMetadata) {
            this.album_metadata = protoAlbumMetadata;
            return this;
        }

        public final ProtoDecorateAlbumItem build() {
            ProtoDecorateAlbumItem protoDecorateAlbumItem = r0;
            ProtoDecorateAlbumItem protoDecorateAlbumItem2 = new ProtoDecorateAlbumItem(this.album_metadata, this.collection_state, this.offline_state, this.link, super.buildUnknownFields());
            return protoDecorateAlbumItem2;
        }

        public final Builder collection_state(ProtoAlbumCollectionState protoAlbumCollectionState) {
            this.collection_state = protoAlbumCollectionState;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder offline_state(ProtoAlbumOfflineState protoAlbumOfflineState) {
            this.offline_state = protoAlbumOfflineState;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateAlbumItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateAlbumItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateAlbumItem protoDecorateAlbumItem = (ProtoDecorateAlbumItem) obj;
            int i = 0;
            int a = (protoDecorateAlbumItem.album_metadata != null ? ProtoAlbumMetadata.ADAPTER.a(1, protoDecorateAlbumItem.album_metadata) : 0) + (protoDecorateAlbumItem.collection_state != null ? ProtoAlbumCollectionState.ADAPTER.a(2, protoDecorateAlbumItem.collection_state) : 0) + (protoDecorateAlbumItem.offline_state != null ? ProtoAlbumOfflineState.ADAPTER.a(3, protoDecorateAlbumItem.offline_state) : 0);
            if (protoDecorateAlbumItem.link != null) {
                i = ProtoAdapter.i.a(4, protoDecorateAlbumItem.link);
            }
            return a + i + protoDecorateAlbumItem.a().h();
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
                    builder.album_metadata((ProtoAlbumMetadata) ProtoAlbumMetadata.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.collection_state((ProtoAlbumCollectionState) ProtoAlbumCollectionState.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.offline_state((ProtoAlbumOfflineState) ProtoAlbumOfflineState.ADAPTER.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.link((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoDecorateAlbumItem protoDecorateAlbumItem = (ProtoDecorateAlbumItem) obj;
            if (protoDecorateAlbumItem.album_metadata != null) {
                ProtoAlbumMetadata.ADAPTER.a(whh, 1, protoDecorateAlbumItem.album_metadata);
            }
            if (protoDecorateAlbumItem.collection_state != null) {
                ProtoAlbumCollectionState.ADAPTER.a(whh, 2, protoDecorateAlbumItem.collection_state);
            }
            if (protoDecorateAlbumItem.offline_state != null) {
                ProtoAlbumOfflineState.ADAPTER.a(whh, 3, protoDecorateAlbumItem.offline_state);
            }
            if (protoDecorateAlbumItem.link != null) {
                ProtoAdapter.i.a(whh, 4, protoDecorateAlbumItem.link);
            }
            whh.a(protoDecorateAlbumItem.a());
        }
    }

    public ProtoDecorateAlbumItem(ProtoAlbumMetadata protoAlbumMetadata, ProtoAlbumCollectionState protoAlbumCollectionState, ProtoAlbumOfflineState protoAlbumOfflineState, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.album_metadata = protoAlbumMetadata;
        this.collection_state = protoAlbumCollectionState;
        this.offline_state = protoAlbumOfflineState;
        this.link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoDecorateAlbumItem)) {
            return false;
        }
        ProtoDecorateAlbumItem protoDecorateAlbumItem = (ProtoDecorateAlbumItem) obj;
        return a().equals(protoDecorateAlbumItem.a()) && whk.a((Object) this.album_metadata, (Object) protoDecorateAlbumItem.album_metadata) && whk.a((Object) this.collection_state, (Object) protoDecorateAlbumItem.collection_state) && whk.a((Object) this.offline_state, (Object) protoDecorateAlbumItem.offline_state) && whk.a((Object) this.link, (Object) protoDecorateAlbumItem.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            ProtoAlbumMetadata protoAlbumMetadata = this.album_metadata;
            int i2 = 0;
            int hashCode2 = (hashCode + (protoAlbumMetadata != null ? protoAlbumMetadata.hashCode() : 0)) * 37;
            ProtoAlbumCollectionState protoAlbumCollectionState = this.collection_state;
            int hashCode3 = (hashCode2 + (protoAlbumCollectionState != null ? protoAlbumCollectionState.hashCode() : 0)) * 37;
            ProtoAlbumOfflineState protoAlbumOfflineState = this.offline_state;
            int hashCode4 = (hashCode3 + (protoAlbumOfflineState != null ? protoAlbumOfflineState.hashCode() : 0)) * 37;
            String str = this.link;
            if (str != null) {
                i2 = str.hashCode();
            }
            i = hashCode4 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.album_metadata != null) {
            String str = " _sbltamaatau=e,m";
            sb.append(", album_metadata=");
            sb.append(this.album_metadata);
        }
        if (this.collection_state != null) {
            String str2 = "e,_mlt=cilnea tstoo";
            sb.append(", collection_state=");
            sb.append(this.collection_state);
        }
        if (this.offline_state != null) {
            String str3 = "i=fnoote taslf_e";
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateAlbumItem{");
        replace.append('}');
        return replace.toString();
    }
}
