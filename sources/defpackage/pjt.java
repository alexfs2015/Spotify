package defpackage;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import java.util.List;

/* renamed from: pjt reason: default package */
public final class pjt implements pjs {
    private final gwm a;
    private final gwt b;
    private final pit c;
    private Group d;

    public pjt(gwt gwt, gwm gwm, pit pit) {
        this.b = gwt;
        this.a = gwm;
        this.c = pit;
    }

    public final void a(RecyclerView recyclerView, Group group) {
        this.d = group;
        recyclerView.a((a) this.b);
        recyclerView.a((i) gxu.b(recyclerView.getContext(), this.a));
        recyclerView.q = true;
        recyclerView.setNestedScrollingEnabled(false);
        this.c.a(recyclerView);
        recyclerView.setFocusable(false);
    }

    public final void a(List<? extends hcm> list) {
        if (list.isEmpty()) {
            Group group = this.d;
            if (group != null) {
                group.setVisibility(8);
            }
            return;
        }
        Group group2 = this.d;
        if (group2 != null) {
            group2.setVisibility(0);
        }
        this.b.a(list);
        this.b.e();
    }
}
