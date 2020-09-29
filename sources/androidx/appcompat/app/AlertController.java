package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public final class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    int M;
    public int N;
    public int O;
    public boolean P;
    Handler Q;
    public final OnClickListener R = new OnClickListener() {
        public final void onClick(View view) {
            Message message = (view != AlertController.this.o || AlertController.this.q == null) ? (view != AlertController.this.s || AlertController.this.u == null) ? (view != AlertController.this.w || AlertController.this.y == null) ? null : Message.obtain(AlertController.this.y) : Message.obtain(AlertController.this.u) : Message.obtain(AlertController.this.q);
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.Q.obtainMessage(1, AlertController.this.b).sendToTarget();
        }
    };
    private int S = 0;
    public final Context a;
    public final u b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n = false;
    public Button o;
    public CharSequence p;
    Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    Message y;
    public Drawable z;

    public static class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.o.a.bW);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(defpackage.o.a.bX, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(defpackage.o.a.bY, -1);
        }
    }

    public static class a {
        public final Context a;
        public final LayoutInflater b;
        public Drawable c;
        public CharSequence d;
        public View e;
        public CharSequence f;
        public CharSequence g;
        public DialogInterface.OnClickListener h;
        public CharSequence i;
        public DialogInterface.OnClickListener j;
        public boolean k;
        public OnKeyListener l;
        public ListAdapter m;
        public DialogInterface.OnClickListener n;
        public int o;
        public View p;
        public boolean q = false;
        public boolean r;
        public int s = -1;
        private int t = 0;
        private int u = 0;
        private boolean v = true;

        public a(Context context) {
            this.a = context;
            this.k = true;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    static final class b extends Handler {
        private WeakReference<DialogInterface> a;

        public b(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
                return;
            }
            if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class c extends ArrayAdapter<CharSequence> {
        public c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, u uVar, Window window) {
        this.a = context;
        this.b = uVar;
        this.c = window;
        this.Q = new b(uVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, defpackage.o.a.G, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(defpackage.o.a.H, 0);
        this.K = obtainStyledAttributes.getResourceId(defpackage.o.a.J, 0);
        this.L = obtainStyledAttributes.getResourceId(defpackage.o.a.L, 0);
        this.M = obtainStyledAttributes.getResourceId(defpackage.o.a.M, 0);
        this.N = obtainStyledAttributes.getResourceId(defpackage.o.a.O, 0);
        this.O = obtainStyledAttributes.getResourceId(defpackage.o.a.K, 0);
        this.P = obtainStyledAttributes.getBoolean(defpackage.o.a.N, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(defpackage.o.a.I, 0);
        obtainStyledAttributes.recycle();
        uVar.a(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void a(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public static void a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.Q.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void a(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
