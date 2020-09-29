package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: xo reason: default package */
public final class xo {
    public final xw a = new xw();
    public Map<String, List<Layer>> b;
    Map<String, xr> c;
    public Map<String, zl> d;
    public dw<zm> e;
    ds<Layer> f;
    public List<Layer> g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    private final HashSet<String> l = new HashSet<>();

    public final float a() {
        return (float) ((long) ((b() / this.k) * 1000.0f));
    }

    public final Layer a(long j2) {
        return (Layer) this.f.a(j2, null);
    }

    public final void a(String str) {
        this.l.add(str);
    }

    public final float b() {
        return this.j - this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer a2 : this.g) {
            sb.append(a2.a("\t"));
        }
        return sb.toString();
    }
}
