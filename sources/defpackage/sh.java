package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: sh reason: default package */
public abstract class sh extends androidx.recyclerview.widget.RecyclerView.a<si> implements sj {
    public final Lifecycle a;
    public final kk d;
    public final ds<Fragment> e;

    /* renamed from: sh$a */
    public class a {
        private long a;
        private /* synthetic */ sh b;

        public final void a(boolean z) {
            if (!this.b.d.i() && null.f.b == 0) {
                if (!(this.b.e.b() == 0) && this.b.b() != 0) {
                    int i = null.b;
                    if (i < this.b.b()) {
                        long b2 = this.b.b(i);
                        if (b2 != this.a) {
                            Fragment fragment = (Fragment) this.b.e.a(b2, null);
                            if (fragment != null && fragment.u()) {
                                this.a = b2;
                                kr a2 = this.b.d.a();
                                for (int i2 = 0; i2 < this.b.e.b(); i2++) {
                                    long b3 = this.b.e.b(i2);
                                    Fragment fragment2 = (Fragment) this.b.e.c(i2);
                                    if (fragment2.u()) {
                                        a2.a(fragment2, b3 == this.a ? State.RESUMED : State.STARTED);
                                        fragment2.d_(b3 == this.a);
                                    }
                                }
                                if (!a2.g()) {
                                    a2.d();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public void a(final Fragment fragment, final FrameLayout frameLayout) {
        this.d.a((defpackage.kk.a) new defpackage.kk.a() {
            public final void a(kk kkVar, Fragment fragment, View view) {
                if (fragment == fragment) {
                    kkVar.a((defpackage.kk.a) this);
                    sh.a(view, frameLayout);
                }
            }
        }, false);
    }

    public final long b(int i) {
        return (long) i;
    }
}
