package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoCollectionArtistsItem extends Message<ProtoCollectionArtistsItem, Builder> {
    public static final ProtoAdapter<ProtoCollectionArtistsItem> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME;
    public static final Integer DEFAULT_HEADERLESS_INDEX;
    public static final String DEFAULT_HEADER_FIELD = "";
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final ProtoArtistMetadata artist_metadata;
    public final ProtoArtistCollectionState collection_state;
    public final String header_field;
    public final Integer headerless_index;
    public final ProtoArtistOfflineState offline_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoCollectionArtistsItem, Builder> {
        public Integer add_time;
        public ProtoArtistMetadata artist_metadata;
        public ProtoArtistCollectionState collection_state;
        public String header_field;
        public Integer headerless_index;
        public ProtoArtistOfflineState offline_state;

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final Builder artist_metadata(ProtoArtistMetadata protoArtistMetadata) {
            this.artist_metadata = protoArtistMetadata;
            return this;
        }

        public final ProtoCollectionArtistsItem build() {
            ProtoCollectionArtistsItem protoCollectionArtistsItem = r0;
            ProtoCollectionArtistsItem protoCollectionArtistsItem2 = new ProtoCollectionArtistsItem(this.header_field, this.headerless_index, this.add_time, this.artist_metadata, this.collection_state, this.offline_state, super.buildUnknownFields());
            return protoCollectionArtistsItem2;
        }

        public final Builder collection_state(ProtoArtistCollectionState protoArtistCollectionState) {
            this.collection_state = protoArtistCollectionState;
            return this;
        }

        public final Builder header_field(String str) {
            this.header_field = str;
            return this;
        }

        public final Builder headerless_index(Integer num) {
            this.headerless_index = num;
            return this;
        }

        public final Builder offline_state(ProtoArtistOfflineState protoArtistOfflineState) {
            this.offline_state = protoArtistOfflineState;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoCollectionArtistsItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionArtistsItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionArtistsItem protoCollectionArtistsItem = (ProtoCollectionArtistsItem) obj;
            int i = 0;
            int a = (protoCollectionArtistsItem.header_field != null ? ProtoAdapter.i.a(1, protoCollectionArtistsItem.header_field) : 0) + (protoCollectionArtistsItem.headerless_index != null ? ProtoAdapter.c.a(2, protoCollectionArtistsItem.headerless_index) : 0) + (protoCollectionArtistsItem.add_time != null ? ProtoAdapter.c.a(3, protoCollectionArtistsItem.add_time) : 0) + (protoCollectionArtistsItem.artist_metadata != null ? ProtoArtistMetadata.ADAPTER.a(4, protoCollectionArtistsItem.artist_metadata) : 0) + (protoCollectionArtistsItem.collection_state != null ? ProtoArtistCollectionState.ADAPTER.a(5, protoCollectionArtistsItem.collection_state) : 0);
            if (protoCollectionArtistsItem.offline_state != null) {
                i = ProtoArtistOfflineState.ADAPTER.a(6, protoCollectionArtistsItem.offline_state);
            }
            return a + i + protoCollectionArtistsItem.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.header_field((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.headerless_index((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 3:
                            builder.add_time((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 4:
                            builder.artist_metadata((ProtoArtistMetadata) ProtoArtistMetadata.ADAPTER.a(whg));
                            break;
                        case 5:
                            builder.collection_state((ProtoArtistCollectionState) ProtoArtistCollectionState.ADAPTER.a(whg));
                            break;
                        case 6:
                            builder.offline_state((ProtoArtistOfflineState) ProtoArtistOfflineState.ADAPTER.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    whg.a(a);
                    return builder.build();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoCollectionArtistsItem protoCollectionArtistsItem = (ProtoCollectionArtistsItem) obj;
            if (protoCollectionArtistsItem.header_field != null) {
                boolean z = false & true;
                ProtoAdapter.i.a(whh, 1, protoCollectionArtistsItem.header_field);
            }
            if (protoCollectionArtistsItem.headerless_index != null) {
                ProtoAdapter.c.a(whh, 2, protoCollectionArtistsItem.headerless_index);
            }
            if (protoCollectionArtistsItem.add_time != null) {
                ProtoAdapter.c.a(whh, 3, protoCollectionArtistsItem.add_time);
            }
            if (protoCollectionArtistsItem.artist_metadata != null) {
                ProtoArtistMetadata.ADAPTER.a(whh, 4, protoCollectionArtistsItem.artist_metadata);
            }
            if (protoCollectionArtistsItem.collection_state != null) {
                ProtoArtistCollectionState.ADAPTER.a(whh, 5, protoCollectionArtistsItem.collection_state);
            }
            if (protoCollectionArtistsItem.offline_state != null) {
                ProtoArtistOfflineState.ADAPTER.a(whh, 6, protoCollectionArtistsItem.offline_state);
            }
            whh.a(protoCollectionArtistsItem.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_HEADERLESS_INDEX = valueOf;
        DEFAULT_ADD_TIME = valueOf;
    }

    public ProtoCollectionArtistsItem(String str, Integer num, Integer num2, ProtoArtistMetadata protoArtistMetadata, ProtoArtistCollectionState protoArtistCollectionState, ProtoArtistOfflineState protoArtistOfflineState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header_field = str;
        this.headerless_index = num;
        this.add_time = num2;
        this.artist_metadata = protoArtistMetadata;
        this.collection_state = protoArtistCollectionState;
        this.offline_state = protoArtistOfflineState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoCollectionArtistsItem)) {
            return false;
        }
        ProtoCollectionArtistsItem protoCollectionArtistsItem = (ProtoCollectionArtistsItem) obj;
        return a().equals(protoCollectionArtistsItem.a()) && whk.a((Object) this.header_field, (Object) protoCollectionArtistsItem.header_field) && whk.a((Object) this.headerless_index, (Object) protoCollectionArtistsItem.headerless_index) && whk.a((Object) this.add_time, (Object) protoCollectionArtistsItem.add_time) && whk.a((Object) this.artist_metadata, (Object) protoCollectionArtistsItem.artist_metadata) && whk.a((Object) this.collection_state, (Object) protoCollectionArtistsItem.collection_state) && whk.a((Object) this.offline_state, (Object) protoCollectionArtistsItem.offline_state);
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
        ProtoArtistMetadata protoArtistMetadata = this.artist_metadata;
        int hashCode5 = (hashCode4 + (protoArtistMetadata != null ? protoArtistMetadata.hashCode() : 0)) * 37;
        ProtoArtistCollectionState protoArtistCollectionState = this.collection_state;
        int hashCode6 = (hashCode5 + (protoArtistCollectionState != null ? protoArtistCollectionState.hashCode() : 0)) * 37;
        ProtoArtistOfflineState protoArtistOfflineState = this.offline_state;
        if (protoArtistOfflineState != null) {
            i2 = protoArtistOfflineState.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            String str = "eas,ee_rdhd il=";
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
        if (this.artist_metadata != null) {
            sb.append(", artist_metadata=");
            sb.append(this.artist_metadata);
        }
        if (this.collection_state != null) {
            sb.append(", collection_state=");
            sb.append(this.collection_state);
        }
        if (this.offline_state != null) {
            String str2 = "eafmoltfis, _nte";
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        String str3 = "trInottPComlotsieAlrotosice";
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionArtistsItem{");
        replace.append('}');
        return replace.toString();
    }
}
