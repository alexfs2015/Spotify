package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: sey reason: default package */
public abstract class sey {
    @JsonCreator
    public static sey create(boolean z, String str, String str2) {
        return new sew(Boolean.valueOf(z), str, str2);
    }

    public abstract Boolean a();

    public abstract String b();

    public abstract String c();
}
