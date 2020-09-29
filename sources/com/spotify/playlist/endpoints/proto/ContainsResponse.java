package com.spotify.playlist.endpoints.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ContainsResponse extends Message<ContainsResponse, Builder> {
    public static final ProtoAdapter<ContainsResponse> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<Boolean> found;

    public static final class Builder extends com.squareup.wire.Message.a<ContainsResponse, Builder> {
        public List<Boolean> found = vte.a();

        public final Builder found(List<Boolean> list) {
            vte.a(list);
            this.found = list;
            return this;
        }

        public final ContainsResponse build() {
            return new ContainsResponse(this.found, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ContainsResponse> {
        public final /* synthetic */ int a(Object obj) {
            ContainsResponse containsResponse = (ContainsResponse) obj;
            return ProtoAdapter.a.a().a(1, containsResponse.found) + containsResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ContainsResponse containsResponse = (ContainsResponse) obj;
            ProtoAdapter.a.a().a(vtb, 1, containsResponse.found);
            vtb.a(containsResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ContainsResponse.class);
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
                    builder.found.add(ProtoAdapter.a.a(vta));
                }
            }
        }
    }

    public ContainsResponse(List<Boolean> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.found = vte.a("found", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContainsResponse)) {
            return false;
        }
        ContainsResponse containsResponse = (ContainsResponse) obj;
        return a().equals(containsResponse.a()) && this.found.equals(containsResponse.found);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.found.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.found.isEmpty()) {
            sb.append(", found=");
            sb.append(this.found);
        }
        StringBuilder replace = sb.replace(0, 2, "ContainsResponse{");
        replace.append('}');
        return replace.toString();
    }
}
