package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yx reason: default package */
public final class yx {
    public final List<yr<aam, Path>> a;
    public final List<yr<Integer, Integer>> b;
    public final List<Mask> c;

    public yx(List<Mask> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((Mask) list.get(i)).b.a());
            this.b.add(((Mask) list.get(i)).c.a());
        }
    }
}
