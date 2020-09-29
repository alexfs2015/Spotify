package defpackage;

import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem.Priority;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem.Type;

/* renamed from: jqn reason: default package */
public abstract class jqn implements SnackItem {
    final int a;
    private final SnackBar b;
    private boolean c = false;
    private final String d;

    public void a(Type type, Priority priority) {
    }

    protected jqn(SnackBar snackBar, int i, String str) {
        this.b = snackBar;
        this.a = i;
        this.d = str;
    }

    public final int a() {
        return this.a;
    }

    public final void a(boolean z) {
        boolean z2 = this.c != z;
        this.c = z;
        if (z2) {
            SnackBar snackBar = this.b;
            Type d2 = d();
            Priority c2 = c();
            int ordinal = Priority.DEFAULT.ordinal();
            for (SnackItem snackItem : snackBar.a) {
                if (snackItem.d() == d2 && snackItem != this) {
                    ordinal = Math.max(ordinal, snackItem.c().ordinal());
                }
            }
            Priority priority = Priority.c[ordinal];
            if (c2.ordinal() > priority.ordinal()) {
                if (!z) {
                    c2 = priority;
                }
                for (SnackItem a2 : snackBar.a) {
                    a2.a(d2, c2);
                }
            }
            snackBar.a();
        }
    }

    public boolean aH_() {
        return this.c;
    }

    public Priority c() {
        return Priority.DEFAULT;
    }

    public Type d() {
        return Type.DEFAULT;
    }
}
