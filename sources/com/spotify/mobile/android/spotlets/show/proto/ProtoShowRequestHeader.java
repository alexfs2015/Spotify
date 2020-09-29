package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoShowRequestHeader extends Message<ProtoShowRequestHeader, Builder> {
    public static final ProtoAdapter<ProtoShowRequestHeader> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final ProtoShowCollectionState show_collection_state;
    public final ProtoShowMetadata show_metadata;
    public final ProtoShowPlayState show_play_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowRequestHeader, Builder> {
        public ProtoShowCollectionState show_collection_state;
        public ProtoShowMetadata show_metadata;
        public ProtoShowPlayState show_play_state;

        public final ProtoShowRequestHeader build() {
            return new ProtoShowRequestHeader(this.show_metadata, this.show_collection_state, this.show_play_state, super.buildUnknownFields());
        }

        public final Builder show_collection_state(ProtoShowCollectionState protoShowCollectionState) {
            this.show_collection_state = protoShowCollectionState;
            return this;
        }

        public final Builder show_metadata(ProtoShowMetadata protoShowMetadata) {
            this.show_metadata = protoShowMetadata;
            return this;
        }

        public final Builder show_play_state(ProtoShowPlayState protoShowPlayState) {
            this.show_play_state = protoShowPlayState;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoShowRequestHeader> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowRequestHeader.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoShowRequestHeader protoShowRequestHeader = (ProtoShowRequestHeader) obj;
            int i = 0;
            int a = (protoShowRequestHeader.show_metadata != null ? ProtoShowMetadata.ADAPTER.a(1, protoShowRequestHeader.show_metadata) : 0) + (protoShowRequestHeader.show_collection_state != null ? ProtoShowCollectionState.ADAPTER.a(2, protoShowRequestHeader.show_collection_state) : 0);
            if (protoShowRequestHeader.show_play_state != null) {
                i = ProtoShowPlayState.ADAPTER.a(3, protoShowRequestHeader.show_play_state);
            }
            return a + i + protoShowRequestHeader.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b != 1) {
                    boolean z = true & true;
                    if (b == 2) {
                        builder.show_collection_state((ProtoShowCollectionState) ProtoShowCollectionState.ADAPTER.a(whg));
                    } else if (b != 3) {
                        FieldEncoding fieldEncoding = whg.b;
                        builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                    } else {
                        builder.show_play_state((ProtoShowPlayState) ProtoShowPlayState.ADAPTER.a(whg));
                    }
                } else {
                    builder.show_metadata((ProtoShowMetadata) ProtoShowMetadata.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoShowRequestHeader protoShowRequestHeader = (ProtoShowRequestHeader) obj;
            if (protoShowRequestHeader.show_metadata != null) {
                ProtoShowMetadata.ADAPTER.a(whh, 1, protoShowRequestHeader.show_metadata);
            }
            if (protoShowRequestHeader.show_collection_state != null) {
                ProtoShowCollectionState.ADAPTER.a(whh, 2, protoShowRequestHeader.show_collection_state);
            }
            if (protoShowRequestHeader.show_play_state != null) {
                ProtoShowPlayState.ADAPTER.a(whh, 3, protoShowRequestHeader.show_play_state);
            }
            whh.a(protoShowRequestHeader.a());
        }
    }

    public ProtoShowRequestHeader(ProtoShowMetadata protoShowMetadata, ProtoShowCollectionState protoShowCollectionState, ProtoShowPlayState protoShowPlayState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_metadata = protoShowMetadata;
        this.show_collection_state = protoShowCollectionState;
        this.show_play_state = protoShowPlayState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowRequestHeader)) {
            return false;
        }
        ProtoShowRequestHeader protoShowRequestHeader = (ProtoShowRequestHeader) obj;
        return a().equals(protoShowRequestHeader.a()) && whk.a((Object) this.show_metadata, (Object) protoShowRequestHeader.show_metadata) && whk.a((Object) this.show_collection_state, (Object) protoShowRequestHeader.show_collection_state) && whk.a((Object) this.show_play_state, (Object) protoShowRequestHeader.show_play_state);
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
        ProtoShowPlayState protoShowPlayState = this.show_play_state;
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
            String str = "_osat,t w=ahsdma";
            sb.append(", show_metadata=");
            sb.append(this.show_metadata);
        }
        if (this.show_collection_state != null) {
            String str2 = "o cmes_o,lawhets_ntitc=l";
            sb.append(", show_collection_state=");
            sb.append(this.show_collection_state);
        }
        if (this.show_play_state != null) {
            sb.append(", show_play_state=");
            sb.append(this.show_play_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoShowRequestHeader{");
        replace.append('}');
        return replace.toString();
    }
}