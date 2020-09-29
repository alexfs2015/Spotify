package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoShowCollectionState extends Message<ProtoShowCollectionState, Builder> {
    public static final ProtoAdapter<ProtoShowCollectionState> ADAPTER = new a();
    public static final Boolean DEFAULT_IS_IN_COLLECTION = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    public final Boolean is_in_collection;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowCollectionState, Builder> {
        public Boolean is_in_collection;

        public final ProtoShowCollectionState build() {
            return new ProtoShowCollectionState(this.is_in_collection, super.buildUnknownFields());
        }

        public final Builder is_in_collection(Boolean bool) {
            this.is_in_collection = bool;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoShowCollectionState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowCollectionState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoShowCollectionState protoShowCollectionState = (ProtoShowCollectionState) obj;
            return (protoShowCollectionState.is_in_collection != null ? ProtoAdapter.a.a(1, protoShowCollectionState.is_in_collection) : 0) + protoShowCollectionState.a().h();
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
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.is_in_collection((Boolean) ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoShowCollectionState protoShowCollectionState = (ProtoShowCollectionState) obj;
            if (protoShowCollectionState.is_in_collection != null) {
                ProtoAdapter.a.a(whh, 1, protoShowCollectionState.is_in_collection);
            }
            whh.a(protoShowCollectionState.a());
        }
    }

    public ProtoShowCollectionState(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_in_collection = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowCollectionState)) {
            return false;
        }
        ProtoShowCollectionState protoShowCollectionState = (ProtoShowCollectionState) obj;
        return a().equals(protoShowCollectionState.a()) && whk.a((Object) this.is_in_collection, (Object) protoShowCollectionState.is_in_collection);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Boolean bool = this.is_in_collection;
        int hashCode2 = hashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_in_collection != null) {
            sb.append(", is_in_collection=");
            sb.append(this.is_in_collection);
        }
        String str = "CrslnlootPShat{citweSetoo";
        StringBuilder replace = sb.replace(0, 2, "ProtoShowCollectionState{");
        replace.append('}');
        return replace.toString();
    }
}
