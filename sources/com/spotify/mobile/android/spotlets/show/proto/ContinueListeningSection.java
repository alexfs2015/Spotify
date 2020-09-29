package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ContinueListeningSection extends Message<ContinueListeningSection, Builder> {
    public static final ProtoAdapter<ContinueListeningSection> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final ProtoShowRequestItem item;

    public static final class Builder extends com.squareup.wire.Message.a<ContinueListeningSection, Builder> {
        public ProtoShowRequestItem item;

        public final Builder item(ProtoShowRequestItem protoShowRequestItem) {
            this.item = protoShowRequestItem;
            return this;
        }

        public final ContinueListeningSection build() {
            return new ContinueListeningSection(this.item, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ContinueListeningSection> {
        public final /* synthetic */ int a(Object obj) {
            ContinueListeningSection continueListeningSection = (ContinueListeningSection) obj;
            return (continueListeningSection.item != null ? ProtoShowRequestItem.ADAPTER.a(1, continueListeningSection.item) : 0) + continueListeningSection.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ContinueListeningSection continueListeningSection = (ContinueListeningSection) obj;
            if (continueListeningSection.item != null) {
                ProtoShowRequestItem.ADAPTER.a(vtb, 1, continueListeningSection.item);
            }
            vtb.a(continueListeningSection.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ContinueListeningSection.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b != 1) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.item((ProtoShowRequestItem) ProtoShowRequestItem.ADAPTER.a(vta));
                }
            }
        }
    }

    public ContinueListeningSection(ProtoShowRequestItem protoShowRequestItem, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = protoShowRequestItem;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContinueListeningSection)) {
            return false;
        }
        ContinueListeningSection continueListeningSection = (ContinueListeningSection) obj;
        return a().equals(continueListeningSection.a()) && vte.a((Object) this.item, (Object) continueListeningSection.item);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoShowRequestItem protoShowRequestItem = this.item;
        int hashCode2 = hashCode + (protoShowRequestItem != null ? protoShowRequestItem.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        StringBuilder replace = sb.replace(0, 2, "ContinueListeningSection{");
        replace.append('}');
        return replace.toString();
    }
}
