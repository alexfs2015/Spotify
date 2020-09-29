package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aki reason: default package */
public final class aki implements Parcelable {
    public static final Creator<aki> CREATOR = new Creator<aki>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aki[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aki(parcel, 0);
        }
    };
    /* access modifiers changed from: private */
    public static final String b = aki.class.getSimpleName();
    public final String a;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Uri g;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ aki(Parcel parcel, byte b2) {
        this(parcel);
    }

    public static aki a() {
        return akk.a().b;
    }

    public static void a(aki aki) {
        akk.a().a(aki, true);
    }

    public static void b() {
        aju a2 = aju.a();
        if (!aju.b()) {
            a(null);
        } else {
            amw.a(a2.e, (a) new a() {
                public final void a(JSONObject jSONObject) {
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        aki aki = new aki(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null);
                        aki.a(aki);
                    }
                }

                public final void a(FacebookException facebookException) {
                    String d = aki.b;
                    StringBuilder sb = new StringBuilder("Got unexpected exception: ");
                    sb.append(facebookException);
                    Log.e(d, sb.toString());
                }
            });
        }
    }

    public aki(String str, String str2, String str3, String str4, String str5, Uri uri) {
        amx.a(str, "id");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.a = str5;
        this.g = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aki)) {
            return false;
        }
        aki aki = (aki) obj;
        if (this.c.equals(aki.c) && this.d == null) {
            return aki.d == null;
        }
        if (this.d.equals(aki.d) && this.e == null) {
            return aki.e == null;
        }
        if (this.e.equals(aki.e) && this.f == null) {
            return aki.f == null;
        }
        if (this.f.equals(aki.f) && this.a == null) {
            return aki.a == null;
        }
        if (!this.a.equals(aki.a) || this.g != null) {
            return this.g.equals(aki.g);
        }
        return aki.g == null;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() + 527;
        String str = this.d;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.e;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.a;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.g;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    /* access modifiers changed from: 0000 */
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.c);
            jSONObject.put("first_name", this.d);
            jSONObject.put("middle_name", this.e);
            jSONObject.put("last_name", this.f);
            jSONObject.put("name", this.a);
            if (this.g == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.g.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    aki(JSONObject jSONObject) {
        Uri uri = null;
        this.c = jSONObject.optString("id", null);
        this.d = jSONObject.optString("first_name", null);
        this.e = jSONObject.optString("middle_name", null);
        this.f = jSONObject.optString("last_name", null);
        this.a = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.g = uri;
    }

    private aki(Parcel parcel) {
        Uri uri;
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.a = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.g = uri;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        Uri uri = this.g;
        parcel.writeString(uri == null ? null : uri.toString());
    }
}
