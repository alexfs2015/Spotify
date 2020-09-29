package defpackage;

import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.Map;

/* renamed from: gwu reason: default package */
public final class gwu extends gwv {
    private final gwx a;

    gwu(gwx gwx) {
        super(gwx.d);
        this.a = gwx;
    }

    /* access modifiers changed from: protected */
    public final Parcelable a(Map<hcm, Parcelable> map) {
        if (map.isEmpty()) {
            return null;
        }
        xoq xoq = new xoq();
        List<hcm> list = this.a.e;
        for (int i = 0; i < list.size(); i++) {
            Parcelable parcelable = (Parcelable) map.get(list.get(i));
            if (parcelable != null) {
                xoq.put(i, parcelable);
            }
        }
        return xoq;
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable, Map<hcm, Parcelable> map) {
        if (parcelable instanceof xoq) {
            xoq xoq = (xoq) parcelable;
            List<hcm> list = this.a.e;
            int size = list.size();
            for (int i = 0; i < xoq.size(); i++) {
                int keyAt = xoq.keyAt(i);
                if (keyAt >= size) {
                    Logger.d("Inconsistent saved state: position is %d but size is %d", Integer.valueOf(keyAt), Integer.valueOf(size));
                    return;
                }
                map.put(list.get(keyAt), xoq.valueAt(i));
            }
        }
    }
}
