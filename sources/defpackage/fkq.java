package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* renamed from: fkq reason: default package */
public final class fkq {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0143, code lost:
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0155, code lost:
        if (((java.lang.Integer) r9).intValue() == 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0166, code lost:
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0178, code lost:
        if (((java.lang.Double) r9).doubleValue() == 0.0d) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.fko r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c8
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            java.lang.String r3 = r3.replaceFirst(r7, r4)
            java.lang.String r6 = "List"
            boolean r6 = r3.endsWith(r6)
            r8 = 1
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "OrBuilderList"
            boolean r6 = r3.endsWith(r6)
            if (r6 != 0) goto L_0x00b3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            int r9 = r3.length()
            int r9 = r9 + -4
            java.lang.String r9 = r3.substring(r8, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00b3
            java.lang.String r3 = a(r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.protobuf.GeneratedMessageLite.a(r9, r13, r4)
            a(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00b3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "set"
            r6.<init>(r9)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x004d
            java.lang.String r6 = "Bytes"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x00ed
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            int r9 = r3.length()
            int r9 = r9 + -5
            java.lang.String r9 = r3.substring(r5, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.containsKey(r6)
            if (r6 != 0) goto L_0x004d
        L_0x00ed:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            java.lang.String r9 = r3.substring(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "has"
            r10.<init>(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r9 == 0) goto L_0x004d
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Object r9 = com.google.protobuf.GeneratedMessageLite.a(r9, r13, r10)
            if (r3 != 0) goto L_0x01b1
            boolean r3 = r9 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x014a
            r3 = r9
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0148
        L_0x0145:
            r3 = 1
            goto L_0x01ab
        L_0x0148:
            r3 = 0
            goto L_0x01ab
        L_0x014a:
            boolean r3 = r9 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0158
            r3 = r9
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0148
            goto L_0x0145
        L_0x0158:
            boolean r3 = r9 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0169
            r3 = r9
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0148
            goto L_0x0145
        L_0x0169:
            boolean r3 = r9 instanceof java.lang.Double
            if (r3 == 0) goto L_0x017b
            r3 = r9
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r10 = 0
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0148
            goto L_0x0145
        L_0x017b:
            boolean r3 = r9 instanceof java.lang.String
            if (r3 == 0) goto L_0x0184
            boolean r3 = r9.equals(r4)
            goto L_0x01ab
        L_0x0184:
            boolean r3 = r9 instanceof com.google.protobuf.ByteString
            if (r3 == 0) goto L_0x018f
            com.google.protobuf.ByteString r3 = com.google.protobuf.ByteString.a
            boolean r3 = r9.equals(r3)
            goto L_0x01ab
        L_0x018f:
            boolean r3 = r9 instanceof defpackage.fko
            if (r3 == 0) goto L_0x019d
            r3 = r9
            fko r3 = (defpackage.fko) r3
            fko r3 = r3.i()
            if (r9 != r3) goto L_0x0148
            goto L_0x0145
        L_0x019d:
            boolean r3 = r9 instanceof java.lang.Enum
            if (r3 == 0) goto L_0x0148
            r3 = r9
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r3 = r3.ordinal()
            if (r3 != 0) goto L_0x0148
            goto L_0x0145
        L_0x01ab:
            if (r3 != 0) goto L_0x01af
            r3 = 1
            goto L_0x01bd
        L_0x01af:
            r3 = 0
            goto L_0x01bd
        L_0x01b1:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.protobuf.GeneratedMessageLite.a(r3, r13, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
        L_0x01bd:
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = a(r6)
            a(r14, r15, r3, r9)
            goto L_0x004d
        L_0x01c8:
            boolean r0 = r13 instanceof com.google.protobuf.GeneratedMessageLite.ExtendableMessage
            if (r0 == 0) goto L_0x021e
            r0 = r13
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r0
            fkf<com.google.protobuf.GeneratedMessageLite$c> r0 = r0.d
            boolean r1 = r0.b
            if (r1 == 0) goto L_0x01e5
            fkj$b r1 = new fkj$b
            fku<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x01ef
        L_0x01e5:
            fku<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x01ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021e
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object r3 = r0.getKey()
            com.google.protobuf.GeneratedMessageLite$c r3 = (com.google.protobuf.GeneratedMessageLite.c) r3
            int r3 = r3.a
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.getValue()
            a(r14, r15, r2, r0)
            goto L_0x01ef
        L_0x021e:
            com.google.protobuf.GeneratedMessageLite r13 = (com.google.protobuf.GeneratedMessageLite) r13
            fkx r0 = r13.b
            if (r0 == 0) goto L_0x0229
            fkx r13 = r13.b
            r13.a(r14, r15)
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkq.a(fko, java.lang.StringBuilder, int):void");
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(sb, i, str, a);
            }
            return;
        }
        sb.append(10);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        String str2 = ": \"";
        if (obj instanceof String) {
            sb.append(str2);
            sb.append(fkw.a(ByteString.a((String) obj)));
            sb.append('\"');
        } else if (obj instanceof ByteString) {
            sb.append(str2);
            sb.append(fkw.a((ByteString) obj));
            sb.append('\"');
        } else if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            a((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
