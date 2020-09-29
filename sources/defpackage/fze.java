package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fze reason: default package */
public final class fze {

    /* renamed from: fze$a */
    static class a {
        public boolean a;
        public boolean b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static void a(View view) {
        if (!view.isInEditMode()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    a(viewGroup.getChildAt(i));
                }
                return;
            }
            b(view);
        }
    }

    private static void b(View view) {
        if (view instanceof TextView) {
            a aVar = (a) view.getTag(R.id.baselines_margin_view);
            if (aVar != null) {
                TextView textView = (TextView) view;
                a(textView);
                int i = 0;
                c(textView, aVar.a ? -b(textView) : 0);
                if (aVar.b) {
                    i = -c(textView);
                }
                d(textView, i);
            }
        }
    }

    private static void a(TextView textView) {
        int b = uts.b(8.0f, textView.getResources());
        double ceil = Math.ceil((double) (((float) d(textView)) / ((float) b)));
        double d = (double) b;
        Double.isNaN(d);
        utv.a(textView, (float) ((int) (ceil * d)));
    }

    private static int b(TextView textView) {
        return (int) Math.ceil((double) Math.abs(textView.getPaint().getFontMetrics().ascent));
    }

    private static int c(TextView textView) {
        return (int) Math.ceil((double) Math.abs(textView.getPaint().getFontMetrics().descent));
    }

    private static int d(TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.baselines_original_line_height);
        int lineHeight = textView.getLineHeight();
        if (num != null) {
            return num.intValue();
        }
        a(textView, lineHeight);
        return lineHeight;
    }

    private static int c(View view) {
        Integer num = (Integer) view.getTag(R.id.baselines_original_top_margin);
        int i = ((MarginLayoutParams) view.getLayoutParams()).topMargin;
        if (num != null) {
            return num.intValue();
        }
        a(view, i);
        return i;
    }

    private static int d(View view) {
        Integer num = (Integer) view.getTag(R.id.baselines_original_bottom_margin);
        int i = ((MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        if (num != null) {
            return num.intValue();
        }
        b(view, i);
        return i;
    }

    public static void a(TextView textView, int i) {
        if (!textView.isInEditMode()) {
            textView.setTag(R.id.baselines_original_line_height, Integer.valueOf(i));
            a(textView);
        }
    }

    public static void a(View view, int i) {
        view.setTag(R.id.baselines_original_top_margin, Integer.valueOf(i));
    }

    public static void b(View view, int i) {
        view.setTag(R.id.baselines_original_bottom_margin, Integer.valueOf(i));
    }

    private static void c(View view, int i) {
        ((MarginLayoutParams) view.getLayoutParams()).topMargin = c(view) + i;
    }

    private static void d(View view, int i) {
        ((MarginLayoutParams) view.getLayoutParams()).bottomMargin = d(view) + i;
    }

    private static a e(TextView textView) {
        a aVar = (a) textView.getTag(R.id.baselines_margin_view);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(0);
        textView.setTag(R.id.baselines_margin_view, aVar2);
        return aVar2;
    }

    public static void a(TextView... textViewArr) {
        b(textViewArr);
        c(textViewArr);
    }

    public static void b(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                e(textView).a = true;
            }
        }
    }

    public static void c(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                e(textView).b = true;
            }
        }
    }
}
