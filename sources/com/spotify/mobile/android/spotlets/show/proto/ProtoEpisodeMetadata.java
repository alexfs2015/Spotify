package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoEpisodeMetadata extends Message<ProtoEpisodeMetadata, Builder> {
    public static final ProtoAdapter<ProtoEpisodeMetadata> ADAPTER = new a();
    public static final Boolean DEFAULT_AVAILABLE = Boolean.FALSE;
    public static final Boolean DEFAULT_BACKGROUNDABLE = Boolean.FALSE;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Boolean DEFAULT_IS_EXPLICIT = Boolean.FALSE;
    public static final String DEFAULT_LANGUAGE = "";
    public static final Integer DEFAULT_LENGTH;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_MANIFEST_ID = "";
    public static final Integer DEFAULT_MEDIA_TYPE_ENUM;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PREVIEW_ID = "";
    public static final String DEFAULT_PREVIEW_MANIFEST_ID = "";
    public static final Long DEFAULT_PUBLISH_DATE = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Boolean available;
    public final Boolean backgroundable;
    public final ProtoImageGroup covers;
    public final String description;
    public final ProtoImageGroup freeze_frames;
    public final Boolean is_explicit;
    public final String language;
    public final Integer length;
    public final String link;
    public final String manifest_id;
    public final Integer media_type_enum;
    public final String name;
    public final String preview_id;
    public final String preview_manifest_id;
    public final Long publish_date;
    public final ProtoEpisodeShowMetadata show;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoEpisodeMetadata, Builder> {
        public Boolean available;
        public Boolean backgroundable;
        public ProtoImageGroup covers;
        public String description;
        public ProtoImageGroup freeze_frames;
        public Boolean is_explicit;
        public String language;
        public Integer length;
        public String link;
        public String manifest_id;
        public Integer media_type_enum;
        public String name;
        public String preview_id;
        public String preview_manifest_id;
        public Long publish_date;
        public ProtoEpisodeShowMetadata show;

        public final Builder show(ProtoEpisodeShowMetadata protoEpisodeShowMetadata) {
            this.show = protoEpisodeShowMetadata;
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

        public final Builder length(Integer num) {
            this.length = num;
            return this;
        }

        public final Builder covers(ProtoImageGroup protoImageGroup) {
            this.covers = protoImageGroup;
            return this;
        }

        public final Builder manifest_id(String str) {
            this.manifest_id = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder publish_date(Long l) {
            this.publish_date = l;
            return this;
        }

        public final Builder freeze_frames(ProtoImageGroup protoImageGroup) {
            this.freeze_frames = protoImageGroup;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder available(Boolean bool) {
            this.available = bool;
            return this;
        }

        public final Builder media_type_enum(Integer num) {
            this.media_type_enum = num;
            return this;
        }

        public final Builder backgroundable(Boolean bool) {
            this.backgroundable = bool;
            return this;
        }

        public final Builder preview_manifest_id(String str) {
            this.preview_manifest_id = str;
            return this;
        }

        public final Builder is_explicit(Boolean bool) {
            this.is_explicit = bool;
            return this;
        }

        public final Builder preview_id(String str) {
            this.preview_id = str;
            return this;
        }

        public final ProtoEpisodeMetadata build() {
            ProtoEpisodeMetadata protoEpisodeMetadata = new ProtoEpisodeMetadata(this.show, this.link, this.name, this.length, this.covers, this.manifest_id, this.description, this.publish_date, this.freeze_frames, this.language, this.available, this.media_type_enum, this.backgroundable, this.preview_manifest_id, this.is_explicit, this.preview_id, super.buildUnknownFields());
            return protoEpisodeMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoEpisodeMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoEpisodeMetadata protoEpisodeMetadata = (ProtoEpisodeMetadata) obj;
            int i = 0;
            int a = (protoEpisodeMetadata.show != null ? ProtoEpisodeShowMetadata.ADAPTER.a(1, protoEpisodeMetadata.show) : 0) + (protoEpisodeMetadata.link != null ? ProtoAdapter.i.a(2, protoEpisodeMetadata.link) : 0) + (protoEpisodeMetadata.name != null ? ProtoAdapter.i.a(3, protoEpisodeMetadata.name) : 0) + (protoEpisodeMetadata.length != null ? ProtoAdapter.c.a(4, protoEpisodeMetadata.length) : 0) + (protoEpisodeMetadata.covers != null ? ProtoImageGroup.ADAPTER.a(5, protoEpisodeMetadata.covers) : 0) + (protoEpisodeMetadata.manifest_id != null ? ProtoAdapter.i.a(6, protoEpisodeMetadata.manifest_id) : 0) + (protoEpisodeMetadata.description != null ? ProtoAdapter.i.a(7, protoEpisodeMetadata.description) : 0) + (protoEpisodeMetadata.publish_date != null ? ProtoAdapter.e.a(8, protoEpisodeMetadata.publish_date) : 0) + (protoEpisodeMetadata.freeze_frames != null ? ProtoImageGroup.ADAPTER.a(9, protoEpisodeMetadata.freeze_frames) : 0) + (protoEpisodeMetadata.language != null ? ProtoAdapter.i.a(10, protoEpisodeMetadata.language) : 0) + (protoEpisodeMetadata.available != null ? ProtoAdapter.a.a(11, protoEpisodeMetadata.available) : 0) + (protoEpisodeMetadata.media_type_enum != null ? ProtoAdapter.b.a(12, protoEpisodeMetadata.media_type_enum) : 0) + (protoEpisodeMetadata.backgroundable != null ? ProtoAdapter.a.a(14, protoEpisodeMetadata.backgroundable) : 0) + (protoEpisodeMetadata.preview_manifest_id != null ? ProtoAdapter.i.a(15, protoEpisodeMetadata.preview_manifest_id) : 0) + (protoEpisodeMetadata.is_explicit != null ? ProtoAdapter.a.a(16, protoEpisodeMetadata.is_explicit) : 0);
            if (protoEpisodeMetadata.preview_id != null) {
                i = ProtoAdapter.i.a(17, protoEpisodeMetadata.preview_id);
            }
            return a + i + protoEpisodeMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoEpisodeMetadata protoEpisodeMetadata = (ProtoEpisodeMetadata) obj;
            if (protoEpisodeMetadata.show != null) {
                ProtoEpisodeShowMetadata.ADAPTER.a(vtb, 1, protoEpisodeMetadata.show);
            }
            if (protoEpisodeMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 2, protoEpisodeMetadata.link);
            }
            if (protoEpisodeMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 3, protoEpisodeMetadata.name);
            }
            if (protoEpisodeMetadata.length != null) {
                ProtoAdapter.c.a(vtb, 4, protoEpisodeMetadata.length);
            }
            if (protoEpisodeMetadata.covers != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 5, protoEpisodeMetadata.covers);
            }
            if (protoEpisodeMetadata.manifest_id != null) {
                ProtoAdapter.i.a(vtb, 6, protoEpisodeMetadata.manifest_id);
            }
            if (protoEpisodeMetadata.description != null) {
                ProtoAdapter.i.a(vtb, 7, protoEpisodeMetadata.description);
            }
            if (protoEpisodeMetadata.publish_date != null) {
                ProtoAdapter.e.a(vtb, 8, protoEpisodeMetadata.publish_date);
            }
            if (protoEpisodeMetadata.freeze_frames != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 9, protoEpisodeMetadata.freeze_frames);
            }
            if (protoEpisodeMetadata.language != null) {
                ProtoAdapter.i.a(vtb, 10, protoEpisodeMetadata.language);
            }
            if (protoEpisodeMetadata.available != null) {
                ProtoAdapter.a.a(vtb, 11, protoEpisodeMetadata.available);
            }
            if (protoEpisodeMetadata.media_type_enum != null) {
                ProtoAdapter.b.a(vtb, 12, protoEpisodeMetadata.media_type_enum);
            }
            if (protoEpisodeMetadata.backgroundable != null) {
                ProtoAdapter.a.a(vtb, 14, protoEpisodeMetadata.backgroundable);
            }
            if (protoEpisodeMetadata.preview_manifest_id != null) {
                ProtoAdapter.i.a(vtb, 15, protoEpisodeMetadata.preview_manifest_id);
            }
            if (protoEpisodeMetadata.is_explicit != null) {
                ProtoAdapter.a.a(vtb, 16, protoEpisodeMetadata.is_explicit);
            }
            if (protoEpisodeMetadata.preview_id != null) {
                ProtoAdapter.i.a(vtb, 17, protoEpisodeMetadata.preview_id);
            }
            vtb.a(protoEpisodeMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoEpisodeMetadata.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.show((ProtoEpisodeShowMetadata) ProtoEpisodeShowMetadata.ADAPTER.a(vta));
                            break;
                        case 2:
                            builder.link((String) ProtoAdapter.i.a(vta));
                            break;
                        case 3:
                            builder.name((String) ProtoAdapter.i.a(vta));
                            break;
                        case 4:
                            builder.length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 5:
                            builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                            break;
                        case 6:
                            builder.manifest_id((String) ProtoAdapter.i.a(vta));
                            break;
                        case 7:
                            builder.description((String) ProtoAdapter.i.a(vta));
                            break;
                        case 8:
                            builder.publish_date((Long) ProtoAdapter.e.a(vta));
                            break;
                        case 9:
                            builder.freeze_frames((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                            break;
                        case 10:
                            builder.language((String) ProtoAdapter.i.a(vta));
                            break;
                        case 11:
                            builder.available((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 12:
                            builder.media_type_enum((Integer) ProtoAdapter.b.a(vta));
                            break;
                        case 14:
                            builder.backgroundable((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 15:
                            builder.preview_manifest_id((String) ProtoAdapter.i.a(vta));
                            break;
                        case 16:
                            builder.is_explicit((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 17:
                            builder.preview_id((String) ProtoAdapter.i.a(vta));
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
        DEFAULT_LENGTH = valueOf;
        DEFAULT_MEDIA_TYPE_ENUM = valueOf;
    }

    public ProtoEpisodeMetadata(ProtoEpisodeShowMetadata protoEpisodeShowMetadata, String str, String str2, Integer num, ProtoImageGroup protoImageGroup, String str3, String str4, Long l, ProtoImageGroup protoImageGroup2, String str5, Boolean bool, Integer num2, Boolean bool2, String str6, Boolean bool3, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = protoEpisodeShowMetadata;
        this.link = str;
        this.name = str2;
        this.length = num;
        this.covers = protoImageGroup;
        this.manifest_id = str3;
        this.description = str4;
        this.publish_date = l;
        this.freeze_frames = protoImageGroup2;
        this.language = str5;
        this.available = bool;
        this.media_type_enum = num2;
        this.backgroundable = bool2;
        this.preview_manifest_id = str6;
        this.is_explicit = bool3;
        this.preview_id = str7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoEpisodeMetadata)) {
            return false;
        }
        ProtoEpisodeMetadata protoEpisodeMetadata = (ProtoEpisodeMetadata) obj;
        return a().equals(protoEpisodeMetadata.a()) && vte.a((Object) this.show, (Object) protoEpisodeMetadata.show) && vte.a((Object) this.link, (Object) protoEpisodeMetadata.link) && vte.a((Object) this.name, (Object) protoEpisodeMetadata.name) && vte.a((Object) this.length, (Object) protoEpisodeMetadata.length) && vte.a((Object) this.covers, (Object) protoEpisodeMetadata.covers) && vte.a((Object) this.manifest_id, (Object) protoEpisodeMetadata.manifest_id) && vte.a((Object) this.description, (Object) protoEpisodeMetadata.description) && vte.a((Object) this.publish_date, (Object) protoEpisodeMetadata.publish_date) && vte.a((Object) this.freeze_frames, (Object) protoEpisodeMetadata.freeze_frames) && vte.a((Object) this.language, (Object) protoEpisodeMetadata.language) && vte.a((Object) this.available, (Object) protoEpisodeMetadata.available) && vte.a((Object) this.media_type_enum, (Object) protoEpisodeMetadata.media_type_enum) && vte.a((Object) this.backgroundable, (Object) protoEpisodeMetadata.backgroundable) && vte.a((Object) this.preview_manifest_id, (Object) protoEpisodeMetadata.preview_manifest_id) && vte.a((Object) this.is_explicit, (Object) protoEpisodeMetadata.is_explicit) && vte.a((Object) this.preview_id, (Object) protoEpisodeMetadata.preview_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoEpisodeShowMetadata protoEpisodeShowMetadata = this.show;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoEpisodeShowMetadata != null ? protoEpisodeShowMetadata.hashCode() : 0)) * 37;
        String str = this.link;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.length;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        ProtoImageGroup protoImageGroup = this.covers;
        int hashCode6 = (hashCode5 + (protoImageGroup != null ? protoImageGroup.hashCode() : 0)) * 37;
        String str3 = this.manifest_id;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.description;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.publish_date;
        int hashCode9 = (hashCode8 + (l != null ? l.hashCode() : 0)) * 37;
        ProtoImageGroup protoImageGroup2 = this.freeze_frames;
        int hashCode10 = (hashCode9 + (protoImageGroup2 != null ? protoImageGroup2.hashCode() : 0)) * 37;
        String str5 = this.language;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.available;
        int hashCode12 = (hashCode11 + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num2 = this.media_type_enum;
        int hashCode13 = (hashCode12 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool2 = this.backgroundable;
        int hashCode14 = (hashCode13 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        String str6 = this.preview_manifest_id;
        int hashCode15 = (hashCode14 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_explicit;
        int hashCode16 = (hashCode15 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        String str7 = this.preview_id;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i3 = hashCode16 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show != null) {
            sb.append(", show=");
            sb.append(this.show);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        if (this.covers != null) {
            sb.append(", covers=");
            sb.append(this.covers);
        }
        if (this.manifest_id != null) {
            sb.append(", manifest_id=");
            sb.append(this.manifest_id);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.publish_date != null) {
            sb.append(", publish_date=");
            sb.append(this.publish_date);
        }
        if (this.freeze_frames != null) {
            sb.append(", freeze_frames=");
            sb.append(this.freeze_frames);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.available != null) {
            sb.append(", available=");
            sb.append(this.available);
        }
        if (this.media_type_enum != null) {
            sb.append(", media_type_enum=");
            sb.append(this.media_type_enum);
        }
        if (this.backgroundable != null) {
            sb.append(", backgroundable=");
            sb.append(this.backgroundable);
        }
        if (this.preview_manifest_id != null) {
            sb.append(", preview_manifest_id=");
            sb.append(this.preview_manifest_id);
        }
        if (this.is_explicit != null) {
            sb.append(", is_explicit=");
            sb.append(this.is_explicit);
        }
        if (this.preview_id != null) {
            sb.append(", preview_id=");
            sb.append(this.preview_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoEpisodeMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
