package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.spotify.music.R;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.DrawableState;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.b;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.c;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.d;

/* renamed from: qco reason: default package */
public final class qco extends shl {
    private static final pvn f = new pvn() {
        public final void aF_() {
        }

        public final void f() {
        }
    };
    public final ToolbarSearchFieldView a;
    /* access modifiers changed from: private */
    public final pvn d;
    private final boolean e;

    /* renamed from: qco$a */
    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }
        };
        public final String a;
        public final boolean b;

        public final int describeContents() {
            return 0;
        }

        /* synthetic */ a(Parcel parcel, byte b2) {
            this(parcel);
        }

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        private a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = jse.a(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            jse.a(parcel, this.b);
        }
    }

    public qco(Activity activity, ToolbarSearchFieldView toolbarSearchFieldView, boolean z) {
        this(activity, toolbarSearchFieldView, false, f, false);
    }

    public qco(Activity activity, ToolbarSearchFieldView toolbarSearchFieldView, boolean z, pvn pvn, boolean z2) {
        this.a = (ToolbarSearchFieldView) fay.a(toolbarSearchFieldView);
        this.d = (pvn) fay.a(pvn);
        if (z2) {
            toolbarSearchFieldView.a.addTextChangedListener(new sho(toolbarSearchFieldView.a));
        }
        this.e = z;
        ToolbarSearchFieldView toolbarSearchFieldView2 = this.a;
        toolbarSearchFieldView2.getLayoutParams().width = -1;
        toolbarSearchFieldView2.getLayoutParams().height = gab.b(activity);
        ip.a((View) toolbarSearchFieldView2, gab.c(activity));
        this.a.a((d) new d() {
            public final void a() {
                if (!qco.this.f()) {
                    qco.this.a();
                }
                qco.this.c();
                qco.this.g();
            }

            public final void b() {
                qco.this.d.aF_();
            }
        });
        this.a.i = (c) fav.a(new c() {
            public final void a() {
                qco.this.d.f();
            }
        }, ToolbarSearchFieldView.l);
        this.a.a((b) new b() {
            public final void a() {
                if (!(qco.this.b != null && qco.this.b.onToolbarUpButtonPressed())) {
                    qco.this.b();
                    qco.this.c();
                }
            }

            public final void b() {
                qco.this.b();
            }

            public final void c() {
                qco.this.a();
                qco.this.a.d.setPressed(false);
                Animator animator = ((uue) qco.this.a.d).c().a;
                if (animator != null) {
                    animator.cancel();
                }
            }
        });
        if (this.e) {
            ToolbarSearchFieldView toolbarSearchFieldView3 = this.a;
            toolbarSearchFieldView3.k = true;
            toolbarSearchFieldView3.f = new TransitionDrawable(new Drawable[]{toolbarSearchFieldView3.g, toolbarSearchFieldView3.h});
            toolbarSearchFieldView3.f.setCrossFadeEnabled(true);
            toolbarSearchFieldView3.b.setImageDrawable(toolbarSearchFieldView3.f);
            toolbarSearchFieldView3.e = DrawableState.SCANNABLES;
            toolbarSearchFieldView3.b.setVisibility(0);
            toolbarSearchFieldView3.i.a();
            jm.b(toolbarSearchFieldView3.d, null, null, null, null);
        }
        i();
    }

    public final void a(String str) {
        super.a(str);
        boolean a2 = fax.a(str);
        if (!this.a.a()) {
            this.a.a(!a2);
            return;
        }
        if (this.e) {
            if (this.a.e == DrawableState.SCANNABLES && !a2) {
                ToolbarSearchFieldView toolbarSearchFieldView = this.a;
                if (toolbarSearchFieldView.f != null) {
                    toolbarSearchFieldView.f.startTransition(200);
                    toolbarSearchFieldView.e = DrawableState.CLEAR;
                    toolbarSearchFieldView.b.setContentDescription(toolbarSearchFieldView.b.getContext().getString(R.string.voice_search_clear_content_desc));
                }
            } else if (this.a.e == DrawableState.CLEAR && a2) {
                ToolbarSearchFieldView toolbarSearchFieldView2 = this.a;
                if (toolbarSearchFieldView2.f != null) {
                    toolbarSearchFieldView2.f.reverseTransition(200);
                    ip.c((View) toolbarSearchFieldView2.b, 1.2f);
                    ip.d((View) toolbarSearchFieldView2.b, 1.2f);
                    toolbarSearchFieldView2.e = DrawableState.SCANNABLES;
                }
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.j.c();
        } else if (j()) {
            this.a.j.d();
        }
        super.a(z);
    }

    public final void a() {
        super.a();
        this.a.j.b();
    }

    public final void a(int i) {
        super.a(i);
        this.a.j.b();
    }

    public final void b() {
        if (j()) {
            this.a.j.a();
        }
        super.b();
    }

    public final void c() {
        if (f()) {
            super.c();
        } else {
            this.a.j.a();
        }
    }

    private boolean j() {
        return TextUtils.isEmpty(this.a.a.getText());
    }

    public final void b(int i) {
        this.a.d.setText(R.string.concerts_location_hint);
    }

    public final EditText d() {
        return this.a.a;
    }

    public final void b(boolean z) {
        boolean z2 = this.a.j.a;
        this.a.j.a = true;
        this.a.j.b();
        this.a.j.a = z2;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            boolean z = this.a.j.a;
            this.a.j.a = true;
            if (!fax.a(aVar.a)) {
                b(aVar.a);
            }
            if (aVar.b) {
                a();
            } else {
                b();
            }
            this.a.j.a = z;
        }
    }

    public final void a(float f2) {
        super.a(f2);
        this.a.setAlpha(f2);
    }

    public final float e() {
        return this.a.getAlpha();
    }

    public final void b(String str) {
        if (!fax.a(str)) {
            this.a.j.b();
        } else if (!f()) {
            this.a.j.a();
        }
        super.b(str);
    }
}
