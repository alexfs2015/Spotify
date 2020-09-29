package defpackage;

import com.google.protobuf.ByteString;

/* renamed from: flq reason: default package */
final class flq {

    /* renamed from: flq$a */
    interface a {
        byte a(int i);

        int a();
    }

    static String a(final ByteString byteString) {
        return a((a) new a() {
            public final byte a(int i) {
                return byteString.a(i);
            }

            public final int a() {
                return byteString.b();
            }
        });
    }

    private static String a(a aVar) {
        StringBuilder sb = new StringBuilder(aVar.a());
        for (int i = 0; i < aVar.a(); i++) {
            byte a2 = aVar.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
