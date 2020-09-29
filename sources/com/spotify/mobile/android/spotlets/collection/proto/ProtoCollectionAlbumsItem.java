package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoCollectionAlbumsItem extends Message<ProtoCollectionAlbumsItem, Builder> {
    public static final ProtoAdapter<ProtoCollectionAlbumsItem> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME;
    public static final Integer DEFAULT_HEADERLESS_INDEX;
    public static final String DEFAULT_HEADER_FIELD = "";
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final ProtoAlbumMetadata album_metadata;
    public final ProtoAlbumCollectionState collection_state;
    public final String header_field;
    public final Integer headerless_index;
    public final ProtoAlbumOfflineState offline_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoCollectionAlbumsItem, Builder> {
        public Integer add_time;
        public ProtoAlbumMetadata album_metadata;
        public ProtoAlbumCollectionState collection_state;
        public String header_field;
        public Integer headerless_index;
        public ProtoAlbumOfflineState offline_state;

        public final Builder header_field(String str) {
            this.header_field = str;
            return this;
        }

        public final Builder headerless_index(Integer num) {
            this.headerless_index = num;
            return this;
        }

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final Builder album_metadata(ProtoAlbumMetadata protoAlbumMetadata) {
            this.album_metadata = protoAlbumMetadata;
            return this;
        }

        public final Builder collection_state(ProtoAlbumCollectionState protoAlbumCollectionState) {
            this.collection_state = protoAlbumCollectionState;
            return this;
        }

        public final Builder offline_state(ProtoAlbumOfflineState protoAlbumOfflineState) {
            this.offline_state = protoAlbumOfflineState;
            return this;
        }

        public final ProtoCollectionAlbumsItem build() {
            ProtoCollectionAlbumsItem protoCollectionAlbumsItem = new ProtoCollectionAlbumsItem(this.header_field, this.headerless_index, this.add_time, this.album_metadata, this.collection_state, this.offline_state, super.buildUnknownFields());
            return protoCollectionAlbumsItem;
        }
    }

    static final class a extends ProtoAdapter<ProtoCollectionAlbumsItem> {
        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionAlbumsItem protoCollectionAlbumsItem = (ProtoCollectionAlbumsItem) obj;
            int i = 0;
            int a = (protoCollectionAlbumsItem.header_field != null ? ProtoAdapter.i.a(1, protoCollectionAlbumsItem.header_field) : 0) + (protoCollectionAlbumsItem.headerless_index != null ? ProtoAdapter.c.a(2, protoCollectionAlbumsItem.headerless_index) : 0) + (protoCollectionAlbumsItem.add_time != null ? ProtoAdapter.c.a(3, protoCollectionAlbumsItem.add_time) : 0) + (protoCollectionAlbumsItem.album_metadata != null ? ProtoAlbumMetadata.ADAPTER.a(4, protoCollectionAlbumsItem.album_metadata) : 0) + (protoCollectionAlbumsItem.collection_state != null ? ProtoAlbumCollectionState.ADAPTER.a(5, protoCollectionAlbumsItem.collection_state) : 0);
            if (protoCollectionAlbumsItem.offline_state != null) {
                i = ProtoAlbumOfflineState.ADAPTER.a(6, protoCollectionAlbumsItem.offline_state);
            }
            return a + i + protoCollectionAlbumsItem.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoCollectionAlbumsItem protoCollectionAlbumsItem = (ProtoCollectionAlbumsItem) obj;
            if (protoCollectionAlbumsItem.header_field != null) {
                ProtoAdapter.i.a(vtb, 1, protoCollectionAlbumsItem.header_field);
            }
            if (protoCollectionAlbumsItem.headerless_index != null) {
                ProtoAdapter.c.a(vtb, 2, protoCollectionAlbumsItem.headerless_index);
            }
            if (protoCollectionAlbumsItem.add_time != null) {
                ProtoAdapter.c.a(vtb, 3, protoCollectionAlbumsItem.add_time);
            }
            if (protoCollectionAlbumsItem.album_metadata != null) {
                ProtoAlbumMetadata.ADAPTER.a(vtb, 4, protoCollectionAlbumsItem.album_metadata);
            }
            if (protoCollectionAlbumsItem.collection_state != null) {
                ProtoAlbumCollectionState.ADAPTER.a(vtb, 5, protoCollectionAlbumsItem.collection_state);
            }
            if (protoCollectionAlbumsItem.offline_state != null) {
                ProtoAlbumOfflineState.ADAPTER.a(vtb, 6, protoCollectionAlbumsItem.offline_state);
            }
            vtb.a(protoCollectionAlbumsItem.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionAlbumsItem.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.header_field((String) ProtoAdapter.i.a(vta));
                            break;
                        case 2:
                            builder.headerless_index((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 3:
                            builder.add_time((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 4:
                            builder.album_metadata((ProtoAlbumMetadata) ProtoAlbumMetadata.ADAPTER.a(vta));
                            break;
                        case 5:
                            builder.collection_state((ProtoAlbumCollectionState) ProtoAlbumCollectionState.ADAPTER.a(vta));
                            break;
                        case 6:
                            builder.offline_state((ProtoAlbumOfflineState) ProtoAlbumOfflineState.ADAPTER.a(vta));
                            break;
                        default:
                            FieldEncoding fieldEncoding = vta.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                            break;
                    }
                } else {
                    vta.a(a);
                    return builder.build();
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_HEADERLESS_INDEX = valueOf;
        DEFAULT_ADD_TIME = valueOf;
    }

    public ProtoCollectionAlbumsItem(String str, Integer num, Integer num2, ProtoAlbumMetadata protoAlbumMetadata, ProtoAlbumCollectionState protoAlbumCollectionState, ProtoAlbumOfflineState protoAlbumOfflineState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header_field = str;
        this.headerless_index = num;
        this.add_time = num2;
        this.album_metadata = protoAlbumMetadata;
        this.collection_state = protoAlbumCollectionState;
        this.offline_state = protoAlbumOfflineState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoCollectionAlbumsItem)) {
            return false;
        }
        ProtoCollectionAlbumsItem protoCollectionAlbumsItem = (ProtoCollectionAlbumsItem) obj;
        return a().equals(protoCollectionAlbumsItem.a()) && vte.a((Object) this.header_field, (Object) protoCollectionAlbumsItem.header_field) && vte.a((Object) this.headerless_index, (Object) protoCollectionAlbumsItem.headerless_index) && vte.a((Object) this.add_time, (Object) protoCollectionAlbumsItem.add_time) && vte.a((Object) this.album_metadata, (Object) protoCollectionAlbumsItem.album_metadata) && vte.a((Object) this.collection_state, (Object) protoCollectionAlbumsItem.collection_state) && vte.a((Object) this.offline_state, (Object) protoCollectionAlbumsItem.offline_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.header_field;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.headerless_index;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.add_time;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        ProtoAlbumMetadata protoAlbumMetadata = this.album_metadata;
        int hashCode5 = (hashCode4 + (protoAlbumMetadata != null ? protoAlbumMetadata.hashCode() : 0)) * 37;
        ProtoAlbumCollectionState protoAlbumCollectionState = this.collection_state;
        int hashCode6 = (hashCode5 + (protoAlbumCollectionState != null ? protoAlbumCollectionState.hashCode() : 0)) * 37;
        ProtoAlbumOfflineState protoAlbumOfflineState = this.offline_state;
        if (protoAlbumOfflineState != null) {
            i2 = protoAlbumOfflineState.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            sb.append(", header_field=");
            sb.append(this.header_field);
        }
        if (this.headerless_index != null) {
            sb.append(", headerless_index=");
            sb.append(this.headerless_index);
        }
        if (this.add_time != null) {
            sb.append(", add_time=");
            sb.append(this.add_time);
        }
        if (this.album_metadata != null) {
            sb.append(", album_metadata=");
            sb.append(this.album_metadata);
        }
        if (this.collection_state != null) {
            sb.append(", collection_state=");
            sb.append(this.collection_state);
        }
        if (this.offline_state != null) {
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionAlbumsItem{");
        replace.append('}');
        return replace.toString();
    }
}
