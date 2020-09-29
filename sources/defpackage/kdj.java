package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem.Priority;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.IllegalFormatConversionException;
import java.util.Locale;

/* renamed from: kdj reason: default package */
public final class kdj extends jqn {
    public WazeBannerModel b;
    public kdi c;
    private final int d;
    private TextView e;
    private TextView f;
    private RelativeLayout g;
    private ImageButton h;
    private TextView i;
    private TextView j;
    private Button k;
    private LinearLayout l;
    private final int m;
    private boolean n;

    /* renamed from: kdj$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.mobile.android.waze.model.WazeBannerModel$Type[] r0 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.waze.model.WazeBannerModel$Type r1 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.GOTO_BANNER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.waze.model.WazeBannerModel$Type r1 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.CONNECT_BANNER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.waze.model.WazeBannerModel$Type r1 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.NAVIGATION_BANNER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.waze.model.WazeBannerModel$Type r1 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.NO_BANNER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.waze.model.WazeBannerModel$Type r1 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.GOTO_BANNER_UNIFIED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kdj.AnonymousClass1.<clinit>():void");
        }
    }

    public kdj(SnackBar snackBar, String str) {
        this(snackBar, str, jqt.a(snackBar.getContext()));
    }

    public kdj(SnackBar snackBar, String str, int i2) {
        super(snackBar, 0, str);
        this.m = i2;
        this.d = R.layout.waze_banner;
    }

    public final void a(ViewGroup viewGroup) {
        this.g = (RelativeLayout) LayoutInflater.from(viewGroup.getContext()).inflate(this.d, viewGroup, false);
        this.e = (TextView) this.g.findViewById(R.id.waze_message);
        this.f = (TextView) this.g.findViewById(R.id.waze_distance);
        this.h = (ImageButton) this.g.findViewById(R.id.waze_action);
        ImageButton imageButton = this.h;
        Context context = viewGroup.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) uts.b(32.0f, context.getResources()));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        imageButton.setImageDrawable(spotifyIconDrawable);
        this.i = (TextView) this.g.findViewById(R.id.waze_exit);
        this.j = (TextView) this.g.findViewById(R.id.waze_clarification);
        this.k = (Button) this.g.findViewById(R.id.waze_get_started);
        this.l = (LinearLayout) this.g.findViewById(R.id.waze_no_distance);
        if (this.m != 0) {
            LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
            layoutParams.topMargin = this.m;
            this.g.setLayoutParams(layoutParams);
        }
        this.g.setOnClickListener(new $$Lambda$kdj$_enx13O0bqTpzyBNAsbhaHBKATE(this));
        this.h.setOnClickListener(new $$Lambda$kdj$VLJsfl7mJmCvk7ol7a2j0g_Xzw(this));
        viewGroup.addView(this.g);
    }

    private void a(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
            int i2 = 0;
            boolean z = str == null;
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setVisibility(z ? 0 : 8);
                TextView textView3 = this.e;
                if (z) {
                    i2 = 8;
                }
                textView3.setVisibility(i2);
                b(!z);
            }
        }
    }

    private void b(String str) {
        String format;
        CharSequence charSequence = null;
        boolean z = false;
        if (str != null) {
            try {
                Context context = this.g.getContext();
                int parseInt = Integer.parseInt(str);
                Locale locale = Locale.ENGLISH;
                if (parseInt <= 100) {
                    format = context.getString(R.string.waze_distance_now);
                } else if (parseInt <= 250) {
                    format = String.format(locale, context.getString(R.string.waze_distance_meters), new Object[]{Integer.valueOf(250)});
                } else if (parseInt <= 500) {
                    format = String.format(locale, context.getString(R.string.waze_distance_meters), new Object[]{Integer.valueOf(500)});
                } else if (parseInt <= 1000) {
                    format = String.format(locale, context.getString(R.string.waze_distance_km_fmt), new Object[]{Integer.valueOf(1)});
                } else {
                    String string = context.getString(R.string.waze_distance_km_fmt);
                    Object[] objArr = new Object[1];
                    double d2 = (double) parseInt;
                    Double.isNaN(d2);
                    objArr[0] = Double.valueOf(Math.ceil(d2 / 1000.0d));
                    format = String.format(locale, string, objArr);
                }
                charSequence = format;
            } catch (IllegalFormatConversionException unused) {
                Logger.e("Bad distance: %s", str);
            }
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(charSequence);
            this.f.setVisibility(charSequence != null ? 0 : 8);
        }
        if (charSequence != null) {
            z = true;
        }
        b(z);
    }

    private void c(String str) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void d(String str) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void e(String str) {
        if (this.j != null && this.k != null) {
            int i2 = str != null ? 0 : 8;
            this.j.setVisibility(i2);
            this.j.setText(str);
            this.k.setVisibility(i2);
            b(true);
        }
    }

    private void b(boolean z) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(WazeBannerModel wazeBannerModel) {
        this.b = wazeBannerModel;
        if (!this.n) {
            int i2 = AnonymousClass1.a[wazeBannerModel.a().ordinal()];
            if (i2 == 1 || i2 == 2) {
                a(wazeBannerModel.g());
                a(wazeBannerModel.b());
                b((String) null);
                b(wazeBannerModel.c());
                a(true);
                d("");
                e(wazeBannerModel.h());
            } else if (i2 != 3) {
                if (i2 == 4 || i2 == 5) {
                    a(false);
                }
            } else {
                a((String) null);
                a(wazeBannerModel.b());
                if (wazeBannerModel.e() != null) {
                    c(wazeBannerModel.e());
                } else {
                    b(wazeBannerModel.d());
                }
                b(wazeBannerModel.c());
                a(true);
                d(wazeBannerModel.f());
            }
        }
    }

    private void a(int i2) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setBackgroundResource(i2);
        }
    }

    private void b(int i2) {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setImageResource(i2);
        }
    }

    public final SnackItem.Type d() {
        return SnackItem.Type.NAVIGATION;
    }

    public final void a(SnackItem.Type type, Priority priority) {
        if (type == SnackItem.Type.NAVIGATION) {
            boolean z = priority.ordinal() > c().ordinal();
            if (this.n != z) {
                this.n = z;
                if (z) {
                    a(false);
                    return;
                }
                WazeBannerModel wazeBannerModel = this.b;
                if (wazeBannerModel != null) {
                    a(wazeBannerModel);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        kdi kdi = this.c;
        if (kdi != null) {
            kdi.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        kdi kdi = this.c;
        if (kdi != null) {
            kdi.b();
        }
    }
}
