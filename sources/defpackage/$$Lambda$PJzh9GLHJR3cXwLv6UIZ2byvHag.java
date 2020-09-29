package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

/* renamed from: -$$Lambda$PJzh9GLHJR3cXwLv6UIZ2byvHag reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$PJzh9GLHJR3cXwLv6UIZ2byvHag implements OnClickListener {
    private final /* synthetic */ OnLongClickListener f$0;

    public /* synthetic */ $$Lambda$PJzh9GLHJR3cXwLv6UIZ2byvHag(OnLongClickListener onLongClickListener) {
        this.f$0 = onLongClickListener;
    }

    public final void onClick(View view) {
        this.f$0.onLongClick(view);
    }
}
