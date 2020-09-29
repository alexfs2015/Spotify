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

/* renamed from: nod reason: default package */
public final class nod implements noh {
    private final nkf a;

    public nod(nkf nkf) {
        this.a = nkf;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(List list, hcm hcm) {
        if (!a(hcm)) {
            return Collections.singleton(hcm);
        }
        ArrayList a2 = Lists.a(2);
        hco text = hcm.text();
        if (!fbo.a(text.title())) {
            a2.add(hcx.builder().a((hck) HubsGlueSectionHeader.SECTION_HEADER).a(text).a());
        }
        a2.add(hcm.toBuilder().a(list).a());
        return a2;
    }

    private static boolean a(hcm hcm) {
        if (hcm != null) {
            if ("home:recentlyPlayedCarousel".equals(hcm.componentId().id())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(hcm hcm) {
        return !a(hcm);
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        Object obj3;
        hcs hcs = (hcs) obj;
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj2;
        Iterator it = hcs.body().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (a((hcm) it.next())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return hcs;
        }
        fcp a2 = fcp.a((Iterable<E>) hcs.body());
        Iterable a3 = a2.a();
        fbp.a(a3);
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
        List a5 = this.a.call(recentlyPlayedItems, ((hcm) obj3).logging().string("ui:source", ""));
        return hcs.toBuilder().a((List<? extends hcm>) ImmutableList.a((a5.isEmpty() ? a2.a((fbq<? super E>) $$Lambda$nod$aJIvHPrZOnZDee489MkUeL8CzM.INSTANCE) : a2.b((Function<? super E, ? extends Iterable<? extends T>>) new $$Lambda$nod$ZKMCJpVNnMdGIx6pHZym8EtuKn4<Object,Object>(a5))).a())).a();
    }
}
