package com.company.reader;

public class EncryptedReadDecorator extends ReadDecorator{

    public EncryptedReadDecorator(Reader reader) {
        super(reader);
    }

    @Override
    public String read() {
        this.reader.read();
        return ("Decrypted the file!");
    }
}
