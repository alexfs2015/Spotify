package com.spotify.paste.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class DownloadIndicatorDrawable extends Drawable implements Runnable {
    private final int a;
    private final int b;
    private long c;
    private final SpotifyIconDrawable d;
    private final Drawable e;
    private DownloadState f;

    /* renamed from: com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[DownloadState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable$DownloadState[] r0 = com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable$DownloadState r1 = com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState.WAITING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable$DownloadState r1 = com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState.DOWNLOADED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable$DownloadState r1 = com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.AnonymousClass1.<clinit>():void");
        }
    }

    public enum DownloadState {
        WAITING,
        DOWNLOADING,
        DOWNLOADED
    }

    public DownloadIndicatorDrawable(Context context) {
        this.d = new SpotifyIconDrawable(context, SpotifyIcon.DOWNLOAD_16);
        int b2 = uts.b(16.0f, context.getResources());
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.pasteDownloadIndicatorStyle, typedValue, true)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, a.a);
            b2 = obtainStyledAttributes.getDimensionPixelSize(a.e, b2);
            this.e = obtainStyledAttributes.getDrawable(a.d);
            this.a = obtainStyledAttributes.getColor(a.b, -16711936);
            this.b = obtainStyledAttributes.getColor(a.c, -7829368);
            obtainStyledAttributes.recycle();
        } else {
            this.e = new ColorDrawable();
            this.a = -16777216;
            this.b = -16777216;
            Assertion.b("Is the theme missing?");
        }
        this.d.a((float) b2);
        this.f = DownloadState.WAITING;
    }

    public final void a(DownloadState downloadState) {
        if (this.f != downloadState) {
            this.f = downloadState;
            if (this.f == DownloadState.DOWNLOADING) {
                a();
            } else {
                unscheduleSelf(this);
            }
            invalidateSelf();
        }
    }

    private void a() {
        this.c = SystemClock.uptimeMillis();
        scheduleSelf(this, this.c);
    }

    public final void draw(Canvas canvas) {
        this.e.setCallback(getCallback());
        this.d.setBounds(getBounds());
        this.e.setBounds(getBounds());
        int i = AnonymousClass1.a[this.f.ordinal()];
        if (i == 1) {
            this.d.a(this.b);
            this.d.draw(canvas);
        } else if (i != 2) {
            if (i == 3) {
                this.e.draw(canvas);
            }
        } else {
            this.d.a(this.a);
            this.d.draw(canvas);
        }
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.e.setLevel((int) ((((float) ((uptimeMillis - this.c) % 3500)) / 3500.0f) * 10000.0f));
        invalidateSelf();
        scheduleSelf(this, uptimeMillis + 16);
    }

    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        this.e.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        if (this.f == DownloadState.DOWNLOADING) {
            return this.e.getOpacity();
        }
        return this.d.getOpacity();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d.setBounds(rect);
        this.e.setBounds(rect);
    }

    public final int getIntrinsicWidth() {
        return this.d.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        return this.d.getIntrinsicHeight();
    }
}
