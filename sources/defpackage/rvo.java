package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: rvo reason: default package */
public abstract class rvo {
    public abstract Boolean a();

    public abstract String b();

    public abstract String c();

    @JsonCreator
    public static rvo create(boolean z, String str, String str2) {
        return new rvm(Boolean.valueOf(z), str, str2);
    }
}
