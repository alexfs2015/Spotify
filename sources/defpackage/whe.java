package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: whe reason: default package */
public final class whe {
    static final b a = new b() {
    };
    static final ObservableTransformer<c, c> b = new ObservableTransformer<c, c>() {
        public final /* bridge */ /* synthetic */ ObservableSource apply(Observable observable) {
            return observable;
        }
    };
    private b c;
    private ObservableTransformer<c, c> d;

    /* renamed from: whe$a */
    public static final class a {
        private b a = whe.a;
        private ObservableTransformer<c, c> b = whe.b;

        public final whe a() {
            return new whe(this.a, this.b);
        }
    }

    /* renamed from: whe$b */
    public interface b {
    }

    /* renamed from: whe$c */
    public static abstract class c {
        public abstract Cursor a();
    }

    whe(b bVar, ObservableTransformer<c, c> observableTransformer) {
        this.c = bVar;
        this.d = observableTransformer;
    }

    public final whc a(ContentResolver contentResolver, Scheduler scheduler) {
        return new whc(contentResolver, this.c, scheduler, this.d);
    }
}
