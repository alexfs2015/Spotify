package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: xa reason: default package */
public final class xa {
    public final xi a = new xi();
    public Map<String, List<Layer>> b;
    Map<String, xd> c;
    public Map<String, yx> d;
    public dw<yy> e;
    ds<Layer> f;
    public List<Layer> g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    private final HashSet<String> l = new HashSet<>();

    public final void a(String str) {
        this.l.add(str);
    }

    public final Layer a(long j2) {
        return (Layer) this.f.a(j2, null);
    }

    public final float a() {
        return (float) ((long) ((b() / this.k) * 1000.0f));
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
