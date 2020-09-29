package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: bpc reason: default package */
public final class bpc extends bxw {
    public static final Creator<bpc> CREATOR = new bqd();
    public final String a;
    public final int b;
    public final String c;

    /* renamed from: bpc$a */
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

    bpc(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, 3, this.b);
        bxx.a(parcel, 4, this.c, false);
        bxx.b(parcel, a2);
    }
}
