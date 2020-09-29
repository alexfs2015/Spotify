package defpackage;

import com.google.common.collect.Maps;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.google.protobuf.Value.KindCase;
import com.spotify.hubs.view.proto.Command;
import com.spotify.hubs.view.proto.Component;
import com.spotify.hubs.view.proto.ImageData;
import com.spotify.hubs.view.proto.Images;
import com.spotify.hubs.view.proto.Text;
import com.spotify.hubs.view.proto.UIComponent;
import com.spotify.hubs.view.proto.View;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: sbz reason: default package */
public final class sbz {

    /* renamed from: sbz$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[KindCase.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.protobuf.Value$KindCase[] r0 = com.google.protobuf.Value.KindCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.protobuf.Value$KindCase r1 = com.google.protobuf.Value.KindCase.NUMBER_VALUE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.protobuf.Value$KindCase r1 = com.google.protobuf.Value.KindCase.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.protobuf.Value$KindCase r1 = com.google.protobuf.Value.KindCase.BOOL_VALUE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.protobuf.Value$KindCase r1 = com.google.protobuf.Value.KindCase.STRUCT_VALUE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.protobuf.Value$KindCase r1 = com.google.protobuf.Value.KindCase.LIST_VALUE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.protobuf.Value$KindCase r1 = com.google.protobuf.Value.KindCase.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sbz.AnonymousClass1.<clinit>():void");
        }
    }

    private static hci a(Command command) {
        return hct.builder().a(command.d).b(a(command.k())).a();
    }

    private static a a(a aVar, String str, Value value) {
        int i = AnonymousClass1.a[KindCase.a(value.d).ordinal()];
        if (i == 1) {
            return value.k() % 1.0d == 0.0d ? aVar.a(str, (int) value.k()) : aVar.a(str, value.k());
        }
        if (i == 2) {
            return aVar.a(str, value.l());
        }
        if (i == 3) {
            return aVar.a(str, value.m());
        }
        if (i != 4) {
            return i != 5 ? aVar : a(aVar, str, (List<Value>) value.o().d);
        }
        Map k = value.n().k();
        a builder = HubsImmutableComponentBundle.builder();
        for (Entry entry : k.entrySet()) {
            builder = a(builder, (String) entry.getKey(), (Value) entry.getValue());
        }
        return aVar.a(str, builder.a());
    }

    private static a a(a aVar, String str, List<Value> list) {
        if (list.isEmpty()) {
            return aVar;
        }
        int i = 0;
        Value value = (Value) list.get(0);
        int i2 = AnonymousClass1.a[KindCase.a(value.d).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                String[] strArr = new String[list.size()];
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    strArr[i3] = ((Value) list.get(0)).l();
                }
                return aVar.a(str, strArr);
            } else if (i2 == 3) {
                boolean[] zArr = new boolean[list.size()];
                while (i < zArr.length) {
                    zArr[i] = ((Value) list.get(i)).m();
                    i++;
                }
                return aVar.a(str, zArr);
            } else if (i2 != 4) {
                return aVar;
            } else {
                hcj[] hcjArr = new hcj[list.size()];
                while (i < hcjArr.length) {
                    hcjArr[i] = a(HubsImmutableComponentBundle.builder(), str, (Value) list.get(i)).a();
                    i++;
                }
                return aVar.a(str, hcjArr);
            }
        } else if (value.k() % 1.0d == 0.0d) {
            double[] dArr = new double[list.size()];
            while (i < dArr.length) {
                dArr[i] = ((Value) list.get(i)).k();
                i++;
            }
            return aVar.a(str, dArr);
        } else {
            int[] iArr = new int[list.size()];
            while (i < iArr.length) {
                iArr[i] = (int) ((Value) list.get(i)).k();
                i++;
            }
            return aVar.a(str, iArr);
        }
    }

    private static hcj a(Struct struct) {
        a builder = HubsImmutableComponentBundle.builder();
        for (Entry entry : struct.k().entrySet()) {
            builder = a(builder, (String) entry.getKey(), (Value) entry.getValue());
        }
        return builder.a();
    }

    private static hck a(UIComponent uIComponent) {
        return hcv.create(uIComponent.d, uIComponent.e);
    }

    private static hcl a(Images images) {
        hcp hcp = null;
        a a = hcw.builder().a(fbo.b(images.d)).a(images.k().equals(ImageData.l()) ? null : a(images.k()));
        if (!images.l().equals(ImageData.l())) {
            hcp = a(images.l());
        }
        return a.b(hcp).a(a(images.m())).a();
    }

    private static hcm a(Component component) {
        return hcx.builder().a(fbo.c(component.d)).b(fbo.c(component.e)).a(a(component.k())).a(a(component.l())).a(a(component.m())).a(b((List<Component>) component.f)).e(a(component.n())).c(a(component.o())).a(a(component.p())).a(b(component.q())).a();
    }

    private static hco a(Text text) {
        return hcy.builder().a(fbo.c(text.d)).b(fbo.c(text.e)).d(fbo.c(text.g)).c(fbo.c(text.f)).a();
    }

    private static hcp a(ImageData imageData) {
        return hcz.builder().a(fbo.c(imageData.d)).b(fbo.c(imageData.e)).a(a(imageData.k())).a();
    }

    public static hcs a(View view) {
        return hdb.builder().a(fbo.c(view.d)).b(fbo.c(view.e)).a(view.k().equals(Component.r()) ? null : a(view.k())).a(a((List<Component>) view.f)).c(fbo.c(view.g)).a(a(view.l())).a();
    }

    private static Map<String, hcp> a(Map<String, ImageData> map) {
        HashMap a = Maps.a(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != ImageData.l()) {
                a.put(entry.getKey(), a((ImageData) entry.getValue()));
            }
        }
        return a;
    }

    private static hcm[] a(List<Component> list) {
        hcm[] hcmArr = new hcm[list.size()];
        for (int i = 0; i < hcmArr.length; i++) {
            hcmArr[i] = a((Component) list.get(i));
        }
        return hcmArr;
    }

    private static List<hcm> b(List<Component> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Component a : list) {
            arrayList.add(a(a));
        }
        return arrayList;
    }

    private static Map<String, hci> b(Map<String, Command> map) {
        HashMap a = Maps.a(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != Command.l()) {
                a.put(entry.getKey(), a((Command) entry.getValue()));
            }
        }
        return a;
    }
}
