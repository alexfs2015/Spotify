package com.spotify.mobile.android.playlist.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoPlaylistMetadata extends Message<ProtoPlaylistMetadata, Builder> {
    public static final ProtoAdapter<ProtoPlaylistMetadata> ADAPTER = new a();
    public static final Boolean DEFAULT_BROWSABLE_OFFLINE = Boolean.FALSE;
    public static final Boolean DEFAULT_CAN_REPORT_ANNOTATION_ABUSE = Boolean.FALSE;
    public static final Boolean DEFAULT_COLLABORATIVE = Boolean.FALSE;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Boolean DEFAULT_DESCRIPTION_FROM_ANNOTATE = Boolean.FALSE;
    public static final Boolean DEFAULT_FOLLOWED = Boolean.FALSE;
    public static final String DEFAULT_FORMAT_LIST_TYPE = "";
    public static final Boolean DEFAULT_IS_LOADED = Boolean.FALSE;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final Boolean DEFAULT_OWNED_BY_SELF = Boolean.FALSE;
    public static final Boolean DEFAULT_PICTURE_FROM_ANNOTATE = Boolean.FALSE;
    public static final Boolean DEFAULT_PUBLISHED = Boolean.FALSE;
    public static final Integer DEFAULT_TOTAL_LENGTH = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Boolean browsable_offline;
    public final Boolean can_report_annotation_abuse;
    public final Boolean collaborative;
    public final String description;
    public final Boolean description_from_annotate;
    public final Boolean followed;
    public final List<ProtoPlaylistFormatListAttribute> format_list_attributes;
    public final String format_list_type;
    public final Boolean is_loaded;
    public final String link;
    public final ProtoUser made_for;
    public final String name;
    public final Boolean owned_by_self;
    public final ProtoUser owner;
    public final Boolean picture_from_annotate;
    public final ProtoImageGroup pictures;
    public final Boolean published;
    public final Integer total_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistMetadata, Builder> {
        public Boolean browsable_offline;
        public Boolean can_report_annotation_abuse;
        public Boolean collaborative;
        public String description;
        public Boolean description_from_annotate;
        public Boolean followed;
        public List<ProtoPlaylistFormatListAttribute> format_list_attributes = vte.a();
        public String format_list_type;
        public Boolean is_loaded;
        public String link;
        public ProtoUser made_for;
        public String name;
        public Boolean owned_by_self;
        public ProtoUser owner;
        public Boolean picture_from_annotate;
        public ProtoImageGroup pictures;
        public Boolean published;
        public Integer total_length;

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder owner(ProtoUser protoUser) {
            this.owner = protoUser;
            return this;
        }

        public final Builder owned_by_self(Boolean bool) {
            this.owned_by_self = bool;
            return this;
        }

        public final Builder collaborative(Boolean bool) {
            this.collaborative = bool;
            return this;
        }

        public final Builder total_length(Integer num) {
            this.total_length = num;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder pictures(ProtoImageGroup protoImageGroup) {
            this.pictures = protoImageGroup;
            return this;
        }

        public final Builder followed(Boolean bool) {
            this.followed = bool;
            return this;
        }

        public final Builder published(Boolean bool) {
            this.published = bool;
            return this;
        }

        public final Builder browsable_offline(Boolean bool) {
            this.browsable_offline = bool;
            return this;
        }

        public final Builder description_from_annotate(Boolean bool) {
            this.description_from_annotate = bool;
            return this;
        }

        public final Builder picture_from_annotate(Boolean bool) {
            this.picture_from_annotate = bool;
            return this;
        }

        public final Builder format_list_type(String str) {
            this.format_list_type = str;
            return this;
        }

        public final Builder format_list_attributes(List<ProtoPlaylistFormatListAttribute> list) {
            vte.a(list);
            this.format_list_attributes = list;
            return this;
        }

        public final Builder can_report_annotation_abuse(Boolean bool) {
            this.can_report_annotation_abuse = bool;
            return this;
        }

        public final Builder is_loaded(Boolean bool) {
            this.is_loaded = bool;
            return this;
        }

        public final Builder made_for(ProtoUser protoUser) {
            this.made_for = protoUser;
            return this;
        }

        public final ProtoPlaylistMetadata build() {
            ProtoPlaylistMetadata protoPlaylistMetadata = new ProtoPlaylistMetadata(this.link, this.name, this.owner, this.owned_by_self, this.collaborative, this.total_length, this.description, this.pictures, this.followed, this.published, this.browsable_offline, this.description_from_annotate, this.picture_from_annotate, this.format_list_type, this.format_list_attributes, this.can_report_annotation_abuse, this.is_loaded, this.made_for, super.buildUnknownFields());
            return protoPlaylistMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistMetadata protoPlaylistMetadata = (ProtoPlaylistMetadata) obj;
            int i = 0;
            int a = (protoPlaylistMetadata.link != null ? ProtoAdapter.i.a(1, protoPlaylistMetadata.link) : 0) + (protoPlaylistMetadata.name != null ? ProtoAdapter.i.a(2, protoPlaylistMetadata.name) : 0) + (protoPlaylistMetadata.owner != null ? ProtoUser.ADAPTER.a(3, protoPlaylistMetadata.owner) : 0) + (protoPlaylistMetadata.owned_by_self != null ? ProtoAdapter.a.a(4, protoPlaylistMetadata.owned_by_self) : 0) + (protoPlaylistMetadata.collaborative != null ? ProtoAdapter.a.a(5, protoPlaylistMetadata.collaborative) : 0) + (protoPlaylistMetadata.total_length != null ? ProtoAdapter.c.a(6, protoPlaylistMetadata.total_length) : 0) + (protoPlaylistMetadata.description != null ? ProtoAdapter.i.a(7, protoPlaylistMetadata.description) : 0) + (protoPlaylistMetadata.pictures != null ? ProtoImageGroup.ADAPTER.a(8, protoPlaylistMetadata.pictures) : 0) + (protoPlaylistMetadata.followed != null ? ProtoAdapter.a.a(9, protoPlaylistMetadata.followed) : 0) + (protoPlaylistMetadata.published != null ? ProtoAdapter.a.a(10, protoPlaylistMetadata.published) : 0) + (protoPlaylistMetadata.browsable_offline != null ? ProtoAdapter.a.a(11, protoPlaylistMetadata.browsable_offline) : 0) + (protoPlaylistMetadata.description_from_annotate != null ? ProtoAdapter.a.a(12, protoPlaylistMetadata.description_from_annotate) : 0) + (protoPlaylistMetadata.picture_from_annotate != null ? ProtoAdapter.a.a(13, protoPlaylistMetadata.picture_from_annotate) : 0) + (protoPlaylistMetadata.format_list_type != null ? ProtoAdapter.i.a(14, protoPlaylistMetadata.format_list_type) : 0) + ProtoPlaylistFormatListAttribute.ADAPTER.a().a(15, protoPlaylistMetadata.format_list_attributes) + (protoPlaylistMetadata.can_report_annotation_abuse != null ? ProtoAdapter.a.a(16, protoPlaylistMetadata.can_report_annotation_abuse) : 0) + (protoPlaylistMetadata.is_loaded != null ? ProtoAdapter.a.a(17, protoPlaylistMetadata.is_loaded) : 0);
            if (protoPlaylistMetadata.made_for != null) {
                i = ProtoUser.ADAPTER.a(20, protoPlaylistMetadata.made_for);
            }
            return a + i + protoPlaylistMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistMetadata protoPlaylistMetadata = (ProtoPlaylistMetadata) obj;
            if (protoPlaylistMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 1, protoPlaylistMetadata.link);
            }
            if (protoPlaylistMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 2, protoPlaylistMetadata.name);
            }
            if (protoPlaylistMetadata.owner != null) {
                ProtoUser.ADAPTER.a(vtb, 3, protoPlaylistMetadata.owner);
            }
            if (protoPlaylistMetadata.owned_by_self != null) {
                ProtoAdapter.a.a(vtb, 4, protoPlaylistMetadata.owned_by_self);
            }
            if (protoPlaylistMetadata.collaborative != null) {
                ProtoAdapter.a.a(vtb, 5, protoPlaylistMetadata.collaborative);
            }
            if (protoPlaylistMetadata.total_length != null) {
                ProtoAdapter.c.a(vtb, 6, protoPlaylistMetadata.total_length);
            }
            if (protoPlaylistMetadata.description != null) {
                ProtoAdapter.i.a(vtb, 7, protoPlaylistMetadata.description);
            }
            if (protoPlaylistMetadata.pictures != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 8, protoPlaylistMetadata.pictures);
            }
            if (protoPlaylistMetadata.followed != null) {
                ProtoAdapter.a.a(vtb, 9, protoPlaylistMetadata.followed);
            }
            if (protoPlaylistMetadata.published != null) {
                ProtoAdapter.a.a(vtb, 10, protoPlaylistMetadata.published);
            }
            if (protoPlaylistMetadata.browsable_offline != null) {
                ProtoAdapter.a.a(vtb, 11, protoPlaylistMetadata.browsable_offline);
            }
            if (protoPlaylistMetadata.description_from_annotate != null) {
                ProtoAdapter.a.a(vtb, 12, protoPlaylistMetadata.description_from_annotate);
            }
            if (protoPlaylistMetadata.picture_from_annotate != null) {
                ProtoAdapter.a.a(vtb, 13, protoPlaylistMetadata.picture_from_annotate);
            }
            if (protoPlaylistMetadata.format_list_type != null) {
                ProtoAdapter.i.a(vtb, 14, protoPlaylistMetadata.format_list_type);
            }
            ProtoPlaylistFormatListAttribute.ADAPTER.a().a(vtb, 15, protoPlaylistMetadata.format_list_attributes);
            if (protoPlaylistMetadata.can_report_annotation_abuse != null) {
                ProtoAdapter.a.a(vtb, 16, protoPlaylistMetadata.can_report_annotation_abuse);
            }
            if (protoPlaylistMetadata.is_loaded != null) {
                ProtoAdapter.a.a(vtb, 17, protoPlaylistMetadata.is_loaded);
            }
            if (protoPlaylistMetadata.made_for != null) {
                ProtoUser.ADAPTER.a(vtb, 20, protoPlaylistMetadata.made_for);
            }
            vtb.a(protoPlaylistMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistMetadata.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b != 20) {
                    switch (b) {
                        case 1:
                            builder.link((String) ProtoAdapter.i.a(vta));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.i.a(vta));
                            break;
                        case 3:
                            builder.owner((ProtoUser) ProtoUser.ADAPTER.a(vta));
                            break;
                        case 4:
                            builder.owned_by_self((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 5:
                            builder.collaborative((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 6:
                            builder.total_length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 7:
                            builder.description((String) ProtoAdapter.i.a(vta));
                            break;
                        case 8:
                            builder.pictures((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                            break;
                        case 9:
                            builder.followed((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 10:
                            builder.published((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 11:
                            builder.browsable_offline((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 12:
                            builder.description_from_annotate((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 13:
                            builder.picture_from_annotate((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 14:
                            builder.format_list_type((String) ProtoAdapter.i.a(vta));
                            break;
                        case 15:
                            builder.format_list_attributes.add(ProtoPlaylistFormatListAttribute.ADAPTER.a(vta));
                            break;
                        case 16:
                            builder.can_report_annotation_abuse((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 17:
                            builder.is_loaded((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        default:
                            FieldEncoding fieldEncoding = vta.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                            break;
                    }
                } else {
                    builder.made_for((ProtoUser) ProtoUser.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoPlaylistMetadata(String str, String str2, ProtoUser protoUser, Boolean bool, Boolean bool2, Integer num, String str3, ProtoImageGroup protoImageGroup, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str4, List<ProtoPlaylistFormatListAttribute> list, Boolean bool8, Boolean bool9, ProtoUser protoUser2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.name = str2;
        this.owner = protoUser;
        this.owned_by_self = bool;
        this.collaborative = bool2;
        this.total_length = num;
        this.description = str3;
        this.pictures = protoImageGroup;
        this.followed = bool3;
        this.published = bool4;
        this.browsable_offline = bool5;
        this.description_from_annotate = bool6;
        this.picture_from_annotate = bool7;
        this.format_list_type = str4;
        this.format_list_attributes = vte.a("format_list_attributes", list);
        this.can_report_annotation_abuse = bool8;
        this.is_loaded = bool9;
        this.made_for = protoUser2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistMetadata)) {
            return false;
        }
        ProtoPlaylistMetadata protoPlaylistMetadata = (ProtoPlaylistMetadata) obj;
        return a().equals(protoPlaylistMetadata.a()) && vte.a((Object) this.link, (Object) protoPlaylistMetadata.link) && vte.a((Object) this.name, (Object) protoPlaylistMetadata.name) && vte.a((Object) this.owner, (Object) protoPlaylistMetadata.owner) && vte.a((Object) this.owned_by_self, (Object) protoPlaylistMetadata.owned_by_self) && vte.a((Object) this.collaborative, (Object) protoPlaylistMetadata.collaborative) && vte.a((Object) this.total_length, (Object) protoPlaylistMetadata.total_length) && vte.a((Object) this.description, (Object) protoPlaylistMetadata.description) && vte.a((Object) this.pictures, (Object) protoPlaylistMetadata.pictures) && vte.a((Object) this.followed, (Object) protoPlaylistMetadata.followed) && vte.a((Object) this.published, (Object) protoPlaylistMetadata.published) && vte.a((Object) this.browsable_offline, (Object) protoPlaylistMetadata.browsable_offline) && vte.a((Object) this.description_from_annotate, (Object) protoPlaylistMetadata.description_from_annotate) && vte.a((Object) this.picture_from_annotate, (Object) protoPlaylistMetadata.picture_from_annotate) && vte.a((Object) this.format_list_type, (Object) protoPlaylistMetadata.format_list_type) && this.format_list_attributes.equals(protoPlaylistMetadata.format_list_attributes) && vte.a((Object) this.can_report_annotation_abuse, (Object) protoPlaylistMetadata.can_report_annotation_abuse) && vte.a((Object) this.is_loaded, (Object) protoPlaylistMetadata.is_loaded) && vte.a((Object) this.made_for, (Object) protoPlaylistMetadata.made_for);
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
        ProtoUser protoUser = this.owner;
        int hashCode4 = (hashCode3 + (protoUser != null ? protoUser.hashCode() : 0)) * 37;
        Boolean bool = this.owned_by_self;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.collaborative;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Integer num = this.total_length;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 37;
        String str3 = this.description;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ProtoImageGroup protoImageGroup = this.pictures;
        int hashCode9 = (hashCode8 + (protoImageGroup != null ? protoImageGroup.hashCode() : 0)) * 37;
        Boolean bool3 = this.followed;
        int hashCode10 = (hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.published;
        int hashCode11 = (hashCode10 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.browsable_offline;
        int hashCode12 = (hashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.description_from_annotate;
        int hashCode13 = (hashCode12 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.picture_from_annotate;
        int hashCode14 = (hashCode13 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        String str4 = this.format_list_type;
        int hashCode15 = (((hashCode14 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.format_list_attributes.hashCode()) * 37;
        Boolean bool8 = this.can_report_annotation_abuse;
        int hashCode16 = (hashCode15 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Boolean bool9 = this.is_loaded;
        int hashCode17 = (hashCode16 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        ProtoUser protoUser2 = this.made_for;
        if (protoUser2 != null) {
            i2 = protoUser2.hashCode();
        }
        int i3 = hashCode17 + i2;
        this.hashCode = i3;
        return i3;
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
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.owned_by_self != null) {
            sb.append(", owned_by_self=");
            sb.append(this.owned_by_self);
        }
        if (this.collaborative != null) {
            sb.append(", collaborative=");
            sb.append(this.collaborative);
        }
        if (this.total_length != null) {
            sb.append(", total_length=");
            sb.append(this.total_length);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.pictures != null) {
            sb.append(", pictures=");
            sb.append(this.pictures);
        }
        if (this.followed != null) {
            sb.append(", followed=");
            sb.append(this.followed);
        }
        if (this.published != null) {
            sb.append(", published=");
            sb.append(this.published);
        }
        if (this.browsable_offline != null) {
            sb.append(", browsable_offline=");
            sb.append(this.browsable_offline);
        }
        if (this.description_from_annotate != null) {
            sb.append(", description_from_annotate=");
            sb.append(this.description_from_annotate);
        }
        if (this.picture_from_annotate != null) {
            sb.append(", picture_from_annotate=");
            sb.append(this.picture_from_annotate);
        }
        if (this.format_list_type != null) {
            sb.append(", format_list_type=");
            sb.append(this.format_list_type);
        }
        if (!this.format_list_attributes.isEmpty()) {
            sb.append(", format_list_attributes=");
            sb.append(this.format_list_attributes);
        }
        if (this.can_report_annotation_abuse != null) {
            sb.append(", can_report_annotation_abuse=");
            sb.append(this.can_report_annotation_abuse);
        }
        if (this.is_loaded != null) {
            sb.append(", is_loaded=");
            sb.append(this.is_loaded);
        }
        if (this.made_for != null) {
            sb.append(", made_for=");
            sb.append(this.made_for);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
