package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.music.R;

public class BottomNavigationView extends FrameLayout {
    final BottomNavigationMenuView a;
    private final ax b;
    private final eyr c;
    private MenuInflater d;

    public interface a {
    }

    public interface b {
        boolean a();
    }

    static class c extends jt {
        public static final Creator<c> CREATOR = new ClassLoaderCreator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        };
        Bundle a;

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }

    static /* synthetic */ a a(BottomNavigationView bottomNavigationView) {
        return null;
    }

    static /* synthetic */ b b(BottomNavigationView bottomNavigationView) {
        return null;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new eyr();
        this.b = new eyq(context);
        this.a = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.a.setLayoutParams(layoutParams);
        eyr eyr = this.c;
        BottomNavigationMenuView bottomNavigationMenuView = this.a;
        eyr.a = bottomNavigationMenuView;
        eyr.c = 1;
        bottomNavigationMenuView.g = eyr;
        this.b.a((bd) eyr);
        this.c.a(getContext(), this.b);
        cp b2 = ezs.b(context, attributeSet, defpackage.eyc.a.r, i, 2132017900, defpackage.eyc.a.y, defpackage.eyc.a.x);
        if (b2.f(defpackage.eyc.a.w)) {
            this.a.a(b2.e(defpackage.eyc.a.w));
        } else {
            BottomNavigationMenuView bottomNavigationMenuView2 = this.a;
            bottomNavigationMenuView2.a(bottomNavigationMenuView2.e(16842808));
        }
        this.a.a(b2.e(defpackage.eyc.a.v, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (b2.f(defpackage.eyc.a.y)) {
            this.a.b(b2.g(defpackage.eyc.a.y, 0));
        }
        if (b2.f(defpackage.eyc.a.x)) {
            this.a.c(b2.g(defpackage.eyc.a.x, 0));
        }
        if (b2.f(defpackage.eyc.a.z)) {
            this.a.b(b2.e(defpackage.eyc.a.z));
        }
        if (b2.f(defpackage.eyc.a.s)) {
            ip.e((View) this, (float) b2.e(defpackage.eyc.a.s, 0));
        }
        int c2 = b2.c(defpackage.eyc.a.A, -1);
        if (this.a.c != c2) {
            this.a.c = c2;
            this.c.a(false);
        }
        boolean a2 = b2.a(defpackage.eyc.a.u, true);
        if (this.a.b != a2) {
            this.a.b = a2;
            this.c.a(false);
        }
        this.a.d(b2.g(defpackage.eyc.a.t, 0));
        if (b2.f(defpackage.eyc.a.B)) {
            int g = b2.g(defpackage.eyc.a.B, 0);
            this.c.b = true;
            if (this.d == null) {
                this.d = new ao(getContext());
            }
            this.d.inflate(g, this.b);
            eyr eyr2 = this.c;
            eyr2.b = false;
            eyr2.a(true);
        }
        b2.a.recycle();
        addView(this.a, layoutParams);
        if (VERSION.SDK_INT < 21) {
            View view = new View(context);
            view.setBackgroundColor(fr.c(context, R.color.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        this.b.a((defpackage.ax.a) new defpackage.ax.a() {
            public final void a(ax axVar) {
            }

            public final boolean a(ax axVar, MenuItem menuItem) {
                if (BottomNavigationView.a(BottomNavigationView.this) != null && menuItem.getItemId() == BottomNavigationView.this.a.e) {
                    BottomNavigationView.a(BottomNavigationView.this);
                    return true;
                } else if (BottomNavigationView.b(BottomNavigationView.this) == null || BottomNavigationView.b(BottomNavigationView.this).a()) {
                    return false;
                } else {
                    return true;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = new Bundle();
        this.b.a(cVar.a);
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.d);
        this.b.b(cVar.a);
    }
}
