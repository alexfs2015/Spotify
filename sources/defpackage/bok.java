package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bok reason: default package */
public final class bok extends bxw {
    public static final Creator<bok> CREATOR = new bsb();
    private int a;
    private int b;
    private int c;

    bok(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    static bok a(JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            char c2 = 65535;
            int hashCode = string.hashCode();
            if (hashCode != 3218) {
                if (hashCode != 103158) {
                    if (hashCode != 113729) {
                        if (hashCode == 99136405) {
                            if (string.equals("hdr10")) {
                                c2 = 1;
                            }
                        }
                    } else if (string.equals("sdr")) {
                        c2 = 3;
                    }
                } else if (string.equals("hdr")) {
                    c2 = 2;
                }
            } else if (string.equals("dv")) {
                c2 = 0;
            }
            if (c2 == 0) {
                i = 3;
            } else if (c2 == 1) {
                i = 2;
            } else if (c2 == 2) {
                i = 4;
            } else if (c2 != 3) {
                String.format(Locale.ROOT, "Unknown HDR type: %s", new Object[]{string});
                i = 0;
            } else {
                i = 1;
            }
            return new bok(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e) {
            String.format(Locale.ROOT, "Error while creating a VideoInfo instance from JSON: %s", new Object[]{e.getMessage()});
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bok)) {
            return false;
        }
        bok bok = (bok) obj;
        return this.b == bok.b && this.a == bok.a && this.c == bok.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 2, this.a);
        bxx.b(parcel, 3, this.b);
        bxx.b(parcel, 4, this.c);
        bxx.b(parcel, a2);
    }
}
