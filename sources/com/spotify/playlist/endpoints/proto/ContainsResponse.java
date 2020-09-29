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
        public List<Boolean> found = whk.a();

        public final ContainsResponse build() {
            return new ContainsResponse(this.found, super.buildUnknownFields());
        }

        public final Builder found(List<Boolean> list) {
            whk.a(list);
            this.found = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ContainsResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ContainsResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ContainsResponse containsResponse = (ContainsResponse) obj;
            return ProtoAdapter.a.a().a(1, containsResponse.found) + containsResponse.a().h();
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
                    builder.found.add(ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ContainsResponse containsResponse = (ContainsResponse) obj;
            ProtoAdapter.a.a().a(whh, 1, containsResponse.found);
            whh.a(containsResponse.a());
        }
    }

    public ContainsResponse(List<Boolean> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.found = whk.a("found", list);
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
