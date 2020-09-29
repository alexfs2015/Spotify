package defpackage;

import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import io.reactivex.functions.Consumer;

/* renamed from: pov reason: default package */
public final class pov {
    public static Consumer<b> a(poh poh, pnn pnn, ppc ppc) {
        return new $$Lambda$pov$NXt7tycjfMdsCAVO4QMk8mjKvk0(poh, pnn, ppc);
    }

    public static Consumer<c> a(rkd rkd) {
        return new $$Lambda$pov$j1xJ0xhkJ8xqUAqLFfTc3GoYVM(rkd);
    }

    public static Consumer<a> a(psg psg) {
        return new $$Lambda$pov$d8fpqNewzeZa01UWj2qphm7deKA(psg);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, a aVar, c cVar) {
        psg psg2 = psg;
        psg2.a(aVar.c, aVar.a.getTriggerString(), aVar.a.getType(), "notes", ((c) aVar.b).a.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, a aVar, a aVar2) {
        psg psg2 = psg;
        psg2.a(aVar.c, aVar.a.getTriggerString(), aVar.a.getType(), "banners", ((a) aVar.b).a.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, a aVar, b bVar) {
        psg psg2 = psg;
        psg2.a(aVar.c, aVar.a.getTriggerString(), aVar.a.getType(), "cards", ((b) aVar.b).a.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(rkd rkd, c cVar) {
        String str = cVar.a;
        boolean z = cVar.b instanceof a;
        if ("cards".equals(str)) {
            rkd.a = z;
            rkd.d.onNext(Boolean.valueOf(z));
        } else if ("banners".equals(str)) {
            rkd.b = z;
            rkd.e.onNext(Boolean.valueOf(z));
        } else if ("notes".equals(str)) {
            rkd.c = z;
            rkd.f.onNext(Boolean.valueOf(z));
        } else {
            throw new RecoverableAssertionError(String.format("Unrecognized Format: %s", new Object[]{str}));
        }
    }
}
