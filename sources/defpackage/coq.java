package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@cfp
/* renamed from: coq reason: default package */
public final class coq {
    public Map<Integer, Bitmap> a = new ConcurrentHashMap();
    public AtomicInteger b = new AtomicInteger(0);

    public final void a(Integer num) {
        this.a.remove(num);
    }
}
