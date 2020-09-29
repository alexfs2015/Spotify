package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: gui reason: default package */
public interface gui<V extends View> {

    /* renamed from: gui$a */
    public interface a<V extends View> {
    }

    /* renamed from: gui$b */
    public interface b {
        Parcelable a(gzt gzt);

        boolean a(gzt gzt, Parcelable parcelable);
    }

    /* renamed from: gui$c */
    public static abstract class c<H extends a<?>> implements gui<View> {

        /* renamed from: gui$c$a */
        public static abstract class a<V extends View> {
            public final V a;

            /* access modifiers changed from: protected */
            public abstract void a(gzt gzt, a<View> aVar, int... iArr);

            /* access modifiers changed from: protected */
            public abstract void a(gzt gzt, gum gum, b bVar);

            protected a(V v) {
                this.a = (View) fay.a(v);
            }
        }

        /* access modifiers changed from: protected */
        public abstract H b(ViewGroup viewGroup, gum gum);

        public final View a(ViewGroup viewGroup, gum gum) {
            a aVar = (a) fay.a(b(viewGroup, gum));
            aVar.a.setTag(R.id.hub_framework_view_holder_tag, aVar);
            return aVar.a;
        }

        public final void a(View view, gzt gzt, gum gum, b bVar) {
            a(view).a(gzt, gum, bVar);
        }

        public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
            a(view).a(gzt, aVar, iArr);
        }

        private static a<?> a(View view) {
            return (a) fay.a(view.getTag(R.id.hub_framework_view_holder_tag));
        }
    }

    V a(ViewGroup viewGroup, gum gum);

    void a(V v, gzt gzt, a<View> aVar, int... iArr);

    void a(V v, gzt gzt, gum gum, b bVar);
}
