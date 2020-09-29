package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: bol reason: default package */
public final class bol extends bxf {
    public static final Creator<bol> CREATOR = new bpm();
    public final String a;
    public final int b;
    public final String c;

    /* renamed from: bol$a */
    public static final class a {
        private String a;

        public final a a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.a = str;
                return this;
            }
            throw new IllegalArgumentException("action cannot be null or an empty string.");
        }
    }

    bol(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, 3, this.b);
        bxg.a(parcel, 4, this.c, false);
        bxg.b(parcel, a2);
    }
}
