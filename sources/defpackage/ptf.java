package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: ptf reason: default package */
public abstract class ptf implements Parcelable, pte {
    @JsonCreator
    public static ptf create(int i, String str, String str2, String str3) {
        return new ptb(i, str, str2, str3);
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
