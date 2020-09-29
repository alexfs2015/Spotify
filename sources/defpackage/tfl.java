package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: tfl reason: default package */
public final class tfl extends oe implements FlowableOnSubscribe<View> {
    private int b = -1;
    private RecyclerView c;
    private FlowableEmitter<View> d;

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.c = recyclerView;
    }

    public final View a(i iVar) {
        int i;
        View a = super.a(iVar);
        if (a == null || this.c == null) {
            i = -1;
        } else {
            i = RecyclerView.e(a);
        }
        if (!(i == -1 || this.b == i)) {
            FlowableEmitter<View> flowableEmitter = this.d;
            if (flowableEmitter != null) {
                flowableEmitter.a(a);
            }
            this.b = i;
        }
        return a;
    }

    public final void subscribe(FlowableEmitter<View> flowableEmitter) {
        this.d = flowableEmitter;
        this.d.a(new $$Lambda$tfl$MqQVbsbaBizKUhgIdpAEOn0ZmDc(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.d = null;
    }
}
