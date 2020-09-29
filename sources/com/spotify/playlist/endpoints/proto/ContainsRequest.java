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
        public List<String> items = whk.a();

        public final ContainsRequest build() {
            return new ContainsRequest(this.items, super.buildUnknownFields());
        }

        public final Builder items(List<String> list) {
            whk.a(list);
            this.items = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ContainsRequest> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ContainsRequest.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ContainsRequest containsRequest = (ContainsRequest) obj;
            return ProtoAdapter.i.a().a(1, containsRequest.items) + containsRequest.a().h();
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
                    builder.items.add(ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ContainsRequest containsRequest = (ContainsRequest) obj;
            ProtoAdapter.i.a().a(whh, 1, containsRequest.items);
            whh.a(containsRequest.a());
        }
    }

    public ContainsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = whk.a("items", list);
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
