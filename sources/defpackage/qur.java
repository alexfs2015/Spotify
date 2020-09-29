package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: qur reason: default package */
public abstract class qur implements Parcelable {

    /* renamed from: qur$a */
    public static abstract class a {
        public abstract a a(String str);

        public abstract qur a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    @JsonCreator
    public static qur create(@JsonProperty("section") String str, @JsonProperty("content_source") String str2) {
        return new quq(str, str2, null);
    }

    public static a e() {
        return new a();
    }

    public abstract String a();

    public final qur a(String str) {
        return d().a(str).a();
    }

    public abstract String b();

    public final qur b(String str) {
        return d().c(str).a();
    }

    public abstract String c();

    /* access modifiers changed from: 0000 */
    public abstract a d();
}
