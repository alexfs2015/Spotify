package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: csg reason: default package */
public final class csg {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;

    public csg(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", dtg.B);
        this.b = b(jSONObject, "byte_buffer_precache_limit", dtg.m);
        this.c = b(jSONObject, "exo_cache_buffer_size", dtg.p);
        this.d = b(jSONObject, "exo_connect_timeout_millis", dtg.i);
        this.e = c(jSONObject, "exo_player_version", dtg.h);
        this.f = b(jSONObject, "exo_read_timeout_millis", dtg.j);
        this.g = b(jSONObject, "load_check_interval_bytes", dtg.k);
        this.h = b(jSONObject, "player_precache_limit", dtg.l);
        this.i = a(jSONObject, "use_cache_data_source", dtg.cF);
    }

    private static boolean a(JSONObject jSONObject, String str, dsw<Boolean> dsw) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) dqe.f().a(dsw)).booleanValue();
    }

    private static int b(JSONObject jSONObject, String str, dsw<Integer> dsw) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) dqe.f().a(dsw)).intValue();
    }

    private static String c(JSONObject jSONObject, String str, dsw<String> dsw) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) dqe.f().a(dsw);
    }
}
