package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: nwc reason: default package */
public final class nwc extends jqn {
    Runnable b = $$Lambda$nwc$KfVnCoSWTuoBeL9V8wDmgT48rkU.INSTANCE;
    Runnable c = $$Lambda$nwc$ImexK7gkny030jC1h2gMi3ZYdnQ.INSTANCE;
    Runnable d = $$Lambda$nwc$yXYCPNI6VSfAxPmsRCvOXg2DBvg.INSTANCE;
    Runnable e = $$Lambda$nwc$Ji6cBN3jOwohylKOqAsceCF1OI.INSTANCE;
    View f;
    TextView g;
    Context h;
    Button i;
    Button j;
    Button k;
    View l;
    ProgressBar m;

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h() {
    }

    public nwc(SnackBar snackBar, int i2) {
        super(snackBar, i2, "Start trip");
    }

    public final void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.h = context;
        int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_starttrip_banner, viewGroup, false);
        this.f = inflate;
        View view = (View) fay.a(inflate);
        if (gaa.b(context)) {
            i2 = gaa.a(context.getResources());
        }
        if (i2 != 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.topMargin += i2;
            view.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) ((View) fay.a(inflate)).findViewById(R.id.start_trip_icon);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DEVICE_CAR, (float) context.getResources().getDimensionPixelSize(R.dimen.empty_view_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        imageView.setImageDrawable(spotifyIconDrawable);
        this.g = (TextView) inflate.findViewById(R.id.start_trip_title);
        Button button = (Button) inflate.findViewById(R.id.start_trip_google_maps);
        this.i = button;
        button.setOnClickListener(new $$Lambda$nwc$5Jf9RD1RwqD9WrahsHPk_PSQLic(this));
        a(context, button, (int) R.drawable.app_logo_googlemaps);
        Button button2 = (Button) inflate.findViewById(R.id.start_trip_waze);
        this.j = button2;
        button2.setOnClickListener(new $$Lambda$nwc$KiWllCIrbmDH4Tjc7UxkXPfgplo(this));
        a(context, button2, (int) R.drawable.wazelogobig);
        Button button3 = (Button) inflate.findViewById(R.id.start_trip_more_options);
        button3.setOnClickListener(new $$Lambda$nwc$2YA4nHfHL3b1P95R52sacow2xg(this));
        if (VERSION.SDK_INT >= 21) {
            button3.setLetterSpacing(0.0f);
        }
        this.k = button3;
        this.m = (ProgressBar) inflate.findViewById(R.id.close_progress_button);
        this.m.setOnClickListener(new $$Lambda$nwc$tyjwyB8oUW7LPpdmxH2RE_1vRh0(this));
        this.l = inflate.findViewById(R.id.start_trip_horizontal_bar);
        viewGroup.addView(inflate);
    }

    private static void a(Context context, Button button, int i2) {
        button.setCompoundDrawablesWithIntrinsicBounds(a(context, (Drawable) fay.a(fr.a(context, i2)), (int) R.dimen.std_16dp), null, null, null);
    }

    private static Drawable a(Context context, Drawable drawable, int i2) {
        fay.a(context);
        fay.a(drawable);
        return new BitmapDrawable(context.getResources(), a(drawable, context.getResources().getDimensionPixelSize(i2)));
    }

    private static Bitmap a(Drawable drawable, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        this.b.run();
    }

    /* access modifiers changed from: private */
    public void b(View view) {
        this.c.run();
    }

    /* access modifiers changed from: private */
    public void c(View view) {
        this.d.run();
    }

    /* access modifiers changed from: private */
    public void d(View view) {
        this.e.run();
    }

    public final void a(Runnable runnable) {
        Context context = (Context) fay.a(this.h);
        View view = (View) fay.a(this.f);
        View view2 = (View) fay.a(this.i);
        View view3 = (View) fay.a(this.j);
        View view4 = (View) fay.a(this.k);
        View view5 = (View) fay.a(this.l);
        ((TextView) fay.a(this.g)).setText(String.format(Locale.getDefault(), "%s\n%s", new Object[]{context.getString(R.string.starttrip_banner_carbluetoothconnected), context.getString(R.string.starttrip_banner_connect)}));
        view.setOnClickListener(new $$Lambda$nwc$ZsCumJIVqOTc67xHtOWX4w4YtHM(runnable));
        view2.setVisibility(8);
        view3.setVisibility(8);
        view4.setVisibility(8);
        view5.setVisibility(8);
    }
}
