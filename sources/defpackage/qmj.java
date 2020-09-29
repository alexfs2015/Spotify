package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: qmj reason: default package */
public abstract class qmj implements Parcelable {

    /* renamed from: qmj$a */
    public static abstract class a {
        public abstract a a(String str);

        public abstract qmj a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    /* access modifiers changed from: 0000 */
    public abstract a d();

    @JsonCreator
    public static qmj create(@JsonProperty("section") String str, @JsonProperty("content_source") String str2) {
        return new qmi(str, str2, null);
    }

    public static a e() {
        return new a();
    }

    public final qmj a(String str) {
        return d().a(str).a();
    }

    public final qmj b(String str) {
        return d().c(str).a();
    }
}
