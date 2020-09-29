package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoShowMetadata extends Message<ProtoShowMetadata, Builder> {
    public static final ProtoAdapter<ProtoShowMetadata> ADAPTER = new a();
    public static final String DEFAULT_CONSUMPTION_ORDER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Boolean DEFAULT_IS_EXPLICIT = Boolean.FALSE;
    public static final String DEFAULT_LANGUAGE = "";
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_MEDIA_TYPE_ENUM;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM_EPISODES;
    public static final Integer DEFAULT_POPULARITY;
    public static final String DEFAULT_PUBLISHER = "";
    private static final long serialVersionUID = 0;
    public final String consumption_order;
    public final List<String> copyright;
    public final ProtoImageGroup covers;
    public final String description;
    public final Boolean is_explicit;
    public final String language;
    public final String link;
    public final Integer media_type_enum;
    public final String name;
    public final Integer num_episodes;
    public final Integer popularity;
    public final String publisher;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowMetadata, Builder> {
        public String consumption_order;
        public List<String> copyright = vte.a();
        public ProtoImageGroup covers;
        public String description;
        public Boolean is_explicit;
        public String language;
        public String link;
        public Integer media_type_enum;
        public String name;
        public Integer num_episodes;
        public Integer popularity;
        public String publisher;

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder popularity(Integer num) {
            this.popularity = num;
            return this;
        }

        public final Builder publisher(String str) {
            this.publisher = str;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder is_explicit(Boolean bool) {
            this.is_explicit = bool;
            return this;
        }

        public final Builder covers(ProtoImageGroup protoImageGroup) {
            this.covers = protoImageGroup;
            return this;
        }

        public final Builder num_episodes(Integer num) {
            this.num_episodes = num;
            return this;
        }

        public final Builder consumption_order(String str) {
            this.consumption_order = str;
            return this;
        }

        public final Builder media_type_enum(Integer num) {
            this.media_type_enum = num;
            return this;
        }

        public final Builder copyright(List<String> list) {
            vte.a(list);
            this.copyright = list;
            return this;
        }

        public final ProtoShowMetadata build() {
            ProtoShowMetadata protoShowMetadata = new ProtoShowMetadata(this.link, this.name, this.description, this.popularity, this.publisher, this.language, this.is_explicit, this.covers, this.num_episodes, this.consumption_order, this.media_type_enum, this.copyright, super.buildUnknownFields());
            return protoShowMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoShowMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoShowMetadata protoShowMetadata = (ProtoShowMetadata) obj;
            int i = 0;
            int a = (protoShowMetadata.link != null ? ProtoAdapter.i.a(1, protoShowMetadata.link) : 0) + (protoShowMetadata.name != null ? ProtoAdapter.i.a(2, protoShowMetadata.name) : 0) + (protoShowMetadata.description != null ? ProtoAdapter.i.a(3, protoShowMetadata.description) : 0) + (protoShowMetadata.popularity != null ? ProtoAdapter.c.a(4, protoShowMetadata.popularity) : 0) + (protoShowMetadata.publisher != null ? ProtoAdapter.i.a(5, protoShowMetadata.publisher) : 0) + (protoShowMetadata.language != null ? ProtoAdapter.i.a(6, protoShowMetadata.language) : 0) + (protoShowMetadata.is_explicit != null ? ProtoAdapter.a.a(7, protoShowMetadata.is_explicit) : 0) + (protoShowMetadata.covers != null ? ProtoImageGroup.ADAPTER.a(8, protoShowMetadata.covers) : 0) + (protoShowMetadata.num_episodes != null ? ProtoAdapter.c.a(9, protoShowMetadata.num_episodes) : 0) + (protoShowMetadata.consumption_order != null ? ProtoAdapter.i.a(10, protoShowMetadata.consumption_order) : 0);
            if (protoShowMetadata.media_type_enum != null) {
                i = ProtoAdapter.b.a(11, protoShowMetadata.media_type_enum);
            }
            return a + i + ProtoAdapter.i.a().a(12, protoShowMetadata.copyright) + protoShowMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoShowMetadata protoShowMetadata = (ProtoShowMetadata) obj;
            if (protoShowMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 1, protoShowMetadata.link);
            }
            if (protoShowMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 2, protoShowMetadata.name);
            }
            if (protoShowMetadata.description != null) {
                ProtoAdapter.i.a(vtb, 3, protoShowMetadata.description);
            }
            if (protoShowMetadata.popularity != null) {
                ProtoAdapter.c.a(vtb, 4, protoShowMetadata.popularity);
            }
            if (protoShowMetadata.publisher != null) {
                ProtoAdapter.i.a(vtb, 5, protoShowMetadata.publisher);
            }
            if (protoShowMetadata.language != null) {
                ProtoAdapter.i.a(vtb, 6, protoShowMetadata.language);
            }
            if (protoShowMetadata.is_explicit != null) {
                ProtoAdapter.a.a(vtb, 7, protoShowMetadata.is_explicit);
            }
            if (protoShowMetadata.covers != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 8, protoShowMetadata.covers);
            }
            if (protoShowMetadata.num_episodes != null) {
                ProtoAdapter.c.a(vtb, 9, protoShowMetadata.num_episodes);
            }
            if (protoShowMetadata.consumption_order != null) {
                ProtoAdapter.i.a(vtb, 10, protoShowMetadata.consumption_order);
            }
            if (protoShowMetadata.media_type_enum != null) {
                ProtoAdapter.b.a(vtb, 11, protoShowMetadata.media_type_enum);
            }
            ProtoAdapter.i.a().a(vtb, 12, protoShowMetadata.copyright);
            vtb.a(protoShowMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowMetadata.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.link((String) ProtoAdapter.i.a(vta));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.i.a(vta));
                            break;
                        case 3:
                            builder.description((String) ProtoAdapter.i.a(vta));
                            break;
                        case 4:
                            builder.popularity((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 5:
                            builder.publisher((String) ProtoAdapter.i.a(vta));
                            break;
                        case 6:
                            builder.language((String) ProtoAdapter.i.a(vta));
                            break;
                        case 7:
                            builder.is_explicit((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 8:
                            builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                            break;
                        case 9:
                            builder.num_episodes((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 10:
                            builder.consumption_order((String) ProtoAdapter.i.a(vta));
                            break;
                        case 11:
                            builder.media_type_enum((Integer) ProtoAdapter.b.a(vta));
                            break;
                        case 12:
                            builder.copyright.add(ProtoAdapter.i.a(vta));
                            break;
                        default:
                            FieldEncoding fieldEncoding = vta.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                            break;
                    }
                } else {
                    vta.a(a);
                    return builder.build();
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_POPULARITY = valueOf;
        DEFAULT_NUM_EPISODES = valueOf;
        DEFAULT_MEDIA_TYPE_ENUM = valueOf;
    }

    public ProtoShowMetadata(String str, String str2, String str3, Integer num, String str4, String str5, Boolean bool, ProtoImageGroup protoImageGroup, Integer num2, String str6, Integer num3, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.name = str2;
        this.description = str3;
        this.popularity = num;
        this.publisher = str4;
        this.language = str5;
        this.is_explicit = bool;
        this.covers = protoImageGroup;
        this.num_episodes = num2;
        this.consumption_order = str6;
        this.media_type_enum = num3;
        this.copyright = vte.a("copyright", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowMetadata)) {
            return false;
        }
        ProtoShowMetadata protoShowMetadata = (ProtoShowMetadata) obj;
        return a().equals(protoShowMetadata.a()) && vte.a((Object) this.link, (Object) protoShowMetadata.link) && vte.a((Object) this.name, (Object) protoShowMetadata.name) && vte.a((Object) this.description, (Object) protoShowMetadata.description) && vte.a((Object) this.popularity, (Object) protoShowMetadata.popularity) && vte.a((Object) this.publisher, (Object) protoShowMetadata.publisher) && vte.a((Object) this.language, (Object) protoShowMetadata.language) && vte.a((Object) this.is_explicit, (Object) protoShowMetadata.is_explicit) && vte.a((Object) this.covers, (Object) protoShowMetadata.covers) && vte.a((Object) this.num_episodes, (Object) protoShowMetadata.num_episodes) && vte.a((Object) this.consumption_order, (Object) protoShowMetadata.consumption_order) && vte.a((Object) this.media_type_enum, (Object) protoShowMetadata.media_type_enum) && this.copyright.equals(protoShowMetadata.copyright);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.link;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.popularity;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        String str4 = this.publisher;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.language;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.is_explicit;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 37;
        ProtoImageGroup protoImageGroup = this.covers;
        int hashCode9 = (hashCode8 + (protoImageGroup != null ? protoImageGroup.hashCode() : 0)) * 37;
        Integer num2 = this.num_episodes;
        int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str6 = this.consumption_order;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num3 = this.media_type_enum;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        int hashCode12 = ((hashCode11 + i2) * 37) + this.copyright.hashCode();
        this.hashCode = hashCode12;
        return hashCode12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.popularity != null) {
            sb.append(", popularity=");
            sb.append(this.popularity);
        }
        if (this.publisher != null) {
            sb.append(", publisher=");
            sb.append(this.publisher);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.is_explicit != null) {
            sb.append(", is_explicit=");
            sb.append(this.is_explicit);
        }
        if (this.covers != null) {
            sb.append(", covers=");
            sb.append(this.covers);
        }
        if (this.num_episodes != null) {
            sb.append(", num_episodes=");
            sb.append(this.num_episodes);
        }
        if (this.consumption_order != null) {
            sb.append(", consumption_order=");
            sb.append(this.consumption_order);
        }
        if (this.media_type_enum != null) {
            sb.append(", media_type_enum=");
            sb.append(this.media_type_enum);
        }
        if (!this.copyright.isEmpty()) {
            sb.append(", copyright=");
            sb.append(this.copyright);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoShowMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
