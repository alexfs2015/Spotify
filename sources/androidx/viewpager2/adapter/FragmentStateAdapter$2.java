package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;

public class FragmentStateAdapter$2 implements lk {
    private /* synthetic */ si a;
    private /* synthetic */ sh b;

    FragmentStateAdapter$2(sh shVar, si siVar) {
        this.b = shVar;
        this.a = siVar;
    }

    public final void a(lm lmVar, Event event) {
        if (!this.b.d.i()) {
            lmVar.Y_().b(this);
            if (ip.E((FrameLayout) this.a.o)) {
                sh shVar = this.b;
                si siVar = this.a;
                a aVar = null;
                Fragment fragment = (Fragment) shVar.e.a(siVar.s, aVar);
                String str = "Design assumption violated.";
                if (fragment != null) {
                    FrameLayout frameLayout = (FrameLayout) siVar.o;
                    View view = fragment.H;
                    if (!fragment.u() && view != null) {
                        throw new IllegalStateException(str);
                    } else if (fragment.u() && view == null) {
                        shVar.a(fragment, frameLayout);
                    } else if (fragment.u() && view.getParent() != null) {
                        if (view.getParent() != frameLayout) {
                            sh.a(view, frameLayout);
                        }
                    } else if (fragment.u()) {
                        sh.a(view, frameLayout);
                    } else if (!shVar.d.i()) {
                        shVar.a(fragment, frameLayout);
                        kr a2 = shVar.d.a();
                        StringBuilder sb = new StringBuilder("f");
                        sb.append(siVar.s);
                        a2.a(fragment, sb.toString()).a(fragment, State.STARTED).d();
                        aVar.a(false);
                    } else if (!shVar.d.g()) {
                        shVar.a.a(new FragmentStateAdapter$2(shVar, siVar));
                    }
                } else {
                    throw new IllegalStateException(str);
                }
            }
        }
    }
}
