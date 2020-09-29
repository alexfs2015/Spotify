package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageFormatException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.Variable;
import org.msgpack.value.Variable.Type;

/* renamed from: wpo reason: default package */
public class wpo implements Closeable {
    public static final MessageBuffer a = MessageBuffer.wrap(new byte[0]);
    private static /* synthetic */ boolean j = (!wpo.class.desiredAssertionStatus());
    public MessageBufferInput b;
    public MessageBuffer c;
    public int d;
    public long e;
    public MessageBuffer f;
    public boolean g;
    private final b h;
    private final MessageBuffer i;

    /* renamed from: wpo$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[MessageFormat.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(100:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|110) */
        /* JADX WARNING: Can't wrap try/catch for region: R(101:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|110) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(91:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(92:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(94:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(96:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(97:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(3:107|108|110)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0209 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0081 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0191 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x019d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01d9 */
        static {
            /*
                org.msgpack.value.ValueType[] r0 = org.msgpack.value.ValueType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.msgpack.value.ValueType r2 = org.msgpack.value.ValueType.NIL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                org.msgpack.value.ValueType r3 = org.msgpack.value.ValueType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                org.msgpack.value.ValueType r4 = org.msgpack.value.ValueType.INTEGER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.msgpack.value.ValueType r5 = org.msgpack.value.ValueType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.msgpack.value.ValueType r6 = org.msgpack.value.ValueType.STRING     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x004b }
                org.msgpack.value.ValueType r7 = org.msgpack.value.ValueType.BINARY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0056 }
                org.msgpack.value.ValueType r8 = org.msgpack.value.ValueType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                r7 = 8
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0062 }
                org.msgpack.value.ValueType r9 = org.msgpack.value.ValueType.MAP     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r8 = 9
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x006e }
                org.msgpack.value.ValueType r10 = org.msgpack.value.ValueType.EXTENSION     // Catch:{ NoSuchFieldError -> 0x006e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                org.msgpack.core.MessageFormat[] r9 = org.msgpack.core.MessageFormat.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                a = r9
                int[] r9 = a     // Catch:{ NoSuchFieldError -> 0x0081 }
                org.msgpack.core.MessageFormat r10 = org.msgpack.core.MessageFormat.POSFIXINT     // Catch:{ NoSuchFieldError -> 0x0081 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0081 }
                r9[r10] = r0     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008b }
                org.msgpack.core.MessageFormat r9 = org.msgpack.core.MessageFormat.NEGFIXINT     // Catch:{ NoSuchFieldError -> 0x008b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x008b }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x008b }
            L_0x008b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0095 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009f }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.NIL     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a9 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXMAP     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXARRAY     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00bd }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXSTR     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c7 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.INT8     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.UINT8     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00dd }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.INT16     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.UINT16     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.INT32     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0101 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.UINT32     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x010d }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FLOAT32     // Catch:{ NoSuchFieldError -> 0x010d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0119 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.INT64     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0125 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.UINT64     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0131 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FLOAT64     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x013d }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.BIN8     // Catch:{ NoSuchFieldError -> 0x013d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013d }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x013d }
            L_0x013d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0149 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.STR8     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0155 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.BIN16     // Catch:{ NoSuchFieldError -> 0x0155 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0155 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0155 }
            L_0x0155:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0161 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.STR16     // Catch:{ NoSuchFieldError -> 0x0161 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0161 }
            L_0x0161:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x016d }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.BIN32     // Catch:{ NoSuchFieldError -> 0x016d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x016d }
            L_0x016d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0179 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.STR32     // Catch:{ NoSuchFieldError -> 0x0179 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0179 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0179 }
            L_0x0179:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0185 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXEXT1     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0191 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXEXT2     // Catch:{ NoSuchFieldError -> 0x0191 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0191 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0191 }
            L_0x0191:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x019d }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXEXT4     // Catch:{ NoSuchFieldError -> 0x019d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019d }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019d }
            L_0x019d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01a9 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXEXT8     // Catch:{ NoSuchFieldError -> 0x01a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a9 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a9 }
            L_0x01a9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01b5 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.FIXEXT16     // Catch:{ NoSuchFieldError -> 0x01b5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b5 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b5 }
            L_0x01b5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01c1 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.EXT8     // Catch:{ NoSuchFieldError -> 0x01c1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c1 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c1 }
            L_0x01c1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01cd }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.EXT16     // Catch:{ NoSuchFieldError -> 0x01cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cd }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cd }
            L_0x01cd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01d9 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.EXT32     // Catch:{ NoSuchFieldError -> 0x01d9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d9 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d9 }
            L_0x01d9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01e5 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.ARRAY16     // Catch:{ NoSuchFieldError -> 0x01e5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e5 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e5 }
            L_0x01e5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01f1 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.ARRAY32     // Catch:{ NoSuchFieldError -> 0x01f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f1 }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f1 }
            L_0x01f1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01fd }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.MAP16     // Catch:{ NoSuchFieldError -> 0x01fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fd }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01fd }
            L_0x01fd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0209 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.MAP32     // Catch:{ NoSuchFieldError -> 0x0209 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0209 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0209 }
            L_0x0209:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0215 }
                org.msgpack.core.MessageFormat r1 = org.msgpack.core.MessageFormat.NEVER_USED     // Catch:{ NoSuchFieldError -> 0x0215 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0215 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0215 }
            L_0x0215:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wpo.AnonymousClass1.<clinit>():void");
        }
    }

    public wpo(MessageBufferInput messageBufferInput) {
        this(messageBufferInput, wpm.b);
    }

    private wpo(MessageBufferInput messageBufferInput, b bVar) {
        this.c = a;
        this.f = null;
        this.i = MessageBuffer.wrap(new byte[24]);
        this.g = false;
        this.b = (MessageBufferInput) wpp.a(messageBufferInput, (Object) "MessageBufferInput is null");
        this.h = (b) wpp.a(bVar, (Object) "Config");
    }

    public final long a() {
        return this.e + ((long) this.d);
    }

    private boolean g() {
        while (true) {
            MessageBuffer messageBuffer = this.c;
            if (messageBuffer != null && this.d >= messageBuffer.size()) {
                int size = this.c.size();
                this.d -= size;
                this.e += (long) size;
                this.c = h();
            }
        }
        return this.c != null;
    }

    private MessageBuffer h() {
        if (this.g) {
            return null;
        }
        MessageBuffer messageBuffer = this.f;
        if (messageBuffer == null) {
            messageBuffer = this.b.next();
        } else {
            this.f = null;
        }
        if (messageBuffer == null) {
            this.g = true;
        }
        return messageBuffer;
    }

    public boolean a(int i2) {
        MessageBuffer messageBuffer;
        if (i2 == 0) {
            return true;
        }
        if (!g()) {
            return false;
        }
        if (this.d + i2 <= this.c.size()) {
            return true;
        }
        MessageBuffer newBuffer = i2 <= this.i.size() ? this.i : MessageBuffer.newBuffer(i2);
        int size = this.c.size();
        int i3 = this.d;
        int i4 = size - i3;
        if (i4 > 0) {
            this.c.copyTo(i3, newBuffer, 0, i4);
        }
        while (i4 < i2) {
            this.f = h();
            MessageBuffer messageBuffer2 = this.f;
            if (messageBuffer2 == null) {
                return false;
            }
            int min = Math.min(i2 - i4, messageBuffer2.size());
            this.f.copyTo(0, newBuffer, i4, min);
            if (min == this.f.size()) {
                messageBuffer = null;
            } else {
                MessageBuffer messageBuffer3 = this.f;
                messageBuffer = messageBuffer3.slice(min, messageBuffer3.size() - min);
            }
            this.f = messageBuffer;
            i4 += min;
        }
        this.e += (long) this.d;
        if (i2 != newBuffer.size()) {
            newBuffer = newBuffer.slice(0, i2);
        }
        this.c = newBuffer;
        this.d = 0;
        return true;
    }

    public final MessageFormat b() {
        return MessageFormat.a(i());
    }

    private byte i() {
        if (a(1)) {
            return this.c.getByte(this.d);
        }
        throw new EOFException();
    }

    private byte j() {
        byte i2 = i();
        this.d++;
        return i2;
    }

    private void b(int i2) {
        if (j || i2 >= 0) {
            if (this.d + i2 < 0) {
                g();
            }
            this.d += i2;
            return;
        }
        throw new AssertionError();
    }

    private byte k() {
        if (a(1)) {
            byte b2 = this.c.getByte(this.d);
            b(1);
            return b2;
        }
        throw new EOFException("insufficient data length for reading byte value");
    }

    private short l() {
        if (a(2)) {
            short s = this.c.getShort(this.d);
            b(2);
            return s;
        }
        throw new EOFException("insufficient data length for reading short value");
    }

    private int m() {
        if (a(4)) {
            int i2 = this.c.getInt(this.d);
            b(4);
            return i2;
        }
        throw new EOFException("insufficient data length for reading int value");
    }

    private float n() {
        if (a(4)) {
            float f2 = this.c.getFloat(this.d);
            b(4);
            return f2;
        }
        throw new EOFException("insufficient data length for reading float value");
    }

    private long o() {
        if (a(8)) {
            long j2 = this.c.getLong(this.d);
            b(8);
            return j2;
        }
        throw new EOFException("insufficient data length for reading long value");
    }

    private double p() {
        if (a(8)) {
            double d2 = this.c.getDouble(this.d);
            b(8);
            return d2;
        }
        throw new EOFException("insufficient data length for reading double value");
    }

    private static MessageTypeException a(String str, byte b2) {
        String str2;
        MessageFormat a2 = MessageFormat.a(b2);
        if (a2 == MessageFormat.NEVER_USED) {
            str2 = "NeverUsed";
        } else {
            String name = a2.a().name();
            StringBuilder sb = new StringBuilder();
            sb.append(name.substring(0, 1));
            sb.append(name.substring(1).toLowerCase());
            str2 = sb.toString();
        }
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", new Object[]{str, str2, Byte.valueOf(b2)}));
    }

    private wqj q() {
        int i2 = 0;
        switch (b().a()) {
            case NIL:
                c();
                return wrc.a();
            case BOOLEAN:
                return wqr.a(d());
            case INTEGER:
                if (AnonymousClass1.a[b().ordinal()] != 16) {
                    return wqr.a(r());
                }
                return wqr.a(s());
            case FLOAT:
                return wqr.a(t());
            case STRING:
                return wqr.b(c(v()));
            case BINARY:
                return wqr.a(c(w()));
            case ARRAY:
                int e2 = e();
                wqq[] wqqArr = new wqq[e2];
                while (i2 < e2) {
                    wqqArr[i2] = q();
                    i2++;
                }
                if (wqqArr.length == 0) {
                    return wqu.I();
                }
                return new wqu((wqq[]) Arrays.copyOf(wqqArr, wqqArr.length));
            case MAP:
                int f2 = f() << 1;
                wqq[] wqqArr2 = new wqq[f2];
                while (i2 < f2) {
                    wqqArr2[i2] = q();
                    int i3 = i2 + 1;
                    wqqArr2[i3] = q();
                    i2 = i3 + 1;
                }
                return wqr.a(wqqArr2);
            case EXTENSION:
                wpl u = u();
                return wqr.a(u.a, c(u.b));
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }

    public final Variable a(Variable variable) {
        int i2 = 0;
        switch (b().a()) {
            case NIL:
                c();
                variable.a();
                return variable;
            case BOOLEAN:
                boolean d2 = d();
                variable.i = Type.BOOLEAN;
                variable.m = variable.a;
                variable.j = d2 ? 1 : 0;
                return variable;
            case INTEGER:
                if (AnonymousClass1.a[b().ordinal()] != 16) {
                    long r = r();
                    variable.i = Type.LONG;
                    variable.m = variable.b;
                    variable.j = r;
                    return variable;
                }
                BigInteger s = s();
                if (s.compareTo(Variable.n) < 0 || s.compareTo(Variable.o) > 0) {
                    variable.i = Type.BIG_INTEGER;
                    variable.m = variable.b;
                    variable.l = s;
                } else {
                    variable.i = Type.LONG;
                    variable.m = variable.b;
                    variable.j = s.longValue();
                }
                return variable;
            case FLOAT:
                double t = t();
                variable.i = Type.DOUBLE;
                variable.m = variable.c;
                variable.k = t;
                variable.j = (long) t;
                return variable;
            case STRING:
                byte[] c2 = c(v());
                variable.i = Type.RAW_STRING;
                variable.m = variable.e;
                variable.l = c2;
                return variable;
            case BINARY:
                byte[] c3 = c(w());
                variable.i = Type.BYTE_ARRAY;
                variable.m = variable.d;
                variable.l = c3;
                return variable;
            case ARRAY:
                int e2 = e();
                ArrayList arrayList = new ArrayList(e2);
                while (i2 < e2) {
                    arrayList.add(q());
                    i2++;
                }
                variable.i = Type.LIST;
                variable.m = variable.f;
                variable.l = arrayList;
                return variable;
            case MAP:
                int f2 = f();
                HashMap hashMap = new HashMap();
                while (i2 < f2) {
                    hashMap.put(q(), q());
                    i2++;
                }
                variable.i = Type.MAP;
                variable.m = variable.g;
                variable.l = hashMap;
                return variable;
            case EXTENSION:
                wpl u = u();
                byte b2 = u.a;
                byte[] c4 = c(u.b);
                variable.i = Type.EXTENSION;
                variable.m = variable.h;
                variable.l = wqr.a(b2, c4);
                return variable;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }

    public final void c() {
        byte j2 = j();
        if (j2 != -64) {
            throw a("Nil", j2);
        }
    }

    public final boolean d() {
        byte j2 = j();
        if (j2 == -62) {
            return false;
        }
        if (j2 == -61) {
            return true;
        }
        throw a("boolean", j2);
    }

    private long r() {
        byte j2 = j();
        if (a.a(j2)) {
            return (long) j2;
        }
        switch (j2) {
            case -52:
                return (long) (k() & 255);
            case -51:
                return (long) (l() & 65535);
            case -50:
                int m = m();
                return m < 0 ? ((long) (m & Integer.MAX_VALUE)) + 2147483648L : (long) m;
            case -49:
                long o = o();
                if (o >= 0) {
                    return o;
                }
                throw a(o);
            case -48:
                return (long) k();
            case -47:
                return (long) l();
            case -46:
                return (long) m();
            case -45:
                return o();
            default:
                throw a("Integer", j2);
        }
    }

    private BigInteger s() {
        byte j2 = j();
        if (a.a(j2)) {
            return BigInteger.valueOf((long) j2);
        }
        switch (j2) {
            case -52:
                return BigInteger.valueOf((long) (k() & 255));
            case -51:
                return BigInteger.valueOf((long) (l() & 65535));
            case -50:
                int m = m();
                if (m < 0) {
                    return BigInteger.valueOf(((long) (m & Integer.MAX_VALUE)) + 2147483648L);
                }
                return BigInteger.valueOf((long) m);
            case -49:
                long o = o();
                if (o < 0) {
                    return BigInteger.valueOf(o + Long.MAX_VALUE + 1).setBit(63);
                }
                return BigInteger.valueOf(o);
            case -48:
                return BigInteger.valueOf((long) k());
            case -47:
                return BigInteger.valueOf((long) l());
            case -46:
                return BigInteger.valueOf((long) m());
            case -45:
                return BigInteger.valueOf(o());
            default:
                throw a("Integer", j2);
        }
    }

    private double t() {
        byte j2 = j();
        if (j2 == -54) {
            return (double) n();
        }
        if (j2 == -53) {
            return p();
        }
        throw a("Float", j2);
    }

    public final int e() {
        byte j2 = j();
        if (a.b(j2)) {
            return j2 & 15;
        }
        if (j2 == -36) {
            return y();
        }
        if (j2 == -35) {
            return z();
        }
        throw a("Array", j2);
    }

    public final int f() {
        byte j2 = j();
        if (a.c(j2)) {
            return j2 & 15;
        }
        if (j2 == -34) {
            return y();
        }
        if (j2 == -33) {
            return z();
        }
        throw a("Map", j2);
    }

    private wpl u() {
        byte j2 = j();
        switch (j2) {
            case -57:
                return new wpl(k(), x());
            case -56:
                return new wpl(k(), y());
            case -55:
                return new wpl(k(), z());
            default:
                switch (j2) {
                    case -44:
                        return new wpl(k(), 1);
                    case -43:
                        return new wpl(k(), 2);
                    case -42:
                        return new wpl(k(), 4);
                    case -41:
                        return new wpl(k(), 8);
                    case -40:
                        return new wpl(k(), 16);
                    default:
                        throw a("Ext", j2);
                }
        }
    }

    private int a(byte b2) {
        switch (b2) {
            case -39:
                return x();
            case -38:
                return y();
            case -37:
                return z();
            default:
                return -1;
        }
    }

    private int b(byte b2) {
        switch (b2) {
            case -60:
                return x();
            case -59:
                return y();
            case -58:
                return z();
            default:
                return -1;
        }
    }

    private int v() {
        byte j2 = j();
        if (a.d(j2)) {
            return j2 & 31;
        }
        int a2 = a(j2);
        if (a2 >= 0) {
            return a2;
        }
        if (this.h.b) {
            int b2 = b(j2);
            if (b2 >= 0) {
                return b2;
            }
        }
        throw a("String", j2);
    }

    private int w() {
        byte j2 = j();
        if (a.d(j2)) {
            return j2 & 31;
        }
        int b2 = b(j2);
        if (b2 >= 0) {
            return b2;
        }
        if (this.h.a) {
            int a2 = a(j2);
            if (a2 >= 0) {
                return a2;
            }
        }
        throw a("Binary", j2);
    }

    private void a(byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (g()) {
                int min = Math.min(this.c.size() - this.d, length - i2);
                this.c.getBytes(this.d, bArr, i2 + 0, min);
                b(min);
                i2 += min;
            } else {
                throw new EOFException();
            }
        }
    }

    private byte[] c(int i2) {
        byte[] bArr = new byte[i2];
        a(bArr);
        return bArr;
    }

    private int x() {
        return k() & 255;
    }

    private int y() {
        return l() & 65535;
    }

    private int z() {
        int m = m();
        if (m >= 0) {
            return m;
        }
        throw d(m);
    }

    public void close() {
        this.b.close();
    }

    private static MessageIntegerOverflowException a(long j2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j2 + Long.MAX_VALUE + 1).setBit(63));
    }

    private static MessageSizeException d(int i2) {
        return new MessageSizeException(((long) (i2 & Integer.MAX_VALUE)) + 2147483648L);
    }
}
