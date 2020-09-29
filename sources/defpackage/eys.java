package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.a;
import com.spotify.music.R;

/* renamed from: eys reason: default package */
public final class eys extends u {
    boolean a;
    boolean b;
    boolean c;
    private BottomSheetBehavior<FrameLayout> d;
    private a e;

    public final void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.d = z;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.d;
        if (bottomSheetBehavior != null && bottomSheetBehavior.e == 5) {
            this.d.b(4);
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    private View a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.design_bottom_sheet);
        this.d = BottomSheetBehavior.a(frameLayout2);
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.d;
        bottomSheetBehavior.j = this.e;
        bottomSheetBehavior.d = this.a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (eys.this.a && eys.this.isShowing()) {
                    eys eys = eys.this;
                    if (!eys.c) {
                        TypedArray obtainStyledAttributes = eys.getContext().obtainStyledAttributes(new int[]{16843611});
                        eys.b = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        eys.c = true;
                    }
                    if (eys.b) {
                        eys.this.cancel();
                    }
                }
            }
        });
        ip.a((View) frameLayout2, (ht) new ht() {
            public final void a(View view, ja jaVar) {
                super.a(view, jaVar);
                if (eys.this.a) {
                    jaVar.a(1048576);
                    jaVar.k(true);
                    return;
                }
                jaVar.k(false);
            }

            public final boolean a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !eys.this.a) {
                    return super.a(view, i, bundle);
                }
                eys.this.cancel();
                return true;
            }
        });
        frameLayout2.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }

    public eys(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = 2132017707;
            }
        }
        super(context, i);
        this.a = true;
        this.b = true;
        this.e = new a() {
            public final void a(float f) {
            }

            public final void a(int i) {
                if (i == 5) {
                    eys.this.cancel();
                }
            }
        };
        a(1);
    }
}
