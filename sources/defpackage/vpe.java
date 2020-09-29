package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: vpe reason: default package */
public final class vpe implements vph {
    private final fqn a;
    private final vpg b;

    public vpe(fqn fqn, vpg vpg) {
        this.a = fqn;
        this.b = vpg;
    }

    public final Optional<View> a(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"treatment1", "treatment2", "treatment3"}));
        return (hashSet.contains((String) this.a.a(vpf.a)) || hashSet.contains((String) this.a.a(vpf.b))) ? Optional.b(this.b.a(viewGroup)) : Optional.e();
    }
}
