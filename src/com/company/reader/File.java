package com.company.reader;

import com.company.reader.EncryptedReadDecorator;
import com.company.reader.Reader;

public class File extends EncryptedReadDecorator {

    public File(Reader reader) {
        super(reader);
    }
}
