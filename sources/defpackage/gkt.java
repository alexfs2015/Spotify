package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import io.reactivex.functions.Consumer;
import java.util.UUID;

@Deprecated
/* renamed from: gkt reason: default package */
public final class gkt {
    private final Context a;
    private final jlr b;
    private final jtz c;
    private final gkx d;
    private rmb e;
    private float f;
    private float g;
    private long h;

    gkt(Context context, jlr jlr, rmf rmf, jtz jtz, gkx gkx) {
        this.a = (Context) fbp.a(context);
        this.b = (jlr) fbp.a(jlr);
        this.c = (jtz) fbp.a(jtz);
        this.d = (gkx) fbp.a(gkx);
        ((rmf) fbp.a(rmf)).a.a((Consumer<? super T>) new $$Lambda$gkt$xKvLMcX0jCj1a7z9MylAr6gInSc<Object>(this), (Consumer<? super Throwable>) $$Lambda$gkt$8XSdkNxT9dq0npX82ZnJHezZ2U.INSTANCE);
    }

    private static long a(View view) {
        fbp.a(view);
        return ((long) view.getWidth()) * ((long) view.getHeight());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.ViewGroup, code=null, for r10v0, types: [java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2
      assigns: []
      uses: []
      mth insns count: 47
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.view.View a(android.view.ViewGroup r10, float r11, float r12) {
        /*
            defpackage.fbp.a(r10)
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            r3 = r10
            r2 = 0
        L_0x0009:
            int r4 = r10.getChildCount()
            if (r2 >= r4) goto L_0x0059
            android.view.View r4 = r10.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L_0x0056
            r4.getLocationOnScreen(r0)
            r5 = r0[r1]
            r6 = 1
            r6 = r0[r6]
            int r7 = r4.getWidth()
            int r7 = r7 + r5
            int r8 = r4.getHeight()
            int r8 = r8 + r6
            float r5 = (float) r5
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0056
            float r5 = (float) r7
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0056
            float r5 = (float) r6
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0056
            float r5 = (float) r8
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0056
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0049
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = a(r4, r11, r12)
        L_0x0049:
            long r5 = a(r4)
            long r7 = a(r3)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0056
            r3 = r4
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkt.a(android.view.ViewGroup, float, float):android.view.View");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rmb rmb) {
        this.e = rmb;
    }

    public final void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        fbp.a(viewGroup);
        fbp.a(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float scaledTouchSlop = (float) ViewConfiguration.get(this.a.getApplicationContext()).getScaledTouchSlop();
                InteractionType interactionType = (Math.abs(motionEvent.getRawX() - this.f) >= scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.g) >= scaledTouchSlop) ? InteractionType.UNKNOWN : this.c.a() - this.h < ((long) ViewConfiguration.getLongPressTimeout()) ? InteractionType.TAP : InteractionType.LONG_PRESS;
                if (interactionType != InteractionType.UNKNOWN) {
                    View a2 = a(viewGroup, motionEvent.getX(), motionEvent.getY());
                    Logger.b("Touched View: %s", a2.getClass().getSimpleName());
                    fbp.a(interactionType);
                    fbp.a(a2);
                    gks gks = new gks(a2);
                    View view = gks.a;
                    if (gko.c(gks.a)) {
                        gks.b = gks.a;
                    }
                    StringBuilder sb = new StringBuilder(16);
                    String a3 = gko.a(gks.a);
                    if (a3 != null) {
                        sb.append(a3);
                    }
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append(gks.a.getClass().getSimpleName());
                    while ((gks.a.getParent() instanceof View) && gks.a.getId() != 16908290) {
                        ViewParent parent = gks.a.getParent();
                        ViewGroup viewGroup2 = (ViewGroup) parent;
                        String a4 = gko.a(viewGroup2);
                        if (a4 != null) {
                            if (sb.length() > 0) {
                                sb.insert(0, '/');
                            }
                            sb.insert(0, a4);
                        }
                        if (parent instanceof RecyclerView) {
                            a c2 = ((RecyclerView) parent).c();
                            int e2 = RecyclerView.e(gks.a);
                            String simpleName = gks.a.getClass().getSimpleName();
                            if (sb2.indexOf(simpleName) == 0) {
                                int indexOf = sb2.indexOf("/");
                                if (indexOf <= 0) {
                                    indexOf = simpleName.length();
                                }
                                sb2.delete(0, indexOf);
                            }
                            if (e2 >= 0 && (c2 instanceof gkv)) {
                                gkv gkv = (gkv) c2;
                                simpleName = gkv.c(e2);
                                int i = 0;
                                for (int i2 = 0; i2 < e2; i2++) {
                                    if (simpleName.equals(gkv.c(i2))) {
                                        i++;
                                    }
                                }
                                e2 = i;
                            } else if (!(c2 instanceof gkw)) {
                                simpleName = "Unknown";
                            }
                            sb2.insert(0, e2);
                            sb2.insert(0, ':');
                            sb2.insert(0, simpleName);
                            sb2.insert(0, '/');
                        } else {
                            sb2.insert(0, '/');
                            if (viewGroup2.getChildCount() > 1) {
                                sb2.insert(0, viewGroup2.indexOfChild(gks.a));
                                sb2.insert(0, ':');
                            }
                        }
                        sb2.insert(0, viewGroup2.getClass().getSimpleName());
                        if (gks.c == null) {
                            gks.c = gko.b(viewGroup2);
                        }
                        if (gks.b == null && gko.c(viewGroup2)) {
                            gks.b = viewGroup2;
                        }
                        gks.a = (View) parent;
                    }
                    if (sb.length() > 0) {
                        gks.d = sb.toString();
                    } else {
                        gks.d = sb2.toString();
                        if (gks.b == null) {
                            gks.b = view;
                        }
                    }
                    String str = gks.d;
                    String str2 = gks.c;
                    View view2 = gks.b;
                    fbp.a(interactionType);
                    rmb rmb = this.e;
                    String a5 = rmb instanceof rmc ? ((rmc) rmb).a() : PageIdentifiers.UNKNOWN.mPageIdentifier;
                    rmb rmb2 = this.e;
                    String str3 = "unknown";
                    String b2 = (!(rmb2 instanceof rmc) || ((rmc) rmb2).b() == null) ? str3 : ((rmc) this.e).b();
                    String uuid = UUID.randomUUID().toString();
                    String str4 = !TextUtils.isEmpty(str) ? str : str3;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = InteractionIntent.UNKNOWN.mInteractionIntent;
                    }
                    String str5 = str2;
                    jlr jlr = this.b;
                    ah ahVar = new ah(uuid, str4, interactionType.mInteractionType, str5, a5, b2);
                    jlr.a(ahVar);
                    if (view2 != null) {
                        view2.setTag(R.id.interaction_id, uuid);
                    }
                }
            }
            return;
        }
        this.h = this.c.a();
        this.f = motionEvent.getRawX();
        this.g = motionEvent.getRawY();
    }
}
