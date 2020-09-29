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

        public final ContinueListeningSection build() {
            return new ContinueListeningSection(this.item, super.buildUnknownFields());
        }

        public final Builder item(ProtoShowRequestItem protoShowRequestItem) {
            this.item = protoShowRequestItem;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ContinueListeningSection> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ContinueListeningSection.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ContinueListeningSection continueListeningSection = (ContinueListeningSection) obj;
            return (continueListeningSection.item != null ? ProtoShowRequestItem.ADAPTER.a(1, continueListeningSection.item) : 0) + continueListeningSection.a().h();
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
                    builder.item((ProtoShowRequestItem) ProtoShowRequestItem.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ContinueListeningSection continueListeningSection = (ContinueListeningSection) obj;
            if (continueListeningSection.item != null) {
                ProtoShowRequestItem.ADAPTER.a(whh, 1, continueListeningSection.item);
            }
            whh.a(continueListeningSection.a());
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
        return a().equals(continueListeningSection.a()) && whk.a((Object) this.item, (Object) continueListeningSection.item);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            ProtoShowRequestItem protoShowRequestItem = this.item;
            i = hashCode + (protoShowRequestItem != null ? protoShowRequestItem.hashCode() : 0);
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.item != null) {
            String str = ",mse =t";
            sb.append(", item=");
            sb.append(this.item);
        }
        String str2 = "onnmcuLntientsio{gtiSieCe";
        StringBuilder replace = sb.replace(0, 2, "ContinueListeningSection{");
        replace.append('}');
        return replace.toString();
    }
}
