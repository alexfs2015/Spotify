package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.Lifecycle.Event;

public class FragmentStateAdapter$5 implements lk {
    private /* synthetic */ Handler a;
    private /* synthetic */ Runnable b;

    public final void a(lm lmVar, Event event) {
        if (event == Event.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            lmVar.Y_().b(this);
        }
    }
}
