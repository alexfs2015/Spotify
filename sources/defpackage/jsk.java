package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: jsk reason: default package */
public class jsk implements jsn {
    private final Context a;

    public jsk(Context context) {
        this.a = context;
    }

    public final View a(ViewGroup viewGroup) {
        return fqv.e().a(this.a, viewGroup).getView();
    }

    public void a(int i, View view, String str, String str2, boolean z) {
        fsm fsm = (fsm) fbp.a(fqv.a(view, fsm.class));
        fsm.a((CharSequence) str);
        fsm.a(str2);
        fsm.b(z);
    }
}
