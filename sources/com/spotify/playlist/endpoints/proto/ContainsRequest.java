package com.spotify.playlist.endpoints.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ContainsRequest extends Message<ContainsRequest, Builder> {
    public static final ProtoAdapter<ContainsRequest> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<String> items;

    public static final class Builder extends com.squareup.wire.Message.a<ContainsRequest, Builder> {
        public List<String> items = vte.a();

        public final Builder items(List<String> list) {
            vte.a(list);
            this.items = list;
            return this;
        }

        public final ContainsRequest build() {
            return new ContainsRequest(this.items, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ContainsRequest> {
        public final /* synthetic */ int a(Object obj) {
            ContainsRequest containsRequest = (ContainsRequest) obj;
            return ProtoAdapter.i.a().a(1, containsRequest.items) + containsRequest.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ContainsRequest containsRequest = (ContainsRequest) obj;
            ProtoAdapter.i.a().a(vtb, 1, containsRequest.items);
            vtb.a(containsRequest.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ContainsRequest.class);
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
                    builder.items.add(ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public ContainsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = vte.a("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContainsRequest)) {
            return false;
        }
        ContainsRequest containsRequest = (ContainsRequest) obj;
        return a().equals(containsRequest.a()) && this.items.equals(containsRequest.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.items.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        StringBuilder replace = sb.replace(0, 2, "ContainsRequest{");
        replace.append('}');
        return replace.toString();
    }
}
