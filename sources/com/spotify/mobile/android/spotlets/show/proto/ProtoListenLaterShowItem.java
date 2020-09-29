package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoListenLaterShowItem extends Message<ProtoListenLaterShowItem, Builder> {
    public static final ProtoAdapter<ProtoListenLaterShowItem> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final ProtoShowCollectionState show_collection_state;
    public final ProtoShowMetadata show_metadata;
    public final ProtoShowPlayState show_played_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoListenLaterShowItem, Builder> {
        public ProtoShowCollectionState show_collection_state;
        public ProtoShowMetadata show_metadata;
        public ProtoShowPlayState show_played_state;

        public final Builder show_metadata(ProtoShowMetadata protoShowMetadata) {
            this.show_metadata = protoShowMetadata;
            return this;
        }

        public final Builder show_collection_state(ProtoShowCollectionState protoShowCollectionState) {
            this.show_collection_state = protoShowCollectionState;
            return this;
        }

        public final Builder show_played_state(ProtoShowPlayState protoShowPlayState) {
            this.show_played_state = protoShowPlayState;
            return this;
        }

        public final ProtoListenLaterShowItem build() {
            return new ProtoListenLaterShowItem(this.show_metadata, this.show_collection_state, this.show_played_state, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoListenLaterShowItem> {
        public final /* synthetic */ int a(Object obj) {
            ProtoListenLaterShowItem protoListenLaterShowItem = (ProtoListenLaterShowItem) obj;
            int i = 0;
            int a = (protoListenLaterShowItem.show_metadata != null ? ProtoShowMetadata.ADAPTER.a(1, protoListenLaterShowItem.show_metadata) : 0) + (protoListenLaterShowItem.show_collection_state != null ? ProtoShowCollectionState.ADAPTER.a(2, protoListenLaterShowItem.show_collection_state) : 0);
            if (protoListenLaterShowItem.show_played_state != null) {
                i = ProtoShowPlayState.ADAPTER.a(3, protoListenLaterShowItem.show_played_state);
            }
            return a + i + protoListenLaterShowItem.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoListenLaterShowItem protoListenLaterShowItem = (ProtoListenLaterShowItem) obj;
            if (protoListenLaterShowItem.show_metadata != null) {
                ProtoShowMetadata.ADAPTER.a(vtb, 1, protoListenLaterShowItem.show_metadata);
            }
            if (protoListenLaterShowItem.show_collection_state != null) {
                ProtoShowCollectionState.ADAPTER.a(vtb, 2, protoListenLaterShowItem.show_collection_state);
            }
            if (protoListenLaterShowItem.show_played_state != null) {
                ProtoShowPlayState.ADAPTER.a(vtb, 3, protoListenLaterShowItem.show_played_state);
            }
            vtb.a(protoListenLaterShowItem.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoListenLaterShowItem.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.show_metadata((ProtoShowMetadata) ProtoShowMetadata.ADAPTER.a(vta));
                } else if (b == 2) {
                    builder.show_collection_state((ProtoShowCollectionState) ProtoShowCollectionState.ADAPTER.a(vta));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.show_played_state((ProtoShowPlayState) ProtoShowPlayState.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoListenLaterShowItem(ProtoShowMetadata protoShowMetadata, ProtoShowCollectionState protoShowCollectionState, ProtoShowPlayState protoShowPlayState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_metadata = protoShowMetadata;
        this.show_collection_state = protoShowCollectionState;
        this.show_played_state = protoShowPlayState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoListenLaterShowItem)) {
            return false;
        }
        ProtoListenLaterShowItem protoListenLaterShowItem = (ProtoListenLaterShowItem) obj;
        return a().equals(protoListenLaterShowItem.a()) && vte.a((Object) this.show_metadata, (Object) protoListenLaterShowItem.show_metadata) && vte.a((Object) this.show_collection_state, (Object) protoListenLaterShowItem.show_collection_state) && vte.a((Object) this.show_played_state, (Object) protoListenLaterShowItem.show_played_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoShowMetadata protoShowMetadata = this.show_metadata;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoShowMetadata != null ? protoShowMetadata.hashCode() : 0)) * 37;
        ProtoShowCollectionState protoShowCollectionState = this.show_collection_state;
        int hashCode3 = (hashCode2 + (protoShowCollectionState != null ? protoShowCollectionState.hashCode() : 0)) * 37;
        ProtoShowPlayState protoShowPlayState = this.show_played_state;
        if (protoShowPlayState != null) {
            i2 = protoShowPlayState.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_metadata != null) {
            sb.append(", show_metadata=");
            sb.append(this.show_metadata);
        }
        if (this.show_collection_state != null) {
            sb.append(", show_collection_state=");
            sb.append(this.show_collection_state);
        }
        if (this.show_played_state != null) {
            sb.append(", show_played_state=");
            sb.append(this.show_played_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoListenLaterShowItem{");
        replace.append('}');
        return replace.toString();
    }
}
