package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bwd reason: default package */
public final class bwd extends bxf {
    public static final Creator<bwd> CREATOR = new bwe();
    public final Uri a;
    private final int b;
    private final int c;
    private final int d;

    bwd(int i, Uri uri, int i2, int i3) {
        this.b = i;
        this.a = uri;
        this.c = i2;
        this.d = i3;
    }

    private bwd(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public bwd(JSONObject jSONObject) {
        this(a(jSONObject), jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    private static Uri a(JSONObject jSONObject) {
        String str = "url";
        if (jSONObject.has(str)) {
            try {
                return Uri.parse(jSONObject.getString(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), this.a.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bwd)) {
            bwd bwd = (bwd) obj;
            return bwv.a(this.a, bwd.a) && this.c == bwd.c && this.d == bwd.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.b);
        bxg.a(parcel, 2, (Parcelable) this.a, i, false);
        bxg.b(parcel, 3, this.c);
        bxg.b(parcel, 4, this.d);
        bxg.b(parcel, a2);
    }
}
