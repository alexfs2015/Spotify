package defpackage;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;

/* renamed from: mun reason: default package */
public final class mun implements gwk, gwl {
    private final ImmutableMap<String, gwi<? extends View>> a;
    private final ImmutableList<String> b = ImmutableList.a((Collection<? extends E>) this.a.keySet());

    public mun(mvd mvd, mvb mvb, muz muz) {
        this.a = ImmutableMap.g().b("feed:releaseItem", mvd).b("feed:followRecs", mvb).b("feed:expandableRelease", muz).b();
    }

    public final gwi<?> getBinder(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.b.size()) {
            return null;
        }
        return (gwi) this.a.get(this.b.get(i2));
    }

    public final int resolve(hcm hcm) {
        return this.b.indexOf(hcm.componentId().id()) + 1;
    }
}
