package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoPlaylistRootResponse extends Message<ProtoPlaylistRootResponse, Builder> {
    public static final ProtoAdapter<ProtoPlaylistRootResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final Boolean loading_contents;
    public final ProtoPlaylistRootFolder root;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistRootResponse, Builder> {
        public Boolean loading_contents;
        public ProtoPlaylistRootFolder root;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoPlaylistRootResponse build() {
            ProtoPlaylistRootResponse protoPlaylistRootResponse = r0;
            ProtoPlaylistRootResponse protoPlaylistRootResponse2 = new ProtoPlaylistRootResponse(this.root, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoPlaylistRootResponse2;
        }

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final Builder root(ProtoPlaylistRootFolder protoPlaylistRootFolder) {
            this.root = protoPlaylistRootFolder;
            return this;
        }

        public final Builder unfiltered_length(Integer num) {
            this.unfiltered_length = num;
            return this;
        }

        public final Builder unranged_length(Integer num) {
            this.unranged_length = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistRootResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistRootResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            int i;
            ProtoPlaylistRootResponse protoPlaylistRootResponse = (ProtoPlaylistRootResponse) obj;
            int i2 = 0;
            if (protoPlaylistRootResponse.root != null) {
                int i3 = 1 >> 1;
                i = ProtoPlaylistRootFolder.ADAPTER.a(1, protoPlaylistRootResponse.root);
            } else {
                i = 0;
            }
            int a = i + (protoPlaylistRootResponse.unfiltered_length != null ? ProtoAdapter.b.a(2, protoPlaylistRootResponse.unfiltered_length) : 0) + (protoPlaylistRootResponse.unranged_length != null ? ProtoAdapter.b.a(3, protoPlaylistRootResponse.unranged_length) : 0);
            if (protoPlaylistRootResponse.loading_contents != null) {
                i2 = ProtoAdapter.a.a(4, protoPlaylistRootResponse.loading_contents);
            }
            return a + i2 + protoPlaylistRootResponse.a().h();
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
                    builder.root((ProtoPlaylistRootFolder) ProtoPlaylistRootFolder.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.unfiltered_length((Integer) ProtoAdapter.b.a(whg));
                } else if (b == 3) {
                    builder.unranged_length((Integer) ProtoAdapter.b.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.loading_contents((Boolean) ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoPlaylistRootResponse protoPlaylistRootResponse = (ProtoPlaylistRootResponse) obj;
            if (protoPlaylistRootResponse.root != null) {
                ProtoPlaylistRootFolder.ADAPTER.a(whh, 1, protoPlaylistRootResponse.root);
            }
            if (protoPlaylistRootResponse.unfiltered_length != null) {
                ProtoAdapter.b.a(whh, 2, protoPlaylistRootResponse.unfiltered_length);
            }
            if (protoPlaylistRootResponse.unranged_length != null) {
                ProtoAdapter.b.a(whh, 3, protoPlaylistRootResponse.unranged_length);
            }
            if (protoPlaylistRootResponse.loading_contents != null) {
                ProtoAdapter.a.a(whh, 4, protoPlaylistRootResponse.loading_contents);
            }
            whh.a(protoPlaylistRootResponse.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoPlaylistRootResponse(ProtoPlaylistRootFolder protoPlaylistRootFolder, Integer num, Integer num2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.root = protoPlaylistRootFolder;
        this.unfiltered_length = num;
        this.unranged_length = num2;
        this.loading_contents = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistRootResponse)) {
            return false;
        }
        ProtoPlaylistRootResponse protoPlaylistRootResponse = (ProtoPlaylistRootResponse) obj;
        return a().equals(protoPlaylistRootResponse.a()) && whk.a((Object) this.root, (Object) protoPlaylistRootResponse.root) && whk.a((Object) this.unfiltered_length, (Object) protoPlaylistRootResponse.unfiltered_length) && whk.a((Object) this.unranged_length, (Object) protoPlaylistRootResponse.unranged_length) && whk.a((Object) this.loading_contents, (Object) protoPlaylistRootResponse.loading_contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            ProtoPlaylistRootFolder protoPlaylistRootFolder = this.root;
            int i2 = 0;
            int hashCode2 = (hashCode + (protoPlaylistRootFolder != null ? protoPlaylistRootFolder.hashCode() : 0)) * 37;
            Integer num = this.unfiltered_length;
            int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.unranged_length;
            int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Boolean bool = this.loading_contents;
            if (bool != null) {
                i2 = bool.hashCode();
            }
            i = hashCode4 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.root != null) {
            sb.append(", root=");
            sb.append(this.root);
        }
        if (this.unfiltered_length != null) {
            String str = "_fstednelitl=eg,rnhu";
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            String str2 = "n=gmoec_o idn,ttsla";
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        String str3 = "aiesoltoResls{opyrttoRonoP";
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistRootResponse{");
        replace.append('}');
        return replace.toString();
    }
}
