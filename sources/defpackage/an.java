package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: an reason: default package */
public final class an extends ActionMode {
    final aj a;
    private Context b;

    /* renamed from: an$a */
    public static class a implements defpackage.aj.a {
        private Callback a;
        private Context b;
        private ArrayList<an> c = new ArrayList<>();
        private dv<Menu, Menu> d = new dv<>();

        public a(Context context, Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public final boolean a(aj ajVar, Menu menu) {
            return this.a.onCreateActionMode(b(ajVar), a(menu));
        }

        public final boolean b(aj ajVar, Menu menu) {
            return this.a.onPrepareActionMode(b(ajVar), a(menu));
        }

        public final boolean a(aj ajVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(ajVar), new ba(this.b, (gu) menuItem));
        }

        public final void a(aj ajVar) {
            this.a.onDestroyActionMode(b(ajVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            bf bfVar = new bf(this.b, (gt) menu);
            this.d.put(menu, bfVar);
            return bfVar;
        }

        public final ActionMode b(aj ajVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                an anVar = (an) this.c.get(i);
                if (anVar != null && anVar.a == ajVar) {
                    return anVar;
                }
            }
            an anVar2 = new an(this.b, ajVar);
            this.c.add(anVar2);
            return anVar2;
        }
    }

    public an(Context context, aj ajVar) {
        this.b = context;
        this.a = ajVar;
    }

    public final Object getTag() {
        return this.a.b;
    }

    public final void setTag(Object obj) {
        this.a.b = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void invalidate() {
        this.a.d();
    }

    public final void finish() {
        this.a.c();
    }

    public final Menu getMenu() {
        return new bf(this.b, (gt) this.a.b());
    }

    public final CharSequence getTitle() {
        return this.a.f();
    }

    public final void setTitle(int i) {
        this.a.a(i);
    }

    public final CharSequence getSubtitle() {
        return this.a.g();
    }

    public final void setSubtitle(int i) {
        this.a.b(i);
    }

    public final View getCustomView() {
        return this.a.i();
    }

    public final void setCustomView(View view) {
        this.a.a(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.a.a();
    }

    public final boolean getTitleOptionalHint() {
        return this.a.c;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.a.a(z);
    }

    public final boolean isTitleOptional() {
        return this.a.h();
    }
}
