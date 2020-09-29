package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* renamed from: dlz reason: default package */
final class dlz implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ dly b;

    dlz(dly dly, View view) {
        this.b = dly;
        this.a = view;
    }

    public final void run() {
        dly dly = this.b;
        View view = this.a;
        try {
            dls dls = new dls(dly.f, dly.g, dly.h, dly.i, dly.j, dly.k, dly.l);
            Context b2 = bjl.h().b();
            if (b2 != null && !TextUtils.isEmpty(dly.m)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) dpn.f().a(dsp.ab), "id", b2.getPackageName()));
                if (str != null && str.equals(dly.m)) {
                    return;
                }
            }
            dmc a2 = dly.a(view, dls);
            dls.c();
            if (a2.a != 0 || a2.b != 0) {
                if (a2.b != 0 || dls.b != 0) {
                    if (a2.b != 0 || !dly.d.a(dls)) {
                        dly.d.c(dls);
                    }
                }
            }
        } catch (Exception e) {
            clu.a("Exception in fetchContentOnUIThread", e);
            dly.e.a(e, "ContentFetchTask.fetchContent");
        }
    }
}
