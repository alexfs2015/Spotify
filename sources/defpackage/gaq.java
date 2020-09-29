package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.spotify.paste.widgets.DialogLayout;

/* renamed from: gaq reason: default package */
public final class gaq extends Dialog {
    /* access modifiers changed from: private */
    public rma a;
    /* access modifiers changed from: private */
    public String b;
    /* access modifiers changed from: private */
    public String c;
    private boolean d;
    /* access modifiers changed from: private */
    public Button e;
    /* access modifiers changed from: private */
    public Button f;

    /* renamed from: gaq$a */
    public static class a {
        public CharSequence a;
        public CharSequence b;
        public View c;
        OnClickListener d;
        OnClickListener e;
        public OnCancelListener f;
        public OnDismissListener g;
        public boolean h = true;
        public boolean i;
        private Context j;
        private int k;
        private CharSequence l;
        private CharSequence m;
        private rma n;
        private String o;
        private String p;

        public a(Context context, int i2) {
            this.j = context;
            this.k = i2;
        }

        public final a a(int i2) {
            this.a = this.j.getResources().getText(i2);
            return this;
        }

        public final a a(int i2, OnClickListener onClickListener) {
            this.l = this.j.getResources().getText(i2);
            this.d = onClickListener;
            return this;
        }

        public final a a(CharSequence charSequence, OnClickListener onClickListener) {
            this.m = charSequence;
            this.e = onClickListener;
            return this;
        }

        public final a a(rma rma, String str, String str2) {
            this.n = rma;
            this.o = str;
            this.p = str2;
            return this;
        }

        public final gaq a() {
            final gaq gaq = new gaq(this.j, this.k);
            gaq.setCancelable(this.h);
            gaq.setOnCancelListener(this.f);
            gaq.setOnDismissListener(this.g);
            DialogLayout dialogLayout = new DialogLayout(gaq.getContext(), this.i);
            CharSequence charSequence = this.l;
            if (charSequence != null) {
                dialogLayout.a(charSequence, (View.OnClickListener) new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (a.this.d != null) {
                            a.this.d.onClick(gaq, -1);
                        }
                        gaq.dismiss();
                    }
                });
            }
            CharSequence charSequence2 = this.m;
            if (charSequence2 != null) {
                dialogLayout.b(charSequence2, (View.OnClickListener) new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (a.this.e != null) {
                            a.this.e.onClick(gaq, -2);
                        }
                        gaq.dismiss();
                    }
                });
            }
            CharSequence charSequence3 = this.a;
            if (charSequence3 != null) {
                dialogLayout.a(charSequence3);
            }
            CharSequence charSequence4 = this.b;
            if (charSequence4 != null) {
                dialogLayout.b(charSequence4);
            }
            View view = this.c;
            if (view != null) {
                dialogLayout.a(view);
            }
            gaq.f = dialogLayout.b;
            gaq.e = dialogLayout.a;
            gaq.a = this.n;
            gaq.b = this.o;
            gaq.c = this.p;
            gaq.setContentView(dialogLayout);
            return gaq;
        }

        public final a b(int i2) {
            this.b = this.j.getResources().getText(i2);
            return this;
        }

        public final a b(int i2, OnClickListener onClickListener) {
            a(this.j.getResources().getText(i2), onClickListener);
            return this;
        }
    }

    protected gaq(Context context, int i) {
        super(context, i);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rma rma = this.a;
        if (rma != null) {
            String str = this.b;
            if (str != null && !this.d) {
                rma.a(str, this.c);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rma rma = this.a;
        if (rma != null) {
            rma.Z_();
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        this.d = true;
    }
}
