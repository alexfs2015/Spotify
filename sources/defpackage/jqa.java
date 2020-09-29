package defpackage;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: jqa reason: default package */
public final class jqa implements jqc {
    public final View a(ViewGroup viewGroup) {
        return fqb.e().c(viewGroup.getContext(), viewGroup).getView();
    }

    public final void a(int i, View view, String str, String str2, boolean z) {
        frs frs = (frs) fqb.a(view, frs.class);
        frs.b(z);
        frs.a((CharSequence) str);
    }
}
