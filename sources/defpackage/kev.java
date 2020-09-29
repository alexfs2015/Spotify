package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;

/* renamed from: kev reason: default package */
public final class kev extends WazeBannerModel {
    private final Type a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    /* renamed from: kev$a */
    public static final class a extends com.spotify.mobile.android.waze.model.WazeBannerModel.a {
        private Type a;
        private Integer b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a a(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a a(Type type) {
            if (type != null) {
                this.a = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a a(String str) {
            this.d = str;
            return this;
        }

        public final WazeBannerModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" type");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" icon");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" action");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                kev kev = new kev(this.a, this.b.intValue(), this.c.intValue(), this.d, this.e, this.f, this.g, this.h, this.i, 0);
                return kev;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a b(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a b(String str) {
            this.e = str;
            return this;
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a c(String str) {
            this.f = str;
            return this;
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a d(String str) {
            this.g = str;
            return this;
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a e(String str) {
            this.h = str;
            return this;
        }

        public final com.spotify.mobile.android.waze.model.WazeBannerModel.a f(String str) {
            this.i = str;
            return this;
        }
    }

    private kev(Type type, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = type;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    /* synthetic */ kev(Type type, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, byte b2) {
        this(type, i2, i3, str, str2, str3, str4, str5, str6);
    }

    public final Type a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WazeBannerModel) {
            WazeBannerModel wazeBannerModel = (WazeBannerModel) obj;
            if (this.a.equals(wazeBannerModel.a()) && this.b == wazeBannerModel.b() && this.c == wazeBannerModel.c()) {
                String str = this.d;
                if (str != null ? str.equals(wazeBannerModel.d()) : wazeBannerModel.d() == null) {
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(wazeBannerModel.e()) : wazeBannerModel.e() == null) {
                        String str3 = this.f;
                        if (str3 != null ? str3.equals(wazeBannerModel.f()) : wazeBannerModel.f() == null) {
                            String str4 = this.g;
                            if (str4 != null ? str4.equals(wazeBannerModel.g()) : wazeBannerModel.g() == null) {
                                String str5 = this.h;
                                if (str5 != null ? str5.equals(wazeBannerModel.h()) : wazeBannerModel.h() == null) {
                                    String str6 = this.i;
                                    return str6 != null ? str6.equals(wazeBannerModel.i()) : wazeBannerModel.i() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.h;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.i;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode6 ^ i2;
    }

    public final String i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WazeBannerModel{type=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", distance=");
        sb.append(this.d);
        sb.append(", distanceDisplay=");
        sb.append(this.e);
        sb.append(", exit=");
        sb.append(this.f);
        sb.append(", text=");
        sb.append(this.g);
        sb.append(", clarification=");
        sb.append(this.h);
        sb.append(", trigger=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
