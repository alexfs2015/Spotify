package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;

/* renamed from: uls reason: default package */
public final class uls extends Transition {
    private final int a;

    public uls(int i) {
        this.a = i;
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getId() == R.id.fragment_container) {
            int i = this.a;
            String str = "transition_center_y";
            String str2 = "transition_center_x";
            if (i == 0) {
                int width = (view.getWidth() / 2) + ((int) ((float) view.getLeft()));
                int height = (view.getHeight() / 2) + ((int) ((float) view.getTop()));
                transitionValues.values.put(str2, Integer.valueOf(width));
                transitionValues.values.put(str, Integer.valueOf(height));
            } else if (i == 3) {
                transitionValues.values.put(str2, Integer.valueOf(-1));
                transitionValues.values.put(str, Integer.valueOf(-1));
                transitionValues.values.put("transition_left", Integer.valueOf(view.getLeft()));
                transitionValues.values.put("transition_right", Integer.valueOf(view.getRight()));
                transitionValues.values.put("transition_top", Integer.valueOf(view.getTop()));
                transitionValues.values.put("transition_bottom", Integer.valueOf(view.getBottom()));
                transitionValues.values.put("transition_radius", Float.valueOf(a(view)));
            }
        }
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getId() == R.id.fragment_container) {
            int i = this.a;
            String str = "transition_center_y";
            String str2 = "transition_center_x";
            if (i == 3) {
                int width = (view.getWidth() / 2) + ((int) ((float) view.getLeft()));
                int height = (view.getHeight() / 2) + ((int) ((float) view.getTop()));
                transitionValues.values.put(str2, Integer.valueOf(width));
                transitionValues.values.put(str, Integer.valueOf(height));
            } else if (i == 0) {
                transitionValues.values.put(str2, Integer.valueOf(-1));
                transitionValues.values.put(str, Integer.valueOf(-1));
                transitionValues.values.put("transition_radius", Float.valueOf(a(view)));
            }
        }
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        float f;
        int i2;
        if (transitionValues2 == null || transitionValues2.view.getId() != R.id.fragment_container) {
            return null;
        }
        int i3 = this.a;
        String str = "transition_radius";
        String str2 = "transition_center_y";
        String str3 = "transition_center_x";
        String str4 = "Invalid transition mode.";
        if (i3 == 0) {
            i2 = ((Integer) transitionValues.values.get(str3)).intValue();
            i = ((Integer) transitionValues.values.get(str2)).intValue();
            f = ((Float) transitionValues2.values.get(str)).floatValue();
        } else if (i3 != 3) {
            Logger.e(str4, new Object[0]);
            return null;
        } else {
            i2 = ((Integer) transitionValues2.values.get(str3)).intValue();
            i = ((Integer) transitionValues2.values.get(str2)).intValue();
            f = ((Float) transitionValues.values.get(str)).floatValue();
            transitionValues2.view.setLeft(((Integer) transitionValues.values.get("transition_left")).intValue());
            transitionValues2.view.setRight(((Integer) transitionValues.values.get("transition_right")).intValue());
            transitionValues2.view.setTop(((Integer) transitionValues.values.get("transition_top")).intValue());
            transitionValues2.view.setBottom(((Integer) transitionValues.values.get("transition_bottom")).intValue());
        }
        final View view = transitionValues2.view;
        int i4 = this.a;
        String str5 = "Missing information.";
        if (i4 != 0) {
            if (i4 != 3) {
                Logger.e(str4, new Object[0]);
                return null;
            } else if (i2 < 0 || i < 0) {
                Logger.e(str5, new Object[0]);
                return null;
            } else {
                view.setBackgroundColor(fr.c(view.getContext(), 17170444));
                view.setAlpha(1.0f);
                Animator a2 = a(view, f, 0.0f, i2, i);
                a2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        View view = view;
                        view.setBackgroundColor(fr.c(view.getContext(), 17170444));
                        view.setAlpha(1.0f);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        View view = view;
                        view.setBackgroundColor(fr.c(view.getContext(), 17170445));
                        view.setAlpha(0.0f);
                    }
                });
                return a2;
            }
        } else if (i2 >= 0 && i >= 0) {
            return a(view, 0.0f, f, i2, i);
        } else {
            Logger.e(str5, new Object[0]);
            return null;
        }
    }

    private static Animator a(View view, float f, float f2, int i, int i2) {
        return ViewAnimationUtils.createCircularReveal(view, i, i2, f, f2);
    }

    private static float a(View view) {
        return Math.max((float) view.getWidth(), (float) view.getHeight());
    }
}
