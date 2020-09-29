package defpackage;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.slate.model.BackgroundColor.Type;
import com.squareup.picasso.Picasso;
import java.util.Locale;

/* renamed from: tzu reason: default package */
public final class tzu implements tyk {
    private final tzo a;
    /* access modifiers changed from: private */
    public final wum b;
    private final tzp c;
    private final Picasso d;

    /* renamed from: tzu$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.slate.model.BackgroundColor$Type[] r0 = com.spotify.music.slate.model.BackgroundColor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.slate.model.BackgroundColor$Type r1 = com.spotify.music.slate.model.BackgroundColor.Type.HEX     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.slate.model.BackgroundColor$Type r1 = com.spotify.music.slate.model.BackgroundColor.Type.DERIVED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tzu.AnonymousClass3.<clinit>():void");
        }
    }

    public tzu(Picasso picasso, wum wum, tzp tzp, tzo tzo) {
        this.d = picasso;
        this.a = tzo;
        this.c = tzp;
        this.b = wum;
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        b f = this.a.f();
        int i2 = viewGroup.getResources().getConfiguration().orientation;
        if (i2 == 1) {
            i = f.a();
        } else if (i2 == 2) {
            i = f.b();
        } else {
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "Orientation %s unrecognized", new Object[]{Integer.valueOf(i2)}));
        }
        final View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0080b c2 = f.c();
        TextView textView = (TextView) fay.a(inflate.findViewById(c2.b()));
        Button button = (Button) fay.a(inflate.findViewById(c2.c()));
        this.a.a().a((TextView) fay.a(inflate.findViewById(c2.a())));
        this.a.b().a(textView);
        this.a.d().a((TextView) button);
        button.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                tzu.this.b.call();
            }
        });
        ImageView imageView = (ImageView) inflate.findViewById(c2.d());
        int i3 = AnonymousClass3.a[this.a.e().b.ordinal()];
        if (i3 == 1) {
            ip.a(inflate, (Drawable) new ColorDrawable(this.a.e().a));
            this.a.c().a(imageView, this.d, null, this.c);
        } else if (i3 == 2) {
            this.a.c().a(imageView, this.d, new uvj() {
                public final void a(int i) {
                    ip.a(inflate, (Drawable) tzu.a(i));
                }
            }, this.c);
        }
        return inflate;
    }

    private static int a(int i, float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * (1.0f - f);
        return Color.HSVToColor(fArr);
    }

    static /* synthetic */ GradientDrawable a(int i) {
        int a2 = a(i, 0.1f);
        int a3 = a(i, 0.6f);
        return new GradientDrawable(Orientation.TR_BL, new int[]{a2, a3});
    }
}
