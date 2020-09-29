package defpackage;

import android.os.Parcelable;
import com.google.common.base.Optional;
import io.reactivex.Observable;

/* renamed from: gdf reason: default package */
public interface gdf {

    /* renamed from: gdf$a */
    public static abstract class a implements Parcelable {

        /* renamed from: gdf$a$a reason: collision with other inner class name */
        public interface C0033a {
            C0033a a(int i);

            C0033a a(Optional<Boolean> optional);

            a a();
        }

        public static C0033a d() {
            return new a().a(Optional.e()).a(500);
        }

        public abstract Optional<Boolean> a();

        public abstract int b();
    }

    Observable<gdl> a(a aVar);
}
