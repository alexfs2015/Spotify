package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kbw reason: default package */
public final class kbw {
    public final String a;
    public final int b;
    public final String c;
    private final String d;

    private kbw(String str, int i, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str3;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbw)) {
            return false;
        }
        kbw kbw = (kbw) obj;
        if (this.b != kbw.b) {
            return false;
        }
        String str = this.a;
        if (str == null ? kbw.a != null : !str.equals(kbw.a)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? kbw.c != null : !str2.equals(kbw.c)) {
            return false;
        }
        String str3 = this.d;
        return str3 == null ? kbw.d == null : str3.equals(kbw.d);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMetadata{mUrl='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", mBitrate=");
        sb.append(this.b);
        sb.append(", mMimeType='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mEncryption='");
        sb.append(this.d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static List<kbw> a(String str) {
        String str2 = "mimeType";
        String str3 = "encryption";
        String str4 = "bitrate";
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                Logger.e("Media manifest is empty", new Object[0]);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("url");
                if (string != null) {
                    int i2 = jSONObject.has(str4) ? jSONObject.getInt(str4) : -1;
                    String str5 = null;
                    String string2 = jSONObject.has(str3) ? jSONObject.getString(str3) : null;
                    if (jSONObject.has(str2)) {
                        str5 = jSONObject.getString(str2);
                    }
                    arrayList.add(new kbw(string, i2, string2, str5));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            Logger.e("Error parsing media manifest", new Object[0]);
            return Collections.emptyList();
        }
    }
}
