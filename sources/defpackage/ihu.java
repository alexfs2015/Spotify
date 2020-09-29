package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.ihx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ihu reason: default package */
public final class ihu<T extends ihx> implements wuu<ihw, List<T>, List<ihv<T>>> {
    public final /* synthetic */ Object call(Object obj, Object obj2) {
        long j;
        long j2;
        ihw ihw = (ihw) obj;
        List list = (List) obj2;
        boolean z = ihw.c() && !ihw.d() && ihw.b() == 1.0d;
        int a = (int) ihw.a();
        int i = 0;
        while (true) {
            if (i < list.size()) {
                if (((ihx) list.get(i)).getTimestampMillis() == a) {
                    break;
                } else if (((ihx) list.get(i)).getTimestampMillis() > a) {
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
        if (a == 0) {
            j = 0;
        } else {
            j = (long) (a - ((ihx) list.get(i)).getTimestampMillis());
        }
        long j3 = j;
        while (i < size) {
            long timestampMillis = (long) ((ihx) list.get(i)).getTimestampMillis();
            int i2 = i + 1;
            if (i2 < list.size()) {
                j2 = (long) ((ihx) list.get(i2)).getTimestampMillis();
            } else {
                j2 = ihw.e();
            }
            ihv ihv = new ihv((ihx) list.get(i), j3, j2 - timestampMillis, z);
            arrayList.add(ihv);
            i = i2;
            j3 = 0;
        }
        return arrayList;
    }
}
