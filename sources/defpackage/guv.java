package defpackage;

import android.os.Parcelable;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: guv reason: default package */
public class guv implements b {
    private final Map<gzt, Parcelable> a = new WeakHashMap();
    private final gvc b;

    /* access modifiers changed from: protected */
    public Parcelable a(Map<gzt, Parcelable> map) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable, Map<gzt, Parcelable> map) {
    }

    public guv(gvc gvc) {
        this.b = gvc;
    }

    public final Parcelable a(gzt gzt) {
        Map<gzt, Parcelable> map = this.a;
        gzt b2 = this.b.b(gzt);
        if (b2 != null) {
            return (Parcelable) map.get(b2);
        }
        String id = gzt.id() != null ? gzt.id() : gzt.toString();
        StringBuilder sb = new StringBuilder("Model ");
        sb.append(id);
        sb.append(" not resolved");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean a(gzt gzt, Parcelable parcelable) {
        gzt b2 = this.b.b(gzt);
        if (b2 == null) {
            return false;
        }
        this.a.put(b2, parcelable);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a.clear();
    }

    public final Parcelable b() {
        return a(this.a);
    }

    public final void a(Parcelable parcelable) {
        a(parcelable, this.a);
    }
}
