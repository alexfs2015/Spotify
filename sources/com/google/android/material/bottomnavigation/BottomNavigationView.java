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
    private final ezi c;
    private MenuInflater d;

    public interface a {
    }

    public interface b {
        boolean a();
    }

    static class c extends jt {
        public static final Creator<c> CREATOR = new ClassLoaderCreator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        };
        Bundle a;

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ezi();
        this.b = new ezh(context);
        this.a = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.a.setLayoutParams(layoutParams);
        ezi ezi = this.c;
        BottomNavigationMenuView bottomNavigationMenuView = this.a;
        ezi.a = bottomNavigationMenuView;
        ezi.c = 1;
        bottomNavigationMenuView.g = ezi;
        this.b.a((bd) ezi);
        this.c.a(getContext(), this.b);
        cp b2 = faj.b(context, attributeSet, defpackage.eyt.a.r, i, 2132017903, defpackage.eyt.a.y, defpackage.eyt.a.x);
        if (b2.f(defpackage.eyt.a.w)) {
            this.a.a(b2.e(defpackage.eyt.a.w));
        } else {
            BottomNavigationMenuView bottomNavigationMenuView2 = this.a;
            bottomNavigationMenuView2.a(bottomNavigationMenuView2.e(16842808));
        }
        this.a.a(b2.e(defpackage.eyt.a.v, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (b2.f(defpackage.eyt.a.y)) {
            this.a.b(b2.g(defpackage.eyt.a.y, 0));
        }
        if (b2.f(defpackage.eyt.a.x)) {
            this.a.c(b2.g(defpackage.eyt.a.x, 0));
        }
        if (b2.f(defpackage.eyt.a.z)) {
            this.a.b(b2.e(defpackage.eyt.a.z));
        }
        if (b2.f(defpackage.eyt.a.s)) {
            ip.e((View) this, (float) b2.e(defpackage.eyt.a.s, 0));
        }
        int c2 = b2.c(defpackage.eyt.a.A, -1);
        if (this.a.c != c2) {
            this.a.c = c2;
            this.c.a(false);
        }
        boolean a2 = b2.a(defpackage.eyt.a.u, true);
        if (this.a.b != a2) {
            this.a.b = a2;
            this.c.a(false);
        }
        this.a.d(b2.g(defpackage.eyt.a.t, 0));
        if (b2.f(defpackage.eyt.a.B)) {
            int g = b2.g(defpackage.eyt.a.B, 0);
            this.c.b = true;
            if (this.d == null) {
                this.d = new ao(getContext());
            }
            this.d.inflate(g, this.b);
            ezi ezi2 = this.c;
            ezi2.b = false;
            ezi2.a(true);
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
                if (BottomNavigationView.a(BottomNavigationView.this) == null || menuItem.getItemId() != BottomNavigationView.this.a.e) {
                    return BottomNavigationView.b(BottomNavigationView.this) != null && !BottomNavigationView.b(BottomNavigationView.this).a();
                }
                BottomNavigationView.a(BottomNavigationView.this);
                return true;
            }
        });
    }

    static /* synthetic */ a a(BottomNavigationView bottomNavigationView) {
        return null;
    }

    static /* synthetic */ b b(BottomNavigationView bottomNavigationView) {
        return null;
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

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = new Bundle();
        this.b.a(cVar.a);
        return cVar;
    }
}
