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
        public List<ProtoPlaylistFormatListAttribute> format_list_attributes = whk.a();
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

        public final Builder browsable_offline(Boolean bool) {
            this.browsable_offline = bool;
            return this;
        }

        public final ProtoPlaylistMetadata build() {
            String str = this.link;
            String str2 = this.name;
            ProtoUser protoUser = this.owner;
            Boolean bool = this.owned_by_self;
            Boolean bool2 = this.collaborative;
            Integer num = this.total_length;
            String str3 = this.description;
            ProtoImageGroup protoImageGroup = this.pictures;
            Boolean bool3 = this.followed;
            Boolean bool4 = this.published;
            Boolean bool5 = this.browsable_offline;
            Boolean bool6 = this.description_from_annotate;
            Boolean bool7 = this.picture_from_annotate;
            String str4 = this.format_list_type;
            List<ProtoPlaylistFormatListAttribute> list = this.format_list_attributes;
            Boolean bool8 = this.can_report_annotation_abuse;
            Boolean bool9 = this.is_loaded;
            Boolean bool10 = bool9;
            Boolean bool11 = bool9;
            ProtoUser protoUser2 = this.made_for;
            ProtoUser protoUser3 = protoUser2;
            ProtoPlaylistMetadata protoPlaylistMetadata = new ProtoPlaylistMetadata(str, str2, protoUser, bool, bool2, num, str3, protoImageGroup, bool3, bool4, bool5, bool6, bool7, str4, list, bool8, bool11, protoUser2, super.buildUnknownFields());
            return protoPlaylistMetadata;
        }

        public final Builder can_report_annotation_abuse(Boolean bool) {
            this.can_report_annotation_abuse = bool;
            return this;
        }

        public final Builder collaborative(Boolean bool) {
            this.collaborative = bool;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder description_from_annotate(Boolean bool) {
            this.description_from_annotate = bool;
            return this;
        }

        public final Builder followed(Boolean bool) {
            this.followed = bool;
            return this;
        }

        public final Builder format_list_attributes(List<ProtoPlaylistFormatListAttribute> list) {
            whk.a(list);
            this.format_list_attributes = list;
            return this;
        }

        public final Builder format_list_type(String str) {
            this.format_list_type = str;
            return this;
        }

        public final Builder is_loaded(Boolean bool) {
            this.is_loaded = bool;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder made_for(ProtoUser protoUser) {
            this.made_for = protoUser;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder owned_by_self(Boolean bool) {
            this.owned_by_self = bool;
            return this;
        }

        public final Builder owner(ProtoUser protoUser) {
            this.owner = protoUser;
            return this;
        }

        public final Builder picture_from_annotate(Boolean bool) {
            this.picture_from_annotate = bool;
            return this;
        }

        public final Builder pictures(ProtoImageGroup protoImageGroup) {
            this.pictures = protoImageGroup;
            return this;
        }

        public final Builder published(Boolean bool) {
            this.published = bool;
            return this;
        }

        public final Builder total_length(Integer num) {
            this.total_length = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistMetadata> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistMetadata.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistMetadata protoPlaylistMetadata = (ProtoPlaylistMetadata) obj;
            int i = 0;
            int a = (protoPlaylistMetadata.link != null ? ProtoAdapter.i.a(1, protoPlaylistMetadata.link) : 0) + (protoPlaylistMetadata.name != null ? ProtoAdapter.i.a(2, protoPlaylistMetadata.name) : 0) + (protoPlaylistMetadata.owner != null ? ProtoUser.ADAPTER.a(3, protoPlaylistMetadata.owner) : 0) + (protoPlaylistMetadata.owned_by_self != null ? ProtoAdapter.a.a(4, protoPlaylistMetadata.owned_by_self) : 0) + (protoPlaylistMetadata.collaborative != null ? ProtoAdapter.a.a(5, protoPlaylistMetadata.collaborative) : 0) + (protoPlaylistMetadata.total_length != null ? ProtoAdapter.c.a(6, protoPlaylistMetadata.total_length) : 0) + (protoPlaylistMetadata.description != null ? ProtoAdapter.i.a(7, protoPlaylistMetadata.description) : 0) + (protoPlaylistMetadata.pictures != null ? ProtoImageGroup.ADAPTER.a(8, protoPlaylistMetadata.pictures) : 0) + (protoPlaylistMetadata.followed != null ? ProtoAdapter.a.a(9, protoPlaylistMetadata.followed) : 0) + (protoPlaylistMetadata.published != null ? ProtoAdapter.a.a(10, protoPlaylistMetadata.published) : 0) + (protoPlaylistMetadata.browsable_offline != null ? ProtoAdapter.a.a(11, protoPlaylistMetadata.browsable_offline) : 0) + (protoPlaylistMetadata.description_from_annotate != null ? ProtoAdapter.a.a(12, protoPlaylistMetadata.description_from_annotate) : 0) + (protoPlaylistMetadata.picture_from_annotate != null ? ProtoAdapter.a.a(13, protoPlaylistMetadata.picture_from_annotate) : 0) + (protoPlaylistMetadata.format_list_type != null ? ProtoAdapter.i.a(14, protoPlaylistMetadata.format_list_type) : 0) + ProtoPlaylistFormatListAttribute.ADAPTER.a().a(15, protoPlaylistMetadata.format_list_attributes) + (protoPlaylistMetadata.can_report_annotation_abuse != null ? ProtoAdapter.a.a(16, protoPlaylistMetadata.can_report_annotation_abuse) : 0) + (protoPlaylistMetadata.is_loaded != null ? ProtoAdapter.a.a(17, protoPlaylistMetadata.is_loaded) : 0);
            if (protoPlaylistMetadata.made_for != null) {
                i = ProtoUser.ADAPTER.a(20, protoPlaylistMetadata.made_for);
            }
            return a + i + protoPlaylistMetadata.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b != 20) {
                    switch (b) {
                        case 1:
                            builder.link((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 3:
                            builder.owner((ProtoUser) ProtoUser.ADAPTER.a(whg));
                            break;
                        case 4:
                            builder.owned_by_self((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 5:
                            builder.collaborative((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 6:
                            builder.total_length((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 7:
                            builder.description((String) ProtoAdapter.i.a(whg));
                            break;
                        case 8:
                            builder.pictures((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(whg));
                            break;
                        case 9:
                            builder.followed((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 10:
                            builder.published((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 11:
                            builder.browsable_offline((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 12:
                            builder.description_from_annotate((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 13:
                            builder.picture_from_annotate((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 14:
                            builder.format_list_type((String) ProtoAdapter.i.a(whg));
                            break;
                        case 15:
                            builder.format_list_attributes.add(ProtoPlaylistFormatListAttribute.ADAPTER.a(whg));
                            break;
                        case 16:
                            builder.can_report_annotation_abuse((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 17:
                            builder.is_loaded((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    builder.made_for((ProtoUser) ProtoUser.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoPlaylistMetadata protoPlaylistMetadata = (ProtoPlaylistMetadata) obj;
            if (protoPlaylistMetadata.link != null) {
                ProtoAdapter.i.a(whh, 1, protoPlaylistMetadata.link);
            }
            if (protoPlaylistMetadata.name != null) {
                boolean z = true ^ true;
                ProtoAdapter.i.a(whh, 2, protoPlaylistMetadata.name);
            }
            if (protoPlaylistMetadata.owner != null) {
                int i = 6 >> 3;
                ProtoUser.ADAPTER.a(whh, 3, protoPlaylistMetadata.owner);
            }
            if (protoPlaylistMetadata.owned_by_self != null) {
                ProtoAdapter.a.a(whh, 4, protoPlaylistMetadata.owned_by_self);
            }
            if (protoPlaylistMetadata.collaborative != null) {
                ProtoAdapter.a.a(whh, 5, protoPlaylistMetadata.collaborative);
            }
            if (protoPlaylistMetadata.total_length != null) {
                ProtoAdapter.c.a(whh, 6, protoPlaylistMetadata.total_length);
            }
            if (protoPlaylistMetadata.description != null) {
                ProtoAdapter.i.a(whh, 7, protoPlaylistMetadata.description);
            }
            if (protoPlaylistMetadata.pictures != null) {
                ProtoImageGroup.ADAPTER.a(whh, 8, protoPlaylistMetadata.pictures);
            }
            if (protoPlaylistMetadata.followed != null) {
                ProtoAdapter.a.a(whh, 9, protoPlaylistMetadata.followed);
            }
            if (protoPlaylistMetadata.published != null) {
                ProtoAdapter.a.a(whh, 10, protoPlaylistMetadata.published);
            }
            if (protoPlaylistMetadata.browsable_offline != null) {
                ProtoAdapter.a.a(whh, 11, protoPlaylistMetadata.browsable_offline);
            }
            if (protoPlaylistMetadata.description_from_annotate != null) {
                ProtoAdapter.a.a(whh, 12, protoPlaylistMetadata.description_from_annotate);
            }
            if (protoPlaylistMetadata.picture_from_annotate != null) {
                ProtoAdapter.a.a(whh, 13, protoPlaylistMetadata.picture_from_annotate);
            }
            if (protoPlaylistMetadata.format_list_type != null) {
                ProtoAdapter.i.a(whh, 14, protoPlaylistMetadata.format_list_type);
            }
            ProtoPlaylistFormatListAttribute.ADAPTER.a().a(whh, 15, protoPlaylistMetadata.format_list_attributes);
            if (protoPlaylistMetadata.can_report_annotation_abuse != null) {
                ProtoAdapter.a.a(whh, 16, protoPlaylistMetadata.can_report_annotation_abuse);
            }
            if (protoPlaylistMetadata.is_loaded != null) {
                ProtoAdapter.a.a(whh, 17, protoPlaylistMetadata.is_loaded);
            }
            if (protoPlaylistMetadata.made_for != null) {
                ProtoUser.ADAPTER.a(whh, 20, protoPlaylistMetadata.made_for);
            }
            whh.a(protoPlaylistMetadata.a());
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
        this.format_list_attributes = whk.a("format_list_attributes", list);
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
        return a().equals(protoPlaylistMetadata.a()) && whk.a((Object) this.link, (Object) protoPlaylistMetadata.link) && whk.a((Object) this.name, (Object) protoPlaylistMetadata.name) && whk.a((Object) this.owner, (Object) protoPlaylistMetadata.owner) && whk.a((Object) this.owned_by_self, (Object) protoPlaylistMetadata.owned_by_self) && whk.a((Object) this.collaborative, (Object) protoPlaylistMetadata.collaborative) && whk.a((Object) this.total_length, (Object) protoPlaylistMetadata.total_length) && whk.a((Object) this.description, (Object) protoPlaylistMetadata.description) && whk.a((Object) this.pictures, (Object) protoPlaylistMetadata.pictures) && whk.a((Object) this.followed, (Object) protoPlaylistMetadata.followed) && whk.a((Object) this.published, (Object) protoPlaylistMetadata.published) && whk.a((Object) this.browsable_offline, (Object) protoPlaylistMetadata.browsable_offline) && whk.a((Object) this.description_from_annotate, (Object) protoPlaylistMetadata.description_from_annotate) && whk.a((Object) this.picture_from_annotate, (Object) protoPlaylistMetadata.picture_from_annotate) && whk.a((Object) this.format_list_type, (Object) protoPlaylistMetadata.format_list_type) && this.format_list_attributes.equals(protoPlaylistMetadata.format_list_attributes) && whk.a((Object) this.can_report_annotation_abuse, (Object) protoPlaylistMetadata.can_report_annotation_abuse) && whk.a((Object) this.is_loaded, (Object) protoPlaylistMetadata.is_loaded) && whk.a((Object) this.made_for, (Object) protoPlaylistMetadata.made_for);
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
            String str = "i sl,k=";
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
            String str2 = "d,_mbe lseo=wy_f";
            sb.append(", owned_by_self=");
            sb.append(this.owned_by_self);
        }
        if (this.collaborative != null) {
            String str3 = "btalo,ov=rcleiao";
            sb.append(", collaborative=");
            sb.append(this.collaborative);
        }
        if (this.total_length != null) {
            sb.append(", total_length=");
            sb.append(this.total_length);
        }
        if (this.description != null) {
            String str4 = "o nrcb=psdt,ii";
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.pictures != null) {
            String str5 = "tcr= ib,seu";
            sb.append(", pictures=");
            sb.append(this.pictures);
        }
        if (this.followed != null) {
            String str6 = "f,ol=odtlew";
            sb.append(", followed=");
            sb.append(this.followed);
        }
        if (this.published != null) {
            String str7 = "=uilbds,ppe ";
            sb.append(", published=");
            sb.append(this.published);
        }
        if (this.browsable_offline != null) {
            String str8 = "_wir,nfoltos beaelbf";
            sb.append(", browsable_offline=");
            sb.append(this.browsable_offline);
        }
        if (this.description_from_annotate != null) {
            String str9 = ",assotenocmedti=__r aipnrton";
            sb.append(", description_from_annotate=");
            sb.append(this.description_from_annotate);
        }
        if (this.picture_from_annotate != null) {
            sb.append(", picture_from_annotate=");
            sb.append(this.picture_from_annotate);
        }
        if (this.format_list_type != null) {
            String str10 = "ltomre,__y=t saptfi";
            sb.append(", format_list_type=");
            sb.append(this.format_list_type);
        }
        if (!this.format_list_attributes.isEmpty()) {
            String str11 = "ribmoiottsrauttsef l=__ta";
            sb.append(", format_list_attributes=");
            sb.append(this.format_list_attributes);
        }
        if (this.can_report_annotation_abuse != null) {
            String str12 = "a_n_ubnao=eerr tain,tob_cnapot";
            sb.append(", can_report_annotation_abuse=");
            sb.append(this.can_report_annotation_abuse);
        }
        if (this.is_loaded != null) {
            String str13 = "d_ieadb,lo s";
            sb.append(", is_loaded=");
            sb.append(this.is_loaded);
        }
        if (this.made_for != null) {
            String str14 = "o=a r,ftd_m";
            sb.append(", made_for=");
            sb.append(this.made_for);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
