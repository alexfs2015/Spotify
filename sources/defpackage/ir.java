package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: ir reason: default package */
public final class ir {
    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof ii) {
            ((ii) viewParent).a(view, i);
            return;
        }
        if (i == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof ih) {
                ((ih) viewParent).onStopNestedScroll(view);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof ij) {
            ((ij) viewParent2).a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof ii) {
            ((ii) viewParent2).a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    AbstractMethodError abstractMethodError = e;
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), abstractMethodError);
                }
            } else if (viewParent2 instanceof ih) {
                ((ih) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof ii) {
            ((ii) viewParent).a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof ih) {
                ((ih) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof ih) {
                return ((ih) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof ih) {
                return ((ih) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ii) {
            return ((ii) viewParent).a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStartNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof ih) {
                return ((ih) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ii) {
            ((ii) viewParent).b(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof ih) {
                ((ih) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }
}
