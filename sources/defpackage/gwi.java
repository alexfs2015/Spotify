package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: gwi reason: default package */
public interface gwi<V extends View> {

    /* renamed from: gwi$a */
    public interface a<V extends View> {
    }

    /* renamed from: gwi$b */
    public interface b {
        Parcelable a(hcm hcm);

        boolean a(hcm hcm, Parcelable parcelable);
    }

    /* renamed from: gwi$c */
    public static abstract class c<H extends a<?>> implements gwi<View> {

        /* renamed from: gwi$c$a */
        public static abstract class a<V extends View> {
            public final V a;

            protected a(V v) {
                this.a = (View) fbp.a(v);
            }

            /* access modifiers changed from: protected */
            public abstract void a(hcm hcm, a<View> aVar, int... iArr);

            /* access modifiers changed from: protected */
            public abstract void a(hcm hcm, gwm gwm, b bVar);
        }

        private static a<?> a(View view) {
            return (a) fbp.a(view.getTag(R.id.hub_framework_view_holder_tag));
        }

        public final View a(ViewGroup viewGroup, gwm gwm) {
            a aVar = (a) fbp.a(b(viewGroup, gwm));
            aVar.a.setTag(R.id.hub_framework_view_holder_tag, aVar);
            return aVar.a;
        }

        public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
            a(view).a(hcm, aVar, iArr);
        }

        public final void a(View view, hcm hcm, gwm gwm, b bVar) {
            a(view).a(hcm, gwm, bVar);
        }

        /* access modifiers changed from: protected */
        public abstract H b(ViewGroup viewGroup, gwm gwm);
    }

    V a(ViewGroup viewGroup, gwm gwm);

    void a(V v, hcm hcm, a<View> aVar, int... iArr);

    void a(V v, hcm hcm, gwm gwm, b bVar);
}
