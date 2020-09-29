package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: crp reason: default package */
public final class crp {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;

    public crp(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", dsp.B);
        this.b = b(jSONObject, "byte_buffer_precache_limit", dsp.m);
        this.c = b(jSONObject, "exo_cache_buffer_size", dsp.p);
        this.d = b(jSONObject, "exo_connect_timeout_millis", dsp.i);
        this.e = c(jSONObject, "exo_player_version", dsp.h);
        this.f = b(jSONObject, "exo_read_timeout_millis", dsp.j);
        this.g = b(jSONObject, "load_check_interval_bytes", dsp.k);
        this.h = b(jSONObject, "player_precache_limit", dsp.l);
        this.i = a(jSONObject, "use_cache_data_source", dsp.cF);
    }

    private static boolean a(JSONObject jSONObject, String str, dsf<Boolean> dsf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) dpn.f().a(dsf)).booleanValue();
    }

    private static int b(JSONObject jSONObject, String str, dsf<Integer> dsf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) dpn.f().a(dsf)).intValue();
    }

    private static String c(JSONObject jSONObject, String str, dsf<String> dsf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) dpn.f().a(dsf);
    }
}
