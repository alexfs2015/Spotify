package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import java.util.Comparator;

/* renamed from: elv reason: default package */
public final class elv implements Comparator<zzun> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzun zzun = (zzun) obj;
        zzun zzun2 = (zzun) obj2;
        elz elz = (elz) zzun.iterator();
        elz elz2 = (elz) zzun2.iterator();
        while (elz.hasNext() && elz2.hasNext()) {
            int compare = Integer.compare(zzun.a(elz.a()), zzun.a(elz2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzun.a(), zzun2.a());
    }
}
