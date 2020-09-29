package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.Transition.b;
import androidx.transition.Transition.c;
import androidx.transition.TransitionSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qi reason: default package */
public class qi extends ku {
    private static boolean a(Transition transition) {
        return !a((List) transition.e) || !a((List) null) || !a((List) null);
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.a((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.a((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.a((Transition) obj3);
        }
        return transitionSet;
    }

    public final void a(ViewGroup viewGroup, Object obj) {
        qw.a(viewGroup, (Transition) obj);
    }

    public final void a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).a((b) new b() {
                public final Rect a() {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    public final void a(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            final Rect rect = new Rect();
            a(view, rect);
            transition.a((b) new b() {
                public final Rect a() {
                    return rect;
                }
            });
        }
    }

    public final void a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((List<View>) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a((Object) transitionSet, arrayList);
    }

    public final void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        AnonymousClass3 r1 = new c() {
            public final void a() {
            }

            public final void a(Transition transition) {
            }

            public final void b() {
            }

            public final void c() {
                Object obj = obj5;
                if (obj != null) {
                    qi.this.b(obj, arrayList4, null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    qi.this.b(obj2, arrayList5, null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    qi.this.b(obj3, arrayList6, null);
                }
            }
        };
        transition.a((c) r1);
    }

    public final void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int size = transitionSet.a.size();
                while (i < size) {
                    a((Object) transitionSet.c(i), arrayList);
                    i++;
                }
                return;
            }
            if (!a(transition) && a((List) transition.f)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    transition.c((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public final void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f.clear();
            transitionSet.f.addAll(arrayList2);
            b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    public final boolean a(Object obj) {
        return obj instanceof Transition;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public final Object b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().a(transition).a(transition2).b(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.a(transition);
        }
        transitionSet.a(transition3);
        return transitionSet;
    }

    public final void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).c(view);
        }
    }

    public final void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).a((c) new c() {
            public final void a() {
            }

            public final void a(Transition transition) {
                transition.b((c) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            public final void b() {
            }

            public final void c() {
            }
        });
    }

    public final void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.a.size();
            while (i < size) {
                b((Object) transitionSet.c(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!a(transition)) {
            ArrayList<View> arrayList3 = transition.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.c((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.d((View) arrayList.get(size3));
                }
            }
        }
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.a((Transition) obj);
        return transitionSet;
    }

    public final void c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).d(view);
        }
    }
}
