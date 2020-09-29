package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tvx reason: default package */
public final class tvx {
    private final ViewGroup a;
    private List<View> b;
    private boolean c;
    private final Rect d = new Rect();
    private final int[] e = new int[2];
    private final int[] f = new int[2];

    public tvx(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        List<View> list = this.b;
        if (list != null && !list.isEmpty()) {
            int b2 = vfj.b(24.0f, this.a.getResources());
            View view2 = (View) list.get(list.size() - 1);
            Rect rect = this.d;
            view2.getLocationInWindow(this.e);
            view.getLocationInWindow(this.f);
            int[] iArr = this.e;
            int i = iArr[0];
            int[] iArr2 = this.f;
            int i2 = i - iArr2[0];
            int i3 = iArr[1] - iArr2[1];
            rect.set(i2, i3, view2.getWidth() + i2, view2.getHeight() + i3);
            Rect rect2 = this.d;
            rect2.top = 0;
            rect2.bottom += b2;
            if (list.size() == 1) {
                this.d.left -= b2;
            }
            this.d.right += b2;
            view.setTouchDelegate(new TouchDelegate(this.d, view2));
        }
    }

    public final void a() {
        List<View> list = this.b;
        int i = 8;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((View) it.next()).getVisibility() == 0) {
                        i = 0;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.a.setVisibility(i);
    }

    public final void a(View view) {
        a((List<View>) ImmutableList.a(view));
    }

    public final void a(List<View> list) {
        if (!fbn.a(this.b, list)) {
            if (this.b != null) {
                this.a.removeAllViews();
            }
            this.b = list;
            if (list == null || list.isEmpty()) {
                this.a.setVisibility(8);
                return;
            }
            for (View view : list) {
                this.a.addView(view);
                view.setDuplicateParentStateEnabled(this.c);
            }
            this.a.setVisibility(0);
            View view2 = (View) this.a.getParent();
            view2.post(new $$Lambda$tvx$gYS38crf7jeeKLNVdHFb_NvIGU(this, view2));
        }
    }

    public final void a(boolean z) {
        this.c = z;
        this.a.setDuplicateParentStateEnabled(z);
        List<View> list = this.b;
        if (list != null) {
            for (View duplicateParentStateEnabled : list) {
                duplicateParentStateEnabled.setDuplicateParentStateEnabled(z);
            }
        }
    }

    public final View b() {
        List<View> list = this.b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<View> list2 = this.b;
        return (View) list2.get(list2.size() - 1);
    }
}
