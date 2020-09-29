package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: jpz reason: default package */
public class jpz implements jqc {
    private final Context a;

    public jpz(Context context) {
        this.a = context;
    }

    public final View a(ViewGroup viewGroup) {
        return fqb.e().a(this.a, viewGroup).getView();
    }

    public void a(int i, View view, String str, String str2, boolean z) {
        frs frs = (frs) fay.a(fqb.a(view, frs.class));
        frs.a((CharSequence) str);
        frs.a(str2);
        frs.b(z);
    }
}
