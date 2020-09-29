package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoFolderMetadata extends Message<ProtoFolderMetadata, Builder> {
    public static final ProtoAdapter<ProtoFolderMetadata> ADAPTER = new a();
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM_FOLDERS;
    public static final Integer DEFAULT_NUM_PLAYLISTS;
    public static final Integer DEFAULT_NUM_RECURSIVE_FOLDERS;
    public static final Integer DEFAULT_NUM_RECURSIVE_PLAYLISTS;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String link;
    public final String name;
    public final Integer num_folders;
    public final Integer num_playlists;
    public final Integer num_recursive_folders;
    public final Integer num_recursive_playlists;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoFolderMetadata, Builder> {
        public String id;
        public String link;
        public String name;
        public Integer num_folders;
        public Integer num_playlists;
        public Integer num_recursive_folders;
        public Integer num_recursive_playlists;

        public final ProtoFolderMetadata build() {
            ProtoFolderMetadata protoFolderMetadata = r0;
            ProtoFolderMetadata protoFolderMetadata2 = new ProtoFolderMetadata(this.id, this.name, this.num_folders, this.num_playlists, this.num_recursive_folders, this.num_recursive_playlists, this.link, super.buildUnknownFields());
            return protoFolderMetadata2;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder num_folders(Integer num) {
            this.num_folders = num;
            return this;
        }

        public final Builder num_playlists(Integer num) {
            this.num_playlists = num;
            return this;
        }

        public final Builder num_recursive_folders(Integer num) {
            this.num_recursive_folders = num;
            return this;
        }

        public final Builder num_recursive_playlists(Integer num) {
            this.num_recursive_playlists = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoFolderMetadata> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoFolderMetadata.class);
        }

        public final /* synthetic */ int a(Object obj) {
            int i;
            ProtoFolderMetadata protoFolderMetadata = (ProtoFolderMetadata) obj;
            int i2 = 0;
            int a = (protoFolderMetadata.id != null ? ProtoAdapter.i.a(1, protoFolderMetadata.id) : 0) + (protoFolderMetadata.name != null ? ProtoAdapter.i.a(2, protoFolderMetadata.name) : 0) + (protoFolderMetadata.num_folders != null ? ProtoAdapter.c.a(3, protoFolderMetadata.num_folders) : 0);
            if (protoFolderMetadata.num_playlists != null) {
                boolean z = true ^ true;
                i = ProtoAdapter.c.a(4, protoFolderMetadata.num_playlists);
            } else {
                i = 0;
            }
            int a2 = a + i + (protoFolderMetadata.num_recursive_folders != null ? ProtoAdapter.c.a(5, protoFolderMetadata.num_recursive_folders) : 0) + (protoFolderMetadata.num_recursive_playlists != null ? ProtoAdapter.c.a(6, protoFolderMetadata.num_recursive_playlists) : 0);
            if (protoFolderMetadata.link != null) {
                i2 = ProtoAdapter.i.a(7, protoFolderMetadata.link);
            }
            return a2 + i2 + protoFolderMetadata.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.id((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 3:
                            builder.num_folders((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 4:
                            builder.num_playlists((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 5:
                            builder.num_recursive_folders((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 6:
                            builder.num_recursive_playlists((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 7:
                            builder.link((String) ProtoAdapter.i.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    whg.a(a);
                    return builder.build();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoFolderMetadata protoFolderMetadata = (ProtoFolderMetadata) obj;
            if (protoFolderMetadata.id != null) {
                ProtoAdapter.i.a(whh, 1, protoFolderMetadata.id);
            }
            if (protoFolderMetadata.name != null) {
                ProtoAdapter.i.a(whh, 2, protoFolderMetadata.name);
            }
            if (protoFolderMetadata.num_folders != null) {
                ProtoAdapter.c.a(whh, 3, protoFolderMetadata.num_folders);
            }
            if (protoFolderMetadata.num_playlists != null) {
                ProtoAdapter.c.a(whh, 4, protoFolderMetadata.num_playlists);
            }
            if (protoFolderMetadata.num_recursive_folders != null) {
                ProtoAdapter.c.a(whh, 5, protoFolderMetadata.num_recursive_folders);
            }
            if (protoFolderMetadata.num_recursive_playlists != null) {
                ProtoAdapter.c.a(whh, 6, protoFolderMetadata.num_recursive_playlists);
            }
            if (protoFolderMetadata.link != null) {
                ProtoAdapter.i.a(whh, 7, protoFolderMetadata.link);
            }
            whh.a(protoFolderMetadata.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_NUM_FOLDERS = valueOf;
        DEFAULT_NUM_PLAYLISTS = valueOf;
        DEFAULT_NUM_RECURSIVE_FOLDERS = valueOf;
        DEFAULT_NUM_RECURSIVE_PLAYLISTS = valueOf;
    }

    public ProtoFolderMetadata(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.num_folders = num;
        this.num_playlists = num2;
        this.num_recursive_folders = num3;
        this.num_recursive_playlists = num4;
        this.link = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoFolderMetadata)) {
            return false;
        }
        ProtoFolderMetadata protoFolderMetadata = (ProtoFolderMetadata) obj;
        return a().equals(protoFolderMetadata.a()) && whk.a((Object) this.id, (Object) protoFolderMetadata.id) && whk.a((Object) this.name, (Object) protoFolderMetadata.name) && whk.a((Object) this.num_folders, (Object) protoFolderMetadata.num_folders) && whk.a((Object) this.num_playlists, (Object) protoFolderMetadata.num_playlists) && whk.a((Object) this.num_recursive_folders, (Object) protoFolderMetadata.num_recursive_folders) && whk.a((Object) this.num_recursive_playlists, (Object) protoFolderMetadata.num_recursive_playlists) && whk.a((Object) this.link, (Object) protoFolderMetadata.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.id;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.num_folders;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.num_playlists;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.num_recursive_folders;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.num_recursive_playlists;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 37;
        String str3 = this.link;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode7 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            String str = ",isd ";
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            String str2 = "a,nm em";
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.num_folders != null) {
            String str3 = "nerfoo= su,_dm";
            sb.append(", num_folders=");
            sb.append(this.num_folders);
        }
        if (this.num_playlists != null) {
            sb.append(", num_playlists=");
            sb.append(this.num_playlists);
        }
        if (this.num_recursive_folders != null) {
            String str4 = "rfls bnevird=emu,reo_scu";
            sb.append(", num_recursive_folders=");
            sb.append(this.num_recursive_folders);
        }
        if (this.num_recursive_playlists != null) {
            String str5 = "riuc,_bptms=_seiylr slauve";
            sb.append(", num_recursive_playlists=");
            sb.append(this.num_recursive_playlists);
        }
        if (this.link != null) {
            String str6 = "tk,l in";
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoFolderMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
