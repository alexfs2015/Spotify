package com.spotify.music.features.profile.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class GetProfilesResponse extends Message<GetProfilesResponse, Builder> {
    public static final ProtoAdapter<GetProfilesResponse> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<DecorationData> profiles;

    public static final class Builder extends com.squareup.wire.Message.a<GetProfilesResponse, Builder> {
        public List<DecorationData> profiles = whk.a();

        public final GetProfilesResponse build() {
            return new GetProfilesResponse(this.profiles, super.buildUnknownFields());
        }

        public final Builder profiles(List<DecorationData> list) {
            whk.a(list);
            this.profiles = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<GetProfilesResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetProfilesResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            GetProfilesResponse getProfilesResponse = (GetProfilesResponse) obj;
            return DecorationData.ADAPTER.a().a(1, getProfilesResponse.profiles) + getProfilesResponse.a().h();
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
                    builder.profiles.add(DecorationData.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            GetProfilesResponse getProfilesResponse = (GetProfilesResponse) obj;
            DecorationData.ADAPTER.a().a(whh, 1, getProfilesResponse.profiles);
            whh.a(getProfilesResponse.a());
        }
    }

    public GetProfilesResponse(List<DecorationData> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.profiles = whk.a("profiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetProfilesResponse)) {
            return false;
        }
        GetProfilesResponse getProfilesResponse = (GetProfilesResponse) obj;
        return a().equals(getProfilesResponse.a()) && this.profiles.equals(getProfilesResponse.profiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.profiles.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.profiles.isEmpty()) {
            sb.append(", profiles=");
            sb.append(this.profiles);
        }
        StringBuilder replace = sb.replace(0, 2, "GetProfilesResponse{");
        replace.append('}');
        return replace.toString();
    }
}
