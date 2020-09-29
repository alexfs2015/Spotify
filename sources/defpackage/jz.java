package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: jz reason: default package */
public class jz extends Fragment implements OnCancelListener, OnDismissListener {
    private Handler T;
    private Runnable U = new Runnable() {
        public final void run() {
            if (jz.this.b != null) {
                jz jzVar = jz.this;
                jzVar.onDismiss(jzVar.b);
            }
        }
    };
    private int V = 0;
    private int W = 0;
    private boolean X = true;
    private int Y = -1;
    private boolean Z;
    protected boolean a = true;
    private boolean aa;
    private boolean ab;
    protected Dialog b;

    public void onCancel(DialogInterface dialogInterface) {
    }

    public final void a(int i, int i2) {
        this.V = i;
        int i3 = this.V;
        if (i3 == 2 || i3 == 3) {
            this.W = 16973913;
        }
        if (i2 != 0) {
            this.W = i2;
        }
    }

    public void a(kf kfVar, String str) {
        this.aa = false;
        this.ab = true;
        km a2 = kfVar.a();
        a2.a((Fragment) this, str);
        a2.b();
    }

    public void c() {
        a(false, false);
    }

    private void a(boolean z, boolean z2) {
        if (!this.aa) {
            this.aa = true;
            this.ab = false;
            Dialog dialog = this.b;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.b.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.T.getLooper()) {
                        onDismiss(this.b);
                    } else {
                        this.T.post(this.U);
                    }
                }
            }
            this.Z = true;
            if (this.Y >= 0) {
                s().a(this.Y, 1);
                this.Y = -1;
                return;
            }
            km a2 = s().a();
            a2.a((Fragment) this);
            if (z) {
                a2.c();
            } else {
                a2.b();
            }
        }
    }

    public int aa_() {
        return this.W;
    }

    public final void a(boolean z) {
        this.X = z;
        Dialog dialog = this.b;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void a(Context context) {
        super.a(context);
        if (!this.ab) {
            this.aa = false;
        }
    }

    public void aK_() {
        super.aK_();
        if (!this.ab && !this.aa) {
            this.aa = true;
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.T = new Handler();
        this.a = this.y == 0;
        if (bundle != null) {
            this.V = bundle.getInt("android:style", 0);
            this.W = bundle.getInt("android:theme", 0);
            this.X = bundle.getBoolean("android:cancelable", true);
            this.a = bundle.getBoolean("android:showsDialog", this.a);
            this.Y = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater c(Bundle bundle) {
        if (!this.a) {
            return super.c(bundle);
        }
        this.b = a(bundle);
        Dialog dialog = this.b;
        String str = "layout_inflater";
        if (dialog == null) {
            return (LayoutInflater) this.u.b.getSystemService(str);
        }
        a(dialog, this.V);
        return (LayoutInflater) this.b.getContext().getSystemService(str);
    }

    public void a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog a(Bundle bundle) {
        return new Dialog(o(), aa_());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.Z) {
            a(true, true);
        }
    }

    public void d(Bundle bundle) {
        super.d(bundle);
        if (this.a) {
            View view = this.H;
            if (view != null) {
                if (view.getParent() == null) {
                    this.b.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            ka p = p();
            if (p != null) {
                this.b.setOwnerActivity(p);
            }
            this.b.setCancelable(this.X);
            this.b.setOnCancelListener(this);
            this.b.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.b.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void g() {
        super.g();
        Dialog dialog = this.b;
        if (dialog != null) {
            this.Z = false;
            dialog.show();
        }
    }

    public void e(Bundle bundle) {
        super.e(bundle);
        Dialog dialog = this.b;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        int i = this.V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.X;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.a;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.Y;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void h() {
        super.h();
        Dialog dialog = this.b;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void ax_() {
        super.ax_();
        Dialog dialog = this.b;
        if (dialog != null) {
            this.Z = true;
            dialog.setOnDismissListener(null);
            this.b.dismiss();
            if (!this.aa) {
                onDismiss(this.b);
            }
            this.b = null;
        }
    }
}
