package defpackage;

import android.os.Parcelable;
import com.spotify.music.R;
import com.spotify.music.slate.model.BackgroundColor;

/* renamed from: umj reason: default package */
public abstract class umj implements umh {

    /* renamed from: umj$a */
    public static abstract class a {
        public abstract a a(BackgroundColor backgroundColor);

        public abstract a a(ulw ulw);

        public abstract a a(ulz ulz);

        public abstract a a(b bVar);

        public abstract umj a();

        public abstract a b(ulz ulz);

        public abstract a c(ulz ulz);
    }

    /* renamed from: umj$b */
    public static abstract class b implements Parcelable {

        /* renamed from: umj$b$a */
        public static abstract class a {
            public abstract a a(int i);

            public abstract a a(C0082b bVar);

            public abstract b a();

            public abstract a b(int i);
        }

        /* renamed from: umj$b$b reason: collision with other inner class name */
        public static abstract class C0082b implements Parcelable {
            public static final C0082b e = new a().a(R.id.title).b(R.id.sub_title).c(R.id.action_button).d(R.id.image_view).a();

            /* renamed from: umj$b$b$a */
            public static abstract class a {
                public abstract a a(int i);

                public abstract C0082b a();

                public abstract a b(int i);

                public abstract a c(int i);

                public abstract a d(int i);
            }

            public abstract int a();

            public abstract int b();

            public abstract int c();

            public abstract int d();
        }

        static {
            new a().b(R.layout.slate_modal).a((int) R.layout.slate_modal).a(C0082b.e).a();
        }

        public static a d() {
            return new a();
        }

        public abstract int a();

        public abstract int b();

        public abstract C0082b c();
    }

    public static a g() {
        return new a();
    }

    public abstract ulz a();

    public abstract ulz b();

    public abstract ulw c();

    public abstract ulz d();

    public abstract BackgroundColor e();

    public abstract b f();
}
