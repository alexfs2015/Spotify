package org.msgpack.jackson.dataformat;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

public class MessagePackFactory extends JsonFactory {
    private static final long serialVersionUID = 2578263992015504347L;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public xdw _createParser(InputStream inputStream, IOContext iOContext) {
        return new xdw(iOContext, this._parserFeatures, this._objectCodec, inputStream);
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        if (!(i == 0 && i2 == bArr.length)) {
            bArr = Arrays.copyOfRange(bArr, i, i2 + i);
        }
        return new xdw(iOContext, this._parserFeatures, this._objectCodec, bArr);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        return createGenerator((OutputStream) new FileOutputStream(file), jsonEncoding);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        return new xdv(this._generatorFeatures, this._objectCodec, outputStream);
    }

    public JsonGenerator createGenerator(Writer writer) {
        throw new UnsupportedOperationException();
    }

    public JsonParser createParser(InputStream inputStream) {
        return _createParser(inputStream, _createContext(inputStream, false));
    }

    public JsonParser createParser(byte[] bArr) {
        return _createParser(bArr, 0, bArr.length, _createContext(bArr, false));
    }
}
