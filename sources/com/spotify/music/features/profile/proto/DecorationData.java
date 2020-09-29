package com.spotify.music.features.profile.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class DecorationData extends Message<DecorationData, Builder> {
    public static final ProtoAdapter<DecorationData> ADAPTER = new a();
    public static final String DEFAULT_FACEBOOK_UID = "";
    public static final String DEFAULT_FIRST_NAME = "";
    public static final String DEFAULT_FULL_NAME = "";
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_LARGE_IMAGE_URL = "";
    public static final String DEFAULT_LAST_NAME = "";
    public static final Boolean DEFAULT_PROFILE_ANNOTATIONS = Boolean.FALSE;
    public static final Integer DEFAULT_SUBSCRIBER_COUNT = Integer.valueOf(0);
    public static final Boolean DEFAULT_TASTEMAKER = Boolean.FALSE;
    public static final String DEFAULT_USERNAME = "";
    public static final Boolean DEFAULT_VERIFIED = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    public final String facebook_uid;
    public final String first_name;
    public final String full_name;
    public final String image_url;
    public final String large_image_url;
    public final String last_name;
    public final Boolean profile_annotations;
    public final Integer subscriber_count;
    public final Boolean tastemaker;
    public final String username;
    public final Boolean verified;

    public static final class Builder extends com.squareup.wire.Message.a<DecorationData, Builder> {
        public String facebook_uid;
        public String first_name;
        public String full_name;
        public String image_url;
        public String large_image_url;
        public String last_name;
        public Boolean profile_annotations;
        public Integer subscriber_count;
        public Boolean tastemaker;
        public String username;
        public Boolean verified;

        public final DecorationData build() {
            DecorationData decorationData = new DecorationData(this.username, this.full_name, this.image_url, this.subscriber_count, this.large_image_url, this.first_name, this.last_name, this.facebook_uid, this.verified, this.tastemaker, this.profile_annotations, super.buildUnknownFields());
            return decorationData;
        }

        public final Builder facebook_uid(String str) {
            this.facebook_uid = str;
            return this;
        }

        public final Builder first_name(String str) {
            this.first_name = str;
            return this;
        }

        public final Builder full_name(String str) {
            this.full_name = str;
            return this;
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder large_image_url(String str) {
            this.large_image_url = str;
            return this;
        }

        public final Builder last_name(String str) {
            this.last_name = str;
            return this;
        }

        public final Builder profile_annotations(Boolean bool) {
            this.profile_annotations = bool;
            return this;
        }

        public final Builder subscriber_count(Integer num) {
            this.subscriber_count = num;
            return this;
        }

        public final Builder tastemaker(Boolean bool) {
            this.tastemaker = bool;
            return this;
        }

        public final Builder username(String str) {
            this.username = str;
            return this;
        }

        public final Builder verified(Boolean bool) {
            this.verified = bool;
            return this;
        }
    }

    static final class a extends ProtoAdapter<DecorationData> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, DecorationData.class);
        }

        public final /* synthetic */ int a(Object obj) {
            DecorationData decorationData = (DecorationData) obj;
            int i = 0;
            int a = (decorationData.username != null ? ProtoAdapter.i.a(1, decorationData.username) : 0) + (decorationData.full_name != null ? ProtoAdapter.i.a(2, decorationData.full_name) : 0) + (decorationData.image_url != null ? ProtoAdapter.i.a(3, decorationData.image_url) : 0) + (decorationData.subscriber_count != null ? ProtoAdapter.b.a(4, decorationData.subscriber_count) : 0) + (decorationData.large_image_url != null ? ProtoAdapter.i.a(5, decorationData.large_image_url) : 0) + (decorationData.first_name != null ? ProtoAdapter.i.a(6, decorationData.first_name) : 0) + (decorationData.last_name != null ? ProtoAdapter.i.a(7, decorationData.last_name) : 0) + (decorationData.facebook_uid != null ? ProtoAdapter.i.a(8, decorationData.facebook_uid) : 0) + (decorationData.verified != null ? ProtoAdapter.a.a(10, decorationData.verified) : 0) + (decorationData.tastemaker != null ? ProtoAdapter.a.a(11, decorationData.tastemaker) : 0);
            if (decorationData.profile_annotations != null) {
                i = ProtoAdapter.a.a(12, decorationData.profile_annotations);
            }
            return a + i + decorationData.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.username((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.full_name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 3:
                            builder.image_url((String) ProtoAdapter.i.a(whg));
                            break;
                        case 4:
                            builder.subscriber_count((Integer) ProtoAdapter.b.a(whg));
                            break;
                        case 5:
                            builder.large_image_url((String) ProtoAdapter.i.a(whg));
                            break;
                        case 6:
                            builder.first_name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 7:
                            builder.last_name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 8:
                            builder.facebook_uid((String) ProtoAdapter.i.a(whg));
                            break;
                        case 10:
                            builder.verified((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 11:
                            builder.tastemaker((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 12:
                            builder.profile_annotations((Boolean) ProtoAdapter.a.a(whg));
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
            DecorationData decorationData = (DecorationData) obj;
            if (decorationData.username != null) {
                ProtoAdapter.i.a(whh, 1, decorationData.username);
            }
            if (decorationData.full_name != null) {
                ProtoAdapter.i.a(whh, 2, decorationData.full_name);
            }
            if (decorationData.image_url != null) {
                ProtoAdapter.i.a(whh, 3, decorationData.image_url);
            }
            if (decorationData.subscriber_count != null) {
                ProtoAdapter.b.a(whh, 4, decorationData.subscriber_count);
            }
            if (decorationData.large_image_url != null) {
                ProtoAdapter.i.a(whh, 5, decorationData.large_image_url);
            }
            if (decorationData.first_name != null) {
                ProtoAdapter.i.a(whh, 6, decorationData.first_name);
            }
            if (decorationData.last_name != null) {
                ProtoAdapter.i.a(whh, 7, decorationData.last_name);
            }
            if (decorationData.facebook_uid != null) {
                ProtoAdapter.i.a(whh, 8, decorationData.facebook_uid);
            }
            if (decorationData.verified != null) {
                ProtoAdapter.a.a(whh, 10, decorationData.verified);
            }
            if (decorationData.tastemaker != null) {
                ProtoAdapter.a.a(whh, 11, decorationData.tastemaker);
            }
            if (decorationData.profile_annotations != null) {
                ProtoAdapter.a.a(whh, 12, decorationData.profile_annotations);
            }
            whh.a(decorationData.a());
        }
    }

    public DecorationData(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.username = str;
        this.full_name = str2;
        this.image_url = str3;
        this.subscriber_count = num;
        this.large_image_url = str4;
        this.first_name = str5;
        this.last_name = str6;
        this.facebook_uid = str7;
        this.verified = bool;
        this.tastemaker = bool2;
        this.profile_annotations = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationData)) {
            return false;
        }
        DecorationData decorationData = (DecorationData) obj;
        return a().equals(decorationData.a()) && whk.a((Object) this.username, (Object) decorationData.username) && whk.a((Object) this.full_name, (Object) decorationData.full_name) && whk.a((Object) this.image_url, (Object) decorationData.image_url) && whk.a((Object) this.subscriber_count, (Object) decorationData.subscriber_count) && whk.a((Object) this.large_image_url, (Object) decorationData.large_image_url) && whk.a((Object) this.first_name, (Object) decorationData.first_name) && whk.a((Object) this.last_name, (Object) decorationData.last_name) && whk.a((Object) this.facebook_uid, (Object) decorationData.facebook_uid) && whk.a((Object) this.verified, (Object) decorationData.verified) && whk.a((Object) this.tastemaker, (Object) decorationData.tastemaker) && whk.a((Object) this.profile_annotations, (Object) decorationData.profile_annotations);
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
        String str2 = this.full_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.subscriber_count;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        String str4 = this.large_image_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.first_name;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.last_name;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.facebook_uid;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool = this.verified;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.tastemaker;
        int hashCode11 = (hashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.profile_annotations;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        int i3 = hashCode11 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.username != null) {
            sb.append(", username=");
            sb.append(this.username);
        }
        if (this.full_name != null) {
            sb.append(", full_name=");
            sb.append(this.full_name);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        if (this.subscriber_count != null) {
            sb.append(", subscriber_count=");
            sb.append(this.subscriber_count);
        }
        if (this.large_image_url != null) {
            sb.append(", large_image_url=");
            sb.append(this.large_image_url);
        }
        if (this.first_name != null) {
            sb.append(", first_name=");
            sb.append(this.first_name);
        }
        if (this.last_name != null) {
            sb.append(", last_name=");
            sb.append(this.last_name);
        }
        if (this.facebook_uid != null) {
            sb.append(", facebook_uid=");
            sb.append(this.facebook_uid);
        }
        if (this.verified != null) {
            sb.append(", verified=");
            sb.append(this.verified);
        }
        if (this.tastemaker != null) {
            sb.append(", tastemaker=");
            sb.append(this.tastemaker);
        }
        if (this.profile_annotations != null) {
            sb.append(", profile_annotations=");
            sb.append(this.profile_annotations);
        }
        StringBuilder replace = sb.replace(0, 2, "DecorationData{");
        replace.append('}');
        return replace.toString();
    }
}
