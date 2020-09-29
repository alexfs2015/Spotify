package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mbt reason: default package */
public abstract class mbt implements Parcelable {

    /* renamed from: mbt$a */
    public static abstract class a {
        public abstract a a(Uri uri);

        public abstract a a(SubView subView);

        /* access modifiers changed from: 0000 */
        public abstract a a(Integer num);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract mbt a();

        /* access modifiers changed from: 0000 */
        public abstract a b(String str);

        public final a a(jro jro) {
            return a(Integer.valueOf(852700957)).b(jro.d());
        }
    }

    public abstract SubView a();

    public abstract String b();

    public abstract Uri c();

    public abstract boolean d();

    public abstract String e();

    public abstract Integer f();

    public static a g() {
        return new a().a(SubView.NONE).a(true).a(Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_premium&utm_source=spotify&utm_medium=android_client")).a(Integer.valueOf(-2));
    }
}
