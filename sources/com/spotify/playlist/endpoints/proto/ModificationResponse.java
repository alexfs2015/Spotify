package com.spotify.playlist.endpoints.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ModificationResponse extends Message<ModificationResponse, Builder> {
    public static final ProtoAdapter<ModificationResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_SUCCESS = Boolean.FALSE;
    public static final String DEFAULT_URI = "";
    private static final long serialVersionUID = 0;
    public final Boolean success;
    public final String uri;

    public static final class Builder extends com.squareup.wire.Message.a<ModificationResponse, Builder> {
        public Boolean success;
        public String uri;

        public final ModificationResponse build() {
            return new ModificationResponse(this.success, this.uri, super.buildUnknownFields());
        }

        public final Builder success(Boolean bool) {
            this.success = bool;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ModificationResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ModificationResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ModificationResponse modificationResponse = (ModificationResponse) obj;
            int i = 0;
            int a = modificationResponse.success != null ? ProtoAdapter.a.a(1, modificationResponse.success) : 0;
            if (modificationResponse.uri != null) {
                i = ProtoAdapter.i.a(2, modificationResponse.uri);
            }
            return a + i + modificationResponse.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.success((Boolean) ProtoAdapter.a.a(whg));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.uri((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ModificationResponse modificationResponse = (ModificationResponse) obj;
            if (modificationResponse.success != null) {
                ProtoAdapter.a.a(whh, 1, modificationResponse.success);
            }
            if (modificationResponse.uri != null) {
                ProtoAdapter.i.a(whh, 2, modificationResponse.uri);
            }
            whh.a(modificationResponse.a());
        }
    }

    public ModificationResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.uri = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModificationResponse)) {
            return false;
        }
        ModificationResponse modificationResponse = (ModificationResponse) obj;
        return a().equals(modificationResponse.a()) && whk.a((Object) this.success, (Object) modificationResponse.success) && whk.a((Object) this.uri, (Object) modificationResponse.uri);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Boolean bool = this.success;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.uri;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.success != null) {
            sb.append(", success=");
            sb.append(this.success);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        StringBuilder replace = sb.replace(0, 2, "ModificationResponse{");
        replace.append('}');
        return replace.toString();
    }
}
