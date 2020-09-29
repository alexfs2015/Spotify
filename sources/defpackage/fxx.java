package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.android.glue.patterns.prettylist.StickyListView;

/* renamed from: fxx reason: default package */
public final class fxx extends fyc<StickyListView> implements fxw {
    public fxx(Context context, View view, int i) {
        super(context, view, i);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ View a(Context context) {
        return new StickyListView(context);
    }

    public final StickyListView a() {
        return (StickyListView) this.a;
    }

    public final void b(boolean z) {
        a aVar = ((StickyListView) this.a).a;
        int i = ((StickyListView) this.a).d;
        if (z) {
            aVar.smoothScrollToPositionFromTop(0, -i);
        } else {
            aVar.setSelectionFromTop(0, -i);
        }
    }

    public final void c(boolean z) {
        a aVar = ((StickyListView) this.a).a;
        int e = this.b.e();
        if (z) {
            aVar.smoothScrollToPositionFromTop(0, -e);
        } else {
            aVar.setSelectionFromTop(0, -e);
        }
    }
}
