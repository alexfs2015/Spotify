package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: kzw reason: default package */
public abstract class kzw implements Parcelable {

    /* renamed from: kzw$a */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(Intent intent);

        public abstract a a(hct hct);

        public abstract kzw a();
    }

    @JsonCreator
    public static kzw create(@JsonProperty("body") String str, @JsonProperty("header") String str2, @JsonProperty("primary_button") String str3, @JsonProperty("secondary_button") String str4, @JsonProperty("negative_button") String str5, @JsonProperty("loading_desc") String str6, @JsonProperty("image_uri") String str7) {
        kzv kzv = new kzv(str, str2, str3, str4, str5, str6, str7, 0, null, null);
        return kzv;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract long h();

    public abstract Intent i();

    public abstract hct j();

    public abstract a k();
}
