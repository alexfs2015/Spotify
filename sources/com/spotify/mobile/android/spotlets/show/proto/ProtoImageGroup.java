package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoImageGroup extends Message<ProtoImageGroup, Builder> {
    public static final ProtoAdapter<ProtoImageGroup> ADAPTER = new a();
    public static final String DEFAULT_LARGE_LINK = "";
    public static final String DEFAULT_SMALL_LINK = "";
    public static final String DEFAULT_STANDARD_LINK = "";
    public static final String DEFAULT_XLARGE_LINK = "";
    private static final long serialVersionUID = 0;
    public final String large_link;
    public final String small_link;
    public final String standard_link;
    public final String xlarge_link;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoImageGroup, Builder> {
        public String large_link;
        public String small_link;
        public String standard_link;
        public String xlarge_link;

        public final Builder standard_link(String str) {
            this.standard_link = str;
            return this;
        }

        public final Builder small_link(String str) {
            this.small_link = str;
            return this;
        }

        public final Builder large_link(String str) {
            this.large_link = str;
            return this;
        }

        public final Builder xlarge_link(String str) {
            this.xlarge_link = str;
            return this;
        }

        public final ProtoImageGroup build() {
            ProtoImageGroup protoImageGroup = new ProtoImageGroup(this.standard_link, this.small_link, this.large_link, this.xlarge_link, super.buildUnknownFields());
            return protoImageGroup;
        }
    }

    static final class a extends ProtoAdapter<ProtoImageGroup> {
        public final /* synthetic */ int a(Object obj) {
            ProtoImageGroup protoImageGroup = (ProtoImageGroup) obj;
            int i = 0;
            int a = (protoImageGroup.standard_link != null ? ProtoAdapter.i.a(1, protoImageGroup.standard_link) : 0) + (protoImageGroup.small_link != null ? ProtoAdapter.i.a(2, protoImageGroup.small_link) : 0) + (protoImageGroup.large_link != null ? ProtoAdapter.i.a(3, protoImageGroup.large_link) : 0);
            if (protoImageGroup.xlarge_link != null) {
                i = ProtoAdapter.i.a(4, protoImageGroup.xlarge_link);
            }
            return a + i + protoImageGroup.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoImageGroup protoImageGroup = (ProtoImageGroup) obj;
            if (protoImageGroup.standard_link != null) {
                ProtoAdapter.i.a(vtb, 1, protoImageGroup.standard_link);
            }
            if (protoImageGroup.small_link != null) {
                ProtoAdapter.i.a(vtb, 2, protoImageGroup.small_link);
            }
            if (protoImageGroup.large_link != null) {
                ProtoAdapter.i.a(vtb, 3, protoImageGroup.large_link);
            }
            if (protoImageGroup.xlarge_link != null) {
                ProtoAdapter.i.a(vtb, 4, protoImageGroup.xlarge_link);
            }
            vtb.a(protoImageGroup.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoImageGroup.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.standard_link((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.small_link((String) ProtoAdapter.i.a(vta));
                } else if (b == 3) {
                    builder.large_link((String) ProtoAdapter.i.a(vta));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.xlarge_link((String) ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public ProtoImageGroup(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.standard_link = str;
        this.small_link = str2;
        this.large_link = str3;
        this.xlarge_link = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoImageGroup)) {
            return false;
        }
        ProtoImageGroup protoImageGroup = (ProtoImageGroup) obj;
        return a().equals(protoImageGroup.a()) && vte.a((Object) this.standard_link, (Object) protoImageGroup.standard_link) && vte.a((Object) this.small_link, (Object) protoImageGroup.small_link) && vte.a((Object) this.large_link, (Object) protoImageGroup.large_link) && vte.a((Object) this.xlarge_link, (Object) protoImageGroup.xlarge_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.standard_link;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.small_link;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.large_link;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.xlarge_link;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.standard_link != null) {
            sb.append(", standard_link=");
            sb.append(this.standard_link);
        }
        if (this.small_link != null) {
            sb.append(", small_link=");
            sb.append(this.small_link);
        }
        if (this.large_link != null) {
            sb.append(", large_link=");
            sb.append(this.large_link);
        }
        if (this.xlarge_link != null) {
            sb.append(", xlarge_link=");
            sb.append(this.xlarge_link);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoImageGroup{");
        replace.append('}');
        return replace.toString();
    }
}
