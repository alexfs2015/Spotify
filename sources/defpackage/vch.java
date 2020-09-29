package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;

/* renamed from: vch reason: default package */
public final class vch implements vck {
    private final fpt a;
    private final vcj b;

    public vch(fpt fpt, vcj vcj) {
        this.a = fpt;
        this.b = vcj;
    }

    public final Optional<View> a(ViewGroup viewGroup) {
        String str = (String) this.a.a(vci.a);
        if ("treatment1".equals(str) || "treatment2".equals(str) || "treatment3".equals(str)) {
            return Optional.b(this.b.a(viewGroup));
        }
        return Optional.e();
    }
}
