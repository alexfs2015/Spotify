package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import java.util.Comparator;

/* renamed from: emm reason: default package */
public final class emm implements Comparator<zzun> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzun zzun = (zzun) obj;
        zzun zzun2 = (zzun) obj2;
        emq emq = (emq) zzun.iterator();
        emq emq2 = (emq) zzun2.iterator();
        while (emq.hasNext() && emq2.hasNext()) {
            int compare = Integer.compare(zzun.a(emq.a()), zzun.a(emq2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzun.a(), zzun2.a());
    }
}
