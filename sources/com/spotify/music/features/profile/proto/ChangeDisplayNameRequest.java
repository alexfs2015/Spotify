package com.spotify.music.features.profile.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ChangeDisplayNameRequest extends Message<ChangeDisplayNameRequest, Builder> {
    public static final ProtoAdapter<ChangeDisplayNameRequest> ADAPTER = new a();
    public static final String DEFAULT_DISPLAY_NAME = "";
    public static final String DEFAULT_USERNAME = "";
    private static final long serialVersionUID = 0;
    public final String display_name;
    public final String username;

    public static final class Builder extends com.squareup.wire.Message.a<ChangeDisplayNameRequest, Builder> {
        public String display_name;
        public String username;

        public final ChangeDisplayNameRequest build() {
            return new ChangeDisplayNameRequest(this.username, this.display_name, super.buildUnknownFields());
        }

        public final Builder display_name(String str) {
            this.display_name = str;
            return this;
        }

        public final Builder username(String str) {
            this.username = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ChangeDisplayNameRequest> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ChangeDisplayNameRequest.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ChangeDisplayNameRequest changeDisplayNameRequest = (ChangeDisplayNameRequest) obj;
            int i = 0;
            int a = changeDisplayNameRequest.username != null ? ProtoAdapter.i.a(1, changeDisplayNameRequest.username) : 0;
            if (changeDisplayNameRequest.display_name != null) {
                i = ProtoAdapter.i.a(2, changeDisplayNameRequest.display_name);
            }
            return a + i + changeDisplayNameRequest.a().h();
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
                    builder.username((String) ProtoAdapter.i.a(whg));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.display_name((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ChangeDisplayNameRequest changeDisplayNameRequest = (ChangeDisplayNameRequest) obj;
            if (changeDisplayNameRequest.username != null) {
                ProtoAdapter.i.a(whh, 1, changeDisplayNameRequest.username);
            }
            if (changeDisplayNameRequest.display_name != null) {
                ProtoAdapter.i.a(whh, 2, changeDisplayNameRequest.display_name);
            }
            whh.a(changeDisplayNameRequest.a());
        }
    }

    public ChangeDisplayNameRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.username = str;
        this.display_name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeDisplayNameRequest)) {
            return false;
        }
        ChangeDisplayNameRequest changeDisplayNameRequest = (ChangeDisplayNameRequest) obj;
        return a().equals(changeDisplayNameRequest.a()) && whk.a((Object) this.username, (Object) changeDisplayNameRequest.username) && whk.a((Object) this.display_name, (Object) changeDisplayNameRequest.display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.username;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.display_name;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.username != null) {
            sb.append(", username=");
            sb.append(this.username);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        StringBuilder replace = sb.replace(0, 2, "ChangeDisplayNameRequest{");
        replace.append('}');
        return replace.toString();
    }
}
