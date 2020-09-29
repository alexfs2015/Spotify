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

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final ProtoPlaylistRootResponse build() {
            ProtoPlaylistRootResponse protoPlaylistRootResponse = new ProtoPlaylistRootResponse(this.root, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoPlaylistRootResponse;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistRootResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistRootResponse protoPlaylistRootResponse = (ProtoPlaylistRootResponse) obj;
            int i = 0;
            int a = (protoPlaylistRootResponse.root != null ? ProtoPlaylistRootFolder.ADAPTER.a(1, protoPlaylistRootResponse.root) : 0) + (protoPlaylistRootResponse.unfiltered_length != null ? ProtoAdapter.b.a(2, protoPlaylistRootResponse.unfiltered_length) : 0) + (protoPlaylistRootResponse.unranged_length != null ? ProtoAdapter.b.a(3, protoPlaylistRootResponse.unranged_length) : 0);
            if (protoPlaylistRootResponse.loading_contents != null) {
                i = ProtoAdapter.a.a(4, protoPlaylistRootResponse.loading_contents);
            }
            return a + i + protoPlaylistRootResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistRootResponse protoPlaylistRootResponse = (ProtoPlaylistRootResponse) obj;
            if (protoPlaylistRootResponse.root != null) {
                ProtoPlaylistRootFolder.ADAPTER.a(vtb, 1, protoPlaylistRootResponse.root);
            }
            if (protoPlaylistRootResponse.unfiltered_length != null) {
                ProtoAdapter.b.a(vtb, 2, protoPlaylistRootResponse.unfiltered_length);
            }
            if (protoPlaylistRootResponse.unranged_length != null) {
                ProtoAdapter.b.a(vtb, 3, protoPlaylistRootResponse.unranged_length);
            }
            if (protoPlaylistRootResponse.loading_contents != null) {
                ProtoAdapter.a.a(vtb, 4, protoPlaylistRootResponse.loading_contents);
            }
            vtb.a(protoPlaylistRootResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistRootResponse.class);
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
                    builder.root((ProtoPlaylistRootFolder) ProtoPlaylistRootFolder.ADAPTER.a(vta));
                } else if (b == 2) {
                    builder.unfiltered_length((Integer) ProtoAdapter.b.a(vta));
                } else if (b == 3) {
                    builder.unranged_length((Integer) ProtoAdapter.b.a(vta));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.loading_contents((Boolean) ProtoAdapter.a.a(vta));
                }
            }
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
        return a().equals(protoPlaylistRootResponse.a()) && vte.a((Object) this.root, (Object) protoPlaylistRootResponse.root) && vte.a((Object) this.unfiltered_length, (Object) protoPlaylistRootResponse.unfiltered_length) && vte.a((Object) this.unranged_length, (Object) protoPlaylistRootResponse.unranged_length) && vte.a((Object) this.loading_contents, (Object) protoPlaylistRootResponse.loading_contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
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
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.root != null) {
            sb.append(", root=");
            sb.append(this.root);
        }
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistRootResponse{");
        replace.append('}');
        return replace.toString();
    }
}
