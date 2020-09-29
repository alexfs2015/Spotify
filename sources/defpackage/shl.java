package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: shl reason: default package */
public abstract class shl implements shr {
    private static final b f = $$Lambda$shl$X6JtFw0CRAA2UrLsgDQSyPrOA.INSTANCE;
    private final CopyOnWriteArraySet<a> a = new CopyOnWriteArraySet<>();
    public b b;
    private OnEditorActionListener d = new $$Lambda$shl$9v65hD4arB7uJ_6AI8PBzHz_cIw(this);
    private jxg e;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean k() {
        return false;
    }

    public void a(float f2) {
    }

    public void b(boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract EditText d();

    public float e() {
        return 1.0f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if ((i == 3) || (i == 0 && keyEvent != null && keyEvent.getAction() == 0)) {
            if (this.a.isEmpty()) {
                z = false;
            } else {
                String h = h();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).c(h);
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void a(a aVar) {
        this.a.add(fay.a(aVar));
    }

    public final void b(a aVar) {
        this.a.remove(fay.a(aVar));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onQueryChanged(str);
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z);
        }
    }

    public final void a(b bVar) {
        this.b = (b) fav.a(bVar, f);
    }

    public void b(int i) {
        d().setHint(R.string.concerts_location_hint);
    }

    public final boolean f() {
        return d().hasFocus();
    }

    public void a() {
        EditText d2 = d();
        d2.requestFocus();
        gac.c(d2);
    }

    public void a(int i) {
        EditText d2 = d();
        d2.requestFocus();
        d2.postDelayed(new Runnable(d2) {
            private /* synthetic */ View a;

            {
                this.a = r1;
            }

            public final void run() {
                gac.c(this.a);
            }
        }, (long) i);
    }

    public void b() {
        EditText d2 = d();
        d2.clearFocus();
        gac.b(d2);
    }

    public void c() {
        d().getText().clear();
    }

    public void b(String str) {
        a(str, true);
    }

    public final void a(String str, boolean z) {
        EditText d2 = d();
        if (!z) {
            d2.removeTextChangedListener(this.e);
        }
        d2.setText(str);
        d2.setSelection(d2.length());
        if (!z) {
            d2.addTextChangedListener(this.e);
        }
    }

    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).ah();
        }
    }

    public final String h() {
        return jsd.a((CharSequence) d().getText());
    }

    public final void i() {
        j();
    }

    private void j() {
        EditText d2 = d();
        d2.setOnEditorActionListener(this.d);
        d2.setOnFocusChangeListener(new $$Lambda$shl$eIwTvZER0UcgmhnXOa7NU_7cw(this));
        this.e = new jxg() {
            public final void afterTextChanged(Editable editable) {
                shl.this.a(jsd.a((CharSequence) editable));
            }
        };
        d2.addTextChangedListener(this.e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z) {
        a(z);
    }
}
