package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: miw reason: default package */
public final class miw implements gue {
    private final ImmutableList<gue> a;

    public miw(gue... gueArr) {
        this.a = ImmutableList.a((E[]) gueArr);
    }

    public final void a() {
        fdz R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gue) R_.next()).a();
        }
    }

    public final void a(Tech tech) {
        fdz R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gue) R_.next()).a(tech);
        }
    }

    public final void a(Tech tech, String str) {
        fdz R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gue) R_.next()).a(tech, str);
        }
    }

    public final void a(a aVar) {
        fdz R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gue) R_.next()).a(aVar);
        }
    }

    public final void a(EnumSet<Tech> enumSet) {
        fdz R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gue) R_.next()).a(enumSet);
        }
    }

    public final void b() {
        fdz R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gue) R_.next()).b();
        }
    }
}
