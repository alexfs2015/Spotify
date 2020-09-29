package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;

public class JsonFactory implements Serializable {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonParser.Feature.collectDefaults();
    private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    private static final long serialVersionUID = 1;
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public final int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this(null);
    }

    protected JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
    }

    /* access modifiers changed from: protected */
    public IOContext _createContext(Object obj, boolean z) {
        return new IOContext(_getBufferRecycler(), obj, z);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(Reader reader, IOContext iOContext) {
        ReaderBasedJsonParser readerBasedJsonParser = new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures));
        return readerBasedJsonParser;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(char[] cArr, int i, int i2, IOContext iOContext, boolean z) {
        ReaderBasedJsonParser readerBasedJsonParser = new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures), cArr, i, i + i2, z);
        return readerBasedJsonParser;
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    /* access modifiers changed from: protected */
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) {
        return jsonEncoding == JsonEncoding.UTF8 ? new UTF8Writer(iOContext, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    /* access modifiers changed from: protected */
    public final InputStream _decorate(InputStream inputStream, IOContext iOContext) {
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(iOContext, inputStream);
            if (decorate != null) {
                return decorate;
            }
        }
        return inputStream;
    }

    /* access modifiers changed from: protected */
    public final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) {
        OutputDecorator outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            OutputStream decorate = outputDecorator.decorate(iOContext, outputStream);
            if (decorate != null) {
                return decorate;
            }
        }
        return outputStream;
    }

    /* access modifiers changed from: protected */
    public final Reader _decorate(Reader reader, IOContext iOContext) {
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            Reader decorate = inputDecorator.decorate(iOContext, reader);
            if (decorate != null) {
                return decorate;
            }
        }
        return reader;
    }

    /* access modifiers changed from: protected */
    public final Writer _decorate(Writer writer, IOContext iOContext) {
        OutputDecorator outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            Writer decorate = outputDecorator.decorate(iOContext, writer);
            if (decorate != null) {
                return decorate;
            }
        }
        return writer;
    }

    public BufferRecycler _getBufferRecycler() {
        return Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? BufferRecyclers.getBufferRecycler() : new BufferRecycler();
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOContext _createContext = _createContext(fileOutputStream, true);
        _createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate((OutputStream) fileOutputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        IOContext _createContext = _createContext(outputStream, false);
        _createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonGenerator createGenerator(Writer writer) {
        IOContext _createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    public JsonParser createParser(File file) {
        IOContext _createContext = _createContext(file, true);
        return _createParser(_decorate((InputStream) new FileInputStream(file), _createContext), _createContext);
    }

    public JsonParser createParser(InputStream inputStream) {
        IOContext _createContext = _createContext(inputStream, false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    public JsonParser createParser(Reader reader) {
        IOContext _createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    public JsonParser createParser(String str) {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser((Reader) new StringReader(str));
        }
        IOContext _createContext = _createContext(str, true);
        char[] allocTokenBuffer = _createContext.allocTokenBuffer(length);
        str.getChars(0, length, allocTokenBuffer, 0);
        return _createParser(allocTokenBuffer, 0, length, _createContext, true);
    }

    public JsonParser createParser(byte[] bArr) {
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(_createContext, bArr, 0, bArr.length);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, 0, bArr.length, _createContext);
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = (feature.getMask() ^ -1) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return "JSON";
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }
}
