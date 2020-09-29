package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: qpt reason: default package */
public abstract class qpt implements Parcelable {
    @JsonCreator
    public static qpt create(@JsonProperty("entityUri") String str, @JsonProperty("imageUri") String str2, @JsonProperty("title") String str3, @JsonProperty("subtitle") String str4) {
        return new qps(str, str2, str3, str4);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
