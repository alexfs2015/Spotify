package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* renamed from: dmq reason: default package */
final class dmq implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ dmp b;

    dmq(dmp dmp, View view) {
        this.b = dmp;
        this.a = view;
    }

    public final void run() {
        dmp dmp = this.b;
        View view = this.a;
        try {
            dmj dmj = new dmj(dmp.f, dmp.g, dmp.h, dmp.i, dmp.j, dmp.k, dmp.l);
            Context b2 = bkc.h().b();
            if (b2 != null && !TextUtils.isEmpty(dmp.m)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) dqe.f().a(dtg.ab), "id", b2.getPackageName()));
                if (str != null && str.equals(dmp.m)) {
                    return;
                }
            }
            dmt a2 = dmp.a(view, dmj);
            dmj.c();
            if (a2.a != 0 || a2.b != 0) {
                if (a2.b != 0 || dmj.b != 0) {
                    if (a2.b != 0 || !dmp.d.a(dmj)) {
                        dmp.d.c(dmj);
                    }
                }
            }
        } catch (Exception e) {
            cml.a("Exception in fetchContentOnUIThread", e);
            dmp.e.a(e, "ContentFetchTask.fetchContent");
        }
    }
}
