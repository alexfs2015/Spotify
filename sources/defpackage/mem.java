package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: mem reason: default package */
public final class mem implements gse {
    private final ImmutableList<gse> a;

    public mem(gse... gseArr) {
        this.a = ImmutableList.a((E[]) gseArr);
    }

    public final void a(Tech tech, String str) {
        fdh R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gse) R_.next()).a(tech, str);
        }
    }

    public final void a(EnumSet<Tech> enumSet) {
        fdh R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gse) R_.next()).a(enumSet);
        }
    }

    public final void a() {
        fdh R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gse) R_.next()).a();
        }
    }

    public final void b() {
        fdh R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gse) R_.next()).b();
        }
    }

    public final void a(Tech tech) {
        fdh R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gse) R_.next()).a(tech);
        }
    }

    public final void a(a aVar) {
        fdh R_ = this.a.R_();
        while (R_.hasNext()) {
            ((gse) R_.next()).a(aVar);
        }
    }
}
