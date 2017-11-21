package en.simplifia.impl;

import fr.simplifia.input.exception.InputException;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.util.Objects;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest {

    private PrintStream stream;

    public SmpOutputWriterImplTest(){
        stream = Mockito.mock(PrintStream.class);
       doNothing().when(stream).println(anyString());
    }

    //TODO
    @Test
    public void testPrint() throws Exception {
        doNothing().when(stream).println(anyString());
    }

    //TODO
    @Test
    public void testPrintEmpty() throws Exception {
        doThrow(InputException.class).when(stream).println("");
    }

    //TODO
    @Test
    public void testPrintNull() throws Exception {
        doThrow(InputException.class).when(stream).println("null");
    }

}