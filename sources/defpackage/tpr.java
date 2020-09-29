package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.a;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.b;

/* renamed from: tpr reason: default package */
public final class tpr implements a, b {
    private tpu a;
    private boolean b;

    private static View a(tpu tpu, boolean z) {
        tpu.a(z);
        return tpu.d;
    }

    private static void a(View view, View view2) {
        view.setVisibility(4);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view2.setVisibility(0);
    }

    private void a(tpu tpu) {
        a((View) tpu.a, a(tpu, this.b));
    }

    public final void a(boolean z) {
        this.b = !z;
        tpu tpu = this.a;
        if (tpu != null) {
            a(tpu);
        }
    }

    public final void onCenterChildChanged(tpu tpu, boolean z, boolean z2) {
        this.b = z2;
        tpu tpu2 = this.a;
        if (tpu2 != null) {
            a(a(tpu2, this.b), (View) tpu2.a);
        }
        if (!z) {
            float measuredHeight = ((float) tpu.o.getMeasuredHeight()) / 2.0f;
            View a2 = a(tpu, this.b);
            TextView textView = tpu.a;
            textView.setPivotX(0.0f);
            textView.setPivotY(measuredHeight);
            a2.setPivotX(0.0f);
            a2.setPivotY(measuredHeight);
            a(tpu);
        } else {
            tpu.a.setVisibility(4);
            a(tpu, this.b).setVisibility(0);
        }
        this.a = tpu;
    }
}
