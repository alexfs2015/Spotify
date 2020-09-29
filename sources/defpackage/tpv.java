package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: tpv reason: default package */
public final class tpv extends oj implements FlowableOnSubscribe<View> {
    private int b = -1;
    private RecyclerView c;
    private FlowableEmitter<View> d;

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.d = null;
    }

    public final View a(i iVar) {
        View a = super.a(iVar);
        int e = (a == null || this.c == null) ? -1 : RecyclerView.e(a);
        if (!(e == -1 || this.b == e)) {
            FlowableEmitter<View> flowableEmitter = this.d;
            if (flowableEmitter != null) {
                flowableEmitter.a(a);
            }
            this.b = e;
        }
        return a;
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.c = recyclerView;
    }

    public final void subscribe(FlowableEmitter<View> flowableEmitter) {
        this.d = flowableEmitter;
        this.d.a(new $$Lambda$tpv$kCcfqTt1NgQ_OBn_6E0lc8FtOxU(this));
    }
}
