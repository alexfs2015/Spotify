package com.spotify.music.features.profile.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class GetProfilesRequest extends Message<GetProfilesRequest, Builder> {
    public static final ProtoAdapter<GetProfilesRequest> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<String> usernames;

    public static final class Builder extends com.squareup.wire.Message.a<GetProfilesRequest, Builder> {
        public List<String> usernames = whk.a();

        public final GetProfilesRequest build() {
            return new GetProfilesRequest(this.usernames, super.buildUnknownFields());
        }

        public final Builder usernames(List<String> list) {
            whk.a(list);
            this.usernames = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<GetProfilesRequest> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetProfilesRequest.class);
        }

        public final /* synthetic */ int a(Object obj) {
            GetProfilesRequest getProfilesRequest = (GetProfilesRequest) obj;
            return ProtoAdapter.i.a().a(1, getProfilesRequest.usernames) + getProfilesRequest.a().h();
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
                    builder.usernames.add(ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            GetProfilesRequest getProfilesRequest = (GetProfilesRequest) obj;
            ProtoAdapter.i.a().a(whh, 1, getProfilesRequest.usernames);
            whh.a(getProfilesRequest.a());
        }
    }

    public GetProfilesRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.usernames = whk.a("usernames", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetProfilesRequest)) {
            return false;
        }
        GetProfilesRequest getProfilesRequest = (GetProfilesRequest) obj;
        return a().equals(getProfilesRequest.a()) && this.usernames.equals(getProfilesRequest.usernames);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.usernames.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.usernames.isEmpty()) {
            sb.append(", usernames=");
            sb.append(this.usernames);
        }
        StringBuilder replace = sb.replace(0, 2, "GetProfilesRequest{");
        replace.append('}');
        return replace.toString();
    }
}
