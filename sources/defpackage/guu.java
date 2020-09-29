package defpackage;

import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.Map;

/* renamed from: guu reason: default package */
public final class guu extends guv {
    private final gux a;

    /* access modifiers changed from: protected */
    public final Parcelable a(Map<gzt, Parcelable> map) {
        if (map.isEmpty()) {
            return null;
        }
        xam xam = new xam();
        List<gzt> list = this.a.e;
        for (int i = 0; i < list.size(); i++) {
            Parcelable parcelable = (Parcelable) map.get(list.get(i));
            if (parcelable != null) {
                xam.put(i, parcelable);
            }
        }
        return xam;
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable, Map<gzt, Parcelable> map) {
        if (parcelable instanceof xam) {
            xam xam = (xam) parcelable;
            List<gzt> list = this.a.e;
            int size = list.size();
            for (int i = 0; i < xam.size(); i++) {
                int keyAt = xam.keyAt(i);
                if (keyAt >= size) {
                    Logger.d("Inconsistent saved state: position is %d but size is %d", Integer.valueOf(keyAt), Integer.valueOf(size));
                    return;
                }
                map.put(list.get(keyAt), xam.valueAt(i));
            }
        }
    }

    guu(gux gux) {
        super(gux.d);
        this.a = gux;
    }
}
