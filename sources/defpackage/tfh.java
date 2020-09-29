package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.a;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.b;

/* renamed from: tfh reason: default package */
public final class tfh implements a, b {
    private tfk a;
    private boolean b;

    public final void onCenterChildChanged(tfk tfk, boolean z, boolean z2) {
        this.b = z2;
        tfk tfk2 = this.a;
        if (tfk2 != null) {
            a(a(tfk2, this.b), (View) tfk2.a);
        }
        if (!z) {
            float measuredHeight = ((float) tfk.o.getMeasuredHeight()) / 2.0f;
            View a2 = a(tfk, this.b);
            TextView textView = tfk.a;
            textView.setPivotX(0.0f);
            textView.setPivotY(measuredHeight);
            a2.setPivotX(0.0f);
            a2.setPivotY(measuredHeight);
            a(tfk);
        } else {
            tfk.a.setVisibility(4);
            a(tfk, this.b).setVisibility(0);
        }
        this.a = tfk;
    }

    private static void a(View view, View view2) {
        view.setVisibility(4);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view2.setVisibility(0);
    }

    private static View a(tfk tfk, boolean z) {
        tfk.a(z);
        return tfk.d;
    }

    public final void a(boolean z) {
        this.b = !z;
        tfk tfk = this.a;
        if (tfk != null) {
            a(tfk);
        }
    }

    private void a(tfk tfk) {
        a((View) tfk.a, a(tfk, this.b));
    }
}
