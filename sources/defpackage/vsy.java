package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: vsy reason: default package */
public final class vsy {
    static final b a = new b() {
    };
    static final ObservableTransformer<c, c> b = new ObservableTransformer<c, c>() {
        public final /* bridge */ /* synthetic */ ObservableSource apply(Observable observable) {
            return observable;
        }
    };
    private b c;
    private ObservableTransformer<c, c> d;

    /* renamed from: vsy$a */
    public static final class a {
        private b a = vsy.a;
        private ObservableTransformer<c, c> b = vsy.b;

        public final vsy a() {
            return new vsy(this.a, this.b);
        }
    }

    /* renamed from: vsy$b */
    public interface b {
    }

    /* renamed from: vsy$c */
    public static abstract class c {
        public abstract Cursor a();
    }

    vsy(b bVar, ObservableTransformer<c, c> observableTransformer) {
        this.c = bVar;
        this.d = observableTransformer;
    }

    public final vsw a(ContentResolver contentResolver, Scheduler scheduler) {
        return new vsw(contentResolver, this.c, scheduler, this.d);
    }
}
