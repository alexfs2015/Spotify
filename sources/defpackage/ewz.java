package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

@Deprecated
/* renamed from: ewz reason: default package */
public final class ewz extends FrameLayout {

    /* renamed from: ewz$a */
    static class a implements d {
        private Context a;

        private a(Context context) {
            this.a = context;
        }

        /* synthetic */ a(Context context, byte b) {
            this(context);
        }

        public final Drawable a(int i) {
            return this.a.getResources().getDrawable(17301508);
        }

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: ewz$b */
    static class b implements d {
        private Context a;

        private b(Context context) {
            this.a = context;
        }

        /* synthetic */ b(Context context, byte b) {
            this(context);
        }

        public final Drawable a(int i) {
            String str = "com.google.android.gms";
            try {
                Resources resources = this.a.createPackageContext(str, 4).getResources();
                String str2 = i != 0 ? i != 1 ? i != 2 ? "ic_plusone_standard" : "ic_plusone_tall" : "ic_plusone_medium" : "ic_plusone_small";
                return resources.getDrawable(resources.getIdentifier(str2, "drawable", str));
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        public final boolean a() {
            try {
                this.a.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            } catch (NameNotFoundException unused) {
                return false;
            }
        }
    }

    /* renamed from: ewz$c */
    static class c implements d {
        private Context a;

        private c(Context context) {
            this.a = context;
        }

        /* synthetic */ c(Context context, byte b) {
            this(context);
        }

        public final Drawable a(int i) {
            String str = i != 0 ? i != 1 ? i != 2 ? "ic_plusone_standard_off_client" : "ic_plusone_tall_off_client" : "ic_plusone_medium_off_client" : "ic_plusone_small_off_client";
            return this.a.getResources().getDrawable(this.a.getResources().getIdentifier(str, "drawable", this.a.getPackageName()));
        }

        public final boolean a() {
            String str = "drawable";
            return (this.a.getResources().getIdentifier("ic_plusone_small_off_client", str, this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_medium_off_client", str, this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_tall_off_client", str, this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_standard_off_client", str, this.a.getPackageName()) == 0) ? false : true;
        }
    }

    /* renamed from: ewz$d */
    interface d {
        Drawable a(int i);

        boolean a();
    }

    @Deprecated
    public ewz(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        d bVar = new b(getContext(), 0);
        if (!bVar.a()) {
            bVar = new c(getContext(), 0);
        }
        if (!bVar.a()) {
            bVar = new a(getContext(), 0);
        }
        button.setBackgroundDrawable(bVar.a(i));
        Point point = new Point();
        int i2 = 20;
        int i3 = 24;
        if (i == 0) {
            i2 = 14;
        } else if (i == 1) {
            i3 = 32;
        } else if (i != 2) {
            i2 = 24;
            i3 = 38;
        } else {
            i3 = 50;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        double d2 = (double) applyDimension;
        Double.isNaN(d2);
        point.x = (int) (d2 + 0.5d);
        double d3 = (double) applyDimension2;
        Double.isNaN(d3);
        point.y = (int) (d3 + 0.5d);
        addView(button, new LayoutParams(point.x, point.y, 17));
    }
}
