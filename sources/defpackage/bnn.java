package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnn reason: default package */
public final class bnn {
    String a;
    String b;
    int c;
    String d;
    bnm e;
    int f;
    List<bno> g;
    int h;
    long i;

    /* renamed from: bnn$a */
    public static class a {
        private final bnn a = new bnn(0);

        public final bnn a() {
            return new bnn(this.a, 0);
        }

        public final a a(JSONObject jSONObject) {
            bnn bnn = this.a;
            bnn.a();
            if (jSONObject != null) {
                bnn.a = jSONObject.optString("id", null);
                bnn.b = jSONObject.optString("entity", null);
                String optString = jSONObject.optString("queueType");
                char c = 65535;
                switch (optString.hashCode()) {
                    case -1803151310:
                        if (optString.equals("PODCAST_SERIES")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1758903120:
                        if (optString.equals("RADIO_STATION")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1632865838:
                        if (optString.equals("PLAYLIST")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1319760993:
                        if (optString.equals("AUDIOBOOK")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1088524588:
                        if (optString.equals("TV_SERIES")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 62359119:
                        if (optString.equals("ALBUM")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 73549584:
                        if (optString.equals("MOVIE")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 393100598:
                        if (optString.equals("VIDEO_PLAYLIST")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 902303413:
                        if (optString.equals("LIVE_TV")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        bnn.c = 1;
                        break;
                    case 1:
                        bnn.c = 2;
                        break;
                    case 2:
                        bnn.c = 3;
                        break;
                    case 3:
                        bnn.c = 4;
                        break;
                    case 4:
                        bnn.c = 5;
                        break;
                    case 5:
                        bnn.c = 6;
                        break;
                    case 6:
                        bnn.c = 7;
                        break;
                    case 7:
                        bnn.c = 8;
                        break;
                    case 8:
                        bnn.c = 9;
                        break;
                }
                bnn.d = jSONObject.optString("name", null);
                String str = "containerMetadata";
                if (jSONObject.has(str)) {
                    bnn.e = new bnm(new defpackage.bnm.a().a(jSONObject.optJSONObject(str)).a, 0);
                }
                Integer a2 = eic.a(jSONObject.optString("repeatMode"));
                if (a2 != null) {
                    bnn.f = a2.intValue();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                if (optJSONArray != null) {
                    bnn.g = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            try {
                                bnn.g.add(new bno(optJSONObject));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
                bnn.h = jSONObject.optInt("startIndex", bnn.h);
                String str2 = "startTime";
                if (jSONObject.has(str2)) {
                    bnn.i = (long) (jSONObject.optDouble(str2, (double) bnn.i) * 1000.0d);
                }
            }
            return this;
        }
    }

    private bnn() {
        a();
    }

    private bnn(bnn bnn) {
        this.a = bnn.a;
        this.b = bnn.b;
        this.c = bnn.c;
        this.d = bnn.d;
        this.e = bnn.e;
        this.f = bnn.f;
        this.g = bnn.g;
        this.h = bnn.h;
        this.i = bnn.i;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnn)) {
            return false;
        }
        bnn bnn = (bnn) obj;
        return TextUtils.equals(this.a, bnn.a) && TextUtils.equals(this.b, bnn.b) && this.c == bnn.c && TextUtils.equals(this.d, bnn.d) && bwv.a(this.e, bnn.e) && this.f == bnn.f && bwv.a(this.g, bnn.g) && this.h == bnn.h && this.i == bnn.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i)});
    }

    /* synthetic */ bnn(byte b2) {
        this();
    }

    /* synthetic */ bnn(bnn bnn, byte b2) {
        this(bnn);
    }
}
