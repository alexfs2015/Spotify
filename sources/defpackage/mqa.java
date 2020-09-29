package defpackage;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;

/* renamed from: mqa reason: default package */
public final class mqa implements guk, gul {
    private final ImmutableMap<String, gui<? extends View>> a;
    private final ImmutableList<String> b = ImmutableList.a((Collection<? extends E>) this.a.keySet());

    public mqa(mqs mqs, mqq mqq, mqo mqo) {
        this.a = ImmutableMap.g().b("feed:releaseItem", mqs).b("feed:followRecs", mqq).b("feed:expandableRelease", mqo).b();
    }

    public final gui<?> getBinder(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.b.size()) {
            return null;
        }
        return (gui) this.a.get(this.b.get(i2));
    }

    public final int resolve(gzt gzt) {
        return this.b.indexOf(gzt.componentId().id()) + 1;
    }
}
