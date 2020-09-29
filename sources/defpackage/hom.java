package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: hom reason: default package */
public final class hom implements hoo {
    final xac<ugu> a = xac.e();
    ObservableEmitter<ugu> b;
    private final ufq c;
    private final ugj d;
    private final hou e;

    /* renamed from: hom$a */
    final class a implements RadioStateObserver {
        public final void a() {
        }

        public final void a(RadioStationsModel radioStationsModel) {
        }

        private a() {
        }

        /* synthetic */ a(hom hom, byte b) {
            this();
        }

        public final void a(ugu ugu) {
            hom.this.a.onNext(ugu);
            ObservableEmitter<ugu> observableEmitter = hom.this.b;
            if (observableEmitter != null) {
                observableEmitter.a(ugu);
            }
        }
    }

    public hom(Context context, ufq ufq, hou hou, ugk ugk) {
        this.c = ufq;
        this.d = ugk.a(context, new a(this, 0), context.getClass().getSimpleName());
        this.e = hou;
    }

    public final void c() {
        this.d.a();
    }

    public final void d() {
        this.d.b();
    }

    public final void a(String str, String str2) {
        this.c.a(new String[]{str}, ViewUris.bP, false, true, -1, udt.aq, rju.o, null);
        this.e.a(str2, "start_radio", "start_radio", str, (byte[]) null);
        Logger.a("LogHelper.logStartRadio uri: %s", str);
    }

    public final void a(boolean z, String str) {
        this.c.a(z);
        hou hou = this.e;
        int i = z ? 1 : -1;
        hou.a(str, "rate", i == 1 ? "thumb_up" : "thumb_down", (String) null, (byte[]) null);
        Logger.a("LogHelper.logRate rating: %d", Integer.valueOf(i));
    }

    public final wud<ugu> a() {
        return this.a;
    }

    public final Observable<ugu> b() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$hom$84IVZzqo6CvcNh7JvSDmEOpfnI<T>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.b = observableEmitter;
        observableEmitter.a((Cancellable) new $$Lambda$hom$J6c8ZRhsVRH2q7qV00f_Kt7Y9c(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.b = null;
    }
}
