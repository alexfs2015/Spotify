package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.Transition.c;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: qr reason: default package */
public final class qr {
    static ArrayList<ViewGroup> a = new ArrayList<>();
    private static Transition b = new AutoTransition();
    private static ThreadLocal<WeakReference<dp<ViewGroup, ArrayList<Transition>>>> c = new ThreadLocal<>();

    /* renamed from: qr$a */
    static class a implements OnAttachStateChangeListener, OnPreDrawListener {
        ViewGroup a;
        private Transition b;

        public final void onViewAttachedToWindow(View view) {
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.b = transition;
            this.a = viewGroup;
        }

        private void a() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.a.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
            a();
            qr.a.remove(this.a);
            ArrayList arrayList = (ArrayList) qr.a().get(this.a);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).f(this.a);
                }
            }
            this.b.a(true);
        }

        public final boolean onPreDraw() {
            a();
            if (!qr.a.remove(this.a)) {
                return true;
            }
            final dp a2 = qr.a();
            ArrayList arrayList = (ArrayList) a2.get(this.a);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a2.put(this.a, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.b);
            this.b.a((c) new qq() {
                public final void a(Transition transition) {
                    ((ArrayList) a2.get(a.this.a)).remove(transition);
                }
            });
            this.b.a(this.a, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).f(this.a);
                }
            }
            this.b.a(this.a);
            return true;
        }
    }

    static dp<ViewGroup, ArrayList<Transition>> a() {
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference != null) {
            dp<ViewGroup, ArrayList<Transition>> dpVar = (dp) weakReference.get();
            if (dpVar != null) {
                return dpVar;
            }
        }
        dp<ViewGroup, ArrayList<Transition>> dpVar2 = new dp<>();
        c.set(new WeakReference(dpVar2));
        return dpVar2;
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (!a.contains(viewGroup) && ip.B(viewGroup)) {
            a.add(viewGroup);
            if (transition == null) {
                transition = b;
            }
            Transition f = transition.clone();
            ArrayList arrayList = (ArrayList) a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).e(viewGroup);
                }
            }
            if (f != null) {
                f.a(viewGroup, true);
            }
            if (qn.a(viewGroup) != null) {
                qn.a(null);
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (f != null && viewGroup != null) {
                a aVar = new a(f, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }
}
