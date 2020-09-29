package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.ikk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ikh reason: default package */
public final class ikh<T extends ikk> implements xiz<ikj, List<T>, List<iki<T>>> {
    public final /* synthetic */ Object call(Object obj, Object obj2) {
        ikj ikj = (ikj) obj;
        List list = (List) obj2;
        boolean z = ikj.c() && !ikj.d() && ikj.b() == 1.0d;
        int a = (int) ikj.a();
        int i = 0;
        while (true) {
            if (i < list.size()) {
                if (((ikk) list.get(i)).getTimestampMillis() == a) {
                    break;
                } else if (((ikk) list.get(i)).getTimestampMillis() > a) {
                    i--;
                    break;
                } else {
                    i++;
                }
            } else {
                i = list.size() - 1;
                break;
            }
        }
        int size = z ? list.size() : i + 1;
        Logger.b("Annotations Player: Target annotation for position(%s) is at index: %s", Integer.valueOf(a), Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(size - i);
        long timestampMillis = a == 0 ? 0 : (long) (a - ((ikk) list.get(i)).getTimestampMillis());
        while (i < size) {
            int i2 = i + 1;
            iki iki = new iki((ikk) list.get(i), timestampMillis, (i2 < list.size() ? (long) ((ikk) list.get(i2)).getTimestampMillis() : ikj.e()) - ((long) ((ikk) list.get(i)).getTimestampMillis()), z);
            arrayList.add(iki);
            i = i2;
            timestampMillis = 0;
        }
        return arrayList;
    }
}
