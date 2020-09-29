package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.util.Arrays;

/* renamed from: hfz reason: default package */
public final class hfz implements Parcelable {
    public static final Creator<hfz> CREATOR = new Creator<hfz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new hfz(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hfz[i];
        }
    };
    private final String[] a;

    private hfz(Parcel parcel) {
        this.a = parcel.createStringArray();
    }

    /* synthetic */ hfz(Parcel parcel, byte b) {
        this(parcel);
    }

    public hfz(String str) {
        if (str == null || str.isEmpty()) {
            this.a = new String[0];
            return;
        }
        this.a = str.split(";");
        d();
    }

    private void d() {
        int i = 0;
        while (true) {
            String[] strArr = this.a;
            if (i < strArr.length) {
                strArr[i] = strArr[i].trim();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r5 = this;
            java.lang.String[] r0 = r5.a
            int r1 = r0.length
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0014
            r0 = r0[r4]
            java.lang.String r1 = "creditcard_funds"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x0041
            java.lang.String[] r0 = r5.a
            int r1 = r0.length
            if (r1 != r2) goto L_0x0028
            r0 = r0[r4]
            java.lang.String r1 = "creditcard_refused"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 != 0) goto L_0x0041
            java.lang.String[] r0 = r5.a
            int r1 = r0.length
            if (r1 != r2) goto L_0x003c
            r0 = r0[r4]
            java.lang.String r1 = "paypal_refused"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            return r4
        L_0x0041:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfz.a():boolean");
    }

    public final int b() {
        if (a()) {
            String[] strArr = this.a;
            if (strArr.length >= 2) {
                try {
                    return Integer.parseInt(strArr[1]);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder("Failed to parse retry number of '");
                    sb.append(toString());
                    sb.append('\'');
                    Assertion.a(sb.toString(), (Throwable) e);
                }
            }
        }
        return -1;
    }

    public final boolean c() {
        String[] strArr = this.a;
        if (strArr.length == 3) {
            if ("opt-in-trial".equals(strArr[0])) {
                return true;
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfz)) {
            return false;
        }
        return Arrays.equals(this.a, ((hfz) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return TextUtils.join(";", this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.a);
    }
}
