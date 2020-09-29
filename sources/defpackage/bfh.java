package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: bfh reason: default package */
public final class bfh implements bgl<Object> {
    private final bfr a;

    public bfh(bfr bfr) {
        this.a = bfr;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.a != null) {
            if (((String) map.get("name")) == null) {
                cow.a(4);
            }
            Bundle a2 = a((String) map.get(LogMessage.SEVERITY_INFO));
            if (a2 == null) {
                clu.a("Failed to convert ad metadata to Bundle.");
            } else {
                this.a.a(a2);
            }
        }
    }

    private static Bundle a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                Object obj = jSONObject.get(str2);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else {
                        String str3 = "Unsupported type for key:";
                        String valueOf = String.valueOf(str2);
                        if (valueOf.length() != 0) {
                            str3.concat(valueOf);
                        } else {
                            new String(str3);
                        }
                        cow.a(5);
                    }
                }
            }
            return bundle;
        } catch (JSONException e) {
            clu.a("Failed to convert ad metadata to JSON.", e);
            return null;
        }
    }
}
