package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: mwz reason: default package */
public abstract class mwz {
    @JsonCreator
    public static mwz create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("album_type") String str3, @JsonProperty("artist_pick_message") String str4, @JsonProperty("timestamp") Long l, @JsonProperty("artists") List<mwo> list, @JsonProperty("image_url") String str5, @JsonProperty("interacted") boolean z, @JsonProperty("tracks") List<mxb> list2) {
        mwt mwt = new mwt(str, str2, str3, str4, l, list, str5, z, list2);
        return mwt;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract Long e();

    public abstract List<mwo> f();

    public abstract String g();

    public abstract boolean h();

    public abstract List<mxb> i();
}
