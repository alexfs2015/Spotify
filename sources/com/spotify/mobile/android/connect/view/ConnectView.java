package com.spotify.mobile.android.connect.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.music.R;

public class ConnectView extends LinearLayout implements vfv {
    private static final int[] d = {R.attr.devices_available};
    private static final int[] e = {R.attr.remote_active};
    public LinearLayout a;
    public TextView b;
    public boolean c;
    private guj f;
    private gui g;
    private guk h;
    private boolean i;
    private boolean j;
    private final vfu k = new vfu(this);

    /* renamed from: com.spotify.mobile.android.connect.view.ConnectView$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Tech.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.connect.model.Tech[] r0 = com.spotify.mobile.android.connect.model.Tech.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.CONNECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.CAST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.CAST_JS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.view.ConnectView.AnonymousClass1.<clinit>():void");
        }
    }

    public ConnectView(Context context) {
        super(context);
    }

    public ConnectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConnectView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void a(String str) {
        if (!TextUtils.equals(this.b.getText(), str)) {
            this.b.setText(str);
            setContentDescription(str);
        }
    }

    public final void a() {
        this.i = true;
        this.j = false;
        refreshDrawableState();
        a(getContext().getString(R.string.player_connect_devices_available));
        this.f.b();
        this.h.b();
        this.g.c();
    }

    public void a(int i2) {
        this.f.a(i2, i2);
        this.g.a(i2, i2);
        this.h.a(i2, i2);
    }

    public final void a(b bVar) {
        this.k.a(bVar);
    }

    public final void a(Tech tech) {
        this.i = true;
        this.j = true;
        refreshDrawableState();
        a(getContext().getString(R.string.player_connect_connecting));
        this.g.b();
        int i2 = AnonymousClass1.a[tech.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    String str = "kesn cwth Unno";
                    StringBuilder sb = new StringBuilder("Unknown tech: ");
                    sb.append(tech);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f.b();
            this.h.c();
            return;
        }
        this.f.a();
        this.h.b();
    }

    public final void a(Tech tech, String str) {
        this.i = true;
        this.j = true;
        refreshDrawableState();
        a(str);
        this.g.b();
        int i2 = AnonymousClass1.a[tech.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    String str2 = " tnmhwcnUoke n";
                    StringBuilder sb = new StringBuilder("Unknown tech: ");
                    sb.append(tech);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f.b();
            this.h.a();
            return;
        }
        this.f.a();
        this.h.b();
    }

    public final void b() {
        this.i = false;
        this.j = false;
        refreshDrawableState();
        a(getContext().getString(R.string.player_connect_devices_available));
        this.f.b();
        this.h.b();
        this.g.c();
    }

    public final b c() {
        return this.k.a;
    }

    public final void d() {
        this.b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.k.a();
    }

    public final void e() {
        this.b.setVisibility(0);
    }

    public final void f() {
        LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(R.dimen.connect_device_mini_height);
        a((int) getResources().getDimension(R.dimen.connect_device_mini_height));
        this.b.setPadding((int) getResources().getDimension(R.dimen.connect_device_space_for_device_name), 0, 0, 0);
        this.a.setLayoutParams(layoutParams);
        this.a.requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.k.b();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.i) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        if (this.j) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LinearLayout) findViewById(R.id.connect_buttons_container);
        this.b = (TextView) findViewById(R.id.btn_connect);
        ImageView imageView = (ImageView) findViewById(R.id.icn_connect);
        ImageView imageView2 = (ImageView) findViewById(R.id.icn_cast);
        ImageView imageView3 = (ImageView) findViewById(R.id.icn_devices);
        gul gul = new gul(getContext(), vfj.b(20.0f, getResources()), R.color.btn_now_playing_connect);
        this.h = new guc(imageView2, gul);
        this.f = new guf(imageView, gul);
        this.g = new gui(imageView3, gul);
        this.f.b();
        this.h.b();
        this.g.b();
        refreshDrawableState();
        vfz.b(this).a(this.b).b(imageView, imageView2).a();
    }

    public void setPressed(boolean z) {
        if (this.c) {
            super.setPressed(z);
        }
    }
}
