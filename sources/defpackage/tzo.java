package defpackage;

import android.os.Parcelable;
import com.spotify.music.R;
import com.spotify.music.slate.model.BackgroundColor;

/* renamed from: tzo reason: default package */
public abstract class tzo implements tzm {

    /* renamed from: tzo$a */
    public static abstract class a {
        public abstract a a(BackgroundColor backgroundColor);

        public abstract a a(tzb tzb);

        public abstract a a(tze tze);

        public abstract a a(b bVar);

        public abstract tzo a();

        public abstract a b(tze tze);

        public abstract a c(tze tze);
    }

    /* renamed from: tzo$b */
    public static abstract class b implements Parcelable {

        /* renamed from: tzo$b$a */
        public static abstract class a {
            public abstract a a(int i);

            public abstract a a(C0080b bVar);

            public abstract b a();

            public abstract a b(int i);
        }

        /* renamed from: tzo$b$b reason: collision with other inner class name */
        public static abstract class C0080b implements Parcelable {
            public static final C0080b e = new a().a(R.id.title).b(R.id.sub_title).c(R.id.action_button).d(R.id.image_view).a();

            /* renamed from: tzo$b$b$a */
            public static abstract class a {
                public abstract a a(int i);

                public abstract C0080b a();

                public abstract a b(int i);

                public abstract a c(int i);

                public abstract a d(int i);
            }

            public abstract int a();

            public abstract int b();

            public abstract int c();

            public abstract int d();
        }

        public abstract int a();

        public abstract int b();

        public abstract C0080b c();

        public static a d() {
            return new a();
        }

        static {
            new a().b(R.layout.slate_modal).a((int) R.layout.slate_modal).a(C0080b.e).a();
        }
    }

    public abstract tze a();

    public abstract tze b();

    public abstract tzb c();

    public abstract tze d();

    public abstract BackgroundColor e();

    public abstract b f();

    public static a g() {
        return new a();
    }
}
