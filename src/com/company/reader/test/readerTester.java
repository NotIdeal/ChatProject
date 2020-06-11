package com.company.reader.test;

import com.company.reader.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class readerTester {
    @Test
    public void EncryptedReadDecoratorTest(){
        EncryptedReadDecorator a = new EncryptedReadDecorator(new FileReader("oppa"));
        assertEquals("Decrypted the file!", a.read());
    }
    @Test
    public void ReadDecoratorTest(){
        ReadDecorator a = new ReadDecorator(new FileReader("oppa"));
        assertEquals("", a.read());
    }
    @Test
    public void FileReaderTest(){
        FileReader a = new FileReader("oppa");
        assertEquals("Reading file from: oppa", a.read());
    }
}
