package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: pkn reason: default package */
public abstract class pkn implements Parcelable, pkm {
    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    @JsonCreator
    public static pkn create(int i, String str, String str2, String str3) {
        return new pkj(i, str, str2, str3);
    }
}
