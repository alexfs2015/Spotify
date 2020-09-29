package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import io.reactivex.Observable;

/* renamed from: jpk reason: default package */
public interface jpk<T> {
    public static final jpk<Void> a = new jpk<Void>() {
        public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
            return contextMenuViewModel;
        }

        public final ContextMenuViewModel a(jqo<Void> jqo) {
            throw new UnsupportedOperationException("should never be invoked");
        }

        public final Observable<ContextMenuViewModel> a(jqo<Void> jqo, fqn fqn) {
            return Observable.c();
        }
    };

    /* renamed from: jpk$a */
    public static class a implements jpk<Void> {
        private final ContextMenuViewModel b;

        public a(ContextMenuViewModel contextMenuViewModel) {
            this.b = contextMenuViewModel;
        }

        public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
            return contextMenuViewModel;
        }

        public final ContextMenuViewModel a(jqo<Void> jqo) {
            return this.b;
        }

        public final Observable<ContextMenuViewModel> a(jqo<Void> jqo, fqn fqn) {
            return Observable.b(this.b);
        }
    }

    ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z);

    ContextMenuViewModel a(jqo<T> jqo);

    Observable<ContextMenuViewModel> a(jqo<T> jqo, fqn fqn);
}
