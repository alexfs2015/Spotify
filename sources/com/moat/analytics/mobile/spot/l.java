package com.moat.analytics.mobile.spot;

import android.os.Build.VERSION;
import org.json.JSONArray;
import org.json.JSONObject;

class l {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private int d = 200;

    l(String str) {
        a(str);
    }

    private void a(String str) {
        String str2 = "in";
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("sa");
                boolean equals = string.equals("3f2ae9c1894282b5e0222f0d06bbf457191f816f");
                boolean equals2 = string.equals("8f1d08a2d6496191a5ebae8f0590f513e2619489");
                if ((string.equals("on") || equals || equals2) && !a(jSONObject) && !b(jSONObject)) {
                    this.a = true;
                    this.b = equals;
                    this.c = equals2;
                    if (this.c) {
                        this.b = true;
                    }
                }
                if (jSONObject.has(str2)) {
                    int i = jSONObject.getInt(str2);
                    if (i >= 100 && i <= 1000) {
                        this.d = i;
                    }
                }
                if (c(jSONObject)) {
                    ((k) MoatAnalytics.getInstance()).c = true;
                }
            } catch (Exception e) {
                this.a = false;
                this.b = false;
                this.d = 200;
                m.a(e);
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        String str = "ob";
        try {
            if (16 > VERSION.SDK_INT) {
                return true;
            }
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getInt(i) == VERSION.SDK_INT) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean b(JSONObject jSONObject) {
        String str = "ap";
        try {
            if (jSONObject.has(str)) {
                String b2 = new a().b();
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getString(i).contentEquals(b2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            m.a(e);
        }
        return false;
    }

    private boolean c(JSONObject jSONObject) {
        String str = "al";
        try {
            if (jSONObject.has(str)) {
                String b2 = new a().b();
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getString(i).contentEquals(b2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            m.a(e);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public d d() {
        return this.a ? d.ON : d.OFF;
    }
}
