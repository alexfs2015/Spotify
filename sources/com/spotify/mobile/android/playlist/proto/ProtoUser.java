package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoUser extends Message<ProtoUser, Builder> {
    public static final ProtoAdapter<ProtoUser> ADAPTER = new a();
    public static final String DEFAULT_DISPLAY_NAME = "";
    public static final String DEFAULT_IMAGE_URI = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_THUMBNAIL_URI = "";
    public static final String DEFAULT_USERNAME = "";
    private static final long serialVersionUID = 0;
    public final String display_name;
    public final String image_uri;
    public final String link;
    public final String thumbnail_uri;
    public final String username;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoUser, Builder> {
        public String display_name;
        public String image_uri;
        public String link;
        public String thumbnail_uri;
        public String username;

        public final ProtoUser build() {
            ProtoUser protoUser = r0;
            ProtoUser protoUser2 = new ProtoUser(this.link, this.username, this.display_name, this.image_uri, this.thumbnail_uri, super.buildUnknownFields());
            return protoUser2;
        }

        public final Builder display_name(String str) {
            this.display_name = str;
            return this;
        }

        public final Builder image_uri(String str) {
            this.image_uri = str;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder thumbnail_uri(String str) {
            this.thumbnail_uri = str;
            return this;
        }

        public final Builder username(String str) {
            this.username = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoUser> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoUser.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoUser protoUser = (ProtoUser) obj;
            int i = 0;
            int a = (protoUser.link != null ? ProtoAdapter.i.a(1, protoUser.link) : 0) + (protoUser.username != null ? ProtoAdapter.i.a(2, protoUser.username) : 0) + (protoUser.display_name != null ? ProtoAdapter.i.a(3, protoUser.display_name) : 0) + (protoUser.image_uri != null ? ProtoAdapter.i.a(4, protoUser.image_uri) : 0);
            if (protoUser.thumbnail_uri != null) {
                i = ProtoAdapter.i.a(5, protoUser.thumbnail_uri);
            }
            return a + i + protoUser.a().h();
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
                    builder.link((String) ProtoAdapter.i.a(whg));
                } else if (b == 2) {
                    builder.username((String) ProtoAdapter.i.a(whg));
                } else if (b == 3) {
                    builder.display_name((String) ProtoAdapter.i.a(whg));
                } else if (b == 4) {
                    builder.image_uri((String) ProtoAdapter.i.a(whg));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.thumbnail_uri((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoUser protoUser = (ProtoUser) obj;
            if (protoUser.link != null) {
                ProtoAdapter.i.a(whh, 1, protoUser.link);
            }
            if (protoUser.username != null) {
                ProtoAdapter.i.a(whh, 2, protoUser.username);
            }
            if (protoUser.display_name != null) {
                boolean z = true ^ true;
                ProtoAdapter.i.a(whh, 3, protoUser.display_name);
            }
            if (protoUser.image_uri != null) {
                ProtoAdapter.i.a(whh, 4, protoUser.image_uri);
            }
            if (protoUser.thumbnail_uri != null) {
                ProtoAdapter.i.a(whh, 5, protoUser.thumbnail_uri);
            }
            whh.a(protoUser.a());
        }
    }

    public ProtoUser(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.username = str2;
        this.display_name = str3;
        this.image_uri = str4;
        this.thumbnail_uri = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoUser)) {
            return false;
        }
        ProtoUser protoUser = (ProtoUser) obj;
        return a().equals(protoUser.a()) && whk.a((Object) this.link, (Object) protoUser.link) && whk.a((Object) this.username, (Object) protoUser.username) && whk.a((Object) this.display_name, (Object) protoUser.display_name) && whk.a((Object) this.image_uri, (Object) protoUser.image_uri) && whk.a((Object) this.thumbnail_uri, (Object) protoUser.thumbnail_uri);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            String str = this.link;
            int i2 = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.username;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.display_name;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.image_uri;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.thumbnail_uri;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            i = hashCode5 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.username != null) {
            String str = "a snrm,se=e";
            sb.append(", username=");
            sb.append(this.username);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        if (this.image_uri != null) {
            sb.append(", image_uri=");
            sb.append(this.image_uri);
        }
        if (this.thumbnail_uri != null) {
            sb.append(", thumbnail_uri=");
            sb.append(this.thumbnail_uri);
        }
        boolean z = false & true;
        String str2 = "{oemrPrUot";
        StringBuilder replace = sb.replace(0, 2, "ProtoUser{");
        replace.append('}');
        return replace.toString();
    }
}
