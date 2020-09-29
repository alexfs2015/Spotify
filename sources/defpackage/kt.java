package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kt reason: default package */
final class kt extends ku {
    kt() {
    }

    private static boolean a(Transition transition) {
        return !a(transition.getTargetIds()) || !a(transition.getTargetNames()) || !a(transition.getTargetTypes());
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public final void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final void a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new EpicenterCallback() {
                public final Rect onGetEpicenter(Transition transition) {
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
            transition.setEpicenterCallback(new EpicenterCallback() {
                public final Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    public final void a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
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
        AnonymousClass3 r1 = new TransitionListener() {
            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
                Object obj = obj5;
                if (obj != null) {
                    kt.this.b(obj, arrayList4, null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    kt.this.b(obj2, arrayList5, null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    kt.this.b(obj3, arrayList6, null);
                }
            }
        };
        transition.addListener(r1);
    }

    public final void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (!a(transition) && a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public final void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public final void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public final void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new TransitionListener() {
            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
            }
        });
    }

    public final void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget((View) arrayList.get(size2));
                }
            }
        }
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }
}
