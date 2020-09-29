package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: boe reason: default package */
public final class boe {
    String a;
    String b;
    int c;
    String d;
    bod e;
    int f;
    List<bof> g;
    int h;
    long i;

    /* renamed from: boe$a */
    public static class a {
        private final boe a = new boe(0);

        public final a a(JSONObject jSONObject) {
            boe boe = this.a;
            boe.a();
            if (jSONObject != null) {
                boe.a = jSONObject.optString("id", null);
                boe.b = jSONObject.optString("entity", null);
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
                        boe.c = 1;
                        break;
                    case 1:
                        boe.c = 2;
                        break;
                    case 2:
                        boe.c = 3;
                        break;
                    case 3:
                        boe.c = 4;
                        break;
                    case 4:
                        boe.c = 5;
                        break;
                    case 5:
                        boe.c = 6;
                        break;
                    case 6:
                        boe.c = 7;
                        break;
                    case 7:
                        boe.c = 8;
                        break;
                    case 8:
                        boe.c = 9;
                        break;
                }
                boe.d = jSONObject.optString("name", null);
                String str = "containerMetadata";
                if (jSONObject.has(str)) {
                    boe.e = new bod(new defpackage.bod.a().a(jSONObject.optJSONObject(str)).a, 0);
                }
                Integer a2 = eit.a(jSONObject.optString("repeatMode"));
                if (a2 != null) {
                    boe.f = a2.intValue();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                if (optJSONArray != null) {
                    boe.g = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            try {
                                boe.g.add(new bof(optJSONObject));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
                boe.h = jSONObject.optInt("startIndex", boe.h);
                String str2 = "startTime";
                if (jSONObject.has(str2)) {
                    boe.i = (long) (jSONObject.optDouble(str2, (double) boe.i) * 1000.0d);
                }
            }
            return this;
        }

        public final boe a() {
            return new boe(this.a, 0);
        }
    }

    private boe() {
        a();
    }

    /* synthetic */ boe(byte b2) {
        this();
    }

    private boe(boe boe) {
        this.a = boe.a;
        this.b = boe.b;
        this.c = boe.c;
        this.d = boe.d;
        this.e = boe.e;
        this.f = boe.f;
        this.g = boe.g;
        this.h = boe.h;
        this.i = boe.i;
    }

    /* synthetic */ boe(boe boe, byte b2) {
        this(boe);
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
        if (!(obj instanceof boe)) {
            return false;
        }
        boe boe = (boe) obj;
        return TextUtils.equals(this.a, boe.a) && TextUtils.equals(this.b, boe.b) && this.c == boe.c && TextUtils.equals(this.d, boe.d) && bxm.a(this.e, boe.e) && this.f == boe.f && bxm.a(this.g, boe.g) && this.h == boe.h && this.i == boe.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i)});
    }
}
