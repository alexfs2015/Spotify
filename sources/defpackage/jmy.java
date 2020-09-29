package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import io.reactivex.Observable;

/* renamed from: jmy reason: default package */
public interface jmy<T> {
    public static final jmy<Void> a = new jmy<Void>() {
        public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
            return contextMenuViewModel;
        }

        public final ContextMenuViewModel a(joc<Void> joc) {
            throw new UnsupportedOperationException("should never be invoked");
        }

        public final Observable<ContextMenuViewModel> a(joc<Void> joc, fpt fpt) {
            return Observable.c();
        }
    };

    /* renamed from: jmy$a */
    public static class a implements jmy<Void> {
        private final ContextMenuViewModel b;

        public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
            return contextMenuViewModel;
        }

        public a(ContextMenuViewModel contextMenuViewModel) {
            this.b = contextMenuViewModel;
        }

        public final ContextMenuViewModel a(joc<Void> joc) {
            return this.b;
        }

        public final Observable<ContextMenuViewModel> a(joc<Void> joc, fpt fpt) {
            return Observable.b(this.b);
        }
    }

    ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z);

    ContextMenuViewModel a(joc<T> joc);

    Observable<ContextMenuViewModel> a(joc<T> joc, fpt fpt);
}
