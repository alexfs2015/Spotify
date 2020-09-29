package defpackage;

import org.json.JSONObject;

/* renamed from: chx reason: default package */
final /* synthetic */ class chx implements cpc {
    private final chw a;

    chx(chw chw) {
        this.a = chw;
    }

    public final Object a(Object obj) {
        chw chw = this.a;
        dsp.a(chw.a, (JSONObject) obj);
        chw.b.edit().putLong("js_last_update", bjl.l().a()).apply();
        return null;
    }
}
