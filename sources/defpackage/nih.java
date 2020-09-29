package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: nih reason: default package */
public final class nih implements nil {
    private final neq a;

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        Object obj3;
        fbx fbx;
        gzz gzz = (gzz) obj;
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj2;
        Iterator it = gzz.body().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (a((gzt) it.next())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return gzz;
        }
        fbx a2 = fbx.a((Iterable<E>) gzz.body());
        Iterable a3 = a2.a();
        fay.a(a3);
        if (a3 instanceof List) {
            obj3 = ((List) a3).get(i);
        } else {
            Iterator it2 = a3.iterator();
            String str = "position (";
            if (i >= 0) {
                int a4 = Iterators.a(it2, i);
                if (it2.hasNext()) {
                    obj3 = it2.next();
                } else {
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(i);
                    sb.append(") must be less than the number of elements that remained (");
                    sb.append(a4);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(i);
                sb2.append(") must not be negative");
                throw new IndexOutOfBoundsException(sb2.toString());
            }
        }
        List a5 = this.a.call(recentlyPlayedItems, ((gzt) obj3).logging().string("ui:source", ""));
        if (a5.isEmpty()) {
            fbx = a2.a((faz<? super E>) $$Lambda$nih$rIUatUSNM4NVlU0u5PwclbZPnWI.INSTANCE);
        } else {
            fbx = a2.b((Function<? super E, ? extends Iterable<? extends T>>) new $$Lambda$nih$JTYMhHZV5rDoLgdMoJZ9XRGrVE<Object,Object>(a5));
        }
        return gzz.toBuilder().a((List<? extends gzt>) ImmutableList.a(fbx.a())).a();
    }

    public nih(neq neq) {
        this.a = neq;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(gzt gzt) {
        return !a(gzt);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(List list, gzt gzt) {
        if (!a(gzt)) {
            return Collections.singleton(gzt);
        }
        ArrayList a2 = Lists.a(2);
        gzv text = gzt.text();
        if (!fax.a(text.title())) {
            a2.add(hae.builder().a((gzr) HubsGlueSectionHeader.SECTION_HEADER).a(text).a());
        }
        a2.add(gzt.toBuilder().a(list).a());
        return a2;
    }

    private static boolean a(gzt gzt) {
        if (gzt != null) {
            if ("home:recentlyPlayedCarousel".equals(gzt.componentId().id())) {
                return true;
            }
        }
        return false;
    }
}
