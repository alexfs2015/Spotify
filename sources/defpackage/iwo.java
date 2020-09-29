package defpackage;

import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: iwo reason: default package */
public final class iwo implements gue {
    final List<a> a = new ArrayList();
    MiniPlayerDisplayRule b = new MiniPlayerDisplayRule();

    /* renamed from: iwo$a */
    public interface a {
        void a();

        void a(MiniPlayerDisplayRule miniPlayerDisplayRule);

        gue b();
    }

    public final void a() {
        for (a b2 : this.a) {
            b2.b().a();
        }
    }

    public final void a(Tech tech) {
        for (a b2 : this.a) {
            b2.b().a(tech);
        }
    }

    public final void a(Tech tech, String str) {
        for (a b2 : this.a) {
            b2.b().a(tech, str);
        }
    }

    public final void a(defpackage.gue.a aVar) {
        for (a b2 : this.a) {
            b2.b().a(aVar);
        }
    }

    public final void a(a aVar) {
        this.a.add(aVar);
        aVar.a(this.b);
    }

    public final void a(EnumSet<Tech> enumSet) {
        for (a b2 : this.a) {
            b2.b().a(enumSet);
        }
    }

    public final void b() {
        for (a b2 : this.a) {
            b2.b().b();
        }
    }

    public final void b(a aVar) {
        this.a.remove(aVar);
    }
}
