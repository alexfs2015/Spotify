package defpackage;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: jsl reason: default package */
public final class jsl implements jsn {
    public final View a(ViewGroup viewGroup) {
        return fqv.e().c(viewGroup.getContext(), viewGroup).getView();
    }

    public final void a(int i, View view, String str, String str2, boolean z) {
        fsm fsm = (fsm) fqv.a(view, fsm.class);
        fsm.b(z);
        fsm.a((CharSequence) str);
    }
}
