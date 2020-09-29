package com.comscore.android.vce;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class m {
    JSONObject a;
    String b;

    m() {
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        String str = this.b;
        if (str != null) {
            try {
                this.a = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.b = str;
        a();
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            String str = "f";
            if (jSONObject.has(str)) {
                try {
                    return this.a.getString(str);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public Set<String> c() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            String str = "w";
            if (jSONObject.has(str)) {
                try {
                    return ad.b(this.a.getJSONArray(str));
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public Set<String> d() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            String str = "b";
            if (jSONObject.has(str)) {
                try {
                    return ad.b(this.a.getJSONArray(str));
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String[] e() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            String str = "v";
            if (jSONObject.has(str)) {
                try {
                    return ad.a(this.a.getJSONArray(str));
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String[] f() {
        String[] a2;
        String str = ":";
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            String str2 = "d";
            if (jSONObject.has(str2)) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : ad.a(this.a.getJSONArray(str2))) {
                        if (str3 != null && str3.length() > 0 && !str3.startsWith(str) && !str3.endsWith(str) && str3.startsWith("a:")) {
                            String[] split = str3.split(str);
                            if (split.length >= 2 && split.length <= 4) {
                                boolean z = true;
                                for (String trim : split) {
                                    if (trim.trim().length() == 0) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    arrayList.add(str3);
                                }
                            }
                        }
                    }
                    String[] strArr = new String[arrayList.size()];
                    arrayList.toArray(strArr);
                    return strArr;
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }
}
