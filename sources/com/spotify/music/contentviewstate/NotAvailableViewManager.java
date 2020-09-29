package com.spotify.music.contentviewstate;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;

public final class NotAvailableViewManager {
    public int a = -1;
    private final Context b;
    private final ViewGroup c;
    private final LoadingView d;
    private DataState e;
    private boolean f = true;
    private fvd g;
    private fvd h;

    /* renamed from: com.spotify.music.contentviewstate.NotAvailableViewManager$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[DataState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.contentviewstate.NotAvailableViewManager$DataState[] r0 = com.spotify.music.contentviewstate.NotAvailableViewManager.DataState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.contentviewstate.NotAvailableViewManager$DataState r1 = com.spotify.music.contentviewstate.NotAvailableViewManager.DataState.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.contentviewstate.NotAvailableViewManager$DataState r1 = com.spotify.music.contentviewstate.NotAvailableViewManager.DataState.FAILED_TO_LOAD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.contentviewstate.NotAvailableViewManager$DataState r1 = com.spotify.music.contentviewstate.NotAvailableViewManager.DataState.LOADED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.contentviewstate.NotAvailableViewManager$DataState r1 = com.spotify.music.contentviewstate.NotAvailableViewManager.DataState.PRE_LOAD     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.contentviewstate.NotAvailableViewManager.AnonymousClass1.<clinit>():void");
        }
    }

    public enum DataState {
        PRE_LOAD,
        LOADING,
        FAILED_TO_LOAD,
        LOADED
    }

    public NotAvailableViewManager(Context context, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        this.b = context;
        this.c = viewGroup;
        this.d = LoadingView.a(layoutInflater, context, view);
        this.c.addView(this.d);
        view.setVisibility(4);
        a(DataState.PRE_LOAD);
    }

    private static fvd a(Context context, ViewGroup viewGroup) {
        fqv.f();
        fvd a2 = fvg.a(context, viewGroup);
        Resources resources = context.getResources();
        a2.a().a(gaa.b(context, SpotifyIcon.WARNING_32));
        a2.a((CharSequence) resources.getString(R.string.error_general_title));
        a2.b((CharSequence) resources.getString(R.string.error_general_body));
        viewGroup.addView(a2.getView());
        return a2;
    }

    private static fvd a(Context context, ViewGroup viewGroup, int i) {
        if (i == -1) {
            i = R.string.error_no_connection_body;
        }
        fvd a2 = lcd.a(context, context.getString(i));
        viewGroup.addView(a2.getView());
        return a2;
    }

    private void b() {
        if (this.f) {
            int i = AnonymousClass1.a[this.e.ordinal()];
            if (i == 1) {
                e();
            } else if (i == 2) {
                f();
            } else if (i != 3) {
                if (i == 4) {
                    e();
                }
            } else {
                d();
            }
        } else {
            c();
        }
    }

    private void c() {
        this.d.b();
        if (this.g == null) {
            this.g = a(this.b, this.c, this.a);
        }
        this.g.getView().setVisibility(0);
        fvd fvd = this.h;
        if (fvd != null) {
            fvd.getView().setVisibility(8);
        }
    }

    private void d() {
        g();
        this.d.b();
    }

    private void e() {
        g();
        this.d.a();
    }

    private void f() {
        this.d.b();
        if (this.h == null) {
            this.h = a(this.b, this.c);
        }
        this.h.getView().setVisibility(0);
        fvd fvd = this.g;
        if (fvd != null) {
            fvd.getView().setVisibility(8);
        }
    }

    private void g() {
        fvd fvd = this.g;
        if (fvd != null) {
            fvd.getView().setVisibility(8);
        }
        fvd fvd2 = this.h;
        if (fvd2 != null) {
            fvd2.getView().setVisibility(8);
        }
    }

    public final Boolean a() {
        return Boolean.valueOf(this.e == DataState.LOADED || this.e == DataState.LOADING);
    }

    public final void a(DataState dataState) {
        if (this.e != dataState) {
            this.e = dataState;
            b();
        }
    }

    public final void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            b();
        }
    }
}
